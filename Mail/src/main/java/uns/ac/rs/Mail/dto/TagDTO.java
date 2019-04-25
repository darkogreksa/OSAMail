package uns.ac.rs.Mail.dto;

import uns.ac.rs.Mail.entity.Message;

import java.io.Serializable;

public class TagDTO implements Serializable {
    private int id;
    private String name;
    private Message message;

    public TagDTO() {
    }

    public TagDTO(int id, String name, Message message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
