package rpg.system.rpg.model.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rpg.system.rpg.model.domain.CharacterItem;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<CharacterItem, Long> {

    @Query(value = "SELECT * FROM characteritems WHERE character_id = :character_id ", nativeQuery = true)
    List<CharacterItem> findItemsByCharacterId(@Param("character_id") Long character_id);

}
