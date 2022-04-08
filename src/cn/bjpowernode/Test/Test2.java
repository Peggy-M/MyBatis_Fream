package cn.bjpowernode.Test;

import cn.bjpowernode.dao.HeroDao;
import cn.bjpowernode.domain.Hero;
import cn.bjpowernode.util.SqlSesionUtil;
import cn.bjpowernode.vo.HeroClassroomVo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {

        HeroDao heroDao= SqlSesionUtil.getSession().getMapper(HeroDao.class);

      /*  Hero hero=heroDao.select1("A001");
        System.out.println(hero);
*/
   /*     String str="i";
        List<Hero>  lists=heroDao.getAll2(str);
        for (Hero list : lists) {
            System.out.println(list);
        }*/
       /* //模糊查询出表中姓名中有的i的所有的字段的信息
        String str="i";
        List<Hero>  lists=heroDao.getAll2(str);
        for (Hero list : lists) {
            System.out.println(list);
        }*/

      /*  //返回值类型测试
        //返回表中所有的成员数
        int count=heroDao.select2();
        System.out.println("总的记录条数:"+count);*/

        /*  //返回一个domain中Hero类型
        Hero hero=heroDao.select1("A001");
        System.out.println(hero);*/

        /*//返回一个Map集合的测试
        List<Map<String,Object>> lists=heroDao.select3();
        for (Map<String, Object> list : lists) {
           Set<String> key=list.keySet();
            for (String s : key) {
                System.out.println("key="+s);
                System.out.println("value="+list.get(s));
            }
            System.out.println("=====================================");
        }*/

        /*//利用<resultMap>标签进行匿名 查询
        List<Hero> lists=heroDao.select4();
        for (Hero list : lists) {
            System.out.println(list);
        }*/

/*        //where的连接查询
        //比如查询姓名中含有b且地址是地球的信息
        Hero h=new Hero();
        h.setName("b");
        h.setBirthplace("u");
        List<Hero> lists=heroDao.select5(h);
        for (Hero list : lists) {
            System.out.println(list);
        }*/

/*        //测试使用动态数组的进行查询
        //查询编号为A001,A002,A003,A006
        String[] strArry={"A001","A002","A003","A006"};
        List<Hero> lists=heroDao.select6(strArry);
        for (Hero list : lists) {
            System.out.println(list);
        }*/

       /* //sql片段的使用
        Hero  hero=heroDao.select7("A006");
        System.out.println(hero);*/

       /* //sql多表联查
        List<Map<String,Object>> lists=heroDao.select8();
        for (Map<String, Object> list : lists) {
            Set<String> s=list.keySet();
            for (String s1 : s) {
                System.out.println("key="+s1);
                System.out.println("value="+list.get(s1));
            }
            System.out.println("============================");
        }*/

     /*   //使用Vo类进行多表联查
        List<HeroClassroomVo> lists=heroDao.select9();
        for (HeroClassroomVo list : lists) {
            System.out.println(list);
        }*/

        //多表查询出姓名中带有z的所有的学生与班级的信息
        List<HeroClassroomVo> lists=heroDao.select10("li");
        for (HeroClassroomVo list : lists) {
            System.out.println(list);
        }

    }
}
