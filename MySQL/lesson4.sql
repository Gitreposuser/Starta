-- Task 1
create database sakila;

-- Task 2
drop database sakila;

-- Task 3
use sakila;

-- Task 4
show tables;

-- Task 5
select address, district, city_id, phone, postal_code from address;

-- Task 6
select * from address
where district in ("QLD", "Alberta");

-- Task 7
select * from address
where city_id <= 300 or city_id >= 560;

-- Task 8
select * from address
where postal_code = "";

-- Task 9
select * from address
where phone like "8%1";

-- Task 10
select title, description, special_features from film;

-- Task 11
select * from film
where title like "A%" or title like "B%" or title like "E%";

-- Task 12
select * from film
where description like "%girl%";

-- Task 13
select * from film
where description not like "%unbelieavable%" and description like "%drama%" 
and special_features like "%trailers%";

-- Task 14
select first_name, last_name, address_id, active from customer;

-- Task 15
select * from customers
where active = 0;

-- Task 16 
select * from customers
where address_id < 10 or address_id > 15;

-- Task 17
select * from customers
where first_name like "An%" and last_name like "%L";

-- Task 18
select country_id from country
where country = "Germany";

-- Task 19
select * from city
where country_id = 38;

-- Task 20
select * from city
where country_id in (3, 5, 13, 46, 107);

-- Task
create database gt41_42;

-- Task 1
use gt41_42;

-- Task 2
show tables;

-- Task 3
create table customers
(
	id int primary key auto_increment,
    first_name varchar(30) not null,
    last_name varchar(30) not null,
    age int check (age > 18),
    phone int not null,
    order_name varchar(30) not null,
    delivery_status int check (delivery_status in (1, 0))
);

use gt41_42;

-- Task 4
alter table customers
drop first_name, 
drop last_name;

-- Task 5
alter table customers
add full_name varchar(50) not null;

-- Task 6
alter table customers
change column customer_id customer_id int primary key auto_increment;

-- Task 7
alter table customers
add price int not null;

-- Task 8
alter table customers
modify column phone varchar(15);

-- 
alter table customers
modify column customer_id int auto_increment;

-- Task 9
alter table customers
drop phone;

-- Task 10
alter table customers
change column price sum_price int not null;

insert into customers(full_name, age, order_name, delivery_status, sum_price) 
			values( "Kris Krill" , 20 , "math_book, pen" , 0 , 9000 ) ,
				( "Kristin Brooks" , 50 , "notebook, pen, drawing_block" , 0 , 4500 ) ,
				( "Kristina Livshits" , 55 , "pencil, sharpener" , 1 , 2340 ) ,
				( "Kristina Nunez" , 43 , "math_book, eng_book, phil_book" , 1 , 18000 ) ,
				( "Kurtis Parham" , 19 , "pencil" , 1 , 350 ) ,
				( "Lai Kurtich" , 22 , "pen, sharpener" , 1 , 1200 ) ,
				( "Lakia Fitzen" , 21 , "notebook, pen" , 1 , 3500 ) ,
				( "Landon Neville" , 34 , "colored papers, pencil" , 1 , 2450 ) ,
				( "Latoria Siprasoeuth" , 32 , "pen, sharpener, rubber" , 1 , 4600 ) ,
				( "Laurice Goffredo" , 76 , "watercolors, drawing_block" , 1 , 1200 ) ,
				( "Laurice Grimstead" , 54 , "notebook" , 1 , 4500 ) ,
				( "Laurice Karl" , 19 , "colored papers" , 0 , 2250 ) ,
				( "Laveta Wida" , 34 , "pen, math_book" , 0 , 1170 ) ,
				( "Lecia Alvino" , 45 , "pencil, sharpener, notebook" , 1 , 9000 ) ,
				( "Lenore Sullivan" , 55 , "eng_book, notebook" , 1 , 175 ) ,
				( "Leon Schoepfer" , 67 , "notebook" , 0 , 600 ) ,
				( "Lexie Magee" , 54 , "watercolors, drawing_block, brushes" , 0 , 1750 ) ,
				( "Li Robleto" , 76 , "brushes, pencil, notebook" , 0 , 1225 ) ,
				( "Libby Krauss" , 78 , "brushes, watercolor" , 0 , 2300 ) ,
				( "Lillia Talbott" , 65 , "eng_book, pen, rubber" , 0 , 600 ) ,
				( "Linda Merida" , 54 , "notebook, pen, drawing_block" , 1 , 7700 ) ,
				( "Lisa Hughes" , 34 , "flag" , 1 , 5450 ) ,
				( "Lloyd Shackley" , 23 , "brushes, watercolor" , 1 , 4370 ) ,
				( "Lola Whitley" , 24 , "notebook" , 0 , 12200 ) ,
				( "Lonnie Colby" , 74 , "notepad" , 1 , 3375 ) ,
				( "Lorilee Bautista" , 24 , "pencil, sharpener" , 1 , 3800 ) ,
				( "Loris Thibadeau" , 54 , "notepad" , 1 , 4950 ) ,
				( "Lorita Koenig" , 59 , "flag" , 0 , 4425 ) ,
				( "Love Whistlehunt" , 47 , "notepad" , 1 , 5500 ) ,
				( "Lovie Ritacco" , 23 , "colored papers" , 1 , 3800 ) ,
				( "Loyd Huckeba" , 26 , "flag" , 0 , 300 ) ,
				( "Loyd Puchalla" , 25 , "notebook" , 1 , 3850 ) ,
				( "Luana Berends" , 38 , "pencil, sharpener, rubber" , 1 , 2725 ) ,
				( "Lucas Summerill" , 36 , "notepad, pen" , 0 , 2185 ) ,
				( "Luciano Lingenfelter" , 80 , "sharpener" , 1 , 6100 ) ,
				( "Lucila Heck" , 58 , "brushes, watercolor" , 1 , 1687.5 ) ,
				( "Luigi Nored" , 23 , "notepad" , 1 , 1900 ) ,
				( "Luis Pothoven" , 38 , "flag" , 1 , 2475 ) ,
				( "Luther Ardinger" , 49 , "notebook" , 1 , 2212.5 ) ,
				( "Mable Ballard" , 59 , "colored papers, pencil" , 1 , 2750 ) ,
				( "Maia Leggett" , 71 , "notepad" , 1 , 1900 ) ,
				( "Marc Domanski" , 58 , "rubber, pencil" , 1 , 4930 ) ,
				( "Marco Slivka" , 80 , "brushes, watercolor" , 1 , 2680 ) ,
				( "Margaret Bennett" , 82 , "pencil, sharpener, pen" , 1 , 1600 ) ,
				( "Marissa Pontius" , 69 , "notebook" , 1 , 9430 ) ,
				( "Markita Larner" , 58 , "notepad, flag" , 1 , 605 ) ,
				( "Martha Baker" , 38 , "colored papers, notebook" , 1 , 1030 ) ,
				( "Marvis Chou" , 27 , "pencil, sharpener" , 0 , 2180 ) ,
				( "Mary Barnes" , 28 , "brushes, watercolor" , 0 , 1655 ) ,
				( "Mary Wilson" , 78 , "notebook" , 0 , 2730 );

-- Task 12
select * from customers
where age > 30 and (order_name like ("%pen") 
or order_name like "%pen,%");

-- Task 13
select * from customers
where delivery_status = 0
and order_name like("%notebook%")
and (order_name like ("%pen") 
or order_name like "%pen,%");

-- Task 15
SET SQL_SAFE_UPDATES = 0;

update customers
set sum_price = sum_price + 100
where order_name like ("%pencil%");

-- Task 18
update customers
set delivery_status = 1
where sum_price > 1200 
and delivery_status = 0;

SET SQL_SAFE_UPDATES = 1;

create table phones(
	id int primary key auto_increment,
    product_name varchar(128) not null,
    product_count int,
    starting_price int not null
);

insert into Phones(Product_Name, Product_Count, Starting_Price) 
values('iPhone X', 3, 680),
 ('iPhone XR', 2, 700),
 ('iPhone XS', 10, 720),
 ('iPhone 11', 1, 790),
 ('iPhone 11 Pro', 12, 850),
 ('iPhone 11 Pro Max', 2, 890),
 ('iPhone SE', 1, 850),
 ('iPhone 12 Mini', 15, 890),
 ('iPhone 12', 20, 910),
 ('iPhone 12 Pro', 5, 950),
 ('iPhone 12 Pro Max', 13, 1000);

select product_name as name, 
product_count as count,
starting_price as prise from phones;

-- CASE

select product_name, product_count,
case
	when product_count <= 2 then "Product out of stock"
	when product_count <= 5 then "Low stock"
    when product_count <= 10 then "In stock"
    else "Stock is full"
end as category
from phones;

alter table phones
add category varchar(128);

set sql_safe_updates = 0;

update phones
set category = 
case
	when product_count <= 2 then "Product out of stock"
	when product_count <= 5 then "Low stock"
    when product_count <= 10 then "In stock"
    else "Stock is full"
end;

-- Создать новое поле tax целое число
-- Заполнить поле tax
-- Если начальная цена меньше 700, tax = null,
-- если больше либо равно 700 и меньше 850, tax = 15,
-- если больше или равно 850, tax = 25

alter table phones
add tax int;

update phones
set tax = 
case
	when starting_price < 700 then null
	when starting_price < 850 then 15
    else 25
end;

-- Task

select product_name, starting_price,
starting_price + starting_price * tax / 100 as final_price
from phones;

-- Создать новое поле для final_price numeric(7, 2)
alter table phones
add final_price numeric(7, 2);

update phones
set final_price = 
case
	when tax is null then starting_price
    else starting_price + starting_price * tax / 100
end;

update phones
set final_price = coalesce(starting_price + starting_price * tax / 100,
starting_price);

-- Function working with numbers
select 1 as value;

select -1 as value;

select 1.23 as value;

-- ABS: return absolute value of number
select abs(-23) as abs;

-- POW(m, n): return m in n
select pow(4, 2) as pow;

-- ROUND: cut part of number
select round(1234.567, 2) as round_1;
select round(1234.567, -2) as round_2;

-- SQRT: get square root of number
select sqrt(225) as sqrt;

-- RAND: generate random number from 0 to 1
select round(rand(), 2) as rand; 

-- Function for strings

-- CONCAT: cancatenate strings. Accepts 2 or more strings
select concat("Tom", " ", "Smith") as full_name;

-- CONCAT_WS: cancatenate strings. Separator first parameter
select concat_ws("*", "Tom", "Smith", "age", "34") as information;

-- LENGTH: return quantity symbols. String as parameter
select length("Tom Smith") as lenght;

-- LTRIM remove spaces from left side
select ltrim("   apple");

-- RTRIM remove spaces from right side
select rtrim("apple   ");

-- TRIM remove all spaces
select trim("   apple   ");

-- LEFT cut N symbols from left
select left("apple", 3);

-- RIGHT cut N symbols from right
select right("apple", 3);

-- SUBSTRING(str, start [, lenth]): cut substring from string str
select substring("galaxy s8 plus", 8);
select substring("galaxy s8 plus", 8, 2);

-- REPLACE(search, find, replace): replace in find substring search
select replace("galaxy S8 plus", "S8", "A9");

-- LOCATE(find, sezrch [, start]): return position of first of subsequence
select locate("a", "Anna"); -- 1
select locate("a", "Anna", 2); -- 4
select locate("a", "Tom"); -- 0

-- REVERSE: reversing string backwards
select reverse("Tom");
select reverse("12345");

-- LOWER: to lower register
select lower("APPLe");

-- UPPER: to  upper register
select upper("APPLe");

