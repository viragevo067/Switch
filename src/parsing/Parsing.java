package parsing;


public class Parsing {

    public static void main(String[] args) {
        String start = "1,100,USD,оплата заказа";
        int id = 1;
        int amount = 100;
        String comment = "оплата заказа";
        int line = 1;
        String result = "ok";
        String finish = "{'id':1, 'amount':100, 'comment':'оплата заказа', 'line':1, 'result':'OK' }";
        System.out.println(start + id + amount + comment + line + result + finish);
    }
}

