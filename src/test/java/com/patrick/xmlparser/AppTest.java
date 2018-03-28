package com.patrick.xmlparser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.patrick.xmlparser.domain.Claim;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	 try {    
             File file = new File("C:\\Users\\Evan Molinelli\\Desktop\\XMLParser\\src\\test\\java\\com\\patrick\\xmlparser\\mock1.xml");    
             JAXBContext jaxbContext = JAXBContext.newInstance(Claim.class);    
          
             Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();    
             Claim c=(Claim) jaxbUnmarshaller.unmarshal(file);    
             System.out.println("Packaging = " + c.getPackaging().toString());  
               
           } catch (JAXBException e) {e.printStackTrace(); }   
        assertTrue( true );
    }
}
