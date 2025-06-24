package View.Resources;

import javax.swing.ImageIcon;

public enum IconPath {

  	HISTORY("/icons/history.jpg");

	private final ImageIcon icon;

	IconPath(String path) {
		this.icon = new ImageIcon(getClass().getResource(path));
	}

	public ImageIcon getIcon() {
		return icon;
	}
}
