package rpg.system.rpg.model.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rpg.system.rpg.model.domain.RPGCharacters;

import java.util.List;

@Repository
public interface CharactersRepository extends JpaRepository<RPGCharacters, Long> {

    @Query(value = "SELECT * FROM Characters WHERE user_id = :user_id", nativeQuery = true)
    List<RPGCharacters> findCharactersByUserId(@Param("user_id") Long user_id);





}
