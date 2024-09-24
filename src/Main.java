public class Main {
    public static void main(String[] args) {
        double itemPrice = 429.88;
        double taxRate = 0.05;
        double salesTax = itemPrice * taxRate;
         double totalPrice = salesTax + itemPrice;
        System.out.println("Items price is $" + itemPrice);
        System.out.println("Sales Tax is $" + salesTax);
        System.out.println("This makes your total cost $" + totalPrice);
    }
}