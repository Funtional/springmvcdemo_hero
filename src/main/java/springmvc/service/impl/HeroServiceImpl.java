package springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.dao.HeroDao;
import springmvc.model.Hero;
import springmvc.service.HeroService;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {

    @Autowired
    public HeroDao heroDao;

    @Override
    public List<Hero> getHeroList() {
        return heroDao.getHeroList();
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
