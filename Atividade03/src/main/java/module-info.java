module org.example.atividade03 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.atividade03 to javafx.fxml;
    exports org.example.atividade03;
}