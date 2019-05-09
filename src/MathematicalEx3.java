public class MathematicalEx3 {
    int variable;

    boolean isEven (int variable){
        if(variable%2==0){
            return true;
        }else{
            return false;
        }
    }
    boolean isOdd(int variable){
        return !isEven(variable);

    }
    int power(int variable){
        return variable*variable;
    }

    double circleField(double variable){
        return Math.PI* Math.pow(variable,2);
    }



}
