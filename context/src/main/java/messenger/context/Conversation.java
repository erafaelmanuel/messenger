package messenger.context;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_conversation")
public class Conversation {

    @Id
    @Column(name = "_id")
    private String id;

    @ManyToMany(mappedBy = "conversations")
    private Set<User> participants = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<User> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<User> participants) {
        this.participants = participants;
    }
}
