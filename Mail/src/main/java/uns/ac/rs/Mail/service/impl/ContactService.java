package uns.ac.rs.Mail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uns.ac.rs.Mail.entity.Contact;
import uns.ac.rs.Mail.repository.ContactRepository;
import uns.ac.rs.Mail.service.ContactServiceInterface;

import java.util.List;

@Service
public class ContactService implements ContactServiceInterface {

    @Autowired
    ContactRepository contactRepository;

    @Override
    public Contact findOne(Integer contactId) {
        return contactRepository.findById(contactId).get();
    }

    @Override
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }
}
