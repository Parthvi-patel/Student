package com.salesProject.Sales.Queries;



public class SalesQueries {

   public static String Insert = "INSERT INTO `shopping`.`sales` (`sales_id`, `customer_id`, `order_date`, `deliver_date`, `quantity`) VALUES ((?), (?), (?), (?), (?));";
    public  static String Select = "Select * From  `shopping`.`sales`";
    public  static String Update = "UPDATE `shopping`.`sales` SET `quantity`=(?) WHERE `sales_id`=(?)";
//    String Delete = "DELETE FROM `shopping`.`sales` WHERE (`sales_id` = (?));




}
