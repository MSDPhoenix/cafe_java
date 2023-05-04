import java.text.DecimalFormat;


public class cafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.33;
        double lattePrice = 3.25;
        double cappucinoPrice = 3.15;
        String customer1 = "Cindhuri";
        String customer2 = "Noah";
        String customer3 = "Sam";
        String customer4 = "Jimmy";
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        //Cindy
        System.out.println("\n"+generalGreeting + customer1);
        System.out.println(displayTotalMessage + dripCoffeePrice);
        if (isReadyOrder1){
            System.out.println(customer1 + readyMessage);
        }else{
            System.out.println(customer1 + pendingMessage);
        }
        //Noah
        System.out.println("\n"+generalGreeting + customer2);
        System.out.println(displayTotalMessage + cappucinoPrice);
        if (isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        }else{
            System.out.println(customer2 + pendingMessage);
        }
        //Sam
        System.out.println("\n"+generalGreeting + customer3);
        System.out.println(displayTotalMessage + (lattePrice*2));
        if (isReadyOrder3){
            System.out.println(customer3 + readyMessage);
        }else{
            System.out.println(customer3 + pendingMessage);
        }
        //Jimmy
        // double priceDifference = lattePrice - dripCoffeePrice;
        // int diffCents = (int) Math.round(priceDifference*100);
        // double diffRounded = (double) diffCents/100;
        // DecimalFormat df = new DecimalFormat("#0.00");
        // String formatted = df.format(diffRounded);
        // System.out.println("\n"+generalGreeting + customer4);
        // System.out.println(displayTotalMessage + formatted);


        double priceDifference = ((lattePrice - dripCoffeePrice)*100)/100;

        System.out.println("\n"+generalGreeting + customer4);
        System.out.println(displayTotalMessage + priceDifference);
        if (isReadyOrder4){
            System.out.println(customer4 + readyMessage);
        }else{
            System.out.println(customer4 + pendingMessage);
        }
    }
}
