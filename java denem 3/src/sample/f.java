package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.text.*;
import javafx.scene.Group;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.*;
import java.io.*;
import javafx.stage.FileChooser;

import javafx.application.Application;

public class f extends Application {File file;
    Stage st1=new Stage();
    public Stage getSt1() {
        return st1;
    }

    public void setSt1(Stage st1) {
        this.st1 = st1;
    }



    public File getFile() {
        return file;
    }





    public void start(Stage stage)
    {
        st1=stage;
        try {

            // set title for the stage
            stage.setTitle("FileChooser");

            // create a File chooser
            FileChooser fil_chooser = new FileChooser();
            FileChooser.ExtensionFilter extFilter =
                    new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
            FileChooser.ExtensionFilter extfilter2= new FileChooser.ExtensionFilter("Xml files (*.xml)", "*.xml");

            fil_chooser.getExtensionFilters().addAll(extFilter,extfilter2);


            // set title
            fil_chooser.setTitle("Select File");

            // set initial File
            fil_chooser.setInitialDirectory(new File("C:\\"));

            // create a Label
            Label label = new Label("no files selected");

            // create a Button
            Button button = new Button("Show open dialog");

            // create an Event Handler
            EventHandler<ActionEvent> event =
                    new EventHandler<ActionEvent>() {

                        public void handle(ActionEvent e)
                        {

                            // get the file selected
                             file = fil_chooser.showOpenDialog(stage);


                            if (file != null) {
                                label.setText(file.getAbsolutePath()
                                        + "  selected");
                                System.out.println("file:"+file);

                            }
                        }

                    };

            button.setOnAction(event);

            // create a VBox
            VBox vbox = new VBox(30, label, button);

            // set Alignment
            vbox.setAlignment(Pos.CENTER);

            // create a scene
            Scene scene = new Scene(vbox, 800, 500);

            // set the scene
            stage.setScene(scene);


            stage.show();
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    // Main Method
    public static void main(String args[])
    {

        // launch the application
        launch(args);
    }
}

