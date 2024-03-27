package rpg.system.rpg.model.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rpg.system.rpg.model.services.RequestPostUser;

@Table(name = "users")
@Entity(name = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "userId")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @NotBlank
    private String login;

    @Column(name = "password_hash")
    @NotBlank
    private String password;

    public User(RequestPostUser data) {
        this.login = data.login();
        this.password = data.password();
    }

}
