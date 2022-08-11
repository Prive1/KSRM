package ksrm.client.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.XMLEvent;

import ksrm.client.Item;

public class XML_functions {
	
	private void read_xml() {
//		static final String NAME = "name";
//	    static final String BUTTONNAME = "buttonname";
//	    static final String BUTTONNR = "buttonnr";
		List<Item> items = new ArrayList<Item>();
		try {
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			InputStream in = new FileInputStream("C:\\Users\\Basti\\git\\KSRM\\ksrm\\Models\\NewFile.xml");
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
			// read the XML document
			Item item = null;

			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();

//	                if (event.isStartElement()) {
//	                    StartElement startElement = event.asStartElement();
//	                    // If we have an item element, we create a new item
//	                        String elementName = startElement.getName().getLocalPart();
//	                        switch (elementName) {
//	                        case ITEM:
//	                            item = new Item();
//	                            // We read the attributes from this tag and add the date
//	                            // attribute to our object
//	                            Iterator<Attribute> attributes = startElement.getAttributes();
//	                            while (attributes.hasNext()) {
//	                                Attribute attribute = attributes.next();
//	                                if (attribute.getName().toString().equals(DATE)) {
//	                                    item.setDate(attribute.getValue());
//	                                }
//	                            }
//	                            break;
//	                        case MODE:
//	                            event = eventReader.nextEvent();
//	                            item.setMode(event.asCharacters().getData());
//	                            break;
//	                        case UNIT:
//	                            event = eventReader.nextEvent();
//	                            item.setUnit(event.asCharacters().getData());
//	                            break;
//	                        case CURRENT:
//	                            event = eventReader.nextEvent();
//	                            item.setCurrent(event.asCharacters().getData());
//	                            break;
//	                        case INTERACTIVE:
//	                            event = eventReader.nextEvent();
//	                            item.setInteractive(event.asCharacters().getData());
//	                            break;
//	                        }
//	                }
				// If we reach the end of an item element, we add it to the list
				if (event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					if (endElement.getName().getLocalPart().equals("Model")) {
						items.add(item);
					}
				}

			}
		} catch (FileNotFoundException | XMLStreamException e) {
			((Throwable) e).printStackTrace();
		}

	}

}
