package ThreadPackage;

public class InterThreadCommExample {
    public static void main(String[] args){
        User user = new User(2000);
        new Thread(){
            @Override
            public void run() {
                user.withdraw(7000);
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                user.deposit(5000);
            }
        }.start();
    }
}
class User{
    int balance;
    public User(int balance){
        this.balance = balance;
    }
    public synchronized void withdraw(int amount){
        if(amount>balance) {
            try {
                System.out.println("Waiting for sufficient amount/waiting for depositing amount");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            balance = balance - amount;
            System.out.println("Withdraw successfully");
            System.out.println("Your account balance is "+balance);

    }
    public synchronized void deposit(int amount){
        if(amount>0){
            balance= balance+amount;
            System.out.println("Credited the amount successfully/deposited the amount");
            notify();
        }
    }
}