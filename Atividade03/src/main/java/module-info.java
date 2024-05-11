module org.example.atividade03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.atividade03 to javafx.fxml;
    exports org.example.atividade03;
}