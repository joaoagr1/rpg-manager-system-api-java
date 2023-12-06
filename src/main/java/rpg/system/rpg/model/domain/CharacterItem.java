package rpg.system.rpg.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "CharacterItems")
public class CharacterItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "character_id")
    private RPGCharacters character;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

}
