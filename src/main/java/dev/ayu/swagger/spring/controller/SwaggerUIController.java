package dev.ayu.swagger.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class SwaggerUIController {

    @RequestMapping("/ignored")
    public String redirectToNowhere() {
        return "redirect:/nowhere";
    }
}
