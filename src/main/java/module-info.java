module com.example.try_intellij {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;

    opens com.example.try_intellij to javafx.fxml;
    exports com.example.try_intellij;
}