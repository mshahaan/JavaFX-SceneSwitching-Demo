import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        
        Parent root;

        try {
            root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
            Scene scene1 = new Scene(root);
            
            arg0.setScene(scene1);
            arg0.show();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
}
