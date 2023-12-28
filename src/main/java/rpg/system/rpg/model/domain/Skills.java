package rpg.system.rpg.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rpg.system.rpg.model.services.RequestPostItem;
import rpg.system.rpg.model.services.RequestUpdateAttributes;
import rpg.system.rpg.model.services.RequestUpdateSkills;

@Entity(name = "skills")
@Table(name = "skills")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Skills {


    @Id
    @Column(name = "character_id")
    private Long character_id;

    @Column(name = "Acrobatics", nullable = false)
    private Long acrobatics;

    @Column(name = "Animal_Handling", nullable = false)
    private Long animal_Handling;

    @Column(name = "Arcana", nullable = false)
    private Long arcana;

    @Column(name = "Athletics", nullable = false)
    private Long athletics;

    @Column(name = "Deception", nullable = false)
    private Long deception;

    @Column(name = "History", nullable = false)
    private Long history;

    @Column(name = "Insight", nullable = false)
    private Long insight;

    @Column(name = "Intimidation", nullable = false)
    private Long intimidation;

    @Column(name = "Investigation", nullable = false)
    private Long investigation;

    @Column(name = "Medicine", nullable = false)
    private Long medicine;

    @Column(name = "Nature", nullable = false)
    private Long nature;

    @Column(name = "Perception", nullable = false)
    private Long perception;

    @Column(name = "Performance", nullable = false)
    private Long performance;

    @Column(name = "Persuasion", nullable = false)
    private Long persuasion;

    @Column(name = "Religion", nullable = false)
    private Long religion;

    @Column(name = "Sleight_of_Hand", nullable = false)
    private Long sleight_of_Hand;

    @Column(name = "Stealth", nullable = false)
    private Long stealth;

    @Column(name = "Survival", nullable = false)
    private Long survival;


    public void updatedataSkills(RequestUpdateSkills dataSkills) {
        if (dataSkills.acrobatics() != null) {
            this.acrobatics = dataSkills.acrobatics();
        }
        if (dataSkills.animal_Handling() != null) {
            this.animal_Handling = dataSkills.animal_Handling();
        }
        if (dataSkills.arcana() != null) {
            this.arcana = dataSkills.arcana();
        }
        if (dataSkills.athletics() != null) {
            this.athletics = dataSkills.athletics();
        }

        if (dataSkills.deception() != null) {
            this.deception = dataSkills.deception();
        }

        if (dataSkills.history() != null) {
            this.history = dataSkills.history();
        }

        if (dataSkills.insight() != null) {
            this.insight = dataSkills.insight();
        }

        if (dataSkills.intimidation() != null) {
            this.intimidation = dataSkills.intimidation();
        }

        if (dataSkills.investigation() != null) {
            this.investigation = dataSkills.investigation();
        }
        if (dataSkills.medicine() != null) {
            this.medicine = dataSkills.medicine();
        }
        if (dataSkills.nature() != null) {
            this.nature = dataSkills.nature();
        }
        if (dataSkills.perception() != null) {
            this.perception = dataSkills.perception();
        }

        if (dataSkills.performance() != null) {
            this.performance = dataSkills.performance();
        }

        if (dataSkills.persuasion() != null) {
            this.persuasion = dataSkills.persuasion();
        }

        if (dataSkills.religion() != null) {
            this.religion = dataSkills.religion();
        }

        if (dataSkills.sleight_of_Hand() != null) {
            this.sleight_of_Hand = dataSkills.sleight_of_Hand();
        }

        if (dataSkills.stealth() != null) {
            this.stealth = dataSkills.stealth();
        }

        if (dataSkills.survival() != null) {
            this.survival = dataSkills.survival();
        }

    }
}



