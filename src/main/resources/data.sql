
drop table "address" if exists;

CREATE TABLE "address" (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  address VARCHAR(250) DEFAULT NULL
);

INSERT INTO "address" (name, address) VALUES
  ('Bill Gates', 'Billionaire Road - Washington'),
  ('Kumar Valla', 'Valanjavattom');