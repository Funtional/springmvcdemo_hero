package springmvc.mybatis.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springmvc.dao.HeroDao;
import springmvc.model.Hero;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class MyBatisSpringTest {
    @Test
    public void test01() {
        //初始化容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("springmvc-servlet.xml");
        //获得bean
        //HeroDao heroDao=ctx.getBean("heroDao",HeroDao.class);
        HeroDao heroDao=ctx.getBean(HeroDao.class);
        //访问数据库
        List<Hero> heroList = heroDao.getHeroList(new HashMap());
        assertNotNull(heroList);
        for (Hero hero : heroList) {
            System.out.println(hero);
        }
    }
}