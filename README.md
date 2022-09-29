# ImageMapper
Steps:

Step 1: Create a spring starter project
Select the appropriate jdk version 
Select the Web 
Step 2: Change the port number under application.properties 
Server.port = any port number
Step 3: Create a html file under the src/main/resources/static
Step 4: Add the svg content into the html file 
Step 5: Create js and css file and add link path to the html
Step 6: Inside the html file 
add onclick event to the path tag
pass the title attribute as the parameter 
Step 7: Inside the js file
Make an ajax call
Step 8: Create a json file
Create an array of objects inside it
Step 9: Create a Api class named CallApi.java
create an object of JsonFile.java and call the function fetchdata passing the statename as a parameter
Step 10: Create a class named JsonFile.java
return the webcontent of the matched statename else return the string "Not Found"
Step 11: Run ImageMapProject1Application.java file 
