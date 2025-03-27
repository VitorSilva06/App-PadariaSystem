package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Home extends Application {
    @Override
    public void start(Stage janela) throws Exception {
        //Carregamdo imagem
        Image imgIconStarbucks = new Image(getClass().getResourceAsStream("/view/img/starbucks-48px.png"));

        BorderPane layoutPrincipal = new BorderPane();
        layoutPrincipal.setStyle("-fx-background-image: url('/view/img/imgFundo.jpg')");

        Scene scene = new Scene(layoutPrincipal,1024, 700);
        janela.setScene(scene);
        janela.setTitle("Starbucks");
        janela.getIcons().add(imgIconStarbucks);
        janela.show();


    }

    public static void main(String[] lifecycle) {
        launch(lifecycle);
    }

}
