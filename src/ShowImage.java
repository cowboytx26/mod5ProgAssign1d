/*
Short Description:  This program will display images of four flags on a pane with two flags on each row
Author:  Brian Wiatrek
Date:  September 20, 2024
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ShowImage extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws FileNotFoundException {

        // Read the flag images from file input streams
        FileInputStream imageInput1 = new FileInputStream("/Users/brianwiatrek/IdeaProjects/mod5ProgAssign1d/flag1.gif");
        FileInputStream imageInput2 = new FileInputStream("/Users/brianwiatrek/IdeaProjects/mod5ProgAssign1d/flag2.gif");
        FileInputStream imageInput3 = new FileInputStream("/Users/brianwiatrek/IdeaProjects/mod5ProgAssign1d/flag6.gif");
        FileInputStream imageInput4 = new FileInputStream("/Users/brianwiatrek/IdeaProjects/mod5ProgAssign1d/flag7.gif");

        //Create a new GridPane
        GridPane pane = new GridPane();

        //Create new images for each of the files
        Image image1 = new Image(imageInput1);
        Image image2 = new Image(imageInput2);
        Image image3 = new Image(imageInput3);
        Image image4 = new Image(imageInput4);

        //place the nodes as required on the pane
        pane.add(new ImageView(image1),0,0);
        pane.add(new ImageView(image2),0,1);
        pane.add(new ImageView(image3),1,0);
        pane.add(new ImageView(image4),1,1);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
