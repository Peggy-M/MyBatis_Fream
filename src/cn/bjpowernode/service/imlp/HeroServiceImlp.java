package cn.bjpowernode.service.imlp;

import cn.bjpowernode.dao.HeroDao;
import cn.bjpowernode.domain.Hero;
import cn.bjpowernode.service.HeroService;
import cn.bjpowernode.util.SqlSesionUtil;

import java.util.List;


public class HeroServiceImlp implements HeroService {

    //MyBatis提供的代理类 创建一个实现类
    private HeroDao heroDao = SqlSesionUtil.getSession().getMapper(HeroDao.class);

    @Override
    public Hero getById(String id) {
        Hero hero=heroDao.getById(id);
        return hero;
    }

    @Override
    public void save(Hero hero) {
        heroDao.save(hero);
    }

    @Override
    public List<Hero> getAll() {
       List<Hero> lists= heroDao.getAll();
        return lists;
    }


}
