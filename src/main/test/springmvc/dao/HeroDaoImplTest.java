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
}
