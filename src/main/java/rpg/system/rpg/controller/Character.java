package rpg.system.rpg.controller;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Character")
@Entity(name = "Character")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "user_id")
    private String user_id;

    @Column(name = "background")
    private String background;

    @Column(name = "alignment")
    private String alignment;




}
