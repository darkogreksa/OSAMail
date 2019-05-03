package uns.ac.rs.Mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uns.ac.rs.Mail.dto.MessageDTO;
import uns.ac.rs.Mail.entity.Message;
import uns.ac.rs.Mail.service.MessageServiceInterface;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    MessageServiceInterface messageService;

    @GetMapping("/order")
    public ResponseEntity<List<MessageDTO>> orderByDate(){
        List<Message> messages = messageService.findAllOrderByDate();
        List<MessageDTO> messageDTOS = new ArrayList<>();
        for (Message m : messages){
            messageDTOS.add(new MessageDTO(m));
        }

        return new ResponseEntity<>(messageDTOS, HttpStatus.OK);
    }

}
