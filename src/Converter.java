public class Converter {
    public static String converter(String number) {
        String[] rome = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arab = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < rome.length; i++) {
            if (rome[i].equals(number)) {
                return arab[i];
            }
        }
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        char a = '1';
        char b = 'I';
        System.out.println(Character.isDigit(a));
        System.out.println(Character.isDigit(b));
    }

    public static String romeToArab (String number) {
        String [] rome = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String [] arab = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int a = 0; a <= rome.length; a++){
            if (arab[a].equals(number)){
                return rome[a];
            }
        }
        throw new RuntimeException();
    }
}
