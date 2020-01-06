package javafxpackage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// TUTORIAL: https://javabeginners.de/Frameworks/JavaFX/FXML.php

public class View extends Application {
    //Attribute
    
    //Konstruktor
    public View()
    {

    }
    
    //Methoden
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml")); 
        Scene scene = new Scene(root, 430, 130);

        primaryStage.setTitle("Eingabe/Ausgabe Applikation");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("ViewStylesheet_empty.css").toExternalForm());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
} 