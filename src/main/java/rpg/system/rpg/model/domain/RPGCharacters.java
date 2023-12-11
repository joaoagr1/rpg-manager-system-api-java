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
    private Long character_id;

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "character_name")
    private String characterName;

    @Column(name = "level")
    private Long level;

    @Column(name = "background")
    private String background;

    @Column(name = "alignment")
    private String alignment;

    @Column(name = "race")
    private String race;

    @Column(name = "class")
    private String class_;

    @Column(name = "features")
    private String features;


    //Method for update registers in database...
    public void updatedata(RequestUpdateCharacter data) {
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

    }

    public RPGCharacters(RequestPostCharacter data) {
        this.background = data.background();
        this.alignment = data.alignment();
        this.features = data.features();
        this.class_ = data.class_();
        this.race = data.race();
        this.level = data.level();
        this.characterName = data.characterName();
        this.user_id = data.user_id();

        Journal characterJournal = new Journal();


}
    }
