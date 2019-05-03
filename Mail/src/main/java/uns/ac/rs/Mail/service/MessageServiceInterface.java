package uns.ac.rs.Mail.service;

import uns.ac.rs.Mail.entity.Message;

import java.util.List;

public interface MessageServiceInterface {

    List<Message> findAllOrderByDate();

}
