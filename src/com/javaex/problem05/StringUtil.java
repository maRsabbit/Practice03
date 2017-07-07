package com.javaex.problem05;

public class StringUtil {

	private String[] s_array = new String[3];
    
    public static String concatString(String[] strArray){
    	//메소드 내용작성
    	String concatStr = "";
        for(int i=0; i<strArray.length; i++) {
        	concatStr = concatStr+strArray[i];
        }
		return concatStr;
    }
}
