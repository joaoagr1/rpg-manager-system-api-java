package rpg.system.rpg.model.domain;


import jakarta.persistence.*;
import lombok.*;
import rpg.system.rpg.model.services.RequestPostCharacter;
import rpg.system.rpg.model.services.RequestUpdateCharacter;

@Table(name = "Characters")
@Entity(name = "Characters")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class RPGCharacters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long characterId;

    private byte[] image;

    private Long gp;

    private Long ac;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "character_name")
    private String characterName;

    private Long level;

    private String background;

    private String alignment;

    private String race;

    @Column(name = "class")
    private String class_;

    private String features;


    public void updateData(RequestUpdateCharacter data) {
        if (data.background() != null) {
            this.background = data.background();
        }
        if (data.alignment() != null) {
            this.alignment = data.alignment();
        }
        if (data.features() != null) {
            this.features = data.features();
        }
        if (data.class_() != null) {
            this.class_ = data.class_();
        }

        if (data.race() != null) {
            this.race = data.race();
        }

        if (data.level() != null) {
            this.level = data.level();
        }

        if (data.characterName() != null) {
            this.characterName = data.characterName();
        }

        if (data.gp() != null) {
            this.gp = data.gp();
        }

        if (data.ac() != null) {
            this.ac = data.ac();
        }

        if (data.image() != null) {
            this.image = data.image().getBytes();
        }

    }

    public RPGCharacters(RequestPostCharacter data) {
        this.background = data.background();
        this.alignment = data.alignment();
        this.features = data.features();
        this.class_ = data.class_();
        this.race = data.race();
        this.level = data.level();
        this.characterName = data.characterName();
        this.userId = data.user_id();
        this.gp = data.gp();
        this.ac = data.ac();

        Journal characterJournal = new Journal();
    }

}
