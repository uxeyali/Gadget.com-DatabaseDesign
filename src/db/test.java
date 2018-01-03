package db;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test {
	
	 public static void main(String[] args) {
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
   


		try {
			//Query query = session.createQuery("from Product p "+"inner join p.Product l "+"where p.product_ID = l.product_id");
			Query query = session.createQuery("Select x.product_id, x.price, x.model_name, y.RAM_capacity_GB, o.os_system "
					+ "from Laptop y, Product x, Os o "
			+"where x.product_id = y.product_id and x.product_id = o.product_id and x.category=3");
			//Query query = session.createQuery("from Os");
			@SuppressWarnings("unchecked")
			List<Product> list =(List<Product>) query.list();
			System.out.println("TO THE LOOP!");
			//System.out.println(list.get(0).toString());
			for(Iterator iterator= list.iterator(); iterator.hasNext();) {
				//Os p =(Os) iterator.next();
				//u.setManufacturer_name((String)iterator.next());
				//u.setModel_name((String)iterator.next());
				/*
				System.out.println("Manufacturer : "+p.getManufacturer_name());
				System.out.println("model : "+p.getModel_name());
				System.out.println("battery : "+p.getBattery());
				System.out.println("dimentions : "+p.getDimensions());
				System.out.println("price : "+p.getPrice());
				*/
				//System.out.println("os : " +p.getOs_source());
				//System.out.println(iterator.);
				//Product p= (Product) iterator.next();
				
				Object[] l =(Object[]) iterator.next();
				String product_id = String.valueOf(l[0].toString());
				String price = String.valueOf(l[1].toString());
				String model = String.valueOf(l[2].toString());
				String RAM = String.valueOf(l[3].toString());
				String os = String.valueOf(l[4].toString());
				System.out.println("ID : "+ product_id);
				System.out.println("price : "+ price);
				System.out.println("model : "+ model);
				System.out.println("RAM : "+RAM);
				System.out.println("OS : "+os);
				//System.out.println("RAM : "+ l.getConnectivity());
				//System.out.println("RAM : "+ l.getRAM_type());
				//System.out.println("RAM : "+ l.getRAM_capacity_GB());
			
			}
			
		}
		catch(Exception e) {
	         e.printStackTrace(); 
		}finally {
			 session.close();
		}

	
	 }
}
