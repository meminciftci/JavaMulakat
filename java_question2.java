public class java_question2 {

    private static int findLargestPrime(int limit) {    // Find the largest prime number less than the limit
        for (int i = limit - 1; i >= 2; i--) {          // Start from the limit and go down to 2
            if (isPrime(i)) {                       // Check if the number is prime
                return i;                           // Return the prime number
            }
        }
        return -1;              // Return -1 if no prime number is found
    }
    
    private static int findSmallestPrime(int limit) {   // Find the smallest prime number greater than the limit
        for (int i = limit; ; i++) {                    // Start from the limit and go up
            if (isPrime(i)) {                   // Check if the number is prime
                return i;                       // Return the prime number
            }
        }
    }
    
    private static boolean isPrime(int number) {        // Check if a number is prime
        if (number <= 1) {                      // If the number is less than or equal to 1, return false 
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {  // Check if the number is divisible by any number from 2 to the square root of the number
            if (number % i == 0) {                      // If the number is divisible by any number, return false
                return false;
            }
        }
        return true;                        // If the number is not divisible by any number, return true
    }

    public static void main(String[] args) {
        int lowerLimit = 500000;                // Lower limit
        int upperLimit = 500001;                // Upper limit
        
        int largestPrime = findLargestPrime(lowerLimit);        // Find the largest prime number less than the lower limit
        int smallestPrime = findSmallestPrime(upperLimit);      // Find the smallest prime number greater than the upper limit
        
        int difference = smallestPrime - largestPrime;          // Calculate the difference between the two prime numbers
        
        System.out.println("Görev 2:\n");
        System.out.println("500.000'den Küçük En Büyük Asal Sayı: " + largestPrime);        // Print the largest prime number
        System.out.println("500.000'den Büyük En Küçük Asal Sayı: " + smallestPrime);       // Print the smallest prime number
        System.out.println("İki Asal Sayı Arasındaki Fark: " + difference);                 // Print the difference
    }
    
    
}