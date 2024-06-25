package com.firstmaven.Home;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyWindow extends Application{
    
    Text title = null;

    Text vb1Text1 = null;
    Text vb1Text2 = null;
    Text vb1Text3 = null;

    Text vb2Text1 = null;
    Text vb2Text2 = null;
    Text vb2Text3 = null;

    Text text1 = null;
    Text text2 = null;
    
    @Override
    public void start(Stage prStage) {
        
        prStage.setTitle("MyWindow");
        prStage.setHeight(800);
        prStage.setWidth(1000);
        prStage.setResizable(false);

        prStage.getIcons().add(new Image("/images/MyIcon.png"));

        title = new Text(50, 40, "Programming Languages");
        title.setFont(new Font(35));
        title.setFill(Color.RED);

        vb1Text1 = new Text("JAVA");
        vb1Text1.setFont(new Font(40));
        vb1Text1.setFill(Color.YELLOWGREEN);

        vb1Text2 = new Text("PYTHON");
        vb1Text2.setFont(new Font(40));
        vb1Text2.setFill(Color.DARKBLUE);

        vb1Text3 = new Text("CPP");
        vb1Text3.setFont(new Font(40));

        vb2Text1 = new Text(10, 10, "web");
        vb2Text1.setFont(new Font(40));
        vb2Text1.setFill(Color.AQUA);

        vb2Text2 = new Text(10, 10, "backend");
        vb2Text2.setFont(new Font(40));

        vb2Text3 = new Text(10, 10, "app");
        vb2Text3.setFont(new Font(40));

        text1 = new Text(30, 50, "Good evening.");
        text1.setFont(new Font(40));
        text1.setFill(Color.WHITE);

        text2 = new Text(500, 50, "Have a nice day !");
        text2.setFont(new Font(40));
        text2.setFill(Color.YELLOW);

        VBox vb1 = new VBox(30, vb1Text1, vb1Text2, vb1Text3);
        vb1.setAlignment(Pos.CENTER);
        vb1.setLayoutX(50);
        vb1.setLayoutY(100);

        VBox vb2 = new VBox(30, vb2Text1, vb2Text2, vb2Text3);
        vb2.setLayoutX(220);
        vb2.setLayoutY(100);

        HBox hb1 = new HBox(20, vb1, vb2);
        hb1.setLayoutX(50);
        hb1.setLayoutY(100);
        
        Group gr = new Group(text1, text2, hb1);

        Scene sc = new Scene(gr, 450, 100);
        sc.setFill(Color.RED);
        sc.setCursor(Cursor.OPEN_HAND);

        prStage.setScene(sc);

        prStage.show();
    }
}
