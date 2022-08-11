package ksrm.client.gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class MenuBar extends JMenuBar {
	public MenuBar() {
		JMenu menu = new JMenu("Start");
		JMenuItem neu = new JMenuItem("New");
		JMenuItem loade = new JMenuItem("Open");
		JMenuItem custom = new JMenuItem("Anpassen");
		JMenuItem exit = new JMenuItem("Exit");
		menu.add(neu);
		menu.add(loade);
		menu.add(custom);
		menu.add(new JSeparator());
	    menu.add(new AbstractAction("Exit"){

	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	           System.exit(0);
	          
	        }	        
	      });
		add(menu);
	}
	
}
