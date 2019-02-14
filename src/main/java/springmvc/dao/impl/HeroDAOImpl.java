package springmvc.dao.impl;

import org.apache.ibatis.session.SqlSession;
import springmvc.dao.HeroDao;
import springmvc.model.Hero;
import springmvc.util.MyBatisUtil;

import java.util.List;

/**
 * 实现Hero类型数据访问
 * 因为使用MyBatis所以该类并没有用到，Spring注入HeroService依赖的时候，并不是用该实现类。
 * 该类只是学习MyBatis时遗留下来的
 */
public class HeroDAOImpl implements HeroDao {

    @Override
    public List<Hero> getHeroList() {
        //获得会话对象
        SqlSession session = MyBatisUtil.getSession();
        try {
            //通过MyBatis实现接口 HeroDao，返回实例
            HeroDao heroDao = session.getMapper(HeroDao.class);
            return heroDao.getHeroList();
        } finally {
            session.close();
        }
    }

    @Override
    public Hero getHero(int id) {
        return null;
    }

    @Override
    public boolean updateHero(Hero hero) {
        //获得会话对象
        SqlSession session = MyBatisUtil.getSession();
        try {
            //通过MyBatis实现接口 HeroDao，返回实例
            HeroDao heroDao = session.getMapper(HeroDao.class);
            heroDao.updateHero(hero);
            return true;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean addHero(Hero hero) {
        //获得会话对象
        SqlSession session = MyBatisUtil.getSession();
        try {
            //通过MyBatis实现接口 HeroDao，返回实例
            HeroDao heroDao = session.getMapper(HeroDao.class);
            heroDao.addHero(hero);
            return true;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean deleteHero(int id) {
        //获得会话对象
        SqlSession session = MyBatisUtil.getSession();
        try {
            //通过MyBatis实现接口 HeroDao，返回实例
            HeroDao heroDao = session.getMapper(HeroDao.class);
            heroDao.deleteHero(id);
            return true;
        } finally {
            session.close();
        }
    }


}