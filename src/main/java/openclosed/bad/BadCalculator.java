package openclosed.bad;

public class BadCalculator {

    public  int calculateNumber(int number1 , int number2 , String type){
        int result=0;
        switch (type){
            case "sum":
                result = number1 + number2;
                break;
            case "sub":
                result = number1 - number2;
                break;
        }
        return  result;
    }

}
