package br.com.aab.usernameavailable.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.aab.usernameavailable.exception.UserNameException;
import br.com.aab.usernameavailable.facade.UserNameFacade;
import br.com.aab.usernameavailable.model.UserNameModel;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"br.com.aab.usernameavailable"})
@Path("username")
public class UserName {
	
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();	
	
	@Autowired
	private @Getter @Setter UserNameFacade userNameFacade;
	
	public UserName() {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("checkusername/{username}")
	public List<UserNameModel> checkUserNameAvailable(@PathParam ("username") String userName) {	
		ctx.register(UserName.class);
		ctx.refresh();
		List<UserNameModel> retorno = new ArrayList<>();
		try {
			if ( ((UserNameFacade) ctx.getBean("unfacade")).checkUserName(userName) ) {		
				System.out.println(this.getClass().getName() + ".getEmployeeNames() - VALIDO");
				retorno.add(new UserNameModel("VALID"));
			} else {
				System.out.println(this.getClass().getName() + ".getEmployeeNames() - INVALIDO");
				retorno = ((UserNameFacade) ctx.getBean("unfacade")).suggestionsValidName(userName);
			}
		} catch (UserNameException e) {
			e.printStackTrace();
		}
		for (UserNameModel userNameModel : retorno) {
			System.out.println(this.getClass().getName() + ".getEmployeeNames() - userNameModel.getUserName() = " + userNameModel.getUserName());
		}
		return retorno;
	}
}
