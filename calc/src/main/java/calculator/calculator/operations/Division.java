package calculator.calculator.operations;

public class Division {
    double quotient;

    Division(double x, double y,boolean isMod){
        if(isMod==false) {
            quotient = x / y;
        }
        else{
            quotient=x%y;
        }
    }

    Division(double x, boolean isSqrt,boolean isFraction){
        if(isSqrt==true){
            quotient=Math.sqrt(x);
        }
        else{
            if(isFraction==true){
                quotient=1/x;
            }
            else{
                quotient=x/100;
            }
        }

    }
}
