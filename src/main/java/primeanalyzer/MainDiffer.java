package primeanalyzer;

import primeanalyzer.controller.PersonController;
import primeanalyzer.model.Person;

import javax.ws.rs.POST;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
 

public class MainDiffer extends Application {
	 
	 @Override
	    public void start(Stage primaryStage) {
	        try {
	            primaryStage.setResizable(false);
	            primaryStage.setTitle("Issue Manager");
	            primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/Home.fxml"))));
	            primaryStage.show();            
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	 	@POST
	     public void updateDb() {
	    	 	
	     }
	 
	    public static void main(String[] args) {
	        launch(args);
	    }
}

