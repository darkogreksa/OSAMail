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
    public Message findOne(Long messageId) {
        return messageRepository.findById(messageId).get();
    }

    @Override
    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public List<Message> findAllOrderByDateAsc() {
        return messageRepository.findAllByOrderByDateTimeAsc();
    }

    @Override
    public List<Message> findAllOrderByDateDesc() {
        return messageRepository.findAllByOrderByDateTimeDesc();
    }

    @Override
    public Message save(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void remove(Long messageId) {
        messageRepository.deleteById(messageId);
    }

}