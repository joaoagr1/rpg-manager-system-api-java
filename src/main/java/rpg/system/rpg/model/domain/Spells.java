package rpg.system.rpg.model.domain;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rpg.system.rpg.model.services.RequestPostSpell;

@Table(name = "spells")
@Entity(name = "spells")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "spellId")
public class Spells {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spell_id")
    private Long spellId;

    @Column(name = "character_id")
    private Long characterId;

    @NotBlank
    private String name;

    private String description;

    public Spells(RequestPostSpell data) {
        this.characterId = data.character_id();
        this.name = data.name();
        this.description = data.description();
    }
}
