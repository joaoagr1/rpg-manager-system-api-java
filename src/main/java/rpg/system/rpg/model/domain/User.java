package rpg.system.rpg.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rpg.system.rpg.model.services.RequestPostUser;

@Table(name = "Users")
@Entity(name = "Users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(name = "login", length = 255)
    private String login;

    @Column(name = "password_hash",  length = 255)
    private String password;


    public User(Long someNumber) {
       this.user_id = someNumber;
    }

    public User(RequestPostUser data) {
        this.login = data.login();
        this.password = data.password();
    }
}
