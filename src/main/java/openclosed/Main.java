package openclosed;

import openclosed.bad.BadCalculator;
import openclosed.good.GoodCalculator;
import openclosed.good.SumOperation;

public class Main {

    public static void main(String[] args) {
        BadCalculator badCalculator = new BadCalculator();
        System.out.println(badCalculator.calculateNumber(1,2,"sum"));

        GoodCalculator goodCalculator = new GoodCalculator();
        int result =goodCalculator.calculate(2,2, new SumOperation());
        System.out.println(result);


    }

}
