package springmvc.mybatis.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springmvc.dao.HeroDao;
import springmvc.model.Hero;

public class MyBatisSpringTest {
    @Test
    public void test01() {
        //初始化容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("springmvc-servlet.xml");
        //获得bean
        HeroDao heroDao=ctx.getBean("heroDao",HeroDao.class);
        //访问数据库
        List<Hero> heroList=heroDao.getHeroList();
        assertNotNull(heroList);
        for (Hero hero : heroList) {
            System.out.println(hero);
        }
    }
}