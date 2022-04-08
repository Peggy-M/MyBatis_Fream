package cn.bjpowernode.util;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionInvocationHandler implements InvocationHandler {

    //target执行业务
    //target 张三表白方法
    private Object target;
    public TransactionInvocationHandler(Object target){
        this.target=target;
    }

    //代理类的业务方法
    //李四的表白方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)  {

        SqlSession session=null;
        Object obj=null;

       try{
           session=SqlSesionUtil.getSession();

           //处理业务逻辑
           //method.invoke() 张三的表白方法，原汁原味，除此以外的所有的处理都是对于张三表白的润色与加强
           obj=method.invoke(target,args);

           //处理业务逻辑完毕后提交事务
           session.commit();

       }catch (Exception e){
           //如果处理业务逻辑出现了问题需要进行事务的回滚
           session.rollback();

           e.printStackTrace();
       }finally {
           SqlSesionUtil.myClose(session);
       }
        return obj;
    }

    //获取代理类的对象
    //获取给张三润色加强后的表白方式对象
    public Object getProxy(){
        //参数一 target.getClass().getClassLoader() 类加载器 用于java虚拟机动态的加载 李四对象
        //参数二 target.getClass().getInterfaces() 取得所有的接口
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
