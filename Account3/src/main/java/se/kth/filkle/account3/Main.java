package se.kth.filkle.account3;


public class Main {

    public static void main(String[] args) {

        Account3 acc = new Account3("Filip", 11000, 12345);
        System.out.println("Account number: " + acc.getNumber());
        System.out.println(acc.toString());
    }
}
