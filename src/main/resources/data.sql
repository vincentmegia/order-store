INSERT INTO orders (symbol, side, quantity) VALUES
  ('ALI', 'BUY', 100);
INSERT INTO orders (symbol, side, quantity) VALUES
  ('TECH', 'SHORT', 100);
INSERT INTO orders (symbol, side, quantity) VALUES
  ('AMD', 'BUY', 300);

INSERT INTO transactions (orderid, price)
VALUES (1, 1.12);

INSERT INTO transactions (orderid, price)
VALUES (1, 2.12);

INSERT INTO transactions (orderid, price)
VALUES (2, 2.12);

INSERT INTO transactions (orderid, price)
VALUES (2, 2.12);
