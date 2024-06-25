package com.formnav.dataAccess;

import com.formnav.controller.FormNavigatorApp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FormPage2 {
    
    private FormNavigatorApp app;
    private GridPane view;
    private TextField field2;

    //Constructor for formpage2
    public FormPage2(FormNavigatorApp app) {
        this.app = app;
        initialize();
    }

    //Initialize the layout and components
    private void initialize() {

        view = new GridPane();
        view.setPadding(new Insets(10));
        view.setHgap(10);
        view.setVgap(10);

        Label label2 = new Label("Field 2 :");

        //create a textfield for user input
        field2 = new TextField();

        //create a button
        //Back
        Button backButton = new Button("Back");
        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                app.navigateToPage1();
            }        
        });

        //Next
        Button nextButton = new Button("Next");
        nextButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                app.navigateToPage3();
            }        
        });

        //Clear
        Button clearButton = new Button("Clear");
        clearButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                setField2Value(null);
            }        
        });

        //Add components to grid pane
        view.add(label2, 0, 0);

        view.add(field2, 1, 0);

        view.add(backButton, 0, 1);

        view.add(nextButton, 1, 1);

        view.add(clearButton, 2, 1);
    }

    //Method to get the view of page
    public GridPane getView() {
        return view;
    }

    //Method to get the value of field 1
    public String getField2Value() {
        return field2.getText();
    }

    //Method to set the value of field1
    public void setField2Value(String value) {
        field2.setText(value);
    }
    
}
