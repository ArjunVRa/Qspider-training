public class EvenNoOfDigit {
    public static void main(String[] args) {
        int[] a = {18, 124, 9, 1764, 98, 1};

        int evenCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) { // Check if the number is even
                int numDigits = countEvenDigits(a[i]);
                if (numDigits > 0) { // Only consider numbers with an even digit count
                    System.out.println("Number: " + a[i] + ", Digits: " + numDigits);
                    evenCount++;
                }
            }
        }

        System.out.println("Total even numbers with even digit count: " + evenCount);
    }

    public static int countEvenDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        // Check if the count of digits is even
        if (count % 2 == 0) {
            return count;
        }
        return 0;
    }
}
