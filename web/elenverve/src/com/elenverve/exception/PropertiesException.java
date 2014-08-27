package com.elenverve.exception;

/**
 * Any properties (Text/XML) files should throw this exception
 * @author ssengupta
 *
 */
public class PropertiesException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -145087611428918837L;
	public PropertiesException(String fileName,String message) {
		super("Exception while reading file ["+fileName +"] error thrown :"+message);
	}
	public PropertiesException(String fileName,String message,Throwable e) {
		super("Exception while reading file ["+fileName +"] error thrown :"+message,e);
	}
	public PropertiesException(String fileName,Throwable e) {
		super("Exception while reading file ["+fileName +"] error thrown : "+e.getLocalizedMessage(),e);
	}
}