# usernameavailable
Application to check an user name avaiblility

This simple web application has a form that receives an user name and it need to check same rules:
1) it needs to check in case this user name is unique and available to be used
2) it needs to check if this username is the same of a restricted user name, e.g. cannabis, abuse, crack, damm, drunk, grass  
3) it needs to provide a functionality to maintain this restricted user name list
4) it needs to provide a list with 14 suggestions options in case this user name has unavailable
5) it needs to provide a functionality to provides 3 possibilities of user name suggestion list
6) it needs to check if a user name input field form has at least 6 chars
7) it needs to provide a unit test for 2 usernames

The technological solution : 
- AngularJS 1.6.4, npm 4.1.2, node 7.5.0 in frontend. 
- Java SE v8 / Java EE v7, Spring MVC 3.3.9, JAXRS-Jersey-API 2.11, Jackson 2.8.4, Spring 4.3.9.RELEASE and Tomcat 9 in backend. 
- Eclipse Neon 3, MAVEN 3.3.9 and GitHub was used to build this 

Considerations:
- Flat file usernamelist.txt and username-restricted.txt are provided to be copied in your user.home directory
- Both username.war (backend application) and usernamefront (frontend application) are necessarely for this solution

