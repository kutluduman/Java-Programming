package office_Hour;

public class Practice_02_25 {

    public static void main(String[] args) {

        String str1 = "java";
        System.out.println("Line 8 = " + str1);
        String str2 = "java";
        System.out.println("Line 10 = " + str2);
        str1 = "selenium";
        System.out.println("str1 after change = " + str1);
        System.out.println("str2 after change = " + str2);

        StringBuilder sb1 = new StringBuilder("html");
        StringBuilder sb2 = sb1;
        System.out.println("values of sb1 and sb2 = " + sb1 + " " + sb2);
        sb1 = new StringBuilder("cucumber");
        System.out.println("values of sb1 and sb2 after change = " + sb1 + " " + sb2);


        StringBuilder sb3 = new StringBuilder("jenkins");
        StringBuilder sb4 = sb3;
        System.out.println("sb3 and sb4 values = " + sb3 + " " + sb4);
        sb3 = sb3.reverse();
        System.out.println("sb3 and sb4 values = " + sb3 + " " + sb4);

        String word = "apple";
        StringBuilder word2 = new StringBuilder(word);
        word2 = word2.reverse();
        System.out.println("word2 = " + word2);

    }
}
