import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Number:");
       int num=sc.nextInt();
       int temp=0;
       for(int i=1;i<=num;i++){
           temp=temp+(i*i*i);
           
           
       }
       System.out.println(temp);
}
}
