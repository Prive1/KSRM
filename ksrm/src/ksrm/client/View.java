package ksrm.client;


import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.text.html.HTMLDocument.Iterator;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class View {

	private JFrame frame;
	
	    private javax.swing.JButton jButton2 = 
	           new javax.swing.JButton( "jButton2" );
	    private javax.swing.JButton jButton3 = 
	           new javax.swing.JButton( "jButton3" );
	    private javax.swing.JButton jButton4 = 
	           new javax.swing.JButton( "jButton4" );
	
	public View() {
		read_xml();
		build_start_frame();

	}
	
	public JFrame get_frame() {
		return frame;
	}
	
	private void build_start_frame() {
		build_frame();
	} 
	
	private void build_frame(){
		GraphicsDevice display;		
		display = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		
		
		frame = new JFrame("Kartonsucht-Rhein-Main");
		frame.setSize(display.getDisplayMode().getWidth(), display.getDisplayMode().getHeight());
		frame.add(build_JPanel());
		frame.setJMenuBar(build_menuBar());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private JMenuBar build_menuBar() {
	JMenuBar result = new JMenuBar();
	JMenu menu = new JMenu("Start");
	
	result.add(menu);
	return result;
	}
	
	private JPanel build_JPanel() {
		JPanel result = new JPanel();
		result.setLayout(new java.awt.BorderLayout());
		
		result.add(jButton2, java.awt.BorderLayout.PAGE_END);
		result.add(jButton3, java.awt.BorderLayout.LINE_START);
		result.add(jButton4, java.awt.BorderLayout.CENTER);
		
		return result;
	}
	
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


