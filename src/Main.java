import java.util.*; import java.io.*;
public class Main {
        public static String FirstReverse(String str) {
            String revstr=""; // starting with an empty string so we can route it later
            char ch; // created a variable
            for (int i=0; i<str.length(); i++){
                ch = str.charAt(i); // extracts each character
                revstr = ch+revstr; // adds each character in front of the existing string
            }
            return revstr;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(FirstReverse(s.nextLine()));
        }

    }