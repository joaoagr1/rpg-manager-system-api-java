alter table skills
drop foreign key skills_ibfk_1;

alter table skills
add constraint skills_ibfk_1
foreign key (character_id) references characters(id)
on delete cascade;