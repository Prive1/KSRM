package ksrm.client.gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Panel extends JPanel {
	private javax.swing.JButton jButton2 = new javax.swing.JButton("jButton2");
	private javax.swing.JButton jButton3 = new javax.swing.JButton("jButton3");
	private javax.swing.JButton jButton4 = new javax.swing.JButton("jButton4");

	public Panel() {
		setLayout(new java.awt.BorderLayout());

		add(jButton2, java.awt.BorderLayout.PAGE_END);
		add(new Tree(), java.awt.BorderLayout.LINE_START);
//		add(jButton3, java.awt.BorderLayout.LINE_START);
		add(jButton4, java.awt.BorderLayout.CENTER);

	}

}
