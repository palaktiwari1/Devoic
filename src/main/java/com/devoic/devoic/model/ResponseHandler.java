package com.devoic.devoic.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	
	public static ResponseEntity<Object>  response(String message,String datavalue,HttpStatus response_code
			,Object responseObj,boolean status){
		
		Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", message);
        map.put("status", status);
        map.put("response_code",response_code.value() );
        map.put(datavalue,responseObj);

        return new ResponseEntity<Object>(map,response_code);

		
	}
	

}
