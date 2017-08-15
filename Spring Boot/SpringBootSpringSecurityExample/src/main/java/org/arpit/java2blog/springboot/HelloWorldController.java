package org.arpit.java2blog.springboot;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
 
 @RequestMapping("/helloworld")
 public ModelAndView hello() {
  String helloWorldMessage = "Hello world from java2blog!";
  return new ModelAndView("hello", "message", helloWorldMessage);
 }
 
 // This request mapping will be called in case of logout
 @RequestMapping(value="/logout", method = RequestMethod.GET)
 public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
     Authentication auth = SecurityContextHolder.getContext().getAuthentication();
     if (auth != null){    
         new SecurityContextLogoutHandler().logout(request, response, auth);
     }
     return "redirect:/login?logout";//We are redirecting it to login page.
 }
}
