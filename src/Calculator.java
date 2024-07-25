import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int result=0;

        while(true){
            System.out.print("Enter the operator(enter x if you want to close it): ");
            char op= in.next().trim().charAt(0);
            System.out.println();
            if (op=='+'|| op=='-'||op=='*'||op=='/'|| op=='%'){
                System.out.println("Enter 2 numbers: ");

                int num1= in.nextInt();
                int num2= in.nextInt();


                if(op=='+'){
                    result= num1+num2;
                }
                if(op=='-'){
                    result= num1-num2;
                }
                if(op=='*'){
                    result=num1*num2;
                }
                if(op=='/'){
                    if(num2!=0) {
                        result = num1 / num2;
                    }else{
                        System.out.println("You can not divide it by 0");
                    }
                }
                if(op=='%'){
                    result= num1%num2;
                }
            }else if(op =='x'|| op=='X'){
                break;
            }else{
                System.out.println("Invalid operation");
            }
            System.out.println(result);
        }

    }

}
