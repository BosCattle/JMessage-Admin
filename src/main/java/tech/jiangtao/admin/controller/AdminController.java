package tech.jiangtao.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

  @RequestMapping("/login")
  public ModelAndView index(){
    return new ModelAndView("login");
  }
}
