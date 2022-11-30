/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.persona.demo.controller;

import com.persona.demo.entity.Formulario;
import com.persona.demo.entity.Product;
import com.persona.demo.services.ProductService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author anthony
 */
@Controller
public class AppController {
    
    @Autowired
    private ProductService service;
    
    @RequestMapping("/")
    public String viewHomePage(HttpSession session, Model model){
        if (session.getAttribute("mySessionAttribute") != null){
            List<Product> listProducts = service.listAll();
            model.addAttribute("listProducts", listProducts);
            return "index";
        } else {
            model.addAttribute("formulario", new Formulario());
            return "login";
        }
    }
    
    @RequestMapping("/login")
    public String login(HttpSession session){
        session.setAttribute("mySessionAttribute", "sasas");
        return "redirect:/";
    }
    
    @RequestMapping("/nuevo")
    public String showNewProductPage(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);

        return "new_product";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product){
        service.save(product);
        
        return "redirect:/";
    }
    
    @RequestMapping("/edit/(id)")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") int id){
        ModelAndView mav = new ModelAndView("edit_product");
        Product product = service.get(id);
        mav.addObject("product", product);
        
        return mav;
    }
    
    @RequestMapping("/delete/(id)")
    public String deleteProduct(@PathVariable(name="id") int id){
        service.delete(id);
        return "redirect:/";
    }
}
