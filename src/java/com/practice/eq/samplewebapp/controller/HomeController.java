/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.eq.samplewebapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author baluj
 */
@Controller
@RequestMapping("/home")
public class HomeController {

      @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public String greetDefault () {
        System.out.print("testdef");
       return "Greeting!!!";
    }
   
}
