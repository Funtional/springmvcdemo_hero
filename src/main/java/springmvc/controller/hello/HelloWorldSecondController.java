package springmvc.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller：用于标识是处理器类
//在springmvc-servlet.xml中配置定义的controller：
//<bean class="springmvc.action.HelloWorldController"/>
//如果使用组件扫描则controller不需要在springmvc-servlet.xml中配置
@Controller
@RequestMapping(value = "/test")
public class HelloWorldSecondController {

    //@RequestMapping：请求到处理器功能方法的映射规则
    //@RequestMapping(value="/user")或@RequestMapping("/user")
    @RequestMapping(value = "/hello2.action")
    public String hello(Model model) throws Exception {
        model.addAttribute("message", "HelloWorldSecond!");
        return "hello";
    }

}