package javaFiles;

import javaFiles.Buttons.MyButton;
import javaFiles.Pane.BorderPane1;
import javaFiles.Pane.MyPane;
import javaFiles.Pane.StackPane1;
import javaFiles.Pane.imagePane;
import javafx.application.Application;

public class Main {

    public static void main(String[] s) throws Exception {
        System.out.println("Hello, World!");
        Application.launch(BorderPane1.class, s);
    }
}
