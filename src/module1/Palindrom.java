package module1;

/**
  @autor   Mykola Myroshnychenko
  @project   myr.vsem
  @class   Palindrom
  @version   1.0.0
  @since   09.03.2021 - 21.17
*/

public class Palindrom {

//The fist method "for"

    public static boolean isPalindrom1(String text) {

        text = text.replaceAll("[^A-Za-zA-Ая-я]", "");
        text = text.toLowerCase();
        boolean result = true;
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                result = false;
                break;

            }
        }
        return result;
    }

    //The second method "reserved string"

        public static boolean isPalindrom2(String text){

            text = text.replaceAll("[^A-Za-zA-Ая-я]", "");
            text = text.toLowerCase();
            boolean result = true;
            String resersed = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                resersed = resersed + text.charAt(i);
            }
            return resersed.equals(text);
        }

           //The third method "string builder"

        public static boolean isPalindrom3(String text){

            text = text.replaceAll("[^A-Za-zA-Ая-я]", "");
            text = text.toLowerCase();
            StringBuilder sb = new StringBuilder(text);
            String reversed = sb.reverse().toString();
            return (reversed.equals(text));
        }

        public static void main(String[] args) {
        String text = "Мяса – ракам, ума – карасям";
            System.out.println("The first way :");
            System.out.println(text + " - is a palindrome - " + isPalindrom1(text));
            System.out.println("The second way :");
            System.out.println(text + " - is a palindrome - " + isPalindrom2(text));
            System.out.println("The third way :");
            System.out.println(text + " - is a palindrome - " + isPalindrom3(text));

    }
}

/* result:
        The first way :
        Мяса – ракам, ума – карасям - is a palindrome - true
        The second way :
        Мяса – ракам, ума – карасям - is a palindrome - true
        The third way :
        Мяса – ракам, ума – карасям - is a palindrome - true
*/


