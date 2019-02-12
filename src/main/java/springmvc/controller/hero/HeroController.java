package springmvc.controller.hero;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springmvc.model.Hero;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/hero")
public class HeroController {

    //{×××}占位符，请求的URL可以是“/useredit/001”或“/useredit/abc”，通过在方法中使用@PathVariable 获取{×××}中的×××变量。
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Hero getHeroDetail(@PathVariable int id) throws Exception {
        System.out.println("getHero");
        Hero hero = new Hero();
        hero.setId(id);
        hero.setName("test");
        return hero;
    }

    @RequestMapping(value="/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Hero> getHeroesList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("getHeroes");
        List<Hero> list = new ArrayList<>();
        Hero hero = new Hero();
        hero.setId(1);
        hero.setName("test1");
        Hero hero2 = new Hero();
        hero2.setId(2);
        hero2.setName("test2");
        list.add(hero);
        list.add(hero2);
        return list;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.POST)
    @ResponseBody
    public boolean addHero(@PathVariable int id){
        System.out.println("addHero");
        return false;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.PATCH)
    @ResponseBody
    public boolean updateHero(@PathVariable int id, Hero hero){
        System.out.println("updateHero");
        return false;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public boolean deleteHero(@PathVariable int id){
        System.out.println("deleteHero");
        return false;
    }
}
