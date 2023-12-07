package rpg.system.rpg.model.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    @ManyToOne
    @JoinColumn(name = "character_id")
    private RPGCharacters character;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;



}
