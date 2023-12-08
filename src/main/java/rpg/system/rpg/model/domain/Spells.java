package rpg.system.rpg.model.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rpg.system.rpg.model.services.RequestPostSpell;

@Table(name = "Spells")
@Entity(name = "Spells")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "spell_id")
public class Spells {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long spell_id;


    @Column(name = "character_id")
    private Long character_id;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;


    public Spells(RequestPostSpell data) {
        this.character_id = data.character_id();
        this.name = data.name();
        this.description = data.description();
    }
}
