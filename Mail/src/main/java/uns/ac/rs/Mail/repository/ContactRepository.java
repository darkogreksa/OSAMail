package uns.ac.rs.Mail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uns.ac.rs.Mail.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}