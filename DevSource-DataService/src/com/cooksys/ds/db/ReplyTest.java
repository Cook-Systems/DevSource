package com.cooksys.ds.db;

import javax.xml.bind.annotation.XmlAttribute;

import com.cooksys.commandler.abstracts.CommandlerReply;

public class ReplyTest extends CommandlerReply {
	
	@XmlAttribute(name="wubwub")
	private String replyTest = "wut test";

	
	
	public String getReplyTest() {
		return replyTest;
	}

	public void setReplyTest(String replyTest) {
		this.replyTest = replyTest;
	}
	
}
