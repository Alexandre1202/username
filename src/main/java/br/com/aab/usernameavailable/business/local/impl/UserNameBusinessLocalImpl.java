package br.com.aab.usernameavailable.business.local.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.aab.usernameavailable.business.local.UserNameBusinessLocal;
import br.com.aab.usernameavailable.exception.UserNameException;
import br.com.aab.usernameavailable.util.UserNameFiles;
import lombok.Getter;
import lombok.Setter;

@Component
public class UserNameBusinessLocalImpl implements UserNameBusinessLocal {

	@Autowired
	private @Getter @Setter UserNameFiles userNameFiles;
	
	@Override
	public boolean checkUserName(String userNameParam) throws UserNameException {
		boolean validUserName = false;
		try {
			if (userNameAlreadyExist(userNameParam, userNameFiles.getUserNameList())) {	
				validUserName = false; 
			} else {
				validUserName = ! userNameAlreadyExist(userNameParam, userNameFiles.getRestrictedUserNameList());
			}
			return validUserName ;
		} catch (IOException e) {
			e.printStackTrace();
			throw new UserNameException();
		}
	}

	private boolean userNameAlreadyExist(String userNameParam, List<String> userNameList) throws IOException {
		boolean userNameAlreadyExist = false;
		for (String userName : userNameList) {
			if (userName.equals(userNameParam.trim())) {
				userNameAlreadyExist = true;
				break;
			}				
		}
		return userNameAlreadyExist;
	}

}
