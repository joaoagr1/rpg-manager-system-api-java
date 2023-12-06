package rpg.system.rpg.model.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Characters")
@Entity(name = "Characters")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class RPGCharacters {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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




}
