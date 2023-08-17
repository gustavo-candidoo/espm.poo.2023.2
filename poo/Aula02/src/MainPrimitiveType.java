public class MainPrimitiveType {
    public static void main(String[] args) {
        int n = 2;
        add(n);
        System.out.println(n);

        String msg1 = "Olá mundo";
        String msg2 = "Olá";
        msg2 = msg2 + " ";
        String msg3 = "mundo";
        msg2 = msg2 + msg3;

        System.out.println((msg1 == msg2));
    }

    public static void add(int x){
        x++;
    }
}
