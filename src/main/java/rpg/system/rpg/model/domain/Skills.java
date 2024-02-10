package rpg.system.rpg.model.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
@EqualsAndHashCode(of = "characterId")
public class Skills {


    @Id
    @Column(name = "character_id")
    private Long characterId;

    @NotNull
    private Long acrobatics;

    @Column(name = "animal_handling", nullable = false)
    private Long animalHandling;

    @NotNull
    private Long arcana;

    @NotNull
    private Long athletics;

    @NotNull
    private Long deception;

    @NotNull
    private Long history;

    @NotNull
    private Long insight;

    @NotNull
    private Long intimidation;

    @NotNull
    private Long investigation;

    @NotNull
    private Long medicine;

    @NotNull
    private Long nature;

    @NotNull
    private Long perception;

    @NotNull
    private Long performance;

    @NotNull
    private Long persuasion;

    @NotNull
    private Long religion;

    @Column(name = "sleight_of_hand", nullable = false)
    private Long sleightOfHand;

    @NotNull
    private Long stealth;

    @NotNull
    private Long survival;


    public void updatedataSkills(RequestUpdateSkills dataSkills) {
        if (dataSkills.acrobatics() != null) {
            this.acrobatics = dataSkills.acrobatics();
        }
        if (dataSkills.animal_Handling() != null) {
            this.animalHandling = dataSkills.animal_Handling();
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
            this.sleightOfHand = dataSkills.sleight_of_Hand();
        }

        if (dataSkills.stealth() != null) {
            this.stealth = dataSkills.stealth();
        }

        if (dataSkills.survival() != null) {
            this.survival = dataSkills.survival();
        }

    }
}



