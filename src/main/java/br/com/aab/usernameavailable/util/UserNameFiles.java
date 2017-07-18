package br.com.aab.usernameavailable.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
public class UserNameFiles {

	private List<String> userNameList;

	private final String resourcePath = System.getProperty("user.home");
	private final String fileSeparator = System.getProperty("file.separator");
	private final String USERLISTFILENAME =   System.getProperty("user.home") + fileSeparator + "usernamelist.txt";
	private final String RESTRICTEDUSERLISTFILENAME = System.getProperty("user.home") + fileSeparator + "username-restricted.txt";
	private FileInputStream fileInputStream = null;
	
	public List<String> getUserNameList() throws IOException {

		fileInputStream = new FileInputStream( USERLISTFILENAME );
		return getUserNameListFile(fileInputStream);
	}
	
	public List<String> getRestrictedUserNameList() throws IOException {
		fileInputStream = new FileInputStream( RESTRICTEDUSERLISTFILENAME );
		return getUserNameListFile(fileInputStream);
	}

	private List<String> getUserNameListFile(InputStream is)
			throws IOException {
		
		InputStreamReader isr = new InputStreamReader(is, "UTF8");
		userNameList = new ArrayList<>();
		String line;
		BufferedReader in = new BufferedReader(isr);
		while ((line = in.readLine()) != null) {
			userNameList.add(line);
		}
		in.close();
		
		return userNameList;
	}
}
