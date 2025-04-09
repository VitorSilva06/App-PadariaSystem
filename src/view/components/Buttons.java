package view.components;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class Buttons extends HBox {
    public Button btnAdicionar = new Button("Adicionar");
    public Button btnEditar = new Button("Editar");
    public Button btnDelete = new Button("Delete");

    public Buttons(){
        Image imgIconAdicionar = new Image(getClass().getResourceAsStream("/view/resources/img/plus.png"));
        Image imgIconEditar = new Image(getClass().getResourceAsStream("/view/resources/img/edit.png"));
        Image imgIconDeletar = new Image(getClass().getResourceAsStream("/view/resources/img/delete.png"));
        Font fontNegrito = Font.loadFont(getClass().getResourceAsStream("/view/resources/fonts/Jost-Bold.ttf"), 16);

        ImageView imgViewIconAdicionar = new ImageView(imgIconAdicionar);
        imgViewIconAdicionar.setFitHeight(25);
        imgViewIconAdicionar.setFitWidth(25);
        btnAdicionar.setGraphic(imgViewIconAdicionar);
        btnAdicionar.setFont(Font.font(fontNegrito.getFamily()));

        ImageView imgViewIconEditar = new ImageView(imgIconEditar);
        imgViewIconEditar.setFitHeight(25);
        imgViewIconEditar.setFitWidth(25);
        btnEditar.setGraphic(imgViewIconEditar);
        btnEditar.setFont(Font.font(fontNegrito.getFamily()));


        ImageView imgViewIconDeletar = new ImageView(imgIconDeletar);
        imgViewIconDeletar.setFitHeight(25);
        imgViewIconDeletar.setFitWidth(25);
        btnDelete.setGraphic(imgViewIconDeletar);
        btnDelete.setFont(Font.font(fontNegrito.getFamily()));

        String styleButton  = "-fx-background-color: transparent;" +
                "-fx-alignment: center;" +
                "-fx-cursor: hand;" +
                "-fx-padding: 12px;"+
                "-fx-border-radius: 15px;";

        btnAdicionar.setStyle(styleButton);
        btnEditar.setStyle(styleButton);
        btnDelete.setStyle(styleButton);


        btnAdicionar.setOnMouseEntered(evento -> btnAdicionar.setStyle(styleButton.replace("transparent",
                "#ccc;")));
            btnAdicionar.setOnMouseExited(evento -> btnAdicionar.setStyle(styleButton));

        btnEditar.setOnMouseEntered(evento -> btnEditar.setStyle(styleButton.replace("transparent",
                "#ccc;")));
            btnEditar.setOnMouseExited(evento -> btnEditar.setStyle(styleButton));

        btnDelete.setOnMouseEntered(evento -> btnDelete.setStyle(styleButton.replace("transparent",
                "#ccc;")));
            btnDelete.setOnMouseExited(evento -> btnDelete.setStyle(styleButton));

        getChildren().addAll(btnAdicionar, btnEditar, btnDelete);
    }
}
