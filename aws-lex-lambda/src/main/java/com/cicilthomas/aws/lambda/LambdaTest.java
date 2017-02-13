package com.cicilthomas.aws.lambda;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.cicilthomas.aws.lambda.dto.DialogAction;
import com.cicilthomas.aws.lambda.dto.LexRequest;
import com.cicilthomas.aws.lambda.dto.LexResponse;
import com.cicilthomas.aws.lambda.dto.Message;
/**
 * This class receives AWS Lex  request 
 * 
 * @author Cicil Thomas
 *
 */
public class LambdaTest implements RequestHandler<LexRequest, LexResponse> {

	/*
	 * (non-Javadoc)
	 * @see com.amazonaws.services.lambda.runtime.RequestHandler#handleRequest(java.lang.Object, com.amazonaws.services.lambda.runtime.Context)
	 */
    public LexResponse handleRequest(LexRequest request, Context context) {
    	
    	/* Create a sample Lex Response  */
        return createResponse(request);
    }

    /*
     * This method generates a response based on the
     * slot input from Lex, the response is the current server
     * time. 
     */
    private LexResponse createResponse (LexRequest req) {    
    	/* isExist is the slot name specified in Lex */
    	String response = req.getCurrentIntent().getSlots().get("isExist");
    	
    	 if (response.equalsIgnoreCase("YES")) {
    		 String time = new SimpleDateFormat("HH:mm")
    		 				.format(Calendar.getInstance().getTime());
    		 response = "The current time is " + time;    		 
    	 } else if (response.equalsIgnoreCase("No")) {
    		 response = "It's okay, hope you have a watch.";
    	 } else {
    		 response = "Sorry, I didn't understand. :(";
    	 }
    	 
    	 /* Create the Lex reponse object*/
    	 LexResponse lexResponse = new LexResponse();
    	 
    	 lexResponse.setSessionAttributes(req.getSessionAttributes());
    	 DialogAction da = new DialogAction();
    	 da.setType("Close");
    	 da.setFulfillmentState("Fulfilled");
    	 da.setMessage(new Message("PlainText",response));    	 
    	 lexResponse.setDialogAction(da);
    	 
    	return lexResponse;
    }
}