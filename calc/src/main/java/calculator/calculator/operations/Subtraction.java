package calculator.calculator.operations;

public class Subtraction {
    double difference;

    public Subtraction(int x,int y){
        difference=x-y;
    }

    public Subtraction(double x,double y){
        difference=x-y;
    }

    public double GetDiff(){
        return difference;
    }
}
