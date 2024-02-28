delimiter //
create trigger after_character_insert_skills
after insert on characters for each row
begin
insert into skills (character_id, acrobatics, animal_handling, arcana, athletics, deception, history, insight, intimidation ,investigation,
medicine, nature, perception,performance, persuasion, religion, sleight_of_hand, stealth, survival)
values (new.id, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
end;
//
delimiter ;