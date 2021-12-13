CREATE EXTENSION IF NOT EXISTS pgcrypto;
INSERT INTO usser (username, password) VALUES
('user', crypt('pass', gen_salt('bf')));

INSERT INTO anime(name, description, type, year, image) VALUES
 ('Anime1', 'Description1', 'XD', 2002, '/tmp/image'),
 ('Anime2', 'Description2', 'XD', 2003, '/tmp/image2');

 INSERT INTO author(name, imageurl) VALUES
 ('Masashi Kishimoto', '/tmp/author1'),
 ('Junji Ito', '/tmp/author2');

INSERT INTO genre(label, imageurl) VALUES
    ('Action', '/tmp/genre1');

INSERT INTO favorito(userid, animeid) VALUES
    ((SELECT userid FROM usser WHERE username='user'), (SELECT animeid FROM anime WHERE name='Anime1'));

INSERT INTO visto(userid, animeid) VALUES
    ((SELECT userid FROM usser WHERE username='user'), (SELECT animeid FROM anime WHERE name='Anime1'));


