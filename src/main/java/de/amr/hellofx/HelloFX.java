package de.amr.hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFX extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		var scene = new Scene(createSceneContent(), 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello FX");
		primaryStage.show();
		var version = System.getProperty("javafx.version");
		var runtimeVersion = System.getProperty("javafx.runtime.version");
		System.out
				.println("Application started, JavaFX version: %s, runtime version: %s".formatted(version, runtimeVersion));
	}

	@Override
	public void stop() throws Exception {
		System.out.println("Application stopped");
	}

	private StackPane createSceneContent() {
		var content = new StackPane();
		var text = new Text("Hello FX");
		text.setFont(Font.font(60));
		text.setFill(Color.RED);
		content.getChildren().add(text);
		return content;
	}
}