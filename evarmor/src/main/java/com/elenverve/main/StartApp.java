package com.elenverve.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.elenverve.bean.ITestConstants;
import com.elenverve.db.SpringMongoConfig;
import com.elenverve.dvo.ProductDvo;
import com.elenverve.service.MockProductService;

public class StartApp {

	  public static void main(String[] args) {
		/*  
		  int max =15;
		  int col =3;
		  List<String> str= new ArrayList<String>();
		  str.add("1");
		  str.add("2");
		  str.add("3");
		  str.add("4");
		  str.add("5");
		  str.add("6");
		  str.add("7");
		  str.add("8");
		  str.add("9");
		  str.add("10");
		  str.add("11");
		  str.add("12");
		  str.add("13");
		  str.add("14");
		  str.add("15");
		  str.add("16");
		  str.add("17");
		  int factor=0,j=0, add=0;
		  for(int i=1;i<=max/col;i++){ 
			  if(i>1){
				  add =factor;
			  }
			  for(j=1;j<=col;j++){
				  int ctr =0;
				  if(i>1){
					  ctr=j+add;					  
				  }else{
					  ctr = j;
				  }
				  if(ctr>str.size()){
					break;
				  }
				  System.out.println(str.get(ctr-1));
				  //System.out.println(str.get(j+add));
				  factor++;
			  }
			  
		  }
		  
		*/
		  
		 
			// For XML
			//ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");
		 
			// For Annotation
			ApplicationContext ctx = 
		             new AnnotationConfigApplicationContext(SpringMongoConfig.class);
			MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		 
			MockProductService service = new MockProductService(mongoOperation);
	
			//Step 1: create blank categories
			System.out.println("Adding categories");
			service.createCategories(ITestConstants.categoryNames.length);
			
			// Step 2: create blank collections
			System.out.println("Adding collections");
			service.createCollections(ITestConstants.collectionNames.length);
			
			// Step 3: Associate collections with categories
			Map<String,String> association = new HashMap<String,String>();
			association.put("Home Decor", "Spectrum,conTinent,elementz");
			association.put("Workspace Decor", "Spectrum,conTinent,Oceanaic");
			association.put("Art and paintings", "Spectrum,elementz,Zodaik,Oceanaic");
			association.put("Lamp Shades", "Zodaik,Oceanaic");
			association.put("Fashion Accessories", "Spectrum,Zodaik,Oceanaic");
			association.put("Hand crafted", "Spectrum,conTinent,elementz,Zodaik,Oceanaic");	
			
			System.out.println("Associating collections & categories");
			service.addCollection2Category(association);
			
			// Step 4: Add product
			service.createBulkProducts(100);
			
			//List<ProductDvo> prods = service.getProductsFromCategory("CAT002");
			
			List<ProductDvo> prods = service.getProductsFromCollection("COLL002");
			for(ProductDvo prod:prods){
				System.out.println(prod.getProductId());
			}
			
			
		/*
			// now user object got the created id.
			System.out.println("1. user : " + user);
		 
			// query to search user
			Query searchUserQuery = new Query(Criteria.where("username").is("mkyong"));
		 
			// find the saved user again.
			User savedUser = mongoOperation.findOne(searchUserQuery, User.class);
			System.out.println("2. find - savedUser : " + savedUser);
		 
			// update password
			mongoOperation.updateFirst(searchUserQuery, 
		                         Update.update("password", "new password"),User.class);
		 
			// find the updated user object
			User updatedUser = mongoOperation.findOne(searchUserQuery, User.class);
		 
			System.out.println("3. updatedUser : " + updatedUser);
		 
			// delete
			mongoOperation.remove(searchUserQuery, User.class);
		 
			// List, it should be empty now.
			List<User> listUser = mongoOperation.findAll(User.class);
			System.out.println("4. Number of user = " + listUser.size());
		 */
		    }
}
