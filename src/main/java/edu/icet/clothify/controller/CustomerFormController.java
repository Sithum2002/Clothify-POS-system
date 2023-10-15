package edu.icet.clothify.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;

public class CustomerFormController {
    @FXML
    private TableView<?> dtm;

    @FXML
    private TableColumn<?, ?> colitemcode;

    @FXML
    private TableColumn<?, ?> colitemname;

    @FXML
    private TableColumn<?, ?> colprice;

    @FXML
    private TableColumn<?, ?> colqty;

    @FXML
    private TableColumn<?, ?> colqty1;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtAddress1;

    @FXML
    private JFXTextField txtAddress2;

    @FXML
    private JFXTextField txtAddress3;

    @FXML
    private JFXTextField txtAddress4;

    @FXML
    void placeOrderOnAction(ActionEvent event) throws IOException {


    }

    @FXML
    void tblMouseClick(MouseEvent event) {

    }

    @FXML
    void tbltemsOnMouoseReleased(MouseEvent event) {

    }

    public void tblMouseClick(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void tbltemsOnMouoseReleased(javafx.scene.input.MouseEvent mouseEvent) {

    }
}


