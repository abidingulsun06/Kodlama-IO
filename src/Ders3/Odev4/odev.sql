Foreign key = /*Yabancı key başka bir tablonun keyi*/

/*Case in seSql kodlaı yazılırken büyük küçük harf etkilenmez*/
/*Ansii*/

/*Customers dan bütün verileri getirir*/
SELECT * from Customers

/*Customers Tablosundan ContactName,Address,City kolonlarını getirir*/
Select ContactName,Address,City from Customers

/*şeklinde çağırılırsa Alias yaparak tabloyu çağırırız mesela ContactName alanı Adi olarak çağrılır*/
Select ContactName Adi,Address Adres,City Sehir from Customers

/*Şehri London olarları customersdan getirir*/
Select * from Customers Where City='London'

/*Ürünler tablosunu CategoryID si 1 yada 3 olanları getirir*/
Select * from Products Where CategoryID=1 or CategoryID=3

/*Category idsi 1 olan ve fiyatı 10 dan büyük olan verileri getirir*/
Select * from Products Where CategoryID=1 and Unit>10

/*Ürün adına göre ürünleri sırala A'dan Z'ye gider sonuna Desc gelmediyse*/
Select * from Products order by ProductName

--Asc Artan
--Desc Azalan

--ürünleri az dan çok'a sıralara
Select * from Products order by Unit asc

--CategoryID 1 olan verilerin fiyatlarını Çoktan aza sırala
Select * from Products Where CategoryID =1 order by Unit desc

--Products Kolonlerini sayar sayısını verir
Select Count(*) from Products

--Products Tablosunda categoryid si 2 olan ürünlerin sayısını verir
Select Count(*) from Products Where CategoryID =2

--Hangi categoryde kaç farklı ürün var
Select Count(*) from Products GROUP BY CategoryID

--İd leri ile birlikte CategoryID getirir ve kaç ürün olduğunu verir kolon sayısını sayar
Select CategoryID,ProductName,count(*) from Products group BY CategoryID

--içerisinde 10 dan az ürün bulunan kategorileri getirir
Select CategoryID,ProductName,count(*) from Products group BY CategoryID having count(*)<10

--birim fiyatı 20 den fazla olan ürünleri category idye göre grupla
Select CategoryID,count(*) from Products where Unit>20 group BY CategoryID having count(*)<10

--Products tablosunu Categories tablosu ile birleştirir ve Products.CategoryId'si kategorilerde Categories.CategoryID eşit olanları birleştirir
SELECT *
FROM Products INNER JOIN Categories
on Products.CategoryId = Categories.CategoryID

--Burada ise yukarıda işlemin aynısını yapa ama sadece belirtilen kolonları getirir
SELECT Products.ProductID,Products.ProductName,Products.Unit,Categories.CategoryName
FROM Products INNER JOIN Categories
on Products.CategoryId = Categories.CategoryID

--Dto Data Transformation object java yada c# gibi dillerde classları birleştirmemize yarıyor

--Verileri ürünlerdeki ürün fiyatı 10 dan büyük olanları getirir
SELECT Products.ProductID,Products.ProductName,Products.Unit,Categories.CategoryName
FROM Products INNER JOIN Categories
on Products.CategoryId = Categories.CategoryID where Products.Unit >10

--Customers tablosunu Orders tablosuyla eşleştirir customerıd si eşit olmayanlarıda getirir
select * from Customers c left join Orders o on c.CustomerID = o.CustomerID

--Customers tablosunu Orders tablosuyla eşleştirir customerıd si eşit olmayanlarıda getirir null olan değerleride gösterir
select * from Customers c left join Orders o on c.CustomerID = o.CustomerID is null









