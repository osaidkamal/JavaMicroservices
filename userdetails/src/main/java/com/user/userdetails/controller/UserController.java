package com.user.userdetails.controller;

import com.user.userdetails.entity.Contact;
import com.user.userdetails.entity.User;
import com.user.userdetails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User getUser(@RequestBody @PathVariable("id") int user_id) {
        User user = userService.getUser(user_id);
        Contact contact = this.restTemplate.getForObject("http://contact/contact/user/" + user.getId(),
                Contact.class);

        user.setContact(contact);
        return user;
        // return userService.getUser(user_id);
    }
}
