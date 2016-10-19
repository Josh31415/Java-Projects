import java.net.*;
import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Weather {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://w1.weather.gov/xml/current_obs/KVLL.xml");
        InputStreamReader in = new InputStreamReader(oracle.openStream());
        String inputLine;
        String xml = "";
//        while ((inputLine = in.readLine()) != null){
//            xml += inputLine;
//        	xml += "\n";
//        }
       // System.out.println(xml);
        in.close();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {

			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();

			//parse using builder to get DOM representation of the XML file
			Document dom = db.parse("http://w1.weather.gov/xml/current_obs/KVLL.xml");
			Node n = dom.getElementsByTagName("temp_f").item(0);
			String temp = n.getTextContent();
			System.out.println("Temperature = " + temp);
		    n = dom.getElementsByTagName("windchill_f").item(0);
			temp = n.getTextContent();
			System.out.println("Wind Chill = " + temp);
			n = dom.getElementsByTagName("weather").item(0);
			temp = n.getTextContent();
			System.out.println("Conditions = " + temp);
			
		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
        
    }
}