package com.elenverve.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import com.elenverve.model.Product;



public class ProductParser {
	
	public List<Product> getProductList(){
		List<Product> products = new ArrayList<Product>();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream csv = classLoader.getResourceAsStream("prodList.csv");
		BufferedReader br = null;
        String line = "";
		String cvsSplitBy = ",";
	 
		try {
			
			
			br = new BufferedReader(new InputStreamReader(csv));
			String header = br.readLine();
			while ((line = br.readLine()) != null) {
			
			        // use comma as separator
				String[] values = line.split(cvsSplitBy);
				Product product = new Product();
				product.setName(values[0]);
				product.setImgUrl(values[1]);
				product.setOriginalPrice(Integer.parseInt(values[2]));
				product.setFinalPrice(Integer.parseInt(values[3]));
				product.setCurrInd(values[4]);
				product.setCartInd(Integer.parseInt(values[5]));
				product.setFavInd(Integer.parseInt(values[6]));
				product.setGiftInd(Integer.parseInt(values[7]));
				product.setDetailLinkInd(Integer.parseInt(values[8]));
				product.setIsNew(Integer.parseInt(values[9]));
				product.setImageSizeType(Integer.parseInt(values[10]));
				products.add(product);
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 
		//logger.debug("Done");

		
		
		return products;
		
		
	}
	
	public static void main(String[] arg){
		ProductParser parser = new ProductParser();
		parser.getProductList();
		
	}

}
