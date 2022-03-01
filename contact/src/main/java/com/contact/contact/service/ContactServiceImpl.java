package com.contact.contact.service;

import java.util.ArrayList;
import java.util.List;
import com.contact.contact.entity.Contact;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    private static List<Contact> clist = new ArrayList<>();
    static {
        Contact c1 = new Contact(1, "mohdosaid@gmail.com", 7897, 1);
        Contact c2 = new Contact(2, "owaisraza@gmail.com", 5635, 2);
        Contact c3 = new Contact(3, "ravi@gmail.com", 2662, 3);

        clist.add(c1);
        clist.add(c2);
        clist.add(c3);
    }

    @Override
    public Contact getContacts(int id) {
        for (Contact contact : clist) {
            if (contact.getId() == id) {
                return contact;
            }

        }
        return null;

    }
}
