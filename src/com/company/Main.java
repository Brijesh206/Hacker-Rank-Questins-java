package com.company;

//import java.lang.management.ManagementFactory;

//Code for methods

//public class Main {
//
//    public void fullThrottle(){
//        System.out.println("The car is going as fast as it can!");
//
//    }
//    public void maxSpeed(int maxSpeed){
//        System.out.println(maxSpeed);
//    }
//
//    public static void main(String[] args) {
//	// write your code here
//        Main myObj = new Main();
//        myObj.fullThrottle();
//        myObj.maxSpeed(200);
//    }
//}

//Code for call methods in othor files
//here second.java file

//public class Main {
//    public void fullThrottle() {
//        System.out.println("The car is going as fast as it can!");
//    }
//
//    public void maxSpeed(int maxSpeed) {
//        System.out.println("Max Speed is :" + maxSpeed);
//    }
//}

//Constructors

//public class Main {
//    int x;
//
//
//    public Main() {
//        x = 5;
//    }
//
//    public static void main(String[] args) {
//        Main myObj = new Main();
//        System.out.println(myObj.x);
//    }
//
//}

//Constructors with parameters

public class Main {
    int x;


    public Main(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Main myObj = new Main(8);
        System.out.println(myObj.x);
    }

}