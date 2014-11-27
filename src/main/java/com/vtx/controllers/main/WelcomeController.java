package com.vtx.controllers.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by seokangchun on 14. 11. 27..
 */
@Controller
public class WelcomeController {

    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public ModelAndView hello(@RequestParam(value = "name", defaultValue = "") String name) {
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("name", name);
        return model;
    }

    @RequestMapping(value = {"/read"}, method = RequestMethod.GET)
    @ResponseBody
    public String read(@RequestParam(value = "name", defaultValue = "") String name) {
        return name;
    }
}
