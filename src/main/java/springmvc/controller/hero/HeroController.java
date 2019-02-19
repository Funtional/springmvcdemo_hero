package springmvc.controller.hero;

import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springmvc.model.Hero;
import springmvc.service.HeroService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/hero")
public class HeroController {
    @Autowired
    public HeroService heroService;

    //{×××}占位符，请求的URL可以是“/useredit/001”或“/useredit/abc”，通过在方法中使用@PathVariable 获取{×××}中的×××变量。
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Hero getHeroDetail(@PathVariable int id) throws Exception {
        System.out.println("getHero");
        Hero hero = heroService.getHeroDetail(id);
        return hero;
    }

    @RequestMapping(value="/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Hero> getHeroesList(HttpServletRequest request, HttpServletResponse response, @RequestParam(required = false) String name) throws Exception {
        System.out.println("getHeroes");
        Map paraMap = new HashMap();
        if (!StringUtils.isNullOrEmpty(name)) {
            paraMap.put("name", name.trim());
        }
        List<Hero> list = heroService.getHeroList(paraMap);
        return list;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public boolean addHero(@RequestBody Hero hero) {
        System.out.println("addHero: " + hero);
        heroService.addHero(hero);
        return false;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.PATCH)
    @ResponseBody
    public boolean updateHero(@PathVariable int id, @RequestBody Hero hero) {
        System.out.println("updateHero: " + hero);
        heroService.updateHero(id, hero);
        return true;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public boolean deleteHero(@PathVariable int id){
        System.out.println("deleteHero: " + id);
        heroService.deleteHero(id);
        return true;
    }
}
