package HOMEWORK;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = Sc.nextInt();

        //What is prime number?
        //a natural number greater than 1 and is divisible by only 1 and itself.

        for(int i=2; i<=num; ++i){
            if(num%i==0){
                System.out.println(" is not a prime"+num);
                break;
            } else{
                System.out.println(" is a Prime number"+num);
                break;
            }
        }
        Sc.close();
    }

    }

