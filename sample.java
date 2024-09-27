public class ReverseStringExample {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }

    // Public static method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
i
