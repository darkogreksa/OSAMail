package uns.ac.rs.Mail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uns.ac.rs.Mail.entity.Message;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {
    List<Message> findAllByOrderByDateTime();
}
