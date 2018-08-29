package messenger.context;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tbl_message")
public class Message {

    @Id
    @Column(name = "_id")
    private String id;

    @Column(name = "_content")
    private String content;

    @Column(name = "create_date")
    private Timestamp createdDate;

    @Column(name = "read_date")
    private Timestamp readDate;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getReadDate() {
        return readDate;
    }

    public void setReadDate(Timestamp readDate) {
        this.readDate = readDate;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
}
