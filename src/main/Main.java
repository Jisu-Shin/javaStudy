package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Message m = new Message();
        System.out.println(m.canSend(m));
        System.out.println(m.send());
    }
}