module com.example.section1introduction {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.section1introduction to javafx.fxml;
    exports com.example.section1introduction;
}