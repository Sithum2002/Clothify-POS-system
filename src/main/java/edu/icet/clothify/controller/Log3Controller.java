package edu.icet.clothify.controller;

import edu.icet.clothify.controller.dto.EmployeeDTO;
import edu.icet.clothify.controller.dto.EmployeeDTO;
import javafx.event.ActionEvent;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.regex.Pattern;


public class Log3Controller {

    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXPasswordField txtPassword;

    @FXML
    private JFXButton btnSignIn;

    @FXML
    private JFXButton btnCLose;

    @FXML
    public void ExitOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }


    public void signinaction(ActionEvent actionEvent) throws IOException {
        /*try {
            // Load the new FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/DashBoard.fxml"));
            Parent root = loader.load();

            // Create a new scene and set it in the stage
            Scene scene = new Scene(root);
            Stage stage = (Stage) btnSignIn.getScene().getWindow();
            stage.setScene(scene);


            stage.show();
        } catch (IOException e) {

            e.printStackTrace();
        }*/


        String userName = txtUserName.getText().trim();
        String password = txtPassword.getText().trim();
        if (Pattern.compile("^(Sithum)$").matcher(userName).matches()) {


        } else {
            txtUserName.setFocusColor(Paint.valueOf("red"));
            txtUserName.requestFocus();


        }
        if (Pattern.compile("^(Anjana123)$").matcher(userName).matches()) {
        } else {
            txtPassword.setFocusColor(Paint.valueOf("red"));
            txtPassword.requestFocus();

        }
        if (userName.length() > 0 && password.length() > 0) {
            if (userName.equalsIgnoreCase("Sithum")
                    && password.equals("Anjana123")) {

                Stage window = (Stage) this.root.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/Dashboard.fxml"))));
                window.centerOnScreen();
                String tilte = "Sign In";
                String message = "WELCOME TO Clothify POS System ";


            } else {
                System.out.println("hellooooooooo");
                /*LoginBO loginBO = new LoginBOImpl();
                try {
                    EmployeeDTO employeeDTO = loginBO.getValidated(txtUserName.getText());
                    System.out.println(employeeDTO.getempID()+" id from login form");
                    System.out.println(employeeDTO.getemplogin() + " userName");
                    System.out.println(employeeDTO.getempPassword() + " password");

                    if (employeeDTO.getemplogin().equals(txtUserName.getText()) &&
                            employeeDTO.getempPassword().equals(txtPassword.getText())) {

                        Stage window = (Stage) this.root.getScene().getWindow();
//                        window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/CashierForm.fxml"))));
                        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../view/CashierForm.fxml"));
                        Parent parent =  fxmlLoader.load();
                        AddUserController controller = fxmlLoader.getController();
                        System.out.println("sending data");
                        controller.setempID(EmployeeDTO.getempID());
                        window.setScene(new Scene(parent));
                        window.centerOnScreen();
                        window.show();

                    } else {
                        System.out.println("waradi ukanno");
                    }
                } catch (NullPointerException e) {
                    System.out.println("user name waradi ballo");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } else {
            String tilte = "Sign In";
            String message = "Empty Username Or Password";

        }*/
            }
        }

    }
}


