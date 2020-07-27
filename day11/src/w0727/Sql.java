package w0727;

public class Sql {
	
	public static String productInsert = "INSERT INTO PRODUCT VALUES(?, ?, ?, ?, ?)";
	public static String productDelete = "DELETE FROM PRODUCT WHERE ID=?";
	public static String productUpdate = "UPDATE PRODUCT SET PWD=?, NAME=? WHERE ID=?";
	public static String productSelect = "SELECT * FROM PRODUCT WHERE ID=?";
	public static String productSelectAll = "SELECT * FROM PRODUCT";

}