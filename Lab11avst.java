// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");

        // Step 1: Set all array values to true
        for(int i = 2; i < primes.length; i++){
            primes[i]=true;
            // Set all the values to true

        }

        // Step 2: Removing multiples of primes
        for(int index = 2; index < primes.length; index++ ){
            for(int k = 2*index; k <primes.length; k+=index){
                primes[k]=false;
            }


        }
        // Hint: Nested Loop


    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();

        for(int k = 2; k < primes.length; k++) {
            // Check if primes is true
            if(primes[k] == true) {
                System.out.print(k + " ");
            }
        }
    }

}



