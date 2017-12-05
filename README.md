# springboot-apachecxf-service
This project demonstrates how to implement apachecxf service in Springboot and how to generated javatowsdl after service implementation

### Springboot-apachecxf- jaxws example ###

* This application shows how to create a service using apachecxf jaxws and how to generate wsdl for that service.
* Used java2ws for service to wsdl generation and those are configured in pom.xml

### Keypoints to remember ###

* Annotations
    
```
   @WebService
   public interface BookingService {
   
       @WebMethod
       @WebResult(name = "bookingResponse")
       public @XmlElement(required = true, nillable = false) BookingResponse createBookRequest(
               @XmlElement(required = true, nillable = false)
               @WebParam(name = "bookingRequest")
               BookingRequest bookingRequest);
   }

```
* ServiceConfig.java (refer this package com.techjava.springbootapachecxfservice.config)

* pom.xml

```
        <dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-frontend-jaxws</artifactId>
			<version>3.2.0</version>
        </dependency>
        <dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-transports-http</artifactId>
			<version>3.2.0</version>
        </dependency>
		
		<plugin>
        	<groupId>org.apache.cxf</groupId>
        	<artifactId>cxf-java2ws-plugin</artifactId>
        	<version>${cxf.version}</version>
        	<dependencies>
                <dependency>
                   <groupId>org.apache.cxf</groupId>
                   <artifactId>cxf-rt-frontend-jaxws</artifactId>
                   <version>${cxf.version}</version>
                </dependency>
                <dependency>
                    <groupId>org.apache.cxf</groupId>
                    <artifactId>cxf-rt-frontend-simple</artifactId>
                    <version>${cxf.version}</version>
                    </dependency>
                </dependencies>			
            <executions>
        		<execution>
        			<id>process-classes</id>
        			<phase>process-classes</phase>
        			<configuration>
        			<className>com.techjava.springbootapachecxfservice.service.BookingService</className>
        			<genWsdl>true</genWsdl>
        			<verbose>true</verbose>
        			</configuration>
        		    <goals>
        		        <goal>java2ws</goal>
        	        </goals>
                </execution>
            </executions>
        </plugin>
``` 

* Maven command to generate wsdl : mvn clean process-classes

### Screenshots ###

[apachecxf-jaxws-java2ws](apachecxf-jaxws-java2ws.png)

[apachecxf-jaxws-service](apachecxf-jaxws-service.png)


### Happy Coding ###