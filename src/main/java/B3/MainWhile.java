package B3;

public class MainWhile {

    public static void main(String[] args) {
        int i = 20;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("__________________________________");
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}