package com.elenverve.handler;


import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.elenverve.common.IConstants;
import com.elenverve.exception.PropertiesException;
import com.elenverve.model.Product;

public abstract class PropertiesHandler implements IConstants{

	private static PropertiesHandler handler=null;
	private String propertyFileName =null;
	private String propfileName =null; 
	protected static Map<String,Object> properties;
	
	/**
	 * This method is used for getting path of any file which is in /resources folder
	 * @param fileName
	 * @return
	 */
	public final static InputStream getResourceFileStream(String fileName){
	    URL url=null;
	    

		List<Product> products = new ArrayList<Product>();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream file = classLoader.getResourceAsStream(fileName);		
	    
	    
	    /*
	    //Server way
	    
	    try {
	        ClassLoader classLoader = className.getClassLoader();
	        url=classLoader.getResource("/"+fileName);
	        System.out.println(url.toString());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	    
	    return url;
	   */
	     // Desktop way
	    /*
	    Package pkg =className.getPackage();
		String pkgName=pkg.getName();		
		String[] ar=pkgName.split("\\.");
		int count =ar.length;
		String path="";
		for(int i=0;i<count+1;i++){
			path =path+"/";
		}
		System.out.println("Configuration file :"+IConstants.DEFAULT_RESOURCES_PATH+"/"+path+fileName);
		return PropertiesHandler.class.getResource(IConstants.DEFAULT_RESOURCES_PATH+"/"+path+fileName);
		*/
	    return file;
		
	}
	/**
	 * This method is used for invoking any class with/without initializing it with initial values
	 * @param fileName
	 * @return
	 * @throws Exception 
	 */
	public abstract Object getImplementation(String tagName) throws Exception;
	
	/**
	 * This method reads a property file & needs to be implemented by child class
	 * @param fileName
	 * @throws PropertiesException
	 */
	protected abstract void readPropertiesFile(String fileName) throws PropertiesException;
	/**
	 * This method loads property from property file into a Map, needs to be implemented by child class
	 * @param fileName
	 * @throws PropertiesException
	 */
	public abstract void loadProperties(URL fileName) throws PropertiesException;
	/**
	 * For getting property values from application tag
	 * @param key
	 * @return
	 */
	public abstract List<String> getApplicationProperty(String key);
	
	/**
	 * For getting property values from databases tag
	 * @param key
	 * @return
	 */
	public abstract String getDatabaseProperty(String id,String key);
	/**
	 * For getting property values from environments tag
	 * @param key
	 * @return
	 */
	public abstract String getEnvironmentProperty(String id,String key);
}