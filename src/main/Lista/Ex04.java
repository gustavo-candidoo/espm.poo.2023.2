package main.Lista;

public class Ex04 {
    public static void main(String[] args) {
        boolean isPalindrome = false;

        for(int a = 999, b = 999; !isPalindrome; a -= 1, b -= 1){
            int s = a + b;
            isPalindrome = verificarPalindromo(s);
            if(!isPalindrome){
                s = a - 1 * b;
                isPalindromo = verificarPalindromo(s);
            }
        }

        public static boolean verificarPalindromo(int x){
            String palavra = String.valueOf(x)
            for(int i = 0; i < palavra.length() / 2; i++){
                if(palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)){
                    return false;
                }
            }
            return false;
        }
    }
}
