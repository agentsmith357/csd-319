package com.mycompany.javafxexample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


/*
 * Date: Jul 20, 2025
 * Author: Jelani Jenkins
 * Class: 402-j319
 * Teacher: Elijah Finch
 * Assignment: 11
 */

public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        VBox nav_menu = new VBox(10);
        nav_menu.setPadding(new Insets(10));
        nav_menu.setAlignment(Pos.TOP_LEFT);

        Label labels = new Label("Menu");
        Button main_button = new Button("Main Button");

        nav_menu.getChildren().addAll(labels, main_button);

        BorderPane bpane = new BorderPane();
        bpane.setLeft(nav_menu);



        Scene scene = new Scene(bpane, 500, 300);
        stage.setTitle("My Example of the VBox and using BorderPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
