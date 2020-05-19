package com.gabo.labs.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConnectionDB connectionDB = ConnectionDB.obtenerConnection();
                System.out.println(connectionDB.hashCode());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConnectionDB connectionDB = ConnectionDB.obtenerConnection();
                System.out.println(connectionDB.hashCode());
            }
        });

        thread1.start();
        thread2.start();
    }
}
