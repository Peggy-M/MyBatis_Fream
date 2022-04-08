package cn.bjpowernode.service;

import cn.bjpowernode.domain.Hero;

import java.util.List;

public interface HeroService {
    Hero getById(String id);
    void save(Hero hero);

    List<Hero> getAll();
}
