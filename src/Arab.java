public class Arab {
    public void calcArab(String s1, String s2, String s3) {

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s3);

        try {
            if ((a > 0 && a <= 10) && (b > 0 && b < 10)) {
                System.out.println("Start calc");
                System.out.println("Result" + " " + summ(a, s2, b));
            } else {
                throw new Exception("Error. Numbers must be from 1 to 10");
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public int summ(int a, String s2, int b) {
        int c = 0;
        switch (s2) {
            case ("-"):
                c = a - b;
                return c;
            case ("+"):
                c = a + b;
                return c;
            case ("*"):
                c = a * b;
                return c;
            case ("/"):
                c = a / b;
                return c;
            default:
                return c;

        }
    }
}
