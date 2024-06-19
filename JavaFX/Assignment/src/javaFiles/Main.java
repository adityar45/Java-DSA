package javaFiles;

import javafx.application.Application;
import javaFiles.Buttons.MyButton;
import javaFiles.Home.MyHome;
import javaFiles.Scene.scene;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Application.launch(MyHome.class, args);
    }
}
