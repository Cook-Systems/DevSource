package com.cooksys.ds.dap.jsfspringbeans;

import java.util.ResourceBundle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("session")
public class SystemSession {

	private String currentTheme = getThemesResource() + "default";
	
	public SystemSession(){
		
	}

	public static String getThemesResource(){
		ResourceBundle bundle = ResourceBundle.getBundle("resources.application");
		String themes = bundle.getString("themesResource");
		bundle = null;
		return themes;
	}
	
	public void bullshitTheme(){
		this.setCurrentTheme("bullshit theme");
	}
	
//	Getters and Setters
	public String getCurrentTheme() {
		return currentTheme;
	}

	public void setCurrentTheme(String currentTheme) {
		this.currentTheme = getThemesResource() + currentTheme;
	}
	
}
