package db;

import org.hibernate.Query;
/* 
 * The example demonstrate the use of hibernate in business logic layer of a database
 * application. It is a stand-alone java application. To use hibernate in a web-based
 * database application, I suggest to create a lib folder in WEB-INF and copy 1) all
 * jar files of hibernate and 2) JDBC to the lib folder.
 * @Copyright Mingrui Zhang
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

public class DB {
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.getCurrentSession();

	//	List list = test.list();

	public boolean userEntry(String username, String password, String fname, String lname, String email, String phone, String add1, String add2, String city, String zip, String state, String country) {
			System.out.println("Here");


			//session.beginTransaction();
			System.out.println("transaction start");
			User user = new User();
			Transaction tx=null;
			try {
				System.out.println("Got to here");
				tx = session.beginTransaction();
				System.out.println("Got to here. Bout to stick it in.");
				//Update Sport java object
				user.setusername(username);
				user.setpassword(password);
				user.setfirst_name(fname);
				user.setlast_name(lname);
				user.setemail(email);
				user.setphone(phone);
				user.setadd1(add1);
				user.setadd2(add2);
				user.setcity(city);
				user.setzip(zip);
				user.setstate(state);
				user.setcountry(country);
				System.out.println(user.getpassword());
				System.out.println("Got to here");
				//Save java object Sport to database
				session.save(user);
				System.out.println("Saved flushed and commited: "+tx.wasCommitted());
				session.flush();
				System.out.println("Saved flushed and commited: "+tx.wasCommitted());
				tx.commit();
				System.out.println("Saved flushed and commited: "+tx.wasCommitted());
				return true;
			}catch(Exception se) {
				if(tx != null) {
					tx.rollback();
				}
			}finally {
				if(session.isOpen()) session.close();
			}
			return false;
		}
		
	public boolean Laptop(String manufacturer,String processor,String os, String storage) {
		System.out.println("Laptop checking in");
		Transaction tx=null;
		System.out.println(manufacturer);
		System.out.println(processor);
		System.out.println(os);
		System.out.println(storage);
		if (manufacturer ==null) {
			manufacturer = "";
		}else {
			manufacturer = " and p.manufacturer_name = '"+manufacturer+"'";
		}
		if (processor ==null) {
			processor = "";
		}else {
			processor = " and pr.processot_brand = "+processor+"'";
		}
		if (os ==null) {
			os = "";
		}else {
			os = " and o.os_system = '"+os+"'";
		}
		if (storage ==null) {
			storage = "";
		}else {
			storage = " and s.storage_size_GB = "+storage+"'";
		}
		try {
			tx = session.beginTransaction();
			System.out.println("session created");
			Query query = session.createQuery("Select distinct p.product_id, p.price, p.model_name, l.RAM_capacity_GB, o.os_system, s.storage_size_GB, pr.processor_brand "
					+ "from Laptop l, Product p, Os o, Storage s, Processor pr "
			+"where p.product_id = l.product_id and p.product_id = o.product_id and p.product_id = pr.product_id and p.product_id = s.product_id and p.category=3 "+os+processor+storage+ 
			manufacturer);
			@SuppressWarnings("unchecked")
			List<Product> list =(List<Product>) query.list();
			System.out.println("TO THE LOOP!");

			for(Iterator iterator= list.iterator(); iterator.hasNext();) {

				Object[] l =(Object[]) iterator.next();
				String product_id = String.valueOf(l[0].toString());
				String price = String.valueOf(l[1].toString());
				String model = String.valueOf(l[2].toString());
				String RAM = String.valueOf(l[3].toString());
				System.out.println("ID : "+ product_id);
				System.out.println("price : "+ price);
				System.out.println("model : "+ model);
				System.out.println("RAM : "+RAM);
			}	
			return true;
		}
		catch(Exception e) {
	         e.printStackTrace(); 
		}finally {
			 session.close();
		}
		return false;
	}
}
