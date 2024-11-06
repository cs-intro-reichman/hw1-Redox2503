// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * lim + 1);
		int b = (int)(Math.random() * lim + 1);
		int c = (int)(Math.random() * lim + 1);
		System.out.println(a + " " + b + " " + c);

		int min = Math.min(Math.min(a,b),c);
		int max = Math.max(Math.max(a, b),c);
		int middle;

		if(b != min && b != max) // checks what is the middle value.
			middle = b;
			
		else if(a != min && a != max)
			middle = a;
		
		else middle = c;
	 
		System.out.println(min + " " + middle + " " + max);
	}
}
