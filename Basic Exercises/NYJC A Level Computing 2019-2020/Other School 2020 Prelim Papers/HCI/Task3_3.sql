SELECT Product.ProductCode, Name, Location, Price, ServingSize 
FROM Product INNER JOIN Cake ON Product.ProductCode == Cake.ProductCode
WHERE Shape == 'Circle';
