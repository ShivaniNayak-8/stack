package sjb.mca.recursion;

								//factorial
//public class DemoRecursion {
//	public static int fact(int n)
//	{
//		if (n==0 || n==1)
//			return 1;
//		return n*fact(n-1);
//	}
//	public static void main(String[] args) {
//		System.out.println(fact(4));
//
//	}
//
//}

//fibonacci
public class DemoRecursion{
public static int fibo(int n)
{
	if(n==0)
		return 0;
	if (n==1)
		return 1;
	return fibo(n-1)+fibo(n-2);
}
}