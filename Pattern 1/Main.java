import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp =n;
      for(int i=1;i<=n;i++){
         for(int j=1;j<=(2*temp)-1;j++){
            System.out.print(j+" ");
            
         }
        temp--;
        System.out.println();
      }
	}
}