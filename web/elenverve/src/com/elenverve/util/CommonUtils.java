package com.elenverve.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CommonUtils {
	
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
								System.out.println(""+field.getName()+" ["+field.getType().getCanonicalName()+"] = "+method.invoke(obj, null));
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
