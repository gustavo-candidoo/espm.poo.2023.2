package main.Lista;

public class Ex02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        long soma = 0l;
        int limit = 4000000;

        while(a <= limit){
            System.out.println(a);
            soma += (a % 2 == 0) ? a : 0;
            int aux = a;
            a = b;
            b = a + aux;
        }
        System.out.println(soma);
    }
    
}
