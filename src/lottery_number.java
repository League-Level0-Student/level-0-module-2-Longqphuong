import java.util.Random;

public class lottery_number {
public static void main(String[] args) {
int num1=0;
int num2=0;
int num3=0;
int num4=0;
int num5=0;
	Random first=new Random();
	Random second=new Random();
	Random third=new Random();
	Random fourth=new Random();
	Random fifth=new Random();
num1=first.nextInt(50);
System.out.println(num1);
num2=second.nextInt(50);
System.out.println(num2);
num3=third.nextInt(50);
System.out.println(num3);
num4=fourth.nextInt(50);
System.out.println(num4);
num5=fifth.nextInt(50);
System.out.println(num5);
}
}