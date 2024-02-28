delimiter //
create trigger after_character_insert
after insert on characters for each row
begin
insert into characterjournal (character_id, journal)
values (new.id, null);
end;
//
delimiter ;