package OOPConceptRev2;

/**
 * Created by beatriceotugo on 12/07/2017.
 */
public class AccountRunner {


    public static void main(String[] args) {

        Account barclays = new Account("Dee", 2000, "BankCustomer");

        barclays.showaccountName();

        double myaccountBal = barclays.getAccountBalance();
        System.out.println("Your account balance is " + myaccountBal);

        barclays.depositCash(525);



        String newaccountBalance = barclays.withdrawCash(175);
        System.out.println(newaccountBalance);




        Account natwest = new Account("John", 5050, "Natwest");

        natwest.showaccountName();

        double hisaccountBal = natwest.getAccountBalance();
        System.out.println("Your account balance is " + hisaccountBal);

        natwest.depositCash(525);

        String newaccountBalance1 = natwest.withdrawCash(175);
        System.out.println(newaccountBalance1);


    }
}
