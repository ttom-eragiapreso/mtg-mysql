INSERT INTO db_mtg.rarities (id, name) VALUES(1, 'Comune');
INSERT INTO db_mtg.rarities (id, name) VALUES(2, 'Non Comune');
INSERT INTO db_mtg.rarities (id, name) VALUES(3, 'Rara');
INSERT INTO db_mtg.rarities (id, name) VALUES(4, 'Rara Mitica');

INSERT INTO db_mtg.colors (id, name) VALUES(1, 'Bianco');
INSERT INTO db_mtg.colors (id, name) VALUES(2, 'Rosso');
INSERT INTO db_mtg.colors (id, name) VALUES(3, 'Blu');
INSERT INTO db_mtg.colors (id, name) VALUES(4, 'Nero');
INSERT INTO db_mtg.colors (id, name) VALUES(5, 'Verde');
INSERT INTO db_mtg.colors (id, name) VALUES(6, 'Incolore');

INSERT INTO db_mtg.color_identities (id, name) VALUES(1, 'W');
INSERT INTO db_mtg.color_identities (id, name) VALUES(2, 'R');
INSERT INTO db_mtg.color_identities (id, name) VALUES(3, 'U');
INSERT INTO db_mtg.color_identities (id, name) VALUES(4, 'B');
INSERT INTO db_mtg.color_identities (id, name) VALUES(5, 'G');

INSERT INTO db_mtg.users (id, password, username) VALUES(1, '{noop}ciao', 'enrico');

INSERT INTO db_mtg.roles (id, name) VALUES(1, 'ADMIN');

INSERT INTO db_mtg.users_roles (users_id, roles_id) VALUES(1, 1);


