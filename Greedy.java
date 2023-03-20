import java.util.ArrayList;
import java.util.List;

public class Greedy{
    public static List<Currency> makeChange(double price, double payment){
        double change = payment - price;
        List<Currency> result = new ArrayList<>();

        int cents = (int) Math.round(change*100);

        int dollars = cents/100;
        cents %= 100;

        int quarters = cents/25;
        cents %= 25;

        int dimes = cents/10;
        cents %= 10;

        int nickels = cents/5;
        cents %= 5;

        int pennies = cents;

        for (int i = 0; i < dollars; i++){
            result.add(Currency.DOLLAR);
        }
        for (int i = 0; i < quarters; i++){
            result.add(Currency.QUARTER);
        }
        for (int i = 0; i < dimes; i++){
            result.add(Currency.DIME);
        }
        for (int i = 0; i < nickels; i++){
            result.add(Currency.NICKEL);
        }
        for (int i = 0; i < pennies; i++){
            result.add(Currency.PENNY);
        }
        return result;
    
}
    public static void main(String[] args){
        System.out.println(makeChange(10.7, 12.5));
    }
}