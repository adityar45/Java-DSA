package javaFiles;

import javaFiles.home.MyPane;
import javaFiles.imagePane.imagePane;
import javaFiles.Buttons.MyButton;
import javafx.application.Application;


public class Main {

    public static void main(String[] s) throws Exception {
        System.out.println("Hello, World!");
        Application.launch(MyButton.class, s);
    }

}
