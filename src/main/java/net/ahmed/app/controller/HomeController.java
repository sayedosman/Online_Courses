/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ahmed.app.controller;

import java.util.List;
import net.ahmed.app.bll.service.LookupsService;
import net.ahmed.app.dal.entity.Category;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author Ahmed Hafez
 */
@Controller
public class HomeController {
    
    @Autowired
    LookupsService categoryService;
    @Autowired
    PasswordEncoder passwordEncoder;
    @GetMapping
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public String showCourses(@RequestParam("cat_id") String catId) {
        Integer id = Integer.parseInt(catId);
        return "courses";
    }
    @RequestMapping(value = "/aboutUs", method = RequestMethod.GET)
    public String aboutUs() {
        return "about-us";
    }
    @RequestMapping(value = "/contactUs", method = RequestMethod.GET)
    public String contactUs() {
        return "contact-us";
    }
    @ModelAttribute
    public void getCategoroies(Model model) {
        try {
            List<Category> categoroies = categoryService.findAllCategory();
            model.addAttribute("categories",categoroies);
        } catch (Exception ex) {
        }
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin() {    	
        return "login";
    }
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String authError() {    	
        return "error/403";
    }
    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public String notFound() {    	
        return "error/404";
    }
   @GetMapping("/studnetProfile")
   public String studentProfile() {
	   return "student-profile";
   }
    
}
