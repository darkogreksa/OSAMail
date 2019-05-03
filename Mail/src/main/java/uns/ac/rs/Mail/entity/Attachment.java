package uns.ac.rs.Mail.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Base64;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "attachment")
public class Attachment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attachment_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "data", unique = false, nullable = false)
    private String data;

    @Column(name = "type", unique = false, nullable = false)
    private String type;

    @Column(name = "name", unique = false, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="message_id", referencedColumnName="message_id", nullable=false)
    private Message message;

    @OneToMany(cascade={ALL}, fetch=FetchType.LAZY, mappedBy = "attachment")
    private List<Message> messages;

    public Attachment() {
    }

    public Attachment(Integer id, String data, String type, String name, Message message, List<Message> messages) {
        this.id = id;
        this.data = data;
        this.type = type;
        this.name = name;
        this.message = message;
        this.messages = messages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "id=" + id +
                ", data=" + data +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", message=" + message +
                ", messages=" + messages +
                '}';
    }
}
