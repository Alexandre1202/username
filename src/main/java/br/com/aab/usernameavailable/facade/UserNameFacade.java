package br.com.aab.usernameavailable.facade;

import java.util.List;

import br.com.aab.usernameavailable.exception.UserNameException;
import br.com.aab.usernameavailable.model.UserNameModel;

public interface UserNameFacade {

	boolean checkUserName(String userName) throws UserNameException;
	
	public List<UserNameModel> suggestionsValidName(String userName);

}