package openclosed.good;

public class GoodCalculator {

    public int calculate(int num1, int num2, Operation operation){
        return operation.perform(num1, num2);
    }
}
