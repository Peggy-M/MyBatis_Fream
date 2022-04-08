package cn.bjpowernode.dao;

import cn.bjpowernode.domain.Hero;
import cn.bjpowernode.vo.HeroClassroomVo;

import java.util.List;
import java.util.Map;

public interface HeroDao {
    List<Hero> getAll();
    Hero getById(String id);
    void save(Hero hero);

    Hero select1(String s);


    List<Hero> getAll2(String str);
    List<Hero> getAll3(String str);

    int select2();

    List<Map<String, Object>> select3();

    List<Hero> select4();

    List<Hero> select5(Hero h);

    List<Hero> select6(String[] strArry);

    Hero select7(String aoo1);

    List<Map<String, Object>> select8();

    List<HeroClassroomVo> select9();

    List<HeroClassroomVo> select10(String name);
}
