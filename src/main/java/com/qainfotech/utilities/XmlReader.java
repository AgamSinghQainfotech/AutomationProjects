package com.qainfotech.utilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class XmlReader{

	static XmlReader xmlreaderobj;
	String xmlFilePath = "/src/test/resources/testdata.xml";


	public String xmlRead(String NodeName, String PropertyValue) {
		Element element = null;
		String Value = null;
		try {

			File prop = new File(System.getProperty("user.dir") + xmlFilePath);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
			Document doc = dbBuilder.parse(prop);
			doc.getDocumentElement().normalize();
			doc.getDocumentElement().getNodeName();
			NodeList nodes = doc.getElementsByTagName(NodeName);

			for (int i = 0; i < nodes.getLength(); i++) {
				Node node = nodes.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					element = (Element) node;
				}
			}
			Value = getValue(PropertyValue, element);
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return Value;
	}

	private static String getValue(String tag, Element element) {
		NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodes.item(0);
		return node.getNodeValue();

	}

	public static XmlReader getInstance() {
		if (xmlreaderobj == null)
			xmlreaderobj = new XmlReader();

		return xmlreaderobj;
	}

	public String propertyRead(String keyName) {
		return null;
	}
}
