package calculateSum;

public class Prime {
public static void  primeNum(int n) {
	
	for(int i=2;i<=n;i++) {
		boolean isPrime= true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.print(i+" ");
		}
	}
}
	public static void main(String[] args) {
		primeNum(100 );
	}

}
