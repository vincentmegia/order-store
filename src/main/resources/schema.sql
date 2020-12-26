-- DROP TABLE IF EXISTS orders;
-- DROP TABLE IF EXISTS transactions

CREATE TABLE orders (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  symbol VARCHAR(250)  NULL,
  side VARCHAR(250)  NULL,
  quantity INT DEFAULT NULL
);

CREATE TABLE transactions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    orderid INT references orders(id),
    price double
)
