-- drop da chave estrangeira existente
alter table spells
drop foreign key spells_ibfk_1;

-- adição de uma nova chave estrangeira
alter table spells
add constraint spells_ibfk_1
foreign key (character_id) references characters(id)
on delete cascade;
