module com.example.section3javafxpropertiesandbindings {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.section3javafxpropertiesandbindings to javafx.fxml;
    exports com.example.section3javafxpropertiesandbindings;
}