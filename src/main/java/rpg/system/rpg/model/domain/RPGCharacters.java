package rpg.system.rpg.model.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rpg.system.rpg.model.services.RequestUpdateCharacter;

@Table(name = "Characters")
@Entity(name = "Characters")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class RPGCharacters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "background")
    private String background;

    @Column(name = "alignment")
    private String alignment;

    @Column(name = "features")
    private String features;

    @Column(name = "class")
    private String class_;

    @Column(name = "race")
    private String race;

    @Column(name = "level")
    private Long level;

    @Column(name = "character_name")
    private String character_name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;


    //Method for update registers in database...
    public void updatedata(RequestUpdateCharacter data) {
        if (data.background() != null) {
            this.background = data.background();
        }
        if(data.alignment() != null){
            this.alignment = data.alignment();
        }
        if(data.features() != null){
            this.features = data.features();
        }
        if(data.class_() != null){
            this.class_ = data.class_();
        }

        if(data.race() != null) {
            this.race = data.race();
        }

        if(data.level() != null){
            this.level = data.level();
        }

        if(data.character_name() != null){
            this.character_name = data.character_name();
        }

    }
}
