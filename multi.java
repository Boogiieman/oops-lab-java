import java.util.*;
public class multi {

    public static void main(String[] args) {

        int num, i = 1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        num=sc.nextInt();
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}
