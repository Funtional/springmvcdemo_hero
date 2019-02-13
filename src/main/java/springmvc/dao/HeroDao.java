package springmvc.dao;

import springmvc.model.Hero;

import java.util.List;

public interface HeroDao {
    List<Hero> getHeroList();
}
