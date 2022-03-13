package com.company;

import java.util.Scanner;


//public class palindromeChecker {
//    public isPalindrome(String str){
//        StringBuilder sb=new StringBuilder(str);
//        sb.reverse();
//        String rev=sb.toString();
//        if(str.equals(rev)){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//    }
//}
//public class javaStringReverse {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
////        Object isPalindrom;
////        if(isPalindrome(A) == true){
////            System.out.println("Yes");
////        }else {
////            System.out.println("Yes");
////        }
//    }
//}

public class javaStringReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder sb=new StringBuilder(A);
        sb.reverse();
        String rev=sb.toString();
        if(A.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

//        another mathd
//       System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
    }
}
