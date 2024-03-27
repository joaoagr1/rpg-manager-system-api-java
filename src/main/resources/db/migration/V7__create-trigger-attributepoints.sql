delimiter //
create trigger after_character_insert_attributes
after insert on characters for each row
begin
    insert into attributepoints (character_id, strength, dexterity, constitution, intelligence, wisdom, charisma, passive_perception)
    values (new.id, null, null, null, null, null, null, null);
end;
//
delimiter ;
