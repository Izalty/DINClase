module com.mycompany.teoria {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    
    opens com.mycompany.teoria to javafx.fxml;
    
    opens Models to javafx.base;
    
    exports com.mycompany.teoria;
}
