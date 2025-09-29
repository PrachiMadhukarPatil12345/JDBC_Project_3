package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Entity.Product;
import com.connection.DBConnection;
import com.main.main;

import java.util.ArrayList;

public class Productdao 
{
	DBConnection db = new DBConnection();
	
	
	public String DeleteProduct (Product product )  throws ClassNotFoundException, SQLException
	{
		Connection con = db.dbConnection();
		PreparedStatement pst = con.prepareStatement(" DELETE FROM PRODUCT WHERE id =? ");
		pst.setInt(1, product.getId());
		
		 pst.executeUpdate();
		
		return "Record Deleted";
	}
	
	
	
	
	public Product UpdateProduct (Product product )    throws ClassNotFoundException, SQLException
	{
		Connection con = db.dbConnection();
		PreparedStatement pst = con.prepareStatement("UPDATE Product SET Productname =?, price =? WHERE ID =? ");
		pst.setString(1, product.getProductname());
		pst.setDouble(2, product.getPrice());
		pst.setInt(3, product.getId());
		int executeUpdate = pst.executeUpdate();
		return product;
		
	}
	
	
	public Product getRecordsById (int id )         throws SQLException, ClassNotFoundException
	{
		Connection con = db.dbConnection();
		PreparedStatement pst = con.prepareStatement("Select * from Product where id =?");
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		
		Product p =null;
		
		while(rs.next() )
		{
			rs.getInt(id);
			String name = rs.getString("Productname");
			double price = rs.getDouble("Price");
			int quan = rs.getInt("Quantity");
			
			 p =new Product(id, name, price, quan);
		}
		return p;
		
		
		
	}
	
	
	
	public ArrayList <Product> getUniqueRecords ( )   throws ClassNotFoundException, SQLException
	{
		Connection con = db.dbConnection();
		 ArrayList all = new ArrayList(); 
		 
		PreparedStatement pst = con.prepareStatement(" select distinct id, Productname,price, Quantity from product" );
		ResultSet rs = pst.executeQuery();
		while(rs.next() )
		{
			int id = rs.getInt("id");
			String name = rs.getString("Productname");
			double price = rs.getDouble("Price");
			int quan = rs.getInt("Quantity");
			
			Product p =new Product(id, name, price, quan);
			all.add(p);
			
		}
		return all;
		
	}
	
	
	
	
	public String Insert_MultipleProducts (ArrayList <Product> ls)      throws ClassNotFoundException, SQLException
	{
		Connection con = db.dbConnection();
		PreparedStatement pst = con.prepareStatement(" INSERT INTO PRODUCT VALUES (?,?,?,?)	" );
		for(Product p : ls)
		{
			pst.setInt(1, p.getId());
			pst.setString(2, p.getProductname() );
			pst.setDouble(3, p.getPrice() );
			pst.setInt(4, p.getQuantity() );
			pst.addBatch();
		}
		int[] arr = pst.executeBatch();

		return  arr.length  +"  "   +  "Employee Inserted successfully";
		
	}
	
	
	
	

	public String InsertProduct (Product product) throws ClassNotFoundException, SQLException
	{
		Connection con = db.dbConnection();
		PreparedStatement pst = con.prepareStatement(" INSERT INTO Product VALUES  (?,?,?,?) "  );
		pst.setInt(1,product.getId() );
		pst.setString(2, product.getProductname());
		pst.setDouble(3,product.getPrice() );
		pst.setInt(4, product.getQuantity() );
		
		pst.executeUpdate();
		
		return "Record Inserted";
		
	}
}
	
	
	
	
	
	
	
	
	
//	public  void CreateTable() throws ClassNotFoundException, SQLException
//	{ 
//		Connection con =  db.dbConnection();
//		Statement st = con.createStatement();
//		
//st.execute("CREATE TABLE Product ( id int, Productname varchar(20) , Age int, Price double, Quantity int ) ");
//System.out.println("Table created");
//
//	}
//	
//	
//	
//	
//	
//	public static void main(String[] args)           throws ClassNotFoundException, SQLException
//	{
//		Productdao pd = new Productdao();
//		pd.CreateTable();
//	}








	
