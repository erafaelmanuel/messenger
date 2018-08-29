package messenger.context;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tbl_message")
public class Message {

    @Id
    private String id;

    private String content;

    private Timestamp createdDate;

    private Timestamp readDate;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

}
