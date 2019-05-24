package uns.ac.rs.Mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uns.ac.rs.Mail.dto.MessageDTO;
import uns.ac.rs.Mail.entity.Message;
import uns.ac.rs.Mail.service.MessageServiceInterface;
import uns.ac.rs.Mail.service.impl.MessageService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="api/messages")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping(value="/all")
    public ResponseEntity<List<MessageDTO>> getMessages(){
        List<Message> messages = messageService.findAll();
        List<MessageDTO> messageDTO = new ArrayList<MessageDTO>();
        for (Message m : messages) {
            messageDTO.add(new MessageDTO(m));
        }
        return new ResponseEntity<List<MessageDTO>>(messageDTO, HttpStatus.OK);
    }

    @GetMapping("/orderAsc")
    public ResponseEntity<List<MessageDTO>> orderByDateAsc(){
        List<Message> messages = messageService.findAllOrderByDateAsc();
        List<MessageDTO> messageDTOS = new ArrayList<>();
        for (Message m : messages){
            messageDTOS.add(new MessageDTO(m));
        }
        return new ResponseEntity<>(messageDTOS, HttpStatus.OK);
    }

    @GetMapping("/orderDesc")
    public ResponseEntity<List<MessageDTO>> orderByDateDesc(){
        List<Message> messages = messageService.findAllOrderByDateDesc();
        List<MessageDTO> messageDTOS = new ArrayList<>();
        for (Message m : messages){
            messageDTOS.add(new MessageDTO(m));
        }
        return new ResponseEntity<>(messageDTOS, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<MessageDTO> saveMessage(@RequestBody MessageDTO messageDTO) {
        Message message = new Message();

        message.setFrom(messageDTO.getFrom());
        message.setTo(messageDTO.getTo());
        message.setCc(messageDTO.getCc());
        message.setBcc(messageDTO.getBcc());
        message.setDateTime(messageDTO.getDateTime());
        message.setSubject(messageDTO.getSubject());
        message.setContent(messageDTO.getContent());
        message.setUnread(messageDTO.getUnread());
        message.setMessageTag(messageDTO.getMessageTag());

        message = messageService.save(message);
        return new ResponseEntity<MessageDTO>(new MessageDTO(message), HttpStatus.CREATED);
    }

    @DeleteMapping(value="/delete/{id}")
    public ResponseEntity<Void> deleteMessage(@PathVariable Long id) {
        Message message = messageService.findOne(id);
        if (message != null) {
            messageService.remove(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

}