# LSEG-task3

**To avoid errors, you need to add the path to the libraries from folder "libraries" in each project. 
add jsoup-1.15.3.jar manualy and Run TestNG Configuration with selenium solution. (Wait for the end of the program execution) For running you have two options. 

a) In IntelliJ Idea click like at image below to clear caches. This error occurs when running the project with TestNG on another local machine.\**
![image](https://user-images.githubusercontent.com/57364788/204531013-7b6dff5a-cfd5-410d-aa6f-eee06330cd05.png) \
**b) Add configuration with TestNG in class org.example.Main  Method: test  like image below\**
![image](https://user-images.githubusercontent.com/57364788/204531127-7be23fd6-01ee-461c-b1e7-fde045591006.png)


In this project is used Silenium Web Driver (https://www.selenium.dev/), because lib JSOUP can't read changeable values and scrool web page. 

We open conection, than open web page and scrool to needed changeable item. Finally, we read that value and write to our console. It's very painstaking process.
To run program - run testNG! 

![Screenshot_5](https://user-images.githubusercontent.com/57364788/204150818-d88ea7cf-dc15-4dc9-b0de-9ff32bf881c3.png)


Maven:
<dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>6.8</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-chrome-driver</artifactId>
            <version>2.50.0</version>
        </dependency>
        
Aditional needed libraries Maven:
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>22.0</version>
        </dependency>
        <dependency>
            <groupId>com.google.api-client</groupId>
            <artifactId>google-api-client-appengine</artifactId>
            <version>1.23.0</version>
            <exclusions>
                <exclusion>
                    <groupId>com.google.guava</groupId>
                    <artifactId>guava-jdk5</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.2.4</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>3.8.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>com.google.inject</groupId>
            <artifactId>guice</artifactId>
            <version>4.1.0</version>
            <classifier>no_aop</classifier>
        </dependency>
