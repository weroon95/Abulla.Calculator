class AraBCalc {

    public static void Arab(String str4) {
        int result = 0;

        String[] vod = str4.split("[+\\-*/]");

        char[] simb = str4.toCharArray();
        int count = 0;
        for (char x : simb) {
            switch (x) {
                case ('+') -> count++;
                case ('-') -> count++;
                case ('/') -> count++;
                case ('*') -> count++;
            }
        }

        if (count > 1)
            throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор");

        int A = Integer.parseInt(vod[0]);
        int B = Integer.parseInt(vod[1]);


        if (A > 10 || B > 10) throw new RuntimeException("Число больше 10-ти");

        if (A < 10) {
            switch (simb[1]) {
                case '/':
                    result = A / B;
                    System.out.println(result);
                    break;
                case '*':
                    result = A * B;
                    System.out.println(result);
                    break;
                case '+':
                    result = A + B;
                    System.out.println(result);
                    break;
                case '-':
                    result = A - B;
                    System.out.println(result);
                    break;
            }
        } else {
            switch (simb[2]) {
                case '/':
                    result = A / B;
                    System.out.println(result);
                    break;
                case '*':
                    result = A * B;
                    System.out.println(result);
                    break;
                case '+':
                    result = A + B;
                    System.out.println(result);
                    break;
                case '-':
                    result = A - B;
                    System.out.println(result);
                    break;
            }
        }
    }
}