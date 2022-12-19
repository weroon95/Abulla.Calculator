import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            String[] vod = str.split("[+\\-*/]");
            try {
                int i = Integer.parseInt(vod[0]);
                int b = Integer.parseInt(vod[1]);
                AraBCalc.Arab(str);
            } catch (NumberFormatException exception) {
                Rim.RimCalc(str);
            }
        }
    }
}