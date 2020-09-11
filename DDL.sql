create schema tarefas;

create user 'taruser'@'localhost' identified by 'pass123';

grant select, insert, delete, update on tarefas.* to taruser@'localhost';

use tarefas;

create table tar_tarefa (
  tar_id bigint unsigned primary key auto_increment,
  tar_descricao varchar(200) not null,
  tar_inicio_previsto datetime not null,
  tar_inicio_real datetime,
  tar_termino_previsto datetime,
  tar_termino_real datetime
);

insert into tar_tarefa (tar_descricao, tar_inicio_previsto, tar_inicio_real, tar_termino_previsto) 
  values ('Tarefa teste 1', '2020-09-08', '2020-09-09', '2020-09-18');
insert into tar_tarefa (tar_descricao, tar_inicio_previsto, tar_termino_previsto) 
  values ('Tarefa teste 2', '2020-09-10', '2020-09-15');
