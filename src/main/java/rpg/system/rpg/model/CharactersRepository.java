package rpg.system.rpg.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Characters;
import java.util.List;

@Repository
public interface CharactersRepository extends JpaRepository<RPGCharacters, Long> {


}
