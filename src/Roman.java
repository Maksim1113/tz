import java.util.List;

public class Roman {

    public void calcRoman(String s1, String s2, String s3){
        System.out.println("Start calc");
           int a = changeRomeToArab(s1);
           int b = changeRomeToArab(s3);
           Arab arab = new Arab();
           int x = arab.summ(a, s2, b);
        System.out.println("Result" + " " + changeArabToRoman(x));
    }

    public int changeRomeToArab(String s1){
        String roman = s1.toUpperCase();
        int result = 0;

        List<RomanChange> romanNumerals = RomanChange.getReverseSortedValues();

        int i = 0;

        try {
            while ((roman.length() > 0) && (i < romanNumerals.size())) {
                RomanChange symbol = romanNumerals.get(i);
                if (roman.startsWith(symbol.name())) {
                    result += symbol.getValue();
                    roman = roman.substring(symbol.name().length());
                } else {
                    i++;
                }
            }
            if (roman.length() > 0) {
                throw new Exception("Error. Cannot be converted to a Roman Numeral");
            }

        } catch (Exception ex){
            ex.getMessage();
        }
        return result;
    }

    public String changeArabToRoman(int c) {

        try {
            if ((c <= 0) || (c > 4000)) {
                throw new Exception("Error. Numbers can be from 0 to 4000");
            }
        } catch (Exception ex) {
            ex.getMessage();
        }

            List<RomanChange> roman = RomanChange.getReverseSortedValues();

            int i = 0;
            StringBuilder sb = new StringBuilder();

            while ((c > 0) && (i < roman.size())) {
                RomanChange currentSymbol = roman.get(i);
                if (currentSymbol.getValue() <= c) {
                    sb.append(currentSymbol.name());
                    c -= currentSymbol.getValue();
                } else {
                    i++;
                }
            }
        return sb.toString();
    }
}
