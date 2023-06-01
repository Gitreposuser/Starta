USE w3schools;

-- Task 1
SELECT COUNT(*) AS All_Orders, Customers.Country AS To_Country, 
	Shippers.ShipperName AS Shipper
FROM Orders
INNER JOIN Shippers
ON Orders.ShipperID = Shippers.ShipperID
INNER JOIN Customers
ON orders.CustomerID = customers.CustomerID
WHERE Customers.Country = 'Brazil' AND Shippers.ShipperName = 'Speedy Express';

-- Task 2
SELECT SUM(Price * Quantity) AS Total_Sum, Country AS Send_To
FROM Order_Details
INNER JOIN Products
ON Order_Details.ProductID = Products.ProductID
INNER JOIN Orders
ON Order_Details.OrderID = Orders.OrderID
INNER JOIN Customers
ON Orders.CustomerID = Customers.CustomerID
WHERE Customers.Country = 'USA';
