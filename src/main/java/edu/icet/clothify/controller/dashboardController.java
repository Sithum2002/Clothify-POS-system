package edu.icet.clothify.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class dashboardController implements initiable {

    @FXML
    private AnchorPane root1;

    @FXML
    private Pane context;

    @FXML
    private Text dateDisplay;

    @FXML
    private Text digitalClock;

    @FXML
    private JFXButton btnDashboard;

    @FXML
    private JFXButton btnNewuser;

    @FXML
    private JFXButton btnAllReports;

    @FXML
    private JFXButton btnCustomers;

    @FXML
    private JFXButton btnAdditems;

    @FXML
    private JFXButton btnSupplier;

    @FXML
    private JFXButton btnAbout;

    @FXML
    private VBox dashboardpane;


    @FXML
    void openadditem(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/AddItem.fxml");
        Parent load = FXMLLoader.load(resource);
        this.context.getChildren().clear();
        this.context.getChildren().add(load);

    }

    @FXML
    void openallreports(ActionEvent event) throws IOException {

        URL resource = getClass().getResource("/view/");
        Parent load = FXMLLoader.load(resource);
        this.context.getChildren().clear();
        this.context.getChildren().add(load);

    }


    @FXML
    void opencustomers(ActionEvent event) throws IOException {

        URL resource = getClass().getResource("/view/CustomerForm.fxml");
        Parent load = FXMLLoader.load(resource);
        this.context.getChildren().clear();
        this.context.getChildren().add(load);

    }

    @FXML
    void opendashboard(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/DashBoard2.fxml");
        Parent load = FXMLLoader.load(resource);
        this.context.getChildren().clear();
        this.context.getChildren().add(load);

    }

    @FXML
    void opennewuser(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/adduser.fxml");
        Parent load = FXMLLoader.load(resource);
        this.context.getChildren().clear();
        this.context.getChildren().add(load);

    }

    @FXML
    void opensupplier(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/SupplierForm.fxml");
        Parent load = FXMLLoader.load(resource);
        this.context.getChildren().clear();
        this.context.getChildren().add(load);

    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        URL resource = getClass().getResource("view/About.fxml");
        if (resource != null) {
            Parent load = null;
            try {
                load = FXMLLoader.load(resource);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            this.context.getChildren().clear();
            this.context.getChildren().add(load);
        } else {
            System.out.println("FXML file not found: overview.fxml");
        }
    }

    public void openplaceorder(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("/view/PlaceOrder.fxml");
        Parent load = FXMLLoader.load(resource);
        this.context.getChildren().clear();
        this.context.getChildren().add(load);
    }

    public void aboutonaction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("/view/About.fxml");
        Parent load = FXMLLoader.load(resource);
        this.context.getChildren().clear();
        this.context.getChildren().add(load);
    }











    public void initialize() {
        updateClock();
        setupClockTimer();
    }

    public void updateClock() {

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String time = timeFormat.format(new Date());
        digitalClock.setText(time);


        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        String date = dateFormat.format(new Date());
        dateDisplay.setText(date);
    }

    public void setupClockTimer() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateClock();
            }
        }, 0, 500); // Update the clock every 1000 milliseconds (1 second)
    }
}
