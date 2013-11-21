package com.cooksys.ds.test;

import org.springframework.stereotype.Component;

@Component
public class TerminalController {
	
	public String handleCommand(String command, String[] params){
		String string = null;
		
		if(command.equals("test")){
			string = "yep";
		}else if(command.equals("Josh")){
			StringBuilder sbuild = new StringBuilder();
			sbuild.append("Josh clearly likes these things: ");
			
			for(String tmp : params){
				sbuild.append(tmp + ", ");
			}

			String tmpString = sbuild.toString();
			
			string = tmpString.substring(0, tmpString.length() - 2) + " because he is clearly a fag!";
			
		}
		
		return string;
	}
}
