package app;

public class Sql {
	 
    public static String userInsert = "INSERT INTO USERS VALUES(?,?,?)";
    public static String userDelete = "DELETE FROM USERS WHERE ID=?";
    public static String userUpdate = "UPDATE USERS SET PWD=?,NAME=? WHERE ID=?";
    public static String userSelect = "SELECT * FROM USERS WHERE ID=?";
    public static String userSelectAll = "SELECT * FROM USERS";
 
    public static String foodInsert = "INSERT INTO FOODS VALUES(?,?,?,0)";
    public static String foodDelete = "DELETE FROM FOODS WHERE ID=?";
    public static String foodUpdate = "UPDATE FOODS SET NAME=?,PRICE=?,SALES=? WHERE ID=?";
    public static String foodSelect = "SELECT * FROM FOODS WHERE ID=?";
    public static String foodSelectAll = "SELECT * FROM FOODS";
}









