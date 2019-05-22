package uns.ac.rs.Mail.service;

import uns.ac.rs.Mail.entity.Contact;

import java.util.List;

public interface ContactServiceInterface {

    Contact findOne(Long contactId);
    List<Contact> findAll();
    Contact save(Contact contact);
    void remove(Long contactId);
}
