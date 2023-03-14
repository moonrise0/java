package com.kbstar.frame;

public class Sql {
	   public static String cartDeleteSql = "DELETE FROM cart WHERE id=?";
	   public static String cartInsertSql = "INSERT INTO cart VALUES(?, ?, ?, ?, SYSDATE)";
	   public static String cartUpdateSql = "UPDATE cart SET user_id=?, item_id=?, cnt=? WHERE id=?";
	   public static String cartSelectSql = "SELECT *  FROM cart WHERE id=?";
	   public static String cartSelectAllSql = "SELECT *  FROM cart";

}
