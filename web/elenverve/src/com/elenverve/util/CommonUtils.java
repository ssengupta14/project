package com.elenverve.util;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.elenverve.dvo.OfferDvo;
import com.elenverve.exception.PropertiesException;

public class CommonUtils {
	
	static Properties prop = new Properties();
	static Map<String,List<String>> parameters = new HashMap<String,List<String>>();
	
	static{
		
		InputStream inputStream = CommonUtils.class.getClassLoader().getResourceAsStream("dealTemplate.properties");
		try {
			prop.load(inputStream);
			
		} catch (IOException e) {
			 //logger.debug("property file not found in the classpath");
		}finally{
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * This method helps to convert OfferDvo to offer wording 
	 * @param offers
	 * @return
	 */
	public static String offerWordFormatter(OfferDvo offer){
		
		String gap = " ";
		String currency ="$";
		
		String templateId = offer.getTemplateId();
		String temp = prop.getProperty(templateId);			
		
		int perc = (int)offer.getDiscountPercentage();
		int amt = (int)offer.getAmount();
		String endWord =offer.getEndWord();
		// get products
		String product = offer.getProductName();
		String collection = offer.getCollectionName();
		String category = offer.getCategoryName();
		String separator = offer.getLineSeparator();
		int breaker = offer.getLineBreak();
		String discountName= offer.getDiscountName();			
		//logger.debug(temp);
		int amount = offer.getAmount();
		double buyQty = offer.getBuyQty();
		double getQty = offer.getGetQty();			
		String getProduct = offer.getGetProductName();
		
		if(temp.contains("{season}")){
			temp=temp.replace("{season}", discountName);
		}
		if(temp.contains("{percent}")){
			temp=temp.replace("{percent}", ""+perc);
		}
		if(temp.contains("{amount}")){
			temp=temp.replace("{amount}", ""+amt);
		}
		if(temp.contains("{clearance}")){
			temp=temp.replace("{clearance}", discountName);
		}
		if(temp.contains("{event}")){
			temp=temp.replace("{event}", discountName);
		}
		if(temp.contains("{saleword}")){
			temp=temp.replace("{saleword}", ""+endWord);
		}
		if(temp.contains("{product}")){
			temp=temp.replace("{product}", ""+product);
		}
		if(temp.contains("{collection}")){
			temp=temp.replace("{collection}", ""+collection);
		}
		
		if(temp.contains("{category}")){
			temp=temp.replace("{category}", ""+category);
		}
					
		if(temp.contains("{currId}")){
			temp=temp.replace("{currId}", ""+currency);
		}
		if(temp.contains("{buyQuantity}")){
			temp=temp.replace("{buyQuantity}", ""+buyQty);
		}
		if(temp.contains("{buyProduct}")){
			temp=temp.replace("{buyProduct}", ""+product);
		}
		if(temp.contains("{getQuantity}")){
			temp=temp.replace("{getQuantity}", ""+getQty);
		}
		if(temp.contains("{getProduct}")){
			temp=temp.replace("{getProduct}", ""+getProduct);
		}
		
		if(temp.contains("{separator}")){
			temp=temp.replace("{separator}", separator);				
		}
		if(temp.contains("{lineDiv}")){
			if(breaker>0){
				StringBuilder nLine =new StringBuilder();
				for(int i=0;i<breaker;i++){
					nLine.append("\n");
				}
				temp=temp.replace("{lineDiv}", nLine);		
			}else{
				temp=temp.replace("{lineDiv}{gap}", "");
			}
				
		}
		
		if(temp.contains("{gap}")){
			if(temp.contains("{gap}")){
				temp=temp.replaceAll("\\{gap}", gap);
			}
		}
		return temp;
	}
	
	public static List<String> offerWordFormatter(List<OfferDvo> offers){
		
		
		List<String> offerWords = new ArrayList<String>();
		String temp = null;
		for(OfferDvo offer:offers){
			temp = offerWordFormatter(offer); 
			offerWords.add(temp);
		}
		return offerWords;
	}
	
	private static String replace(Map<String,String> parameters,String temp) throws PropertiesException{
		Set<String> keys = parameters.keySet();
		for(String key:keys){
			
			
			
		}
		
		return null;
	}
	
	public static void main(String arg[]){
		
		List<OfferDvo> dvos = new ArrayList<OfferDvo>();
		
		OfferDvo offer = new OfferDvo();
		offer.setOfferType(OfferDvo.DISCOUNT);
		offer.setDiscountName("SUMMER");
		offer.setDiscountPercentage(30.00);
		offer.setEndWord("Discount");
		offer.setTemplateId("generalSalePercCol001");
		offer.setCollectionId("021");
		offer.setCollectionName("ELEMENTS");
		dvos.add(offer);
		
		offer = new OfferDvo();
		offer.setOfferType(OfferDvo.DISCOUNT);
		offer.setDiscountName("FOURTH OF JULY");
		offer.setDiscountPercentage(30.00);
		offer.setEndWord("OFF");
		offer.setTemplateId("EventSalePercCol001");
		offer.setCollectionId("021");
		offer.setCollectionName("ELEMENTS");		
		dvos.add(offer);
		
		List<String> words = offerWordFormatter(dvos);
		for(String word:words){
			//logger.debug(word);
		}
	}
	private static boolean isSelectedMethod(String methodName,String field){
		if(("GET"+field.toUpperCase()).equals(methodName.toUpperCase())){
			return true;
		}
		return false;
	}
	private static boolean isPrimitiveField(Field field){
		Class clazz = field.getType();
		
		if(clazz.getName().startsWith("com.elenverve")){
			return false;
		}
		return true;
	}
	private static boolean isCollection(Field field){
		Class mclazz = field.getType();
		if(mclazz.getName().contains("List")){
			return true;
		}
		if(mclazz.getName().contains("Map")){
			return true;
		}
		if(mclazz.getName().contains("Set")){
			return true;
		}
		return false;
		
	}
	private static void printCollection(Object obj){
		if(obj instanceof List<?>){
			List<?> keys = (List<?>)obj;
			for(Object key:keys){
				printObject(key);
			}			
		}
		if(obj instanceof Map<?,?>){
			Set<?> keys = ((Map<?,?>)obj).keySet();
			for(Object key:keys){
				printObject(((Map) obj).get(key));
			}			
		}
		if(obj instanceof Set<?>){
			Set<?> keys = (Set<?>)obj;
			for(Object key:keys){
				printObject(key);
			}			
		}
	}
	public static void printObject(Object obj){
		
		Field[] fields = obj.getClass().getDeclaredFields();
		for(Field field : fields){
			
			String name = field.getName();
			Method[] methods = obj.getClass().getDeclaredMethods();
			for(Method method:methods){
				String methodName = method.getName();				
				if (method.getName().startsWith("get") && isSelectedMethod(methodName, name)){
					try {
						if(!isPrimitiveField(field)){
							Object object =method.invoke(obj, null);
								printObject(object);
							
						}else{
							if(isCollection(field)){
								Object keys =method.invoke(obj, null);
								printCollection(keys);
							}else{
								//logger.debug(""+field.getName()+" ["+field.getType().getCanonicalName()+"] = "+method.invoke(obj, null));
							}
						}
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
					
				}
				
			}
			
			
				
			
		}
		
	}

}
