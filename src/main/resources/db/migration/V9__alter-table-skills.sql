ALTER TABLE skills
DROP FOREIGN KEY skills_ibfk_1;

ALTER TABLE skills
ADD CONSTRAINT skills_ibfk_1
FOREIGN KEY (character_id) REFERENCES characters(id)
ON DELETE CASCADE;
