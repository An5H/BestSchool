package com.eazybytes.bestschool.service;

import com.eazybytes.bestschool.model.Contact;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ContactService {
    private final Logger log = Logger.getLogger(ContactService.class.toString());

    public void saveMessageDetails(Contact contact){
        log.info(contact.toString());
    }
}
