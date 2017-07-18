package br.com.aab.usernameavailable.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class UserNameModel {

	private @Getter @Setter String userName;
	
	public UserNameModel() {
		
	}
	
	public UserNameModel(String userName) {
		this.userName = userName;
	}
}
