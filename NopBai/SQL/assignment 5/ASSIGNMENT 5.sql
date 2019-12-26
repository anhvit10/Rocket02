USE adventureworks;
-- QUESTION 1 EXERCISE 1
SELECT 
    p.`Name`
FROM
    product p
        JOIN
    productsubcategory ps ON p.ProductSubcategoryID = ps.ProductSubcategoryID
WHERE
    ps.`Name` = 'SADDLES';
                
                
-- QUESTION 2 EXERCISE 1              
SELECT 
    `Name`
FROM
    product
WHERE
    ProductSubcategoryID = (SELECT 
            ProductSubcategoryID
        FROM
            productsubcategory
        WHERE
            product.ProductSubcategoryID = productsubcategory.ProductSubcategoryID
                AND `Name` LIKE 'Bo%');


-- QUESTION 3 EXERCISE 1              
SELECT 
    product.`Name`
FROM
    product
        JOIN
    productsubcategory ON product.ProductSubcategoryID = productsubcategory.ProductSubcategoryID
WHERE
    productsubcategory.`Name` LIKE 'Touring Bikes'
        AND ListPrice = (SELECT 
            MIN(ListPrice)
        FROM
            product
        WHERE
            product.ProductSubcategoryID = productsubcategory.ProductSubcategoryID
                AND productsubcategory.`Name` LIKE 'Touring Bikes');

	 
     
-- QUESTION 1,2 EXERCISE 2        
SELECT 
    cr.`Name` AS Country, sp.`Name` AS Province
FROM
    countryregion cr
        JOIN
    stateprovince sp ON cr.CountryRegionCode = sp.CountryRegionCode
WHERE
    cr.CountryRegionCode IN (SELECT 
            CountryRegionCode
        FROM
            countryregion
        WHERE
            `Name` IN ('Canada' , 'Germany'))
ORDER BY Country , Province;	



-- QUESTION 3 EXERCISE 2              
SELECT 
    sd.SalesOrderID,
    sd.OrderDate,
    s.SalesPersonID,
    s.SalesPersonID AS BusinessEntityID,
    ROUND(s.Bonus, 2) AS Bonus,
    s.SalesYTD
FROM
    salesperson s
        JOIN
    salesorderheader sd ON s.SalesPersonID = sd.SalesPersonID;


-- QUESTION 4 EXERCISE 2
SELECT 
    sd.SalesOrderID,
    sd.OrderDate,
    e.Title,
    ROUND(s.Bonus, 2) AS Bonus,
    s.SalesYTD
FROM
    salesperson s
        JOIN
    salesorderheader sd ON s.SalesPersonID = sd.SalesPersonID
		JOIN
    employee e ON sd.SalesPersonID = e.EmployeeID;




    



