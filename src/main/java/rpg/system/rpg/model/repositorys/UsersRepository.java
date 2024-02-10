package rpg.system.rpg.model.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rpg.system.rpg.model.domain.Spells;
import rpg.system.rpg.model.domain.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository <User, Long> {

    @Query(value = "SELECT id FROM users WHERE login = :login AND password_hash = :password_hash", nativeQuery = true)
    Optional<Long> userAuthentication(@Param("login") String login, @Param("password_hash") String passwordHash);

}
