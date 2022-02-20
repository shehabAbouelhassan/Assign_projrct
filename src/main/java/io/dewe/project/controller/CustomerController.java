package io.dewe.project.controller;

import io.dewe.project.customer.Customer;
import io.dewe.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class CustomerController {

@Autowired
    private CustomerService customerService;

    @GetMapping(value = "/login")

    public String login(Model model){
    Customer customer = new Customer();
    model.addAttribute("customerObj", customer);
    return "login";

}
}
