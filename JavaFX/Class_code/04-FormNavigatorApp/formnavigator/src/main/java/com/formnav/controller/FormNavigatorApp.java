package com.formnav.controller;

import com.formnav.dataAccess.FormPage1;
import com.formnav.dataAccess.FormPage2;
import com.formnav.dataAccess.FormPage3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FormNavigatorApp extends Application{

        private Stage prStage;
        private Scene page1scene, page2scene, page3scene;

        //Page 1 instance
        private FormPage1 page1;

        //Page 2 instance
        private FormPage2 page2;

        //Page 3 instance
        private FormPage3 page3;

        @Override
        public void start(Stage prStage) {

            this.prStage = prStage;

            //Initialize Pages
            page1 = new FormPage1(this);
            page2 = new FormPage2(this);
            page3 = new FormPage3(this);

            //Create scenes for each page with specific dimensions
            page1scene = new Scene(page1.getView(), 400, 300);
            page2scene = new Scene(page2.getView(), 400, 300);
            page3scene = new Scene(page3.getView(), 400, 300);

            //Scene
            prStage.setScene(page1scene);
            prStage.setTitle("FormNavigatorApp");
            prStage.show();
    }

    //Method for navigating to page1
    public void navigateToPage1() {
        //Preserve data and navigate to page1
        page2.setField2Value(page2.getField2Value());
        page1.setField1Value(page1.getField1Value());
        prStage.setScene(page1scene);
    }

    //Method for navigating to page2
    public void navigateToPage2() {
        //Preserve data and navigate to page2
        page1.setField1Value(page1.getField1Value());
        page3.setField3Value(page3.getField3Value());
        prStage.setScene(page2scene);
    }

    //Method for navigating to page3
    public void navigateToPage3() {
        //Preserve data and navigate to page3
        page2.setField2Value(page2.getField2Value());
        prStage.setScene(page3scene);
    }



    
}
