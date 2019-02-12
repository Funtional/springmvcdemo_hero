package springmvc.service.impl;

import org.springframework.stereotype.Service;
import springmvc.model.Hero;
import springmvc.service.HeroService;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {


    @Override
    public List<Hero> getHeroList() {
        return null;
    }

    @Override
    public Hero getHeroDetail(int id) {
        return null;
    }

    @Override
    public boolean updateHero(int id, Hero hero) {
        return false;
    }

    @Override
    public boolean addHero(Hero hero) {
        return false;
    }

    @Override
    public boolean deleteHero(int id) {
        return false;
    }
}
