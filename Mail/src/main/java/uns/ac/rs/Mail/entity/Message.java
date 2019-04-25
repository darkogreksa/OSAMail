package uns.ac.rs.Mail.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "message")
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "from", unique = false, nullable = false)
    private String from;

    @Column(name = "to", unique = false, nullable = false)
    private String to;

    @Column(name = "cc", unique = false, nullable = false)
    private String cc;

    @Column(name = "bcc", unique = false, nullable = false)
    private String bcc;

    @Column(name = "dateTime", unique = false, nullable = false)
    private Date dateTime;

    @Column(name = "subject", unique = false, nullable = false)
    private String subject;

    @Column(name = "content", unique = false, nullable = false)
    private String content;

    @OneToMany(cascade={ALL}, fetch=FetchType.LAZY, mappedBy = "message")
    private List<Attachment> attachments;

    @OneToMany(cascade={ALL}, fetch=FetchType.LAZY, mappedBy = "message")
    private List<Tag> tags;

    @ManyToOne
    @JoinColumn(name="attachment_id", referencedColumnName="attachment_id", nullable=false)
    private Attachment attachment;

    @ManyToOne
    @JoinColumn(name="folder_id", referencedColumnName="folder_id", nullable=false)
    private Folder folder;

    public Message(Integer id, String from, String to, String cc, String bcc, Date dateTime, String subject, String content, List<Attachment> attachments, List<Tag> tags, Attachment attachment, Folder folder) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.dateTime = dateTime;
        this.subject = subject;
        this.content = content;
        this.attachments = attachments;
        this.tags = tags;
        this.attachment = attachment;
        this.folder = folder;
    }

    public Message() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", cc='" + cc + '\'' +
                ", bcc='" + bcc + '\'' +
                ", dateTime=" + dateTime +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", attachments=" + attachments +
                ", tags=" + tags +
                ", attachment=" + attachment +
                ", folder=" + folder +
                '}';
    }
}
