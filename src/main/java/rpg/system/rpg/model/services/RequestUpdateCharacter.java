package rpg.system.rpg.model.services;

import org.antlr.v4.runtime.misc.NotNull;

public record RequestUpdateCharacter(
        @NotNull
        Long id,
        String background,
        String alignment,
        String features,
        String class_,
        String race,
        Long level,
        String character_name
        ) {

}
