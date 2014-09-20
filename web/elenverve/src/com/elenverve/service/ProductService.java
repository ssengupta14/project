package com.elenverve.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.elenverve.dvo.CategoryDvo;
import com.elenverve.dvo.CollectionDvo;
import com.elenverve.dvo.OfferDvo;
import com.elenverve.dvo.ProductDvo;

@Repository
public class ProductService {

	private static final Logger logger = Logger.getLogger(ProductService.class);
	@Autowired
	private MongoTemplate mongoTemplate;

	private List<ProductDvo> products = null;
	private List<CollectionDvo> collections = null;
	private List<CategoryDvo> categories = null;
	private List<OfferDvo> offers = null;

	/**
	 * Retrieve all products from database
	 * 
	 * @return
	 */
	public List<ProductDvo> getProducts() {
		if (products == null) {
			logger.debug("retrieving products from db..");
			products = mongoTemplate.findAll(ProductDvo.class, "productDvo");
			logger.debug("retrieved [" + products.size()+ "] products from db..");
		} else {
			logger.debug("returning [" + products.size()+ "] products from service...");
		}
		return products;
	}

	public ProductDvo getProduct(String productId) {
		ProductDvo productDvo = null;
		if (products == null) {
			Query prodQuery = new Query();
			prodQuery.addCriteria(Criteria.where("productId").is(productId));		
			
			logger.debug("retrieving product from db..");
			productDvo = mongoTemplate.findOne(prodQuery,ProductDvo.class);
			logger.debug("retrieved  product from db..");
		} else {
			logger.debug("returning [" + products.size()+ "] products from service...");
		}
		return productDvo;
	}

	/**
	 * Retrieves all collections from database
	 * 
	 * @return
	 */
	public List<CollectionDvo> getCollections() {
		if (collections == null) {
			logger.debug("retrieving collections from db..");
			collections = mongoTemplate.findAll(CollectionDvo.class,	"collectionDvo");
			logger.debug("retrieved [" + collections.size()	+ "] collections from db..");
		} else {
			logger.debug("returning [" + collections.size() + "] collections from service...");
		}
		return collections;
	}

	/**
	 * Retrieves all categories from database
	 * 
	 * @return
	 */
	public List<CategoryDvo> getCategories() {
		if (categories == null) {
			logger.debug("retrieving categories from db..");
			categories = mongoTemplate.findAll(CategoryDvo.class, "categoryDvo");
			logger.debug("retrieved [" + categories.size()	+ "] categories from db..");
		} else {
			logger.debug("returning [" + categories.size()	+ "] categories from service...");
		}
		return categories;
	}

	/**
	 * Retrieves all Offers from database
	 * 
	 * @return
	 */
	public List<OfferDvo> getOffers() {
		if (offers == null) {
			logger.debug("retrieving offers from db..");
			offers = mongoTemplate.findAll(OfferDvo.class, "offerDvo");
			logger.debug("retrieved [" + offers.size() + "] offers from db..");
		} else {
			logger.debug("returning [" + offers.size()	+ "] offers from service...");
		}
		return offers;
	}

	/**
	 * Retrieve products from a collection
	 * 
	 * @param collectionId
	 * @return
	 */
	public List<ProductDvo> getProductsFromCollection(String collectionId) {
		Query collquery = new Query();
		collquery.addCriteria(Criteria.where("categoryId").is(collectionId));
		CollectionDvo collDvo = mongoTemplate.findOne(collquery,CollectionDvo.class);
		List<String> prodIds = collDvo.getProducts();

		Query prodquery = new Query();
		prodquery.addCriteria(Criteria.where("productId").in(prodIds));
		List<ProductDvo> products = mongoTemplate.find(prodquery,ProductDvo.class);

		return products;

	}

	/**
	 * Retrieve products from a category
	 * 
	 * @param collectionId
	 * @return
	 */
	public List<ProductDvo> getProductsFromCategory(String categoryId) {
		Query catquery = new Query();
		catquery.addCriteria(Criteria.where("collectionId").is(categoryId));
		CategoryDvo catDvo = mongoTemplate.findOne(catquery, CategoryDvo.class);
		List<String> prodIds = catDvo.getProducts();

		Query prodquery = new Query();
		prodquery.addCriteria(Criteria.where("productId").in(prodIds));
		List<ProductDvo> products = mongoTemplate.find(prodquery,
				ProductDvo.class);

		return products;

	}

}
