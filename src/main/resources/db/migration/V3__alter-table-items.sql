-- Drop da chave estrangeira existente
ALTER TABLE CharacterItems
DROP FOREIGN KEY characteritems_ibfk_1;

-- Adição de uma nova chave estrangeira
ALTER TABLE CharacterItems
ADD CONSTRAINT characteritems_ibfk_1
FOREIGN KEY (character_id) REFERENCES Characters(id)
ON DELETE CASCADE;
