package rpg.system.rpg.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rpg.system.rpg.model.services.RequestPostItem;

@Entity(name = "Characteritems")
@Table(name = "Characteritems")
@EqualsAndHashCode(of = "characteritems_id")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CharacterItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "characteritems_id")
    private Long characterItemsId;


    @Column(name = "character_id")
    private Long characterId;

    private String name;

    private String description;

    public CharacterItem(RequestPostItem data) {
        this.characterId = data.character_id();
        this.description = data.description();
        this.name = data.name();
    }
}
