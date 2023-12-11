package rpg.system.rpg.model.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rpg.system.rpg.model.services.RequestUpdateCharacter;
import rpg.system.rpg.model.services.RequestUpdateJournal;

@Entity(name = "characterjournal")
@Table(name = "characterjournal")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Journal {

    @Id
    @Column(name = "character_id")
    private Long character_id;

    @Column(name = "journal", columnDefinition = "TEXT")
    private String journal;

    public void updatedata(RequestUpdateJournal data) {
        this.journal=data.journal();



    }


}
