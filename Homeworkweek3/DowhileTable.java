package D.Homeworkweek3;

import java.util.Scanner;

public class DowhileTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a=1;
        do {
            System.out.println(a*n);
            a++;
        }while(a<=10);

    }
}
