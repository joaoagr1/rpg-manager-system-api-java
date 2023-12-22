package rpg.system.rpg.model.services;

import org.antlr.v4.runtime.misc.NotNull;
import rpg.system.rpg.model.domain.User;

public record RequestPostCharacter(
        String background,
        String alignment,
        String features,
        String class_,
        String race,
        Long level,
        String characterName,
        Long user_id,
        Long gp,
        Long ac
        ) {

}
