package com.example.demo;

import com.example.demo.entities.Bus;
import com.example.demo.entities.Car;
import com.example.demo.entities.Truck;
import com.example.demo.entities.Vehicle;
import com.example.demo.enums.VehicleType;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private RadioButton carRadioButton;
    @FXML
    private RadioButton busRadioButton;
    @FXML
    private RadioButton truckRadioButton;
    @FXML
    private TextField engineCapacityTextField;
    @FXML
    private TextField manufactureYearTextField;
    @FXML
    private Button calculateTaxButton;
    @FXML
    private Label calculatedTaxLabel;



    public HelloController() {

    }
    @FXML
    void CalculateTax(ActionEvent event) {
        if (getSelectedVehicleType()==null || engineCapacityTextField.getText().isEmpty() ||
                manufactureYearTextField.getText().isEmpty())
            return;

        if (getSelectedVehicleType().equals(VehicleType.CAR)){
            Car car = new Car(Integer.parseInt(engineCapacityTextField.getText()),Integer.parseInt(
                    manufactureYearTextField.getText()));
            this.calculatedTaxLabel.setText(String.valueOf(car.calculateTax(VehicleType.CAR)));
        }
        if (getSelectedVehicleType().equals(VehicleType.BUS)){
            Bus bus = new Bus(Integer.parseInt(engineCapacityTextField.getText()),Integer.parseInt(
                    manufactureYearTextField.getText()));
            this.calculatedTaxLabel.setText(String.valueOf(bus.calculateTax(VehicleType.BUS)));
        }
        if (getSelectedVehicleType().equals(VehicleType.TRUCK)){
            Truck truck = new Truck(Integer.parseInt(engineCapacityTextField.getText()),Integer.parseInt(
                    manufactureYearTextField.getText()));
            this.calculatedTaxLabel.setText(String.valueOf(truck.calculateTax(VehicleType.TRUCK)));
        }


    }
    private VehicleType getSelectedVehicleType() {

        if (this.carRadioButton.isSelected()) {
            return VehicleType.CAR;
        } else if (this.busRadioButton.isSelected()) {
            return VehicleType.BUS;
        } else {
            return this.truckRadioButton.isSelected() ? VehicleType.TRUCK : null;
        }
    }




    @FXML
    void onOneB(ActionEvent event) {
        System.out.println("skmlc");
        String val = this.manufactureYearTextField.getText();
        String val1 = this.engineCapacityTextField.getText();
        if (val.equals("0") || val1.equals("0")) {
            val = "";
        }

        this.manufactureYearTextField.setText(val + "1");
        this.engineCapacityTextField.setText(val1 + "1");
    }

    @FXML
    protected void onTwoB(ActionEvent event) {
        System.out.println("onThreeB");
        String val = this.manufactureYearTextField.getText();
        String val1 = this.engineCapacityTextField.getText();
        if (val.equals("0") || val1.equals("0")) {
            val = "";
        }

        this.manufactureYearTextField.setText(val + "2");
        this.engineCapacityTextField.setText(val1 + "2");
    }

    @FXML
    protected void onThreeB(ActionEvent event) {
        String val = this.manufactureYearTextField.getText();
        String val1 = this.engineCapacityTextField.getText();
        if (val.equals("0") || val1.equals("0")) {
            val = "";
        }

        this.manufactureYearTextField.setText(val + "3");
        this.engineCapacityTextField.setText(val1 + "3");
    }

    @FXML
    protected void onFourB(ActionEvent event) {
        String val = this.manufactureYearTextField.getText();
        String val1 = this.engineCapacityTextField.getText();
        if (val.equals("0") || val1.equals("0")) {
            val = "";
        }

        this.manufactureYearTextField.setText(val + "4");
        this.engineCapacityTextField.setText(val1 + "4");
    }

    @FXML
    protected void onFiveB(ActionEvent event) {
        String val = this.manufactureYearTextField.getText();
        String val1 = this.engineCapacityTextField.getText();
        if (val.equals("0") || val1.equals("0")) {
            val = "";
        }

        this.manufactureYearTextField.setText(val + "5");
        this.engineCapacityTextField.setText(val1 + "5");
    }

    @FXML
    protected void onSixB(ActionEvent event) {
        String val = this.manufactureYearTextField.getText();
        String val1 = this.engineCapacityTextField.getText();
        if (val.equals("0") || val1.equals("0")) {
            val = "";
        }

        this.manufactureYearTextField.setText(val + "6");
        this.engineCapacityTextField.setText(val1 + "6");
    }

    @FXML
    protected void onSevenB(ActionEvent event) {
        String val = this.manufactureYearTextField.getText();
        String val1 = this.engineCapacityTextField.getText();
        if (val.equals("0") || val1.equals("0")) {
            val = "";
        }

        this.manufactureYearTextField.setText(val + "7");
        this.engineCapacityTextField.setText(val1 + "7");
    }

    @FXML
    protected void onEightB(ActionEvent event) {
        String val = this.manufactureYearTextField.getText();
        String val1 = this.engineCapacityTextField.getText();
        if (val.equals("0") || val1.equals("0")) {
            val = "";
        }

        this.manufactureYearTextField.setText(val + "8");
        this.engineCapacityTextField.setText(val1 + "8");
    }

    @FXML
    protected void onNineB(ActionEvent event) {
        String val = this.manufactureYearTextField.getText();
        String val1 = this.engineCapacityTextField.getText();
        if (val.equals("0") || val1.equals("0")) {
            val = "";
        }

        this.manufactureYearTextField.setText(val + "9");
        this.engineCapacityTextField.setText(val1 + "9");
    }

    @FXML
    protected void onZeroB(ActionEvent event) {
        String val = this.manufactureYearTextField.getText();
        String val1 = this.engineCapacityTextField.getText();
        if (val.equals("0") || val1.equals("0")) {
            val = "";
        }

        this.manufactureYearTextField.setText(val + "0");
        this.engineCapacityTextField.setText(val1 + "0");
    }
}