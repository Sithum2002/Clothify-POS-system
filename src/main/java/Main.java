import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

import static javafx.fxml.FXMLLoader.*;
import static javafx.scene.paint.Color.TRANSPARENT;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Parent root;

    double xOffset, yOffset;

    @Override
    public void start(Stage stage) throws Exception {

        root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("view/LoginForm3.fxml")));
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();

        scene.setFill(TRANSPARENT);
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        });
    }
}



