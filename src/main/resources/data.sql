DROP TABLE IF EXISTS orders;

CREATE TABLE orders (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  symbol VARCHAR(250)  NULL,
  side VARCHAR(250)  NULL,
  quantity INT DEFAULT NULL
);

INSERT INTO orders (symbol, side, quantity) VALUES
  ('ALI', 'BUY', 100),
  ('TECH', 'SHORT', 100),
  ('AMD', 'BUY', 300);
