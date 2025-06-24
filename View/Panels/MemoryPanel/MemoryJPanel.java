package View.Panels.MemoryPanel;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MemoryJPanel extends JPanel{
	public MemoryJPanel() {
		this.setLayout(new GridLayout(0, 2));
		this.setPreferredSize( new Dimension(200, 200) );

		JButton
			mc = new JButton("mc"),
			mPlus = new JButton("m+"),
			mMinus = new JButton("m-"),
			mRemove = new JButton("mr");

		this.add(mc);
		this.add(mPlus);
		this.add(mMinus);
		this.add(mRemove);
	}
}
