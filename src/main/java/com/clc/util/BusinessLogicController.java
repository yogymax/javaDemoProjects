package com.clc.util;

import static com.clc.util.AppConstants.*;

public class BusinessLogicController {

	public String autheticateUser(String unm,String pwd){
			if(unm == null || unm.length()<5){
				return USERNAME_INVALID;
			}else if(pwd == null || pwd.length()<5){
				return PASSWORD_INVALID;
			}else if(APP_USERNAME.equals(unm) && APP_PASSWORD.equals(pwd)){
				return LOGIN_SUCCESS;
			}
			return INCORRECT_CREDENTIALS;
	}
	
}
