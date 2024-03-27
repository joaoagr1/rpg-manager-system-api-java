package rpg.system.rpg.model.repositorys;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rpg.system.rpg.model.domain.RPGCharacters;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharactersRepository extends JpaRepository<RPGCharacters, Long> {

    @Query(value = "SELECT * FROM characters WHERE user_id = :user_id", nativeQuery = true)
    List<RPGCharacters> findCharactersByUserId(@Param("user_id") Long user_id);

    @Transactional
    @Modifying
    @Query(value = "UPDATE characters SET image = :foto WHERE id = :character_Id", nativeQuery = true)
    void saveFoto(@Param("character_Id") Long character_id, @Param("foto") byte[] foto);

    Optional<RPGCharacters> findByCharacterId(Long character_id);

    @Query(value = "SELECT image FROM characters WHERE id = :character_Id", nativeQuery = true)
    byte[] findFotoById(@Param("character_Id") Long character_id);

}



