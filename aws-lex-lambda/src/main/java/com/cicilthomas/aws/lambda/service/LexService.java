package com.cicilthomas.aws.lambda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cicilthomas.aws.lambda.dto.DialogAction;
import com.cicilthomas.aws.lambda.dto.LexRequest;
import com.cicilthomas.aws.lambda.dto.LexResponse;
import com.cicilthomas.aws.lambda.dto.Message;

@Component
public class LexService {

	@Autowired
	private TimeService timeService;

	public LexResponse respondToRequest(LexRequest requset) {

		/* isExist is the slot name specified in Lex */
		String response = requset.getCurrentIntent().getSlots().get("isExist");

		if (response.equalsIgnoreCase("YES")) {
			/* Get current server time from TimeService */
			response = timeService.getCurrentTime();
		} else if (response.equalsIgnoreCase("No")) {
			response = "It's okay, hope you have a watch.";
		} else {
			response = "Sorry, I didn't understand. :(";
		}

		/* Create the Lex reponse object */
		LexResponse lexResponse = new LexResponse();
		lexResponse.setSessionAttributes(requset.getSessionAttributes());
		DialogAction dialogAction = new DialogAction();
		dialogAction.setType("Close");
		dialogAction.setFulfillmentState("Fulfilled");
		dialogAction.setMessage(new Message("PlainText", response));
		lexResponse.setDialogAction(dialogAction);

		return lexResponse;
	}

}
