import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sol {

    // Complete the morganAndString function below.
    static String morganAndString(String a, String b) {
 int min = Math.min(a.length(), b.length());
 String maxS = (min == a.length())? b : a;

String sumS =  a.substring(0,min) + b.substring(0,min);

char[] ch = sumS.toCharArray();
Arrays.sort(ch);
 String res = ch.toString() + maxS.substring(min);
 return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = morganAndString(a, b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
