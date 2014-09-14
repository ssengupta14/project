package com.elenverve.common;

import java.util.HashMap;
import java.util.Map;
/**
 * This class will be used for passing parameters b/w Controller & model classes
 * @author ssengupta
 *
 */
public class Parameters {
	private Map<String,Object> parameters = new HashMap<String,Object>();
	/**
	 * For retrieving all parameters
	 * @return
	 */
	public Map<String,Object> getAllParameters() {
		return parameters;
	}
	/**
	 * For adding a parameter
	 * @param key
	 * @param value
	 */
	public void addParameter(String key, Object value) {
		this.parameters.put(key, value);
	}
	/**
	 * To retrieve a parameter
	 * @param key
	 * @return
	 */
	public Object getParameter(String key) {
		return this.parameters.get(key);
	}

}
