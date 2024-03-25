-- Drop da chave estrangeira existente
ALTER TABLE Spells
DROP FOREIGN KEY spells_ibfk_1;

-- Adição de uma nova chave estrangeira
ALTER TABLE Spells
ADD CONSTRAINT spells_ibfk_1
FOREIGN KEY (character_id) REFERENCES Characters(id)
ON DELETE CASCADE;
