package net.aurore.asgard.core;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import net.aurore.asgard.views.TextEditor;

public class Main extends Application{
	
	public Main() {
		
	}
	

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane pane = new BorderPane();
		new TextEditor(pane);
		stage.setScene(new Scene(pane));
		stage.show();
	}
	
	
	public static void main(String[] args) {
		Application.launch(Main.class, args);
	}


}
