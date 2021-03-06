# username
Application to check a user name avaiblility

This simple web application has a form that receives a user name and it needs to check same rules:
1) it needs to check whether this user name is unique and available to be used
2) it needs to check if this username is the same as a restricted user name, e.g. cannabis, abuse, crack, damm, drunk, grass  
3) it needs to provide a function to maintain this restricted user name list
4) it needs to provide a list with 14 suggestions in case this user name has unavailable
5) it needs to provide 3 possibilities of user name suggestion list
6) it needs to check if a user name input field form has at least 6 chars
7) it needs to provide a unit test for 2 usernames 

The technological solution : 
- Java SE v8 / Java EE v7, Spring MVC 3.3.9, JAXRS-Jersey-API 2.11, Jackson 2.8.4, Spring 4.3.9.RELEASE and Tomcat 9 in backend. 
- Eclipse Neon 3, MAVEN 3.3.9 and obviously GitHub was used to build it. 

Considerations:
- Flat file usernamelist.txt and username-restricted.txt are provided to be copied in your user.home directory. In case you use Linux OS and MacOs (e.g. /Users/alexandre1202) or Windows OS (e.g. C:\Users\alexandre1202\)  
- Both username.war (backend application) and usernamefront (frontend application) are used for this solution

Procedures for a this backend. 

Please download and install the Java 8, Maven, Eclipse Neon 3, Apache Tomcat 9 and Tomcat Plugin for Eclipse 

The Frontend that work with this application is available in https://github.com/Alexandre1202/usernamefront

I hope you enjoy it!

