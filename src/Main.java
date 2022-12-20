import java.util.Scanner;

public class Main {
        public static String calc(String input) {
            String[] vod = input.split("[+\\-*/]");
            try {
                int i = Integer.parseInt(vod[0]);
                int b = Integer.parseInt(vod[1]);
                return AraBCalc.Arab(input);
            } catch (NumberFormatException exception) {
                return Rim.RimCalc(input);
            }
    }
}