package String;
import java.util.Scanner;
public class JAVA_class_question {
    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
////        1.) Make a string of your name
//        String name= "Yashika";

//        2.) Take a string from user and iterate over string.
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }
//
//        for (char c : str.toCharArray()) {
//            System.out.println(c);
//        }

//        3.) Reverse a String
//        String reversed = "";
//        for (int i = name.length() - 1; i >= 0; i--) {
//            reversed += name.charAt(i);
//        }
//
//        System.out.println("Original: " + name);
//        System.out.println("Reversed: " + reversed);

//        4.) Check if the given string is palindrome or not
//        if (isPalindrome(name)) {
//            System.out.println("\"" + name + "\" is a palindrome.");
//        } else {
//            System.out.println("\"" + name + "\" is not a palindrome.");
//        }

//        5.) Take a string from a user and count all the vowel, consonant, special character and digits
        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                specialChars++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }
}
