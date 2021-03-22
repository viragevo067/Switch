package parsing;


import java.util.Scanner;

public class Parsing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String start = sc.nextLine();
        convert(start);
    }

    public static void convert(String start) {
        String[] strings = start.split(",");
        String finish = "{'id':" + strings[0] + ", 'amount':" + strings[1] + ", 'comment':'" + strings[3]
                + "', 'line':1, 'result':'OK' }";
        System.out.println("Результат");
        System.out.println(finish);
    }
}

