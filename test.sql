CREATE TABLE Orders (
    order_id    INT PRIMARY KEY,
    customre_id INT,
    order_date  DATE,
    quantity INT 
);

ALTER TABLE Orders 
ADD CONSTRAINT chk_quantity_positive
CHECK (quantity > 0);

INSERT INTO orders (
    order_id,
    customer_id,
    order_date,
    quantity
) VALUES ( 1,
           11,
           DATE '2025 - 10 - 04',
           3 );
           
INSERT INTO orders ( quantity ) VALUES ( 0 );