public class CurrencyConverter {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("** Converting pounds to euro and vice versa **");
        System.out.print("If I give you £1, how many Euro will you give me? ");
        double euroOverPoundRatio = scan.nextDouble();
        System.out.print("If I give you 1€, how many Sterling pounds will you give me? ");
        double poundOverEuroRatio = scan.nextDouble();
        System.out.println("OK, now I know enough.");
        boolean finished = false;
        while (!finished) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("Key in 1 to: Exchange pounds into euro");
            System.out.println("Key in 2 to: Exchange euro into pounds");
            System.out.println("Key in 0 to: Exit the program");
            System.out.println();
            System.out.print(  "> ");
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                System.out.print("How many pounds would you like to convert? ");
                double pounds = scan.nextDouble();
                double euro   = pounds * euroOverPoundRatio;
                System.out.println("£" + pounds + " will give you " + euro + "€");
                break;
            case 2:
                System.out.print("How many euro would you like to convert? ");
                euro   = scan.nextDouble();
                pounds = euro * poundOverEuroRatio;
                System.out.println(euro + "€ will give you £" + pounds);
                break;
            case 0:
                finished = true;
                break;
            default:
                System.out.println("Sorry, that is not a valid option");
            }
        }
        System.out.println("Exiting the program");
    }
}
