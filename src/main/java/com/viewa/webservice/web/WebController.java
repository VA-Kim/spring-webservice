package com.viewa.webservice.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

    @GetMapping("/")        //@RequestMapping 을 대체할 수 있는 매핑 어노테이션, @RequestMapping(value="/", method=RequestMethod.GET) 과 동일하다.
    public String main() {
        return "main";
    }

}
