package net.aurore.asgard.views;

import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class TextEditor extends AsgardView {

	protected final TextArea area;
	
	public TextEditor(BorderPane pane) {
		area = new TextArea();
		pane.setCenter(area);
	}
	
	public TextArea getArea() {
		return area;
	}

}
