-- Task 1
SELECT Suppliers.SupplierName, AVG(Products.Price) AS avg_price
FROM Products
INNER JOIN Suppliers
on Products.SupplierID = Suppliers.SupplierID
GROUP BY Products.SupplierID
ORDER BY avg_price DESC;

-- Task 2
SELECT Suppliers.SupplierName, COUNT(*) AS total_products
FROM Products
INNER JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID
GROUP BY Products.SupplierID
ORDER BY total_products DESC
LIMIT 2;

-- Task 3
SELECT Customers.Country, COUNT(Customers.Country) AS Count 
FROM customers
GROUP BY Country
HAVING Count > 10
ORDER BY Count DESC;

-- Task 4
SELECT Customers.Country, COUNT(*) AS total_orders
FROM Orders
INNER JOIN Customers ON Orders.CustomerID = customers.CustomerID
GROUP BY Customers.Country
HAVING total_orders >= 3
ORDER BY total_orders DESC;

-- Task 5
SELECT Order_details.OrderID AS OrderID, 
	SUM(Products.Price * Order_details.Quantity) AS each_order
FROM Order_details
INNER JOIN Products ON Order_details.ProductID = Products.ProductID
GROUP BY Order_details.OrderID
ORDER BY Order_details.OrderID DESC;

