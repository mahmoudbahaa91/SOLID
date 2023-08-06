package openclosed.good;

public class SubtractOperation implements  Operation{
    @Override
    public int perform(int num1, int num2) {
        return num1-num2;
    }
}
