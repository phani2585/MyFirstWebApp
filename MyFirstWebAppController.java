package jnana;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyFirstWebAppController {
    @RequestMapping("/hellospring")
    public String helloSpring(){
        return "index";
    }
}
