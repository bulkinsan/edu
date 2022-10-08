import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class StepikPalindrom {
    public static void stepikPalindrom() throws IOException {
        BufferedReader bufferR = new BufferedReader(new InputStreamReader(System.in));
        //String str = bufferR.readLine();
        String str = "Madam, I'm Adam!";

        StringBuilder strbuilder = new StringBuilder(str);
        System.out.println(isPalindrome(str) ? "yes": "no");

    }

    public static boolean isPalindrome(String text) throws IOException {
        String oldchar = "[^a-zA-Z0-9]";
        text = text.toLowerCase().replaceAll(oldchar, "");
        StringBuilder strtmp = new StringBuilder(text);
        strtmp.reverse();

        return text.equals(strtmp.toString()) ? true: false;
    }

}
