package com.cooksys.ds.db;

import javax.xml.bind.annotation.XmlAttribute;

import com.cooksys.commandler.abstracts.CommandlerRequest;

public class RequestTest extends CommandlerRequest {

	@XmlAttribute(name="wubwub")
	private String requestTest = null;
	
	

	public String getRequestTest() {
		return requestTest;
	}

	public void setRequestTest(String requestTest) {
		this.requestTest = requestTest;
	}
}
