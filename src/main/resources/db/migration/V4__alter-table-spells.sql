ALTER TABLE spells
DROP FOREIGN KEY spells_ibfk_1;

ALTER TABLE spells
ADD CONSTRAINT spells_ibfk_1
FOREIGN KEY (character_id) REFERENCES characters(id)
ON DELETE CASCADE;
