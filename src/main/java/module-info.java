module com.example.stickherogame_ap_project_deadline1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stickherogame_ap_project_deadline1 to javafx.fxml;
    exports com.example.stickherogame_ap_project_deadline1;
}