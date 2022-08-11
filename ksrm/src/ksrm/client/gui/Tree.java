package ksrm.client.gui;

import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree extends JPanel {
	public Tree() {
		add(build_Tree());
	}

	private JTree build_Tree() {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Wurzel");
		for (int ast = 0; ast < 4; ast++) {
			DefaultMutableTreeNode node = new DefaultMutableTreeNode("Knoten " + ast);
			root.add(node);

			for (int blatt = 1; blatt < 4; blatt++)
				node.add(new DefaultMutableTreeNode("Blatt " + (ast * 3 + blatt)));
		}
		JTree result = new JTree(root);

		return result;
	}

}
