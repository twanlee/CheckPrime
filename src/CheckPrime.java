import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input<2){
            System.out.println(input + " is not Prime");
        }else {
            int i = 2;
            boolean check = true;
            while (i<= Math.sqrt(input)){
                if(input%i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check) System.out.println(input + " is Prime");
            else System.out.println(input + " is not Prime");
        }
    }
}
