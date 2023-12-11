package rpg.system.rpg.model.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import rpg.system.rpg.model.services.RequestUpdateAttributes;
import rpg.system.rpg.model.services.RequestUpdateCharacter;

@Entity
@Table(name = "attributepoints")
@Getter
@Setter
public class AttributePoints {

    @Id
    @Column(name = "character_id")
    private Long character_id;

    @Column(name = "strength", nullable = false)
    private Long strength;

    @Column(name = "dexterity", nullable = false)
    private Long dexterity;

    @Column(name = "constitution", nullable = false)
    private Long constitution;

    @Column(name = "intelligence", nullable = false)
    private Long intelligence;

    @Column(name = "wisdom", nullable = false)
    private Long wisdom;

    @Column(name = "charisma", nullable = false)
    private Long charisma;

    @Column(name = "passive_perception", nullable = false)
    private Long passivePerception;


    public void updatedataAttribute(RequestUpdateAttributes dataAttribute) {
        if (dataAttribute.strength() != null) {
            this.strength = dataAttribute.strength();
        }
        if (dataAttribute.passivePerception() != null) {
            this.passivePerception = dataAttribute.passivePerception();
        }
        if (dataAttribute.dexterity() != null) {
            this.dexterity = dataAttribute.dexterity();
        }
        if (dataAttribute.constitution() != null) {
            this.constitution = dataAttribute.constitution();
        }

        if (dataAttribute.intelligence() != null) {
            this.intelligence = dataAttribute.intelligence();
        }

        if (dataAttribute.wisdom() != null) {
            this.wisdom = dataAttribute.wisdom();
        }

        if (dataAttribute.charisma() != null) {
            this.charisma = dataAttribute.charisma();
        }

    }
}
