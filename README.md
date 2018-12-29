# Deploy Spring hibernate mvc 

<h3>Run in eclipse.</h3>

<ul>

	1. git clone https://github.com/lasanthaa/HelloSpringMvc.git<br>
	2. import the project to eclipse as existing maven project <br>
	3. Create the database using db.sql<br>
	4. Update your database credentials in web.xml<br>
	5. Update tomcat manager-script user and manager-gui user in pom.xml <br>
	
     <plugin>
		    <groupId>org.apache.tomcat.maven</groupId>
		    <artifactId>tomcat7-maven-plugin</artifactId>
		    <version>2.2</version>
		    <configuration>
		        <url>http://localhost:8080/manager/text</url>
		        <server>tomcatserver</server>
		        <path>/${project.artifactId}</path>
		        <update>true</update>
		        <username>tomcat</username>
		        <password>tomcat</password>
		    </configuration>
		</plugin>

	6. Configure maven setting.yml in MAVEN_HOME/conf/setting.yml
  
     <servers>
        <id>tomcatserver</id>
        <username>tomcat</username>
        <password>tomcat</password>
      </servers>
     
    7. Add user credentials for tomcat 
    
      <role rolename="manager-script"/>
      <role rolename="manager-gui"/>
      <user username="tomcat" password="tomcat" roles="manager-script"/>
      <user username="admin" password="admin" roles="manager-gui"/>
     
    8. Deploy the project (war file) using Run configuration <strong>goal</strong> with 
       clean install tomcat7:deploy
       
    9.Go to http://localhost:8080/manager/html with manager-gui credentials


</ul>   
