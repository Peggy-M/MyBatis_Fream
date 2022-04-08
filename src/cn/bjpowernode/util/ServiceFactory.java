package cn.bjpowernode.util;

//转化张三转化李四工厂
public class ServiceFactory {
    //传递张三对象获取李四对象的过程
    public static Object getService(Object service){
        return  new TransactionInvocationHandler(service).getProxy();
    }
}
