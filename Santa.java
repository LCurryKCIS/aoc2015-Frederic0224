import java.util.Scanner;
public class Santa
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
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
            }
            System.out.println(finalFloor);
        }
    }
}
