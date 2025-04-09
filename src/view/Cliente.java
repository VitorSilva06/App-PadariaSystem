package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.components.Buttons;
import view.components.Sidebar;


public class Cliente extends Application {

    @Override
    public void start(Stage clienteJanela) throws Exception {
        //Criando o objeto menu
        Sidebar menu = new Sidebar();
        Buttons buttons = new Buttons();

        //Carregamdo imagem
        Image imgIconStarbucks = new Image(getClass().getResourceAsStream("/view/resources/img/starbucks-48px.png"));

        BorderPane layoutPrincipal = new BorderPane();
        //layoutPrincipal.setStyle("-fx-background-image: url('/view/resources/img/imgFundo.jpg')");
        layoutPrincipal.setLeft(menu);
        layoutPrincipal.setBottom(buttons);

        menu.setStyle("-fx-background-color: white; -fx-padding: 30px");


        Scene scene = new Scene(layoutPrincipal,1024, 700);
        clienteJanela.setScene(scene);
        clienteJanela.setTitle("Starbucks");
        clienteJanela.getIcons().add(imgIconStarbucks);
        clienteJanela.show();


    }

    public static void main(String[] lifecycle) {
        launch(lifecycle);
    }

}
