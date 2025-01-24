import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a.toUpperCase());
        System.out.println(a.length());
        System.out.println(a.replace(a,"hello"));
        System.out.println(a.substring(0, 6));
    }
}
