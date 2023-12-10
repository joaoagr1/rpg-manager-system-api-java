package rpg.system.rpg.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rpg.system.rpg.model.services.RequestPostItem;

@Entity(name = "characteritems")
@Table(name = "characteritems")
@EqualsAndHashCode(of = "characteritems_id")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CharacterItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characteritems_id;


    @Column(name = "character_id")
    private Long character_id;


    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    public CharacterItem(RequestPostItem data) {
        this.character_id = data.character_id();
        this.description = data.description();
        this.name = data.name();

    }
}
