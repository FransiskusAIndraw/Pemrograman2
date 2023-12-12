module com.praktikum6.praktikum6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens PRAKTIKUM6 to javafx.fxml;
    exports PRAKTIKUM6;
}