package com.cooksys.ds.db;

import com.cooksys.commandler.abstracts.CommandlerHandler;
import com.cooksys.commandler.abstracts.CommandlerReply;
import com.cooksys.commandler.abstracts.CommandlerRequest;
import com.cooksys.commandler.annotations.CommandlerHandlerInit;
import com.cooksys.commandler.annotations.CommandlerRequestHandler;
import com.cooksys.commandler.annotations.CommandlerSingleton;
import com.cooksys.commandler.jaxrs.annotations.CommandlerJaxRSPath;

@CommandlerJaxRSPath("")
@CommandlerSingleton
public class HandlerTest extends CommandlerHandler {
	
	private String wub = null;
	
	@CommandlerJaxRSPath("test")
	@CommandlerRequestHandler(handledRequest=RequestTest.class,requestType="real")
	public CommandlerReply handleReal(CommandlerRequest request){
		ReplyTest reply = new ReplyTest();
		
		String requestTest = ((RequestTest)request).getRequestTest();
		
		reply.setReplyTest(requestTest==null ? "" : requestTest);
		
		return reply;
	}
	
	@CommandlerJaxRSPath("bogus")
	@CommandlerRequestHandler(handledRequest=RequestTest.class,requestType="bogus")
	public CommandlerReply handleBogus(CommandlerRequest request){
		ReplyTest reply = new ReplyTest();
		
		reply.setReplyTest("lolbogus request, kthxbai");
		
		return reply;
	}
	
	@CommandlerHandlerInit
	public void testInit1(){
		wub = "initialized";
		System.out.println("init 1");
	}
	
	@CommandlerHandlerInit
	public void testInit2(){
		System.out.println("init 2");
	}
}