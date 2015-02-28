package org.petoskeypaladins.scouting.client;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScoutingClient extends Application {

	private static Stage appStage;
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			ScoutingClient.appStage = primaryStage;
			
			Parent root = FXMLLoader.load(getClass().getResource("xml/Application.fxml"));
			
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Scouting Program 2015 - Recycle Rush (v0.1 ALPHA)");
			primaryStage.setResizable(false);
			primaryStage.show();
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static Stage getStage() {
		return appStage;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
