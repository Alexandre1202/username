package br.com.aab.usernameavailable.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.aab.usernameavailable.business.local.UserNameBusinessLocal;
import br.com.aab.usernameavailable.exception.UserNameException;
import br.com.aab.usernameavailable.facade.UserNameFacade;
import br.com.aab.usernameavailable.model.UserNameModel;
import lombok.Getter;
import lombok.Setter;

@Component("unfacade")
public class UserNameFacadeImpl implements UserNameFacade {

	@Autowired
	private @Getter @Setter UserNameBusinessLocal businessLocal;
	
	public UserNameFacadeImpl() {
		super();
	}

	@Override
	public boolean checkUserName(final String userName) throws UserNameException {
		return businessLocal.checkUserName(userName);
	}

	public List<UserNameModel> suggestionsValidName(String userName) {
		System.out.println(this.getClass().getName() + ".suggestionsValidName() - INICIO");
		List<UserNameModel> retorno = new ArrayList<>();
		for (int i=0; i < 3; i++) {
			for (int j = 0; j < 14; j++) {
				System.out.println(this.getClass().getName() + ".suggestionsValidName() SUGESTAO = " + userName + i + j);
				UserNameModel  model = new UserNameModel();
				model.setUserName(userName + i + j);
				retorno.add(model);
			}
		}
		return retorno;
	}
}
