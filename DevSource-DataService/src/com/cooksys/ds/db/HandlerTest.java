package com.cooksys.ds.db;

import com.cooksys.commandler.abstracts.CommandlerHandler;
import com.cooksys.commandler.abstracts.CommandlerReply;
import com.cooksys.commandler.abstracts.CommandlerRequest;
import com.cooksys.commandler.annotations.CommandlerRequestHandler;
import com.cooksys.commandler.jaxrs.annotations.CommandlerJaxRSPath;

@CommandlerJaxRSPath("")
public class HandlerTest extends CommandlerHandler {

	
	@CommandlerJaxRSPath("test")
	@CommandlerRequestHandler(handledRequest=RequestTest.class)
	public CommandlerReply handle(CommandlerRequest request){
		testMethod();
		return new ReplyTest();
	}
	
//	@FailCatch
	public void testMethod(){
		
	}
}
