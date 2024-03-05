package sb.tutorial.myapp1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "NOTIFICATION", schema = "PUBLIC")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column
    private String message;
}
