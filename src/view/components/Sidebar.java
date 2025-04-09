package view.components;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Sidebar extends VBox {

    public Button btnFornecedor = new Button("Fornecedor");
    public Button btnProduto = new Button("Produto");
    public Button btnCliente = new Button("Cliente");
    public Button btnPedido = new Button("Pedido");


    //construtor para inicializar o componentes (como um objeto) em outras janelas
    public Sidebar() {

        //Carregamento de imagens
        Image imgIconFornecedor = new Image(getClass().getResourceAsStream("/view/resources/img/icon-fornecedor.png"));
        Image imgIconProduto = new Image(getClass().getResourceAsStream("/view/resources/img/icon-produto.png"));
        Image imgIconCliente = new Image(getClass().getResourceAsStream("/view/resources/img/icon-cliente.png"));
        Image imgIconPedido = new Image(getClass().getResourceAsStream("/view/resources/img/icon-pedido.png"));


        Image imgIconStarbucks = new Image(getClass().getResourceAsStream("/view/resources/img/starbucks-48px.png"));


        //Carregamento de fontes
        Font fontNegrito = Font.loadFont(getClass().getResourceAsStream("/view/resources/fonts/Jost-Bold.ttf"), 14);
        Font fontLigth = Font.loadFont(getClass().getResourceAsStream("/view/resources/fonts/Jost-ExtraBold.ttf"), 14);


        //Determina como as imagens serão visualizadas (por exemplo: largura, altura, opacidade...)
        ImageView imgViewIconStarbucks = new ImageView(imgIconStarbucks);
        imgViewIconStarbucks.setFitHeight(50);
        imgViewIconStarbucks.setFitHeight(50);

        ImageView imgViewIconCliente = new ImageView(imgIconCliente);
        imgViewIconCliente.setFitHeight(25);  //Altura
        imgViewIconCliente.setFitWidth(25);   //Largura
        btnCliente.setGraphic(imgViewIconCliente);  //Adicionar a imagem no botão

        ImageView imgViewIconFornecedor = new ImageView(imgIconFornecedor);
        imgViewIconFornecedor.setFitHeight(25);
        imgViewIconFornecedor.setFitWidth(25);
        btnFornecedor.setGraphic(imgViewIconFornecedor);

        ImageView imgViewIconProduto = new ImageView(imgIconProduto);
        imgViewIconProduto.setFitHeight(25);
        imgViewIconProduto.setFitWidth(25);
        btnProduto.setGraphic(imgViewIconProduto);

        ImageView imgViewIconPedido = new ImageView(imgIconPedido);
        imgViewIconPedido.setFitHeight(25);
        imgViewIconPedido.setFitWidth(25);
        btnPedido.setGraphic(imgViewIconPedido);






        //Estilo personalizado para o botão
        String styleButton  = "-fx-background-color: transparent;" +
                "-fx-border-color: transparent;" +
                "-fx-font-size: 14px;" +
                "-fx-font-weight: bold;" +
                "-fx-text-fill: #58b558;" +
                "-fx-alignment: center;" +
                "-fx-graphic-text-gap: 20px;" +
                "-fx-font-family:" + fontNegrito.getFamily() +";" +
                "-fx-cursor: hand;"; //Muda o cursosr do mouse para a mãozinha

        btnCliente.setStyle(styleButton);
        btnProduto.setStyle(styleButton);
        btnPedido.setStyle(styleButton);
        btnFornecedor.setStyle(styleButton);


        Label lblMenu = new Label("Starbucks");
        lblMenu.setFont(Font.font(fontNegrito.getFamily(), 28));
        lblMenu.setGraphic(imgViewIconStarbucks);
        lblMenu.setGraphicTextGap(10); //Determinar um espaço


        //Adicionar um estilo em tempo de execução, isto é, seráatiavado SOMENTE quando o usuário passar o mouse acima do botão
        btnCliente.setOnMouseEntered(evento -> btnCliente.setStyle(styleButton.replace("transparent",
                "#ccc;")));
            btnCliente.setOnMouseExited(evento -> btnCliente.setStyle(styleButton));

        btnFornecedor.setOnMouseEntered(evento -> btnFornecedor.setStyle(styleButton.replace("transparent",
                "#ccc;")));
            btnFornecedor.setOnMouseExited(evento -> btnFornecedor.setStyle(styleButton));

        btnPedido.setOnMouseEntered(evento -> btnPedido.setStyle(styleButton.replace("transparent",
                "#ccc;")));
            btnPedido.setOnMouseExited(evento -> btnPedido.setStyle(styleButton));

        btnProduto.setOnMouseEntered(evento -> btnProduto.setStyle(styleButton.replace("transparent",
                "#ccc;")));
            btnProduto.setOnMouseExited(evento -> btnProduto.setStyle(styleButton));


        // "->" Arrow Fuction é chamada quando uma ação está em andamento.


        //Distanciar com uma margem a lblmenu (que tem o titulo Starbucks) do elemento botão logo abaixo
        setMargin(lblMenu, new Insets(0,1,20,0));
                                    //superior, direita, inferior, esuqerda



        getChildren().addAll(lblMenu, btnFornecedor, btnProduto, btnCliente, btnPedido);
    }
}