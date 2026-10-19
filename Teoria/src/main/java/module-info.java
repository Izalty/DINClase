module com.mycompany.teoria {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.teoria to javafx.fxml;
    exports com.mycompany.teoria;
}
