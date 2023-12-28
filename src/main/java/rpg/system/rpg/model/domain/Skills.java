package rpg.system.rpg.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rpg.system.rpg.model.services.RequestPostItem;

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





        }



