import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
    int ans=a/2;
        if(a==1){
            ans=0;
        
        } else if(a%2==0){
          ans*=a;   
        }else
        {
            ans *=(a+1);
        }
        //ans=(a*2)*(a/2);
        System.out.println(ans);
    }
}