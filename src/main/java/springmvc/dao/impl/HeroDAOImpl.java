package springmvc.dao.impl;

import org.apache.ibatis.session.SqlSession;

import springmvc.dao.HeroDao;
import springmvc.model.Hero;
import springmvc.util.MyBatisUtil;

import java.util.List;

/**
 * 实现Hero类型数据访问
 *
 */
public class HeroDAOImpl implements HeroDao {

    @Override
    public List<Hero> getHeroList() {
        //获得会话对象
        SqlSession session=MyBatisUtil.getSession();
        try {
            //通过MyBatis实现接口 HeroDao，返回实例
            HeroDao heroDao=session.getMapper(HeroDao.class);
            return heroDao.getHeroList();
        } finally {
            session.close();
        }
    }

}