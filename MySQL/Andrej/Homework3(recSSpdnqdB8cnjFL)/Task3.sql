USE w3schools;

-- Task 1
SELECT SUM(Price * Quantity) * 0.1 AS Total_Salary
FROM Order_Details
INNER JOIN Products
ON Order_Details.ProductID = Products.ProductID;

-- Task 1.1
SELECT Employees.LastName, 
    Employees.FirstName,
    SUM(Price * Quantity) * 0.1 AS Total_Salary
FROM Order_Details
INNER JOIN Products
ON Order_Details.ProductID = Products.ProductID
INNER JOIN Orders
ON Order_Details.OrderID = Orders.OrderID
INNER JOIN Employees
ON Orders.EmployeeID = Employees.EmployeeID
GROUP BY Employees.EmployeeID
ORDER BY Total_Salary desc;

-- Task 2
SELECT Employees.LastName, Employees.FirstName, COUNT(*) AS Orders_Qauntity
FROM Orders
INNER JOIN Employees
ON Orders.EmployeeID = Employees.EmployeeID
GROUP BY Employees.EmployeeID
HAVING Orders_Qauntity < 20
ORDER BY Orders_Qauntity desc;

-- Task 3
SELECT ShipperName, Count(Orders.ShipperID) AS Orders_Shipped
FROM Orders
INNER JOIN Shippers
ON Orders.ShipperID = Shippers.ShipperID
GROUP BY Shippers.ShipperID
ORDER BY Orders_Shipped desc;

-- Task 4
SET SQL_SAFE_UPDATES = 0;

UPDATE Customers
SET ContactName = '' 
WHERE Country = 'Mexico';

SET SQL_SAFE_UPDATES = 1;

-- Task 5
/*
Order_Details table
Order_Details.OrderID (M:1) Order.OrderID
Order_Details.ProductID (M:1) Products.ProductID

Orders table
Orders.CustomerID (M:1) Customers.CustomerID
Orders.EmployeeID (M:1) Employees.EmployeeID
Orders.ShipperID (M:1) Shippers.ShipperID

Products table
Products.SupplierID (M:1) Suppliers.SupplierID
Products.CategoryID (M:1) Categories.CategoryID
*/
