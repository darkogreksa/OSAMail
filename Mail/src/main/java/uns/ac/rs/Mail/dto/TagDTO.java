package uns.ac.rs.Mail.dto;

import uns.ac.rs.Mail.entity.Message;

import java.io.Serializable;

public class TagDTO implements Serializable {
    private Long id;
    private String name;

    public TagDTO() {
    }

    public TagDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
