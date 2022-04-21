package ksrm.client;


import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class View {

	private JFrame frame;
	
	    private javax.swing.JButton jButton2 = 
	           new javax.swing.JButton( "jButton21" );
	    private javax.swing.JButton jButton3 = 
	           new javax.swing.JButton( "jButton3" );
	    private javax.swing.JButton jButton4 = 
	           new javax.swing.JButton( "jButton4" );
	
	public View() {
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
		
		JPanel p1 = new JPanel();
		p1.setLayout(new java.awt.BorderLayout());
		
/*		p1.add(jButton2, java.awt.BorderLayout.PAGE_END);
		p1.add(jButton3, java.awt.BorderLayout.LINE_START);
		p1.add(jButton4, java.awt.BorderLayout.CENTER);
	*/	
		
		frame = new JFrame("Kartonsucht-Rhein-Main");
		frame.setSize(display.getDisplayMode().getWidth(), display.getDisplayMode().getHeight());
		frame.add(p1);
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
	
}
