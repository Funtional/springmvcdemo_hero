package springmvc.service;

import springmvc.model.Hero;

import java.util.List;

public interface HeroService {
    List<Hero> getHeroList();

    Hero getHeroDetail(int id);

    boolean updateHero(int id, Hero hero);

    boolean addHero(Hero hero);

    boolean deleteHero(int id);
}
