/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.eq.samplewebapp.util;

import java.lang.String;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author Jagadheesan Balu
 */
@Component
public class AuthorizeInterceptor extends HandlerInterceptorAdapter {

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler)
            throws Exception {
        /*Enumeration<String> e = request.getParameterNames();
        
        while(e.hasMoreElements()) {
                System.out.println("Params :"+e.nextElement());
            }*/
        String user = request.getParameter("name");
        String password = request.getParameter("pass");
                
        boolean retVal = (user.equalsIgnoreCase("prem") && password.equalsIgnoreCase("prem")) ? true : false;
        System.out.println("preHandle");
        
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        if(retVal) {
            HttpSession session = request.getSession();
            session.setAttribute("userName", user);
        } else {
            request.setAttribute("errorMsg", "Invalid Login!!!");
            response.sendRedirect(request.getContextPath() + "/welcome/login");
        }        
        return retVal;
    }
    
    public void postHandle(HttpServletRequest request,
            HttpServletResponse response,
            Object handler, ModelAndView modelAndView) {
        
        Long startTime = (Long) request.getAttribute("startTime");
        
        Long endTime = System.currentTimeMillis();
        
        System.out.println("postHandle");
        modelAndView.addObject("timeTaken", endTime - startTime + "ms");
    }
    
    public void afterCompletion(HttpServletRequest request,
            HttpServletResponse response,
            Object handler, Exception ex)  {
        
        System.out.println("afterCompletion");
    } 
    
}
