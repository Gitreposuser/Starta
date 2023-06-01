-- Task 1
SELECT t1.OrderID, t2.CustomerName, t2.Country, t2.City FROM Orders t1
inner join Customers t2
on t1.CustomerID = t2.CustomerID;

-- Task 2
SELECT ProductName, Price Name FROM Products
INNER JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID
WHERE Suppliers.Country = 'Germany'
ORDER BY Products.Price ASC
LIMIT 2;

-- Task 3
SELECT ProductName, Price * 1.1 as Dollars FROM Products
INNER JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID
WHERE Suppliers.Country = 'Germany'
ORDER BY Products.Price ASC
LIMIT 2;