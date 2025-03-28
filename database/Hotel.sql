use TravelManagementSystem;

create table hotel(name varchar(40), costperperson varchar(20), acroom varchar(10), food varchar(10));

INSERT INTO hotel (name, costperperson, acroom, food) 
VALUES 
('Raddison Blue Hotel', '3400', '1000', '1700'),
('River View Hotel', '2400', '1500', '1000'),
('Taj Hotel', '6900', '1900', '2000');

select * from hotel;