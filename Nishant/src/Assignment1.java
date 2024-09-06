import java.util.*;

class bankGandhinagar {
    static int Networth = 50000;
    static int No_of_account = 0;
    static int loan_sanctioned_tlnw = 0;
    int customer_number;
    String customer_name;
    int account_balance;
    int loan_sanctioned;
    Integer[] loan_rep;

    bankGandhinagar(String b, int c) {
        customer_number = No_of_account + 1;
        customer_name = b;
        account_balance = c;
        loan_sanctioned = 0;
        loan_rep = new Integer[] { 0 };
        Networth += c;
        No_of_account++;
    }

    void loan_request(int a) {
        if ((a < (2 * this.account_balance) - this.loan_sanctioned) & (a < Networth)) {
            System.out.println("The loan is sanctioned.");
            this.loan_sanctioned += a;
            Networth -= a;
            loan_sanctioned_tlnw += a;
        } else {
            System.out.println("Loan amount is invalid.");
        }
    }

    void loan_repayment(int b) {
        if (this.loan_sanctioned != 0) {
            Networth += b;
            if (this.loan_sanctioned >= b) {
                this.loan_sanctioned -= b;
            } else {
                int c = b - this.loan_sanctioned;
                this.account_balance += c;
                Networth += c;
                this.loan_sanctioned = 0;
                System.out.println("The loan has been fully paid.");
                System.out.println("The extra amount " + c + " is credited to your account balance.");
            }
            List<Integer> arrlist = new ArrayList<>(Arrays.asList(this.loan_rep));
            arrlist.add(b);
            this.loan_rep = arrlist.toArray(this.loan_rep);
        } else {
            System.out
                    .println("The loan has already been repaid. The given amount has been nullified. Please retry...");
        }
    }

    static void branch_Inspect() {
        System.out.println("The branch in gandhinagar has current networth of rupees " + Networth + ".");
        System.out.println("The branch till present has opened up " + (No_of_account - 1) + " accounts till date.");
        System.out.println(
                "The total loan amount that has been sanctioned till date is rupees " + loan_sanctioned_tlnw + ".");
    }

    void toView() {
        System.out.println("The name of the account holder is " + this.customer_name);
        System.out.println("The customer number is " + this.customer_number);
        System.out.println("The customer's current account holds rupees " + this.account_balance);
        System.out.println("The customer has a current loan of rupees " + this.loan_sanctioned);
        if ((this.loan_rep).length != 1) {
            System.out.println("The loans have been repaid till date in installments of: ");
            for (int i = 1; i < (this.loan_rep).length; i++) {
                System.out.println("Installment " + i + ": rupees " + this.loan_rep[i]);
            }
        } else {
            System.out.println("No installments filled till date.");
        }
        System.out.println("Thanks");
    }
}

public class Assignment1 {

    public static void main(String[] args) {
        ArrayList<bankGandhinagar> array = new ArrayList<>();
        String yn = "Y";
        Scanner sc = new Scanner(System.in);
        while (!"N".equals(yn)) {
            System.out.println("Welcome to Gandhinagar Bank");
            System.out.println("Please select from the options listed out:");
            System.out.println("1.Open a Bank Account");
            System.out.println("2.Request a loan");
            System.out.println("3.Repay a loan");
            System.out.println("4.Check Account Details");
            System.out.println("5.Check the Bank Details");
            try {
                int a = sc.nextInt();
                switch (a) {
                    case 1 -> {
                        System.out.println("Write your name:");
                        String s = sc.next();
                        System.out.println("Write your Deposit sum here:");
                        int t = sc.nextInt();
                        array.add(new bankGandhinagar(s, t));
                        System.out.println("Your Customer Number is " + bankGandhinagar.No_of_account);
                    }
                    case 2 -> {
                        System.out.println("Write your Customer Number here:");
                        int t = sc.nextInt();
                        System.out.println("Write the amount of loan here:");
                        int u = sc.nextInt();
                        array.get(t - 1).loan_request(u);
                    }
                    case 3 -> {
                        System.out.println("Write your Customer Number here:");
                        int t = sc.nextInt();
                        System.out.println("Write the amount of loan to be repaid here:");
                        int u = sc.nextInt();
                        array.get(t - 1).loan_repayment(u);
                    }
                    case 4 -> {
                        System.out.println("Write your Customer Number here:");
                        int t = sc.nextInt();
                        array.get(t - 1).toView();
                    }
                    case 5 -> {
                        bankGandhinagar.branch_Inspect();
                    }
                    default -> {
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error.....Retry:");
            }
            System.out.println("To Quit type 'N'(running orelse):");
            yn = sc.next();
        }
        System.out.println("Thanks for visiting the Bank.");
    }
}