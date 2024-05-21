import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите выражение в формате x + y");
        Scanner scanner = new Scanner (System.in);
        String str = scanner.nextLine();
        String [] a = str.split(" ");
        if (a.length != 3){
            throw new RuntimeException();
        }
        String num1 = a[0];
        String oper = a[1];
        String num2 = a[2];


        String num1type;
        if (Character.isDigit(num1.charAt(0))){
            num1type = "arab";
        }else {
            num1type = "rome";
        }
        String num2type;
        if (Character.isDigit(num2.charAt(0))){
            num2type = "arab";
        }else {
            num2type = "rome";
        }
        if (!num1type.equals(num2type)){
            throw new RuntimeException();
        }
        if (num1type.equals("rome")){
            num1 = Converter.converter(num1);
            num2 = Converter.converter(num2);
        }
        int num1Iteger = Integer.valueOf(num1);
        int num2Iteger = Integer.valueOf(num2);
            if (num1Iteger > 10
                    || num2Iteger > 10
                    || num1Iteger < 0
                    || num2Iteger < 0){
                throw new RuntimeException();
            }



        int result = Switch.calculated(num1Iteger, num2Iteger, oper);
        String result2;
        if (num1type.equals("rome")){
            result2 = Converter.romeToArab(String.valueOf(result));
        }else {
            result2=String.valueOf(result);
        }
        System.out.println(result2);
    }


    }

