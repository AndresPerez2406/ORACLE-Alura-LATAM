alter table medicos add activo tinyint;

UPDATE medicos SET activo=1;