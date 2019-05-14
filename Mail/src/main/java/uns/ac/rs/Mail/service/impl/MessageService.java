package uns.ac.rs.Mail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uns.ac.rs.Mail.entity.Message;
import uns.ac.rs.Mail.repository.MessageRepository;
import uns.ac.rs.Mail.service.MessageServiceInterface;

import java.util.List;

@Service
public class MessageService implements MessageServiceInterface {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public Message findOne(Long msgId) {
        return messageRepository.findById(msgId).get();
    }

    @Override
    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public List<Message> findAllOrderByDate() {
        return messageRepository.findAllByOrderByDateTime();
    }

}