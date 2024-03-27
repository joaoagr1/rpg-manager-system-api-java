-- drop da chave estrangeira existente
alter table characteritems
drop foreign key characteritems_ibfk_1;

-- adição de uma nova chave estrangeira
alter table characteritems
add constraint characteritems_ibfk_1
foreign key (character_id) references characters(id)
on delete cascade;
