module com.consultorio.utez2dpacientesjavafxequipo08 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.consultorio.utez2dpacientesjavafxequipo08 to javafx.fxml;
    exports com.consultorio.utez2dpacientesjavafxequipo08;
}