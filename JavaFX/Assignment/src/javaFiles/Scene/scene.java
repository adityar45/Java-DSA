package javaFiles.Scene;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class scene extends Application{

     @Override
    public void start(Stage prStage){

        //Code
        VBox vbox = new VBox(50);
        Text java = new Text(10, 40, "Java");
        java.setFont(new Font(40));
        Text python = new Text(10, 40, "Python");
        python.setFont(new Font(40));
        Text cpp = new Text(10, 40, "CPP");
        cpp.setFont(new Font(40));

        vbox.getChildren().addAll(java, python, cpp);
        vbox.setAlignment(Pos.CENTER);
        vbox.setOpacity(1);
        vbox.setVisible(true);

        //Scene
        //Group gr = new Group(vbox);
        Scene sc = new Scene(vbox, 450, 100);
        prStage.setScene(sc);
        sc.setFill(Color.YELLOW);
        sc.setCursor(Cursor.OPEN_HAND);

        //Stage
        prStage.setTitle("MyScene");
        prStage.setWidth(1200);
        prStage.setHeight(1000);
        prStage.setX(500);
        prStage.setY(300);
        prStage.getIcons().add(new Image("assets/images/MyIcon.png"));
        prStage.setResizable(false);
        prStage.centerOnScreen();
        prStage.show();
    }
}
