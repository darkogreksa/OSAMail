package uns.ac.rs.Mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uns.ac.rs.Mail.dto.ContactDTO;
import uns.ac.rs.Mail.entity.Contact;
import uns.ac.rs.Mail.service.impl.ContactService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="api/contacts")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping(value="/all")
    public ResponseEntity<List<ContactDTO>> getContacts(){
        List<Contact> contacts = contactService.findAll();
        List<ContactDTO> contactsDTO = new ArrayList<ContactDTO>();
        for (Contact c : contacts) {
            contactsDTO.add(new ContactDTO(c));
        }
        return new ResponseEntity<List<ContactDTO>>(contactsDTO, HttpStatus.OK);
    }

    //getOne
    @GetMapping(value="/{id}")
    public ResponseEntity<ContactDTO> getContact(@PathVariable("id") Long id) {

        Contact contact = contactService.findOne(id);
        if (contact == null) {
            return new ResponseEntity<ContactDTO>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<ContactDTO>(new ContactDTO(contact), HttpStatus.OK);

    }

    @PostMapping(value="/add", consumes="application/json")
    public ResponseEntity<ContactDTO> saveContact(@RequestBody ContactDTO contactDTO){

        Contact contact = new Contact();

        contact.setFirstName(contactDTO.getFirstname());
        contact.setLastName(contactDTO.getLastname());
        contact.setEmail(contactDTO.getEmail());
        contact.setDisplay(contactDTO.getDisplay());
        contact.setNote(contactDTO.getDisplay());

//        post.setAuthor(userService.findOne(postDTO.getAuthor().getId()));
        contact = contactService.save(contact);

        return new ResponseEntity<ContactDTO>(new ContactDTO(contact), HttpStatus.CREATED);
    }

    @PutMapping(value="/update/{id}", consumes="application/json")
    public ResponseEntity<ContactDTO> updateContact(@RequestBody ContactDTO contactDTO,@PathVariable("id") Long id){
        Contact contact = contactService.findOne(id);

        if(contact == null) {
            return new ResponseEntity<ContactDTO>(HttpStatus.NOT_FOUND);
        }
        contact.setFirstName(contactDTO.getFirstname());
        contact.setLastName(contactDTO.getLastname());
        contact.setEmail(contactDTO.getEmail());
        contact.setDisplay(contactDTO.getDisplay());
        contact.setNote(contactDTO.getDisplay());

        contact = contactService.save(contact);

        return new ResponseEntity<ContactDTO>(HttpStatus.OK);
    }

    @DeleteMapping(value="/delete/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id){
        Contact contact = contactService.findOne(id);
        if(contact != null) {
            contactService.remove(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

}
