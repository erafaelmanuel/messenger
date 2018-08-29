package messenger.context;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_conversation")
public class Conversation {

    @Id
    private String id;
    @ManyToMany(mappedBy = "conversations")
    private List<User> participants = new ArrayList<>();
}
