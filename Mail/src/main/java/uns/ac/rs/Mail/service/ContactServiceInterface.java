package uns.ac.rs.Mail.service;

import uns.ac.rs.Mail.entity.Contact;

import java.util.List;

public interface ContactServiceInterface {

    Contact findOne(Integer contactId);
    List<Contact> findAll();

}
