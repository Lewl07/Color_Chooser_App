package com.mycompany.color_chooser_app;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class ColorChooserController {

    @FXML private Slider redSlider;
    @FXML private Slider greenSlider;
    @FXML private Slider blueSlider;
    @FXML private Slider alphaSlider;
    
    @FXML private TextField redTextField;
    @FXML private TextField greenTextField;
    @FXML private TextField blueTextField;
    @FXML private TextField alphaTextField;

    @FXML private Circle colorCircle;
    @FXML private Rectangle colorRectangle;
    
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;
    
    public void initialize() {
        redTextField.textProperty().bind(
                redSlider.valueProperty().asString("%.0f"));
        
        greenTextField.textProperty().bind(
                greenSlider.valueProperty().asString("%.0f"));
        
        blueTextField.textProperty().bind(
                blueSlider.valueProperty().asString("%.0f"));
        
        alphaTextField.textProperty().bind(
                alphaSlider.valueProperty().asString("%.02f")); 
    }
}
