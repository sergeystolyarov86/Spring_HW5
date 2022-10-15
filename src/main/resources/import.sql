DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial, cost double, title VARCHAR(255), PRIMARY KEY (id));
INSERT INTO products (title, cost) VALUES ('Apple', 50), ('Orange', 80), ('Beer', 70);
