package br.com.aab.usernameavailable.business.local;

import br.com.aab.usernameavailable.exception.UserNameException;

public interface UserNameBusinessLocal {

	public boolean checkUserName(String userName) throws UserNameException;
}
