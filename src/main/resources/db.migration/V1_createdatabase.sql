DROP TABLE IF EXISTS anime CASCADE;

CREATE TABLE IF NOT EXISTS anime (
    animeid uuid NOT NULL DEFAULT gen_random_uuid() PRIMARY KEY,
    name text,
    description text,
    type text,
    year int,
    image text
);

INSERT INTO anime(name, description, type, year, image) VALUES
 ('Anime1', 'Description1', 'XD', 2002, '/tmp/image'),
 ('Anime2', 'Description2', 'XD', 2003, '/tmp/image2');