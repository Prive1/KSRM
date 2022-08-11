package ksrm.client.gui;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.XMLEvent;

import ksrm.client.Item;

public class Frame {
	
	private JFrame frame;


	public Frame() {
		build_frame();
		addGroundJPanel();
	}

	private void addGroundJPanel() {
		frame.add(new Panel());
	}
	
	private void build_frame() {
		GraphicsDevice display;
		display = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

		frame = new JFrame("Kartonsucht-Rhein-Main");
		frame.setSize(display.getDisplayMode().getWidth(), display.getDisplayMode().getHeight());
		addGroundJPanel();
		frame.setJMenuBar(new MenuBar());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}



	
}
