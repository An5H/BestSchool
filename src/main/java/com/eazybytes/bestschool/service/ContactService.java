package com.eazybytes.bestschool.service;

import com.eazybytes.bestschool.constants.BestSchoolConstants;
import com.eazybytes.bestschool.model.Contact;
import com.eazybytes.bestschool.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    /**
     * Save Contact Details into DB
     *
     * @param contact
     * @return boolean
     */
    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = false;
        contact.setStatus(BestSchoolConstants.OPEN);
        contact.setCreatedBy(BestSchoolConstants.ANONYMOUS);
        contact.setCreatedAt(LocalDateTime.now());
        int result = contactRepository.saveContactMsg(contact);
        if (result > 0) {
            isSaved = true;
        }
        return isSaved;
    }

    public List <Contact> findMsgsWithOpenStatus() {
        List <Contact> contactMsgs = contactRepository.findMsgsWithStatus(BestSchoolConstants.OPEN);
        return contactMsgs;
    }

    public boolean updateMsgStatus(int contactId, String updatedBy) {
        boolean isUpdated = false;
        int result = contactRepository.updateMsgStatus(contactId, BestSchoolConstants.CLOSE, updatedBy);
        if (result > 0) {
            isUpdated = true;
        }
        return isUpdated;
    }

}
