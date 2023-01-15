package D.Homeworkweek3;

public class Oddeven {
    public static void main(String[] args) {

        System.out.print("Even Numbers are :");
        for(int a = 1; a <=20; a++)
        {
            if(a % 2 == 0)
            {
                System.out.print(a+ " ");
            }
        }
        System.out.println("Odd Numbers are :" );
        for(int a = 1; a <=20; a++)
        {
            if(a % 2 == 1)
            {
                System.out.print(a + " ");
            }
        }

    }
}
