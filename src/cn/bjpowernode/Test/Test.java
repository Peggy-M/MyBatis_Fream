package cn.bjpowernode.Test;

import cn.bjpowernode.domain.Hero;
import cn.bjpowernode.service.HeroService;
import cn.bjpowernode.service.imlp.HeroServiceImlp;
import cn.bjpowernode.util.ServiceFactory;

import java.util.List;


public class Test {
    public static void main(String[] args) {
        //这里代理所走的只是张三对象
      //  HeroService ss=new HeroServiceImlp();
       HeroService ss=(HeroService)ServiceFactory.getService(new HeroServiceImlp());
    /*   Hero hero=new Hero();
        hero.setName("bibids");
        hero.setId("A006");
        hero.setAttack(1200);
        hero.setBirthplace("qiqiu");

        ss.save(hero);*/
        /* Hero hero1= ss.getById("A006");
        System.out.println(hero1);*/

       List<Hero> lists= ss.getAll();
        for (Hero list : lists) {
            System.out.println(list);
        }
    }
}
