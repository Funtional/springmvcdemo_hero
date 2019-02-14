package springmvc.dao;

import springmvc.model.Hero;

import java.util.List;

public interface HeroDao {
    List<Hero> getHeroList();

    Hero getHero(int id);

    boolean updateHero(Hero hero);

    boolean addHero(Hero hero);

    boolean deleteHero(int id);
}
