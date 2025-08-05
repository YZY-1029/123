package sqlQuestion;

public class SqlQuestion {
// 1. 請用sql語法查出 store_information table 語法
//  select * from store_information;
// 2. 請新增 store_information table 語法
//  insert into	store_information(store_name, sales, txn_date) values
//	('Los Angeles', 1500, '05-Jan-1999'),
//  ('San Diego', 250, '07-Jan-1999'),
//	('Los Angeles', 300, '08-Jan-1999'),
//  ('Boston', 700, '08-Jan-1999');
//
// 3. Geography 做 group by 群組
//	  select Region_name, count(*) as Store_count
//	  from Geography
//	  group by Region_name;
//
// 4. Geography, store_information 二張table做join
//	  select store_name, sales, txn_date, Geography.Region_Name
//	  from store_information
//	  left join Geography
//	  on store_information.Store_Name = Geography.Store_Name;
//
// 5. left join, right join, inner join差別
//	  left join: 以左邊的資料為主,當右邊的沒有對應的話則會是null
//	  right join: 以右邊的資料為主,當左邊的沒有對應的話則會是null
//	  inner join: 當兩者都有對應的會才會出現
//
}
