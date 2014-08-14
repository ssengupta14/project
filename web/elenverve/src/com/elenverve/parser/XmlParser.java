package com.elenverve.parser;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public abstract class XmlParser {
	private File file; 
	public Map<String,Object> parse(){
	
		return new HashMap<String,Object>();
	}

	protected File readFile(String file){
		File f = new File("");
		
		return f;
		
	}
}
