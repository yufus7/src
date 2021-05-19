package sample;



import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

    public class ReadXmlDomParserLoop {
        public static void main(String[] args) {

            try {
                File file=new File("F:\\country_populations.xml");

                DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();

                DocumentBuilder db=dbf.newDocumentBuilder();
                Document doc=db.parse(file);
                doc.getDocumentElement().normalize();
                System.out.println("Root Element:"+doc.getDocumentElement().getNodeName());
                NodeList nodeList=doc.getElementsByTagName("record");

                for(int itr=0;itr<nodeList.getLength();itr++){
                    Node node=nodeList.item(itr);
                    System.out.println("\n Node Name:"+node.getNodeName());
                    if(node.getNodeType()==Node.ELEMENT_NODE){
                        Element eElement=(Element) node;
                        System.out.print( itr +".inci eleman"+eElement.getElementsByTagName("field").item(0).getTextContent());

                    }
                }


            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            }
        }

    }


