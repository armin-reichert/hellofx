package de.amr.hellofx;

import java.util.logging.Logger;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFX extends Application {

	private static Logger log = Logger.getLogger(HelloFX.class.getName());

	public static void main(String[] args) {
		launch(args);
	}

	private static String versionInfo() {
		return "JavaFX %s, runtime %s".formatted(System.getProperty("javafx.version"),
				System.getProperty("javafx.runtime.version"));
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		var scene = new Scene(createSceneContent(), 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello, JavaFX!");
		primaryStage.show();
		log.info(versionInfo());
		log.info("Application started");
	}

	@Override
	public void stop() throws Exception {
		log.info("Application stopped");
	}

	private StackPane createSceneContent() {
		var content = new StackPane();
		var text = new Text(versionInfo());
		text.setFont(Font.font("Serif", FontWeight.EXTRA_BOLD, 30));
		text.setFill(Color.RED);
		content.getChildren().add(text);
		return content;
	}
}