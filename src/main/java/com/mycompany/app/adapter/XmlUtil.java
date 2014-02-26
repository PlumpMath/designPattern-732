package com.mycompany.app.adapter;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: zh
 * Date: 14-2-26
 * Time: 下午4:21
 * To change this template use File | Settings | File Templates.
 */
public class XmlUtil {
    public static Object getBean(){
        try{
            DocumentBuilderFactory builder = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = builder.newDocumentBuilder();
            Document doc = documentBuilder.parse(new File("src\\main\\java\\com\\mycompany\\app\\adapter\\config.xml"));

            Node classNode =doc.getElementsByTagName("className").item(0).getFirstChild();
            return Class.forName(classNode.getNodeValue()).newInstance();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
