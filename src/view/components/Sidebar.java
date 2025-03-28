package view.components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;


public class Sidebar extends VBox {
    public Button btnFornecedor = new Button("Fornecedores");
    public Button btnProduto = new Button("Produtos");
    public Button btnCliente = new Button("Clientes");
    public Button btnPedido = new Button("Pedidos");

    //construtor para inicilizar o component (como um objeto) em outras janelas
    public Sidebar() {
        Label lblMenu = new Label("Starbucks");

        lblMenu.setStyle("-fx-font-size:16px; -fx-font-weight: bold;");
        getChildren().addAll(lblMenu, btnFornecedor, btnProduto, btnCliente, btnPedido);

    }
}
