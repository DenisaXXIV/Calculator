package calculator.calculator;

public class Number {
    double number;
    int nrDigit;
    int nrDecimal;
    boolean isDouble=false;
    String nrS;

    Number(double x){
        number=x;
        nrDigit=1;
        nrDecimal=0;
        isDouble=false;
        nrS="";
    }

    void AddDigit(int digit){
        GetNrOfDecimal();
        GetNrOfIntDigit();
        if(nrDecimal+nrDigit<6) {
            if (!isDouble) {
                number = number * 10 + digit;
            }
            else {
                number =number + ((double)digit/Math.pow(10,nrDecimal+1));
            }
        }
        else{
            return;
        }
    }

    void DeleteLastDigit(){
        if(!isDouble) {
            number =(int)( number / 10);
        }
        else{
            GetNrOfDecimal();
            int nrPeriod=nrDecimal;
            number=(double)((int)(number*Math.pow(10,nrPeriod))/10);
            if(nrPeriod-1>0){
                number=(double)number/Math.pow(10,(nrPeriod-1));
            }
        }
    }

    void DeleteNumber(){
        number=0;
    }

    void ChangeSign(){
        number=number*(-1);
    }

    void GetNrOfDecimal (){
        nrDecimal=0;
        double x=number;

        while(x!=(int)x){
            x=x*10;
            nrDecimal++;
        }

    }

    void GetNrOfIntDigit (){
        nrDigit=0;
        int x=(int)number;

        while(x>0){
            nrDigit++;
            x/=10;
        }
    }

    void MakeDouble(){
        isDouble=true;
    }

    String ToString(){
        Double n=number;
        return n.toString();
    }

    double getNumber(){
        return number;
    }

    void setNumber(double x){
        number=x;
    }

}
