package Day11;

public class ForLoop3 {
    public static void main(String[] args) {
        for (String s = ""; s.length() < 10; s = s + "a") {
            System.out.println(s);
        }
    }
}

