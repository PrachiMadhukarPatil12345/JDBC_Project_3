package com.Controller;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Product;
import com.service.ServiceProduct;

public class Product_Controller
{
	ServiceProduct sp = new ServiceProduct();
	
	
	public String ControllerDeleteProduct (Product product )  throws ClassNotFoundException, SQLException
	{
		return sp.ServiceDeleteProduct (product );
	}
	
	
	
	public Product ControllerUpdateProduct (Product product )    throws ClassNotFoundException, SQLException
	{
		return sp.ServiceUpdateProduct(product);
	}
	
	
	
	public Product getRecordsById_Sservice (int id )       throws ClassNotFoundException, SQLException
	{
		return sp.getRecordsById_Sservice(id);
	}
	 
	
	public ArrayList <Product> ControllerUniqueRecords ( )          throws ClassNotFoundException, SQLException
	{
		return sp.ServiceUniqueRecords ( );
	}
	
	
	public String Insert_MultipleProducts_Controller (ArrayList <Product> ls)    throws ClassNotFoundException, SQLException
	{
		return sp.Insert_MultipleProducts_Service(ls);
	}
	
	
	public String ControllerInsertProduct (Product product) throws ClassNotFoundException, SQLException
	{
		return sp.ServiceInsertProduct (product);
	}
}
