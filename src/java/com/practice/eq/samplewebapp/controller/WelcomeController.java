/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.eq.samplewebapp.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author baluj
 */
@Controller
@RequestMapping("/welcome")
public class WelcomeController extends HttpServlet {

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    /*    @RequestMapping(value = "/page", method = RequestMethod.GET)
     public ModelAndView getWelcome (HttpServletRequest request) {
     //System.out.print("testdef");
        
     SampleUtils util = new SampleUtils();
     List<String> msgs = util.getMessage();
        
     // System.out.println("test : "+msgs.toJSONArray("msgList"));
     ModelAndView mv = new ModelAndView();
     mv.setViewName("welcomePage");
     mv.addObject("message", msgs);
        
     request.getSession().setAttribute("user", "Playboy Prem");
        
        
     return mv;
     }*/
    @RequestMapping(value = "/greet", method = RequestMethod.POST)
    public ModelAndView greet(HttpServletRequest request) {
        System.out.print("test");
        
        return new ModelAndView("home", "welcomeMsg", "Have a Great Day "+request.getSession().getAttribute("userName"));
     
    }
    /*  @RequestMapping(value = "/greeting/{username}", method = RequestMethod.GET)
     @ResponseBody
     public String greeting(@PathVariable("username") String username) {
     System.out.println("greeting API");
     return "Hello "+username;
     } */
}
