package uns.ac.rs.Mail.dto;

import uns.ac.rs.Mail.entity.Folder;
import uns.ac.rs.Mail.entity.Rule;

import java.io.Serializable;

public class FolderDTO implements Serializable {
    private int id;
    private String name;
    private Rule rule;
    private Folder subfolder;

    public FolderDTO() {
    }

    public FolderDTO(int id, String name, Rule rule, Folder subfolder) {
        this.id = id;
        this.name = name;
        this.rule = rule;
        this.subfolder = subfolder;
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
}
