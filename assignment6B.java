public class assignment6B {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 80, 20};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest Element = " + largest);
    }
}