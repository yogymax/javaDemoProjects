/***

Apache Maven--
			resolves transitive dependency..
			every developer will get same versions of jar file
			build automation tool
				war/ear/jar
			
				
			A 							B
				B							b1 -- 1.2
				C							b2
				D							b3
			
	Log4j
	TestNg

Apache Maven--	
	Download Apache maven software..3.3.x
	Set env path
	
	MAVEN_HOME=E:\MySofts\apache-maven-3.3.9  -- in order to work..java_home should be there in path
	JAVA_HOME=JAVA'S ROOT FOLDER - -BEFORE BIN
	path = %JAVA_HOME%\bin; %MAVEN_HOME%\bin
	
	open fresh command prompt..
	
	navigate to c:\\users\yogesh\
				.m2/repositoty
				.m2/settings.xml   -- https://github.com/yogymax/seleniumwithSettingsxml/blob/master/src/main/java/com/scp/settings.xml
					(extension should .xml not settings.xml)
					
		3 types of repositoty
					Local Repositoy -- users\yogesh\.m2
					Remote Repositoy --
							Internet -- Public
							Intranet -- Private -- *
		
		
			settings.xml 
				-- always holds the url of the jar files..
				-- proxy settings for the server
				
				
				https://www.javahelps.com/2015/08/set-proxy-for-maven-in-eclipse.html
				<proxies>
  <!-- Proxy for HTTP -->
  <proxy>
   <id>optional</id>
   <active>true</active>
   <protocol>http</protocol>
   <username>proxyuser</username>
   <password>proxypass</password>
   <host>proxy.host.net</host>
   <port>80</port>
   <nonProxyHosts>local.net</nonProxyHosts>
  </proxy>
  
				
	
open ur eclipse..
		windows...preferences..maven-- usersettings..browse..point to settings.xml..update settings..
			make internet is active..
			
		
		create maven project..
			File--New -- Other-- Maven Project-- 
			
			
			
			archtype not shown issue resolution
				1#https://howtodoinjava.com/eclipse/how-to-import-maven-remote-archetype-catalogs-in-eclipse/
				2#make sure.. eclipse is aware bt settings.xml
				
		windows...preferences..maven-- usersettings..browse..point to settings.xml..update settings..
			make internet is active..
				3 import any working maven project in eclipse..
					File --  will download all settings..
					
					
		Eclipse
			file--new --other--maven project-- next-- select "maven-archtype-quickstart"
				-- next--specify
				
				groupid -- which account/dept in a company
				artifactid -- project name
				version -- which version
				package -- folder structure
				
				
			java project
				ProjectName
					src
					jre
					bin
					
			maven project
				src/main/java -- business logic
				src/test/java -- testcase -- WhiteBox/Unit/Module/Integration -- TestNG
				src/test/resources -- Configuration files for Tests
				src/main/resources -- Configuration files for business logic
				library 
					maven -- required libs for ur project...dependencies.
					jre	-- java jar's
				target -- final -- war/jar/ear
				src -- folder structure view
				test-output -- TestNG configured and run the tests
				pom.xml - project dependencies
					
		

maven dependency for testng -- 6.9.10

		
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>6.9.10</version>
    <scope>test</scope>
</dependency>


pom.xml --
	groupid
	artifactid
	version
*parent -- 
	properties.. constants for ur application -- jar version/encoding
	dependencies
		required libs - groupid/artifactid/version/scope -- url(settings)
	plugins -- 
		resourceplugin -- what type files you want to include in jar/war/ear
		compiler plugin -- proj compliance-- 
		surfire - TestNg reporting..
	finalwarname
	packaging
	repositoties -- settings.xml -- proxy/repositoty url

	
	
	
	
	
*/	
