package calculator.calculator;

import javafx.css.Selector;
import javafx.css.Style;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class CalculatorController {
    Number n=new Number(0);
    Number m=new Number(0);
    int operation=0;

    @FXML
    private Button backBT;

    @FXML
    private Button deleteBT;

    @FXML
    private Button divisionBT;

    @FXML
    private Button eightBT;

    @FXML
    private Button equalBT;

    @FXML
    private Button fiveBT;

    @FXML
    private Button fourBT;

    @FXML
    private Button fractionBT;

    @FXML
    private Button minusBT;

    @FXML
    private Button moduloBT;

    @FXML
    private Button multiplicationBT;

    @FXML
    private Button nineBT;

    @FXML
    private Button oneBT;

    @FXML
    private Button percentBT;

    @FXML
    private Button plusBT;

    @FXML
    private Button positiveBT;

    @FXML
    private Button powerBT;

    @FXML
    private Button sevenBT;

    @FXML
    private Button sixBT;

    @FXML
    private Button sqrtBT;

    @FXML
    private Label textBox;

    @FXML
    private Pane textPane;

    @FXML
    private Button threeBT;

    @FXML
    private Button twoBT;

    @FXML
    private Button decimalBT;

    @FXML
    private Button zeroBT;

    @FXML
    void AddEight(MouseEvent event) {
        n.AddDigit(8);
        textBox.setText(n.ToString());
    }

    @FXML
    void AddOne(MouseEvent event) {
        n.AddDigit(1);
        textBox.setText(n.ToString());
    }

    @FXML
    void AddFive(MouseEvent event) {
        n.AddDigit(5);
        textBox.setText(n.ToString());
    }

    @FXML
    void AddFour(MouseEvent event) {
        n.AddDigit(4);
        textBox.setText(n.ToString());
    }

    @FXML
    void AddNine(MouseEvent event) {
        n.AddDigit(9);
        textBox.setText(n.ToString());
    }

    @FXML
    void AddPeriod(MouseEvent event) {
        n.MakeDouble();
    }

    @FXML
    void AddSeven(MouseEvent event) {
        n.AddDigit(7);
        textBox.setText(n.ToString());
    }

    @FXML
    void AddSix(MouseEvent event) {
        n.AddDigit(6);
        textBox.setText(n.ToString());
    }

    @FXML
    void AddThree(MouseEvent event) {
        n.AddDigit(3);
        textBox.setText(n.ToString());
    }

    @FXML
    void AddTwo(MouseEvent event) {
        n.AddDigit(2);
        textBox.setText(n.ToString());
    }

    @FXML
    void AddZero(MouseEvent event) {
        n.AddDigit(0);
        textBox.setText(n.ToString());
    }

    @FXML
    void ChangeSign(MouseEvent event) {
        n.ChangeSign();
        textBox.setText(n.ToString());
    }

    @FXML
    void DeleteAll(MouseEvent event) {
        n.DeleteNumber();
        m.DeleteNumber();
        operation=0;
        textBox.setText(n.ToString());
    }

    @FXML
    void DeleteLast(MouseEvent event) {
        n.DeleteLastDigit();
        textBox.setText(n.ToString());
    }

    @FXML
    void DoAddition(MouseEvent event) {
        operation=1;
        m.setNumber(n.getNumber());
        n.DeleteNumber();
    }

    @FXML
    void DoDivision(MouseEvent event) {
        operation=4;
        m.setNumber(n.getNumber());
        n.DeleteNumber();
    }

    @FXML
    void DoEqual(MouseEvent event) {
        switch(operation){
            case 1:
                n=new Number(n.getNumber()+m.getNumber());
                textBox.setText(n.ToString());
                break;

            case 2:
                System.out.println(m.getNumber());
                n=new Number(m.getNumber()-n.getNumber());
                textBox.setText(n.ToString());
                break;
            case 3:
                n=new Number(m.getNumber()*n.getNumber());
                textBox.setText(n.ToString());
                break;
            case 4:
                n=new Number(m.getNumber()/n.getNumber());
                textBox.setText(n.ToString());
                break;
            case 5:
                n=new Number(((int)m.getNumber())%((int)n.getNumber()));
                textBox.setText(n.ToString());
                break;
            case 6:
                n=new Number(Math.pow(m.getNumber(),n.getNumber()));
                textBox.setText(n.ToString());
                break;
        }

        operation=0;

    }

    @FXML
    void DoFraction(MouseEvent event) {
        n=new Number(1/(n.getNumber()));
        textBox.setText(n.ToString());
    }

    @FXML
    void DoMod(MouseEvent event) {
        operation=5;
        m.setNumber(n.getNumber());
        n.DeleteNumber();
    }

    @FXML
    void DoMultiplications(MouseEvent event) {
        operation=3;
        m.setNumber(n.getNumber());
        n.DeleteNumber();
    }

    @FXML
    void DoPercent(MouseEvent event) {
        n=new Number(n.getNumber()/100);
        textBox.setText(n.ToString());
    }

    @FXML
    void DoPow(MouseEvent event) {
        operation=6;
        m.setNumber(n.getNumber());
        n.DeleteNumber();
    }

    @FXML
    void DoSqrt(MouseEvent event) {
        n=new Number(Math.sqrt(n.getNumber()));
        textBox.setText(n.ToString());
    }

    @FXML
    void DoSubtraction(MouseEvent event) {
        operation=2;
        m.setNumber(n.getNumber());
        n.DeleteNumber();
    }

}
