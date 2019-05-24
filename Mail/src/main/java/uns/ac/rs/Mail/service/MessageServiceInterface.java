package uns.ac.rs.Mail.service;

import uns.ac.rs.Mail.entity.Message;

import java.util.List;

public interface MessageServiceInterface {

    Message findOne(Long messageId);
    List<Message> findAll();
    List<Message> findAllOrderByDateAsc();
    List<Message> findAllOrderByDateDesc();
    Message save(Message message);
    void remove(Long messageId);
}
