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

    //getOne po ID

    @PostMapping(consumes="application/json")
    public ResponseEntity<ContactDTO> saveContact(@RequestBody ContactDTO contactDTO){



        return new ResponseEntity<>(HttpStatus.OK);
    }

}
