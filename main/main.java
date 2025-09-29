package com.main;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Controller.Product_Controller;
import com.Entity.Product;

public class main {

	public static void main(String[] args)         throws ClassNotFoundException, SQLException
	{    Product_Controller pc = new Product_Controller();
	     ArrayList al = new ArrayList();
	     
	     
	     
	     Product p = new Product(6, "Watch", 2000, 28);
	    String cf = pc.ControllerDeleteProduct(p);
	    System.out.println(cf);
	     
	     
	     
//	     
//	     Product ct = pc.ControllerUpdateProduct(p);
//	     System.out.println(ct);
	     
	     
//     
//	     Product records = pc.getRecordsById_Sservice(19);
//	     System.out.println(records.getId());
//	     System.out.println(records.getProductname());
//	     System.out.println(records.getPrice());
//	     System.out.println(records.getQuantity());
	    
	     
	     
	     
	     
	     
	     
	     
	     
//	     ArrayList<Product>UniqueRecords = pc.ControllerUniqueRecords();
//	     
//	     for(Product p :UniqueRecords)
//	     {
//	    	 System.out.println(p.getId() );
//	    	 System.out.println(p.getProductname() );
//	    	 System.out.println(p.getPrice() );
//	    	 System.out.println(p.getQuantity() );
//	    	 System.out.println("=====================================================================");
//	     }
		
	     
	     
	     
	     
	     
//	  Product p1 = new Product(2, "Appleiphone", 890000, 28);
//	  al.add(p1);
//	  
//	  Product p2 = new Product(3, "Samsung TV", 780000, 34);
//	  al.add(p2);
//	  
//	  Product p3 = new Product(4, "Canon Camera", 940000, 56);
//	  al.add(p3);
//	  
//	  Product p4 = new Product(5, "Sony Headphones", 430000, 15);
//	  al.add(p4);
//	  
//	  Product p5 = new Product(6, "Shoes", 6000, 6);
//	  al.add(p5);
	 
	  
	  
	  
//		
//		String msg2 = pc.Insert_MultipleProducts_Controller(al);
//		System.out.println(msg2);
		
		
		
		
		
		
		
		
//		
//		String msg = pc.ControllerInsertProduct(p1);
//		System.out.println(msg);

	}

}
