package uns.ac.rs.Mail.service;

import uns.ac.rs.Mail.entity.Message;

import java.util.List;

public interface MessageServiceInterface {

    Message findOne(Long msgId);
    List<Message> findAll();
    List<Message> findAllOrderByDate();

}
