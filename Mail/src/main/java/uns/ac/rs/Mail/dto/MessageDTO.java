package uns.ac.rs.Mail.dto;

import uns.ac.rs.Mail.entity.Message;
import uns.ac.rs.Mail.entity.Tag;

import java.io.Serializable;
import java.util.Date;

public class MessageDTO implements Serializable {
    private Long id;
    private String from;
    private String to;
    private String cc;
    private String bcc;
    private Date dateTime;
    private String subject;
    private String content;
    private Boolean unread;
    private Double messageTag;
//    private AccountDTO account;
//    private FolderDTO folder;

    public MessageDTO() {
    }

    public MessageDTO(Long id, String from, String to, String cc, String bcc, Date dateTime, String subject, String content, Boolean unread, Double messageTag) {
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
//        this.account = account;
//        this.folder = folder;
    }

    public MessageDTO(Message message) {
        this(message.getId(), message.getFrom(), message.getTo(), message.getCc(), message.getBcc(), message.getDateTime(), message.getSubject(), message.getContent(), message.getUnread(), message.getMessageTag());
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

//    public AccountDTO getAccount() {
//        return account;
//    }
//
//    public void setAccount(AccountDTO account) {
//        this.account = account;
//    }
//
//    public FolderDTO getFolder() {
//        return folder;
//    }
//
//    public void setFolder(FolderDTO folder) {
//        this.folder = folder;
//    }
}
