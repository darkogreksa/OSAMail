package uns.ac.rs.Mail.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "folder")
public class Folder implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "folder_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name", unique = false, nullable = false)
    private String name;

    @Column(name = "rule", unique = false, nullable = false)
    private Rule rule;

    @Column(name = "subfolder", unique = false, nullable = false)
    private Folder subfolder;

    //@OneToMany(cascade={ALL}, fetch=FetchType.LAZY, mappedBy = "folder")
//    private List<Message> messages;

    public Folder() {
    }

    public Folder(String name, Rule rule, Folder subfolder) {
        this.name = name;
        this.rule = rule;
        this.subfolder = subfolder;
    }

    //    public Folder(Integer id, String name, Rule rule, Folder subfolder, List<Message> messages) {
//        this.id = id;
//        this.name = name;
//        this.rule = rule;
//        this.subfolder = subfolder;
//        this.messages = messages;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public Folder getSubfolder() {
        return subfolder;
    }

    public void setSubfolder(Folder subfolder) {
        this.subfolder = subfolder;
    }

//    public List<Message> getMessages() {
//        return messages;
//    }
//
//    public void setMessages(List<Message> messages) {
//        this.messages = messages;
//    }

    @Override
    public String toString() {
        return "Folder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rule=" + rule +
                ", subfolder=" + subfolder +
//                ", messages=" + messages +
                '}';
    }
}
