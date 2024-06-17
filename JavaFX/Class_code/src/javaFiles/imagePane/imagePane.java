package javaFiles.imagePane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class imagePane extends Application{

    @Override
    public void start(Stage prStage) throws Exception {

        prStage.setTitle("MyPane");
        prStage.setHeight(800);
        prStage.setWidth(1000);
        prStage.setResizable(false);
        prStage.getIcons().add(new Image("assets/images/MyIcon.png"));

        Image img = new Image("assets/images/image.png");
        ImageView iv = new ImageView(img);
        iv.setFitHeight(350);
        iv.setFitWidth(400);
        iv.setPreserveRatio(true);

        Label l1 = new Label("Sine Wave");
        l1.setTextFill(Color.BLACK);
        l1.setFont(new Font(60));
        l1.setAlignment(Pos.BOTTOM_RIGHT);

        VBox vb1 = new VBox(l1);
        vb1.setAlignment(Pos.CENTER);

        HBox hb1 = new HBox(iv, vb1);
        //hb1.setPrefHeight(300);
        //hb1.setPrefWidth(800);
        //hb1.setLayoutY(100);
        //hb1.setLayoutX(100);
        hb1.setStyle("-fx-background-color:BLUE");

        Group gr = new Group(hb1);
        
        Scene sc = new Scene(gr, 450, 100);
        
        sc.setFill(Color.YELLOWGREEN);
        sc.setCursor(Cursor.OPEN_HAND);

        prStage.setScene(sc);

        prStage.show();
        

    }
    
}
