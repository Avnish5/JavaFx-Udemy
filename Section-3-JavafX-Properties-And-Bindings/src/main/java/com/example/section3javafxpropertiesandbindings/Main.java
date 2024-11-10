package com.example.section3javafxpropertiesandbindings;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {
    //property-binding
    /*
    @Override
    public void start(Stage stage) throws Exception {
        VBox root=new VBox();
        Employee employee=new Employee("Patrick",4000);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label label=new Label();
        Button button=new Button("Click Me");

        button.setOnAction(e->{
            int salary=employee.getSalary();
            employee.setSalary(salary*2);

        });

        employee.getSalaryProperty().addListener(o->
                label.setText("Name: "+employee.getName()+" | Salary: "+employee.getSalary()));
        root.getChildren().addAll(label,button);

        Scene scene=new Scene(root,550,500);
        stage.setScene(scene);
        stage.setTitle("Hello");
        stage.show();
    }
/*
    @Override
    public void start(Stage stage)  {
        ReadOnlyIntegerWrapper numWrapper=new ReadOnlyIntegerWrapper(100);
        ReadOnlyIntegerProperty num=numWrapper.getReadOnlyProperty();

        System.out.println("NumWrapper: "+numWrapper.get());
        System.out.println("Num: "+num.get());

        numWrapper.set(200);

        System.out.println("NumWrapper: "+numWrapper.get());
        System.out.println("Num: "+num.get());
    }

 */
    //uni and bi-directional binding
/*
    @Override
    public void start(Stage stage){
        VBox root=new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label label=new Label("Welcome");
        TextField filed1=new TextField();
        TextField filed2=new TextField();
        Button button=new Button("Bind");
        filed1.setMaxWidth(200);

        //unidirectional-binding
        button.setOnAction(e->filed1.textProperty().bind(filed2.textProperty()));

        //bidirectional-binding
       // button.setOnAction(e->filed1.textProperty().bindBidirectional(filed2.textProperty()));

        root.getChildren().addAll(label,filed1,filed2,button);
        Scene scene=new Scene(root,550,500);
        stage.setScene(scene);
        stage.setTitle("Application");
        stage.show();;
    }

 */

    //WAP in javafx where we are displaying an list view and also add the button to add an new item in the list view.
    @Override
    public void start(Stage stage){
        VBox root=new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        ObservableList<String> list= FXCollections.observableArrayList("one","two","three");
        ListView<String> listView=new ListView<>();
        TextField filed=new TextField();
        filed.setMaxWidth(200);
        Button button=new Button("ADD");
        listView.setItems(list);

        button.setOnAction(e->{
            if(!filed.textProperty().get().isEmpty())
            {
                list.addAll(filed.getText());
            }
        });

        root.getChildren().addAll(listView,filed,button);
        Scene scene=new Scene(root,550,500);
        stage.setScene(scene);
        stage.setTitle("Application");
        stage.show();

    }
    public static void main(String[] args) {
        launch();
    }


}
