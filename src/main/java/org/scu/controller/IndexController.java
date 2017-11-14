package org.scu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xing on 2017/11/14.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView toindex(){
        return new ModelAndView("index");
    }

    @RequestMapping("/login")
    public ModelAndView tologin(){
        return new ModelAndView("login");
    }

    @RequestMapping("/about")
    public ModelAndView toabout(){
        return new ModelAndView("about");
    }

    @RequestMapping("/contact")
    public ModelAndView tocontact(){
        return new ModelAndView("contact");
    }

    @RequestMapping("/single")
    public ModelAndView tosingle(){
        return new ModelAndView("single");
    }


}
