SELECT * FROM hotel;
SELECT * FROM hotel WHERE city = 'London';
SELECT * FROM guest WHERE guestAddress LIKE '%London%' ORDER BY guestName;
SELECT * FROM room WHERE TYPE = ('d' OR TYPE = 's') AND price <=1500;
SELECT * from booking WHERE dateTo IS NULL;
SELECT COUNT(hotelNo) AS Antal from hotel;
Select AVG(price) FROM room; 
SELECT SUM(price) FROM room WHERE TYPE = 'd';
SELECT COUNT(DISTINCT guestNo) AS gæster FROM booking
WHERE dateFrom LIKE '20__-08%' 
OR dateTo LIKE '20__-08%'; 
SELECT hotelNo,COUNT(roomNo) FROM room GROUP BY hotelNo;
-- SELECT room.hotelNo,COUNT(room.roomNo) FROM room,hotel GROUP BY hotel.hotelNo HAVING hotel.city ='London';
INSERT INTO room (roomNo,hotelNo,type,price) VALUES(9,3,'d',1655);
UPDATE room SET price = 1.05 * price;
DELETE FROM room WHERE roomNo = 9;
SELECT * FROM room;