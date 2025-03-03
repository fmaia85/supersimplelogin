package ads.web2.supersimplelogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("open")
    @ResponseBody
    public String open(){
        return "Rota liberada!!";
    }

    @GetMapping("secured")
    @ResponseBody
    public String secured(){
        return "Rota fechada!!";
    }
}
