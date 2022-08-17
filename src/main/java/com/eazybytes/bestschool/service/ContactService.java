package com.eazybytes.bestschool.service;

import com.eazybytes.bestschool.model.Contact;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ContactService {
    private final Logger log = Logger.getLogger(ContactService.class.toString());

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        log.info(contact.toString());
        return isSaved;
    }
}
