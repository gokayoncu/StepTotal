import java.util.Scanner;
public class Step {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, stepValue, total =0;
        System.out.print("Enter a Number : ");
        num = input.nextInt();

        while (num!=0){
            stepValue=num%10;
            total+=stepValue;
            num /=10;
        }
        System.out.print(total);
    }
}
