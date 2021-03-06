package com.contact.contact.controller;

import java.util.List;

import com.contact.contact.entity.Contact;
import com.contact.contact.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/user/{id}")
    public Contact getContact(@PathVariable("id") int id) {
        return contactService.getContacts(id);
    }
}