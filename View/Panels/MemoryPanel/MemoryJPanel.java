package View.Panels.MemoryPanel;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MemoryJPanel extends JPanel{
	private JButton
		mc,
		mPlus,
		mMinus,
		mRemove;

	public MemoryJPanel() {
		this.setLayout(new GridLayout(0, 2));
		this.setPreferredSize( new Dimension(200, 200) );

		
			this.mc = new JButton("mc");
			this.mPlus = new JButton("m+");
			this.mMinus = new JButton("m-");
			this.mRemove = new JButton("mr");

		this.add(mc);
		this.add(mPlus);
		this.add(mMinus);
		this.add(mRemove);
	}

	public JButton getMc() {
		return mc;
	}

	public JButton getmPlus() {
		return mPlus;
	}

	public JButton getmMinus() {
		return mMinus;
	}

	public JButton getmRemove() {
		return mRemove;
	}

	


}
