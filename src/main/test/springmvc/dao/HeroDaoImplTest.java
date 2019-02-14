package springmvc.dao;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import springmvc.dao.impl.HeroDAOImpl;
import springmvc.model.Hero;

import java.util.List;

public class HeroDaoImplTest {
    static HeroDao heroDao;

    @BeforeClass
    public static void beforeClass() {
        heroDao = new HeroDAOImpl();
    }

    @Test
    public void getHeroListTest(){
        List<Hero> heroList = heroDao.getHeroList();
        Assert.assertNotNull(heroList);
        for (Hero hero : heroList){
            System.out.println(hero);
        }
    }

    @Test
    public void addHeroTest() {
        Hero hero = new Hero();
//        hero.setName("慕灵风");
        hero.setName("邃无端");
        hero.setId(7);
        int result = heroDao.addHero(hero);
        System.out.println(result);
    }

    @Test
    public void updateHeroTest() {
        Hero hero = new Hero();
        hero.setName("邃无端");
        hero.setId(7);
        int result = heroDao.updateHero(hero);
        System.out.println(result);
    }

    @Test
    public void deleteHeroTest() {
        int result = heroDao.deleteHero(7);
        System.out.println(result);
    }
}
