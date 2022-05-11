public class helloworld { 
    public static void main(String[] args) {

        // the main method executes the tasks of the class

        System.out.println("Hello World!");

        String name="Callum";
        int age = 23;
        double desiredSalary = 27000.00;
        char gender = 'm';
        boolean lookingForJob = true;

        double balance = 1000.75;
        double amountToWithdraw = 250;

        double newBalance = balance - amountToWithdraw;
        double friendsShare = newBalance/3;

        boolean canPurchaseTicket = friendsShare >=250;

        System.out.println("I gave each friend " + friendsShare + "...");

    }
    
}
