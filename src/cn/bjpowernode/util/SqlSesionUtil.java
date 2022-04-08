package cn.bjpowernode.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class SqlSesionUtil {
    private SqlSesionUtil(){}

    public static SqlSessionFactory sqlSessionFactory;
     static {
         String resource = "mybatis-config.xml";
         InputStream inputStream = null;
         try {
             inputStream = Resources.getResourceAsStream(resource);
         } catch (IOException e) {
             e.printStackTrace();
         }
         sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);

     }

     // 相当与一个容器 调用一个新的线程 处理SqlSession
    //统一事务 ，将所有的有关数据库的统一事务交给同一个SqlSession操作
     private static ThreadLocal<SqlSession> t=new ThreadLocal<SqlSession>();

     //获取SqlSesion对象
    public static SqlSession getSession(){
        //这里的意思是在第一次 运行中是没有创建SqlSession对象的 需要进行SqlSession对象的创建
        SqlSession session= t.get();
        if(session==null){
            session=sqlSessionFactory.openSession();
            t.set(session);
        }
        return session;
    }

    //关闭SqlSesion对象
    public static void myClose(SqlSession session){
        if(session!=null){
            session.close();

            //这句是特别重要
            //当每一次执行完毕以后 线程重新回到线程池中  连接回到了连接池中 两者都未销毁
            //需要我们手动的 将两者剥离开  这样保证了 线程池中的该线程在下次的调用的时候是一个干净的线程
            //否则在以后的 数据库的增删改查的操作的时候会出现的数据混乱的情况
            //比如 在查询第一页的数据的时候 出现的是第二页的数据
            t.remove();
        }
    }
}
