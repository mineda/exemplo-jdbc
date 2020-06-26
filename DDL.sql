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