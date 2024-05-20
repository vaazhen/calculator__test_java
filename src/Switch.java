public class Switch {
    public static int calculated(int a, int b, String c) {
        char operand = c.charAt(0);
        switch (operand) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new RuntimeException();
        }
    }
}
