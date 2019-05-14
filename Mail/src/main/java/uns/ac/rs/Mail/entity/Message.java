package uns.ac.rs.Mail.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "message")
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "from1", unique = false, nullable = false)
    private String from;

    @Column(name = "to1", unique = false, nullable = false)
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

    @Column(name = "unread", unique = false, nullable = false)
    private Boolean unread;

    @Column(name = "message_tag", unique = false, nullable = false)
    private Double messageTag;

    @OneToMany(cascade={ALL}, fetch=FetchType.LAZY, mappedBy = "message")
    private Set<Attachment> messageAttachment = new HashSet<Attachment>();

//    @ManyToOne
//    @JoinColumn(name="account_id", referencedColumnName="account_id")
//    private Account account;

//    @ManyToOne
//    @JoinColumn(name="folder_id", referencedColumnName="folder_id")
//    private Folder folder;

    public Message() {
    }

    public Message(Long id, String from, String to, String cc, String bcc, Date dateTime, String subject, String content, Boolean unread, Double messageTag, Set<Attachment> messageAttachment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.dateTime = dateTime;
        this.subject = subject;
        this.content = content;
        this.unread = unread;
        this.messageTag = messageTag;
        this.messageAttachment = messageAttachment;
//        this.account = account;
//        this.folder = folder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Boolean getUnread() {
        return unread;
    }

    public void setUnread(Boolean unread) {
        this.unread = unread;
    }

    public Double getMessageTag() {
        return messageTag;
    }

    public void setMessageTag(Double messageTag) {
        this.messageTag = messageTag;
    }

    public Set<Attachment> getMessageAttachment() {
        return messageAttachment;
    }

    public void setMessageAttachment(Set<Attachment> messageAttachment) {
        this.messageAttachment = messageAttachment;
    }

//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }

//    public Folder getFolder() {
//        return folder;
//    }
//
//    public void setFolder(Folder folder) {
//        this.folder = folder;
//    }

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
                ", unread=" + unread +
                ", messageTag=" + messageTag +
                ", messageAttachment=" + messageAttachment +
//                ", account=" + account +
//                ", folder=" + folder +
                '}';
    }
}
