package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    private User user = new User("San");

    @GetMapping(value = "/")
    public ModelAndView firstView()
    {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Welcome "+user.getName()+" to Stackroute");
        return mav;
    }
}
