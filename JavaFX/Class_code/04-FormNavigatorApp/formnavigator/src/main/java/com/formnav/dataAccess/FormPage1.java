package com.formnav.dataAccess;

import com.formnav.controller.FormNavigatorApp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FormPage1 {

    private FormNavigatorApp app;
    private GridPane view;
    private TextField field1;

    //Constructor for formpage1 
    public FormPage1(FormNavigatorApp app) {
        this.app = app;
        initialize();
    }

    //Initialize the layout and components
    private void initialize() {

        view = new GridPane();
        view.setPadding(new Insets(10));
        view.setHgap(10);
        view.setVgap(10);

        Label label1 = new Label("Field 1 :");

        //create a textfield for user input
        field1 = new TextField();

        //create a button
        //Next
        Button nextButton = new Button("Next");
        nextButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                app.navigateToPage2();
            }        
        });

        //Clear
        Button clearButton = new Button("Clear");
        clearButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                setField1Value(null);
            }        
        });

        //Add components to grid pane
        view.add(label1, 0, 0);

        view.add(field1, 1, 0);

        view.add(nextButton, 1, 1);

        view.add(clearButton, 2, 1);
    }

    //Method to get the view of page
    public GridPane getView() {
        return view;
    }

    //Method to get the value of field 1
    public String getField1Value() {
        return field1.getText();
    }

    //Method to set the value of field1
    public void setField1Value(String value) {
        field1.setText(value);
    }
    
}
