package com.cicilthomas.aws.lambda.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.cicilthomas.aws.lambda.Application;
import com.cicilthomas.aws.lambda.dto.LexRequest;
import com.cicilthomas.aws.lambda.dto.LexResponse;
import com.cicilthomas.aws.lambda.service.LexService;

/**
 * This class receives AWS Lex  request and returns the current server 
 * time as response.
 * 
 * @author Cicil Thomas
 *
 */
public class LexHandler implements RequestHandler<LexRequest, LexResponse> {
		
	/*
	 * (non-Javadoc)
	 * @see com.amazonaws.services.lambda.runtime.RequestHandler#handleRequest(java.lang.Object, com.amazonaws.services.lambda.runtime.Context)
	 */
    public LexResponse handleRequest(LexRequest request, Context context) {    	
    
    	/* Check whether the Context still exist */   	
    	String contextInfo = Application.testApplicationContext();
    	
    	/*If context exists it will be reused, else a new context will be created. */
    	LexService service = Application.getApplicationContext().getBean(LexService.class);
    		
    	/*Get  a sample Lex Response from LexService  */
    	LexResponse response = service.respondToRequest(request);
    	
    	/* Apending context info with Lex response*/    	
        return addContextInfo(response,contextInfo);
    }

    /***
     * Adds the context info with every response. This is just for testing  
     * how context is reused between requests.
     *  
     * @param response
     * @param contextInfo
     * @return
     */
    private LexResponse addContextInfo(LexResponse response, String contextInfo) {
    	String msg = response.getDialogAction().getMessage().getContent();
    	/* Add context info */
    	response.getDialogAction().getMessage().setContent(msg + " - " + contextInfo);
    	return response;
    }
       
}