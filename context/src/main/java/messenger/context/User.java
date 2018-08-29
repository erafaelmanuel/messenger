package messenger.context;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_user")
public class User {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String email;

    @ManyToMany
    @JoinTable(name = "tbl_user_conversation", joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "conversation_id")})
    private Set<Conversation> conversations = new HashSet<>();

    @OneToMany(mappedBy = "sender")
    private Set<Message> messages = new HashSet<>();


}
