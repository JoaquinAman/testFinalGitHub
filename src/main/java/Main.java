public class Main {
    public static void main(String[] args) {
        char ch = 'z';
//        char ch = 'A';
//        char ch = 'a';
        checkIfIsVowel(ch);

    }

    public static void checkIfIsVowel(char ch){

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
