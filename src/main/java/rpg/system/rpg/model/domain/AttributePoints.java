package rpg.system.rpg.model.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "AttributePoints")
@Getter
@Setter
public class AttributePoints {

    @Id
    @Column(name = "character_id")
    private Long characterId;

    @Column(name = "strength", nullable = false)
    private int strength;

    @Column(name = "dexterity", nullable = false)
    private int dexterity;

    @Column(name = "constitution", nullable = false)
    private int constitution;

    @Column(name = "intelligence", nullable = false)
    private int intelligence;

    @Column(name = "wisdom", nullable = false)
    private int wisdom;

    @Column(name = "charisma", nullable = false)
    private int charisma;

    @Column(name = "passive_perception", nullable = false)
    private int passivePerception;

}
