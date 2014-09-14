package com.elenverve.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.elenverve.bean.Category;
import com.elenverve.bean.Collection;
import com.elenverve.bean.ITestConstants;
import com.elenverve.bean.Product;
import com.elenverve.dvo.CategoryDvo;
import com.elenverve.dvo.CollectionDvo;
import com.elenverve.dvo.ProductDvo;
import com.elenverve.dvo.UserDvo;

public class MockProductService {

	private MongoOperations operations;

	public MockProductService(MongoOperations operations) {
		this.operations = operations;
	}

	// Add product
	public void createProduct(Map<String, String> parameters) {
			ProductDvo product = Product.createProducts(parameters);
			operations.save(product);
		
	}

	// Retrieve all products
	public List<ProductDvo> getProducts() {
		return operations.findAll(ProductDvo.class);
	}

	
	// Add Collections
	public void createCollections(int count) {

		int size = ITestConstants.collectionImages.length;
		Random random = new Random();
		for (int i = 0; i < count; i++) {
			Map<String, String> parameters = new HashMap<String, String>();
			parameters.put(ITestConstants.COLL_ID, "COLL00" + i);
			parameters.put(ITestConstants.COLL_NAME,
					ITestConstants.collectionNames[i]);
			parameters.put(ITestConstants.COLL_IMG,
					ITestConstants.collectionImages[random.nextInt(size)]);
			CollectionDvo collection = Collection.createCollection(parameters);
			operations.save(collection);
		}

	}

	// Retrieve all collections
	public List<CollectionDvo> getCollections() {
		return operations.findAll(CollectionDvo.class);
	}

	// Add Categories
	public void createCategories(int total) {
		int size = ITestConstants.categoryImages.length;
		Random random = new Random();
		for (int i = 0; i < total; i++) {
			Map<String, String> parameters = new HashMap<String, String>();
			parameters.put(ITestConstants.CAT_ID, "CAT00" + i);
			parameters.put(ITestConstants.CAT_NAME,
					ITestConstants.categoryNames[i]);
			parameters.put(ITestConstants.CAT_IMG,
					ITestConstants.categoryImages[random.nextInt(size)]);
			CategoryDvo category = Category.createCategory(parameters);
			operations.save(category);
		}

	}

	// Retrieve all categories
	public List<CategoryDvo> getCategories() {
		return operations.findAll(CategoryDvo.class);
	}
	// Associate collections with Category
	public void addCollection2Category(Map<String,String> association) {
		Set<String> catKeys = association.keySet();
		
		
		for(String catName:catKeys){
			Query catquery = new Query();
			catquery.addCriteria(Criteria.where("categoryName").is(catName));
			CategoryDvo catDvo=operations.findOne(catquery, CategoryDvo.class);
			String[] collNames = association.get(catName).split("\\,");
			List<String> colls = Arrays.asList(collNames);
			
			Query collquery = new Query();
			collquery.addCriteria(Criteria.where("collectionName").in(colls));
			List<CollectionDvo> collections = operations.find(collquery, CollectionDvo.class);
			
			List<String> collectionIds = catDvo.getCollections();
			
			Update updateCat = new Update();
			for(CollectionDvo collection: collections){
				String collId = collection.getCollectionId();
				if(!collectionIds.contains(collId)){
					collectionIds.add(collId);
				}
				
				
				List<String> catIds = collection.getCategories();
				String catId =catDvo.getCategoryId();
				if(!catIds.contains(catDvo)){
					catIds.add(catId);
				}
				
				Query collquery1 = new Query();
				collquery1.addCriteria(Criteria.where("collectionId").is(collection.getCollectionId()));
				
				Update updateColl = new Update();
				updateColl.set("categories", catIds);
				operations.updateFirst(collquery1, updateColl, CollectionDvo.class);
			}
			updateCat.set("collections", collectionIds);
			operations.updateFirst(catquery, updateCat, CategoryDvo.class);
			
			
		}
	}
	
	

	public void addProduct2Category(String categoryId, ProductDvo product) {
		CategoryDvo catDvo = new CategoryDvo();
		catDvo.setCategoryId(categoryId);
		CategoryDvo category = operations.findById(catDvo, CategoryDvo.class);
		category.addProduct(product.getProductId());
		operations.insert(category);
		product.getDetails().setCategoryId(categoryId);
		operations.insert(product);

	}
	
	
	// Add products
	public void createBulkProducts(int total) {
		ProductDvo product = null;
		List<CollectionDvo> collections = getCollections();
		List<CategoryDvo> categories = getCategories();
		int collSize = collections.size();
		int catSize = categories.size();

		Random random = new Random();

		for (int i = 0; i < total; i++) {
			int colRandomId = random.nextInt(collSize);
			int catRandomId = random.nextInt(catSize);
			CollectionDvo colDvo = collections.get(colRandomId);
			String collId = colDvo.getCollectionId();
			CategoryDvo catDvo = categories.get(catRandomId);
			String catId = catDvo.getCategoryId();
			Map<String, String> parameters = new HashMap<String, String>();
			parameters.put(ITestConstants.PROD_ID, "P00" + i);
			parameters.put(ITestConstants.COLL_ID, collId);
			parameters.put(ITestConstants.CAT_ID, catId);
			parameters.put(ITestConstants.COUNTER, "" + i);
			product = Product.createProducts(parameters);
			operations.save(product);
			associateProduct2Category(catId, "P00" + i);
			associateProduct2Collection(collId, "P00" + i);
		}
	}
	
	// Associate product with collection
	public void associateProduct2Collection(String collectionId, String productId) {
		Query collquery = new Query();
		collquery.addCriteria(Criteria.where("collectionId").is(collectionId));
		CollectionDvo collDvo=operations.findOne(collquery, CollectionDvo.class);
		List<String> products = collDvo.getProducts();
		if(!products.contains(productId)){
			products.add(productId);
		}
		Update updateColl = new Update();
		updateColl.set("products", products);
		operations.updateFirst(collquery, updateColl, CollectionDvo.class);
	}
	// Associate product with collection
		public void associateProduct2Category(String categoryId, String productId) {
			Query catquery = new Query();
			catquery.addCriteria(Criteria.where("categoryId").is(categoryId));
			CategoryDvo catDvo=operations.findOne(catquery, CategoryDvo.class);
			List<String> products = catDvo.getProducts();
			if(!products.contains(productId)){
				products.add(productId);
			}
			Update updateCat = new Update();
			updateCat.set("products", products);
			operations.updateFirst(catquery, updateCat, CategoryDvo.class);
		}
		
		 /**
		  * Retrieve products from a category
		  * @param collectionId
		  * @return
		  */
		 public List<ProductDvo> getProductsFromCategory(String categoryId) {
			 Query catquery = new Query();
			 catquery.addCriteria(Criteria.where("categoryId").is(categoryId));
			 CategoryDvo catDvo=operations.findOne(catquery, CategoryDvo.class);
			 List<String> prodIds = catDvo.getProducts();
			 
			 Query prodquery = new Query();
			 prodquery.addCriteria(Criteria.where("productId").in(prodIds));
			 List<ProductDvo> products = operations.find(prodquery, ProductDvo.class);
			 
			 return products;
			 
		 }	

		 /**
		  * Retrieve products from a collection
		  * @param collectionId
		  * @return
		  */
		 public List<ProductDvo> getProductsFromCollection(String collectionId) {
			 Query collquery = new Query();
			 collquery.addCriteria(Criteria.where("collectionId").is(collectionId));
			 CollectionDvo collDvo=operations.findOne(collquery, CollectionDvo.class);
			 List<String> prodIds = collDvo.getProducts();
			 
			 Query prodquery = new Query();
			 prodquery.addCriteria(Criteria.where("productId").in(prodIds));
			 List<ProductDvo> products = operations.find(prodquery, ProductDvo.class);
			 
			 return products;
			 
		 }
		 
		 public List<UserDvo> getUsers(String emailId) {
			 Query collquery = new Query();
			 collquery.addCriteria(Criteria.where("emailId").is(emailId));
			 UserDvo usrDvo=operations.findOne(collquery, UserDvo.class);
			 return operations.findAll(UserDvo.class);
			 
			 
		 }
		 
		 
}
