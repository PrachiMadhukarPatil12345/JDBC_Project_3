package com.service;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Product;
import com.dao.Productdao;



public class ServiceProduct
{
	Productdao po = new  Productdao();
	
	
	public String ServiceDeleteProduct (Product product )  throws ClassNotFoundException, SQLException
	{
		return po.DeleteProduct (product );
	}
	
	
	
	public Product ServiceUpdateProduct (Product product )    throws ClassNotFoundException, SQLException
	{
		 return po.UpdateProduct (product );
	}
	
	
	public Product getRecordsById_Sservice (int id ) throws ClassNotFoundException, SQLException
	{
		
			Product recordsById = po.getRecordsById(id);
			if(recordsById == null)
			{
				throw new classNotFoundException("Product not Found " + " " + id);
			}
			return recordsById;
			
	
	}
	
	
	public ArrayList <Product> ServiceUniqueRecords ( )  throws ClassNotFoundException, SQLException
	{
		return po. getUniqueRecords();
	}
	
	public String Insert_MultipleProducts_Service (ArrayList <Product> ls) throws ClassNotFoundException, SQLException
	{
		return po.Insert_MultipleProducts(ls);
	}
	
	
	
	
	public String ServiceInsertProduct (Product product)     throws ClassNotFoundException, SQLException
	{
		return po.InsertProduct(product);
		
		
	}
}
