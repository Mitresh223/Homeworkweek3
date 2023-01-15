package D.Homeworkweek3;

public class Dowhileeven {
    public static void main(String[] args) {

        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }
}
