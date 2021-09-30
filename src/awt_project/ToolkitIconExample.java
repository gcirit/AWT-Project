package awt_project;

import java.awt.*;

class ToolkitIconExample {
	ToolkitIconExample() {
		Frame f = new Frame();
		Image icon = Toolkit.getDefaultToolkit().getImage("Icons\\confirm.png");
		f.setIconImage(icon);
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new ToolkitIconExample();
	}
}
