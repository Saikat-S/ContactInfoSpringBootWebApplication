package com.example.ContactInfoSpringBootWebApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
 
@Controller
public class AppController {
    @Autowired
    private ContactRepository contactRepo;
     
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("contact", new Contact());
        
        return "signup_form";
    }

    @PostMapping("/process_register")
    public String processRegister(Contact contact) {        
        contactRepo.save(contact);

        return "index";
    }

    @GetMapping("/contacts")
    public String listUsers(Model model) {
        List<Contact> listContacts = contactRepo.findAll();
        model.addAttribute("listContacts", listContacts);
        
        return "contacts";
    }
} 
