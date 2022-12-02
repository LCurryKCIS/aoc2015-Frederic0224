import java.util.Scanner;
public class Santa2
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            int x = 0;
            System.out.println("Provide an input!");
            String command = input.nextLine();
            if(command.equals("exit")){
                break;
            }
            int finalFloor = 0;
            for(int i = 0; i <= command.length() - 1; i++){
                if(command.substring(i,i+1).equals("(")){
                    finalFloor++;
                }
                else{
                    finalFloor--;
                }
                x++;
                if(finalFloor == -1){
                    System.out.println(x);
                    break;
                }
            }
            System.out.println(finalFloor);
        }
    }
}
