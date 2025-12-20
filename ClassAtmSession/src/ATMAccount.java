
public class ATMAccount {

    private String owner;
    private double balance;
    private boolean loggedIn;

    public ATMAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.loggedIn = false;
    }

    public void login() {
        if (loggedIn) {
            System.out.println("Eisai hdh sindedemenos");
            return;
        }
        loggedIn = true;
        System.out.println("Epitixis sindesi");
    }

    public void logout() {
        if (!loggedIn) {
            System.out.println("Eisai hdh aposindedemenos");
            return;
        }
        loggedIn = false;
        System.out.println("Aposindesi epitixis");
    }

    public void deposit(double amount) {
        if (!loggedIn) {
            System.out.println("Prepei na kaneis login");
            return;
        }
        if (amount <= 0) {
            System.out.println("Dwse thetiko poso");
            return;
        }

        balance += amount;
        System.out.println("Epitixis katathesi");
    }

    public void withdraw(double amount) {
        if (!loggedIn) {
            System.out.println("Prepei na kaneis login");
            return;
        }
        if (amount <= 0) {
            System.out.println("Dwse thetiko poso");
            return;
        }
        if (amount > balance) {
            System.out.println("Aneparkes ipoloipo");
            return;
        }

        balance -= amount;
        System.out.println("Epitixis analipsi");
    }

    public void printStatus() {
        System.out.println("Onoma katoxou: " + owner);
        System.out.println("Sindedemenos: " + loggedIn);
        System.out.println("Ypoloipo: " + balance);
    }
}
