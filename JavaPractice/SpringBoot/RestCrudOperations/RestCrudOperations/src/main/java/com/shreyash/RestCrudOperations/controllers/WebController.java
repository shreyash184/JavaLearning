package com.shreyash.RestCrudOperations.controllers;

import com.shreyash.RestCrudOperations.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class WebController {
    private ProductService productService;

    // Constructor injection
    public WebController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/static")
    public String getStaticMenu(){
        return "static-menu.html";
    }

    @GetMapping("/menu")
    public ModelAndView getMenu(){
        ModelAndView modelAndView = new ModelAndView("dynamic-menu.html");
        SimpleDateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY hh:mm:ss");
        modelAndView.getModelMap().put("serverTime", dateFormat.format(new Date()));
        modelAndView.getModelMap().put("products", productService.getProducts());
        return modelAndView;
    }
}
