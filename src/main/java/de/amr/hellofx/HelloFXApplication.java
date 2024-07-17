package de.amr.hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.logging.Logger;

/**
 * JavaFX Hello World Application.
 *
 * @author Armin Reichert
 */
public class HelloFXApplication extends Application {

	private static final Logger LOGGER = Logger.getLogger(HelloFXApplication.class.getName());

	private static String versionInfo() {
		return String.format("JavaFX %s, runtime %s",
			System.getProperty("javafx.version"),
			System.getProperty("javafx.runtime.version"));
	}

	@Override
	public void start(Stage primaryStage) {
		var scene = new Scene(createSceneContent(), 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello, JavaFX!");
		primaryStage.show();
		LOGGER.info(versionInfo());
		LOGGER.info("Application started");
	}

	@Override
	public void stop() {
		LOGGER.info("Application stopped");
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