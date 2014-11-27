package com.elenverve.dao;

import com.elenverve.exception.SequenceException;

public interface SequenceDao {
	
	long getNextSequenceId(String key) throws SequenceException;

}
