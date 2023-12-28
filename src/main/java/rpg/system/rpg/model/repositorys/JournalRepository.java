package rpg.system.rpg.model.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rpg.system.rpg.model.domain.Journal;

import java.util.List;

@Repository
public interface JournalRepository extends JpaRepository<Journal, Long> {

    @Query(value = "SELECT * FROM characterjournal WHERE character_id = :character_id ", nativeQuery = true)
    List<Journal> findJournalByCharacterId(@Param("character_id") Long character_id);

}
