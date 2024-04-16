package exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		int i,j,k=0;
		i=8;
		j=2;
		int a[] = new int[4];
		
		try
		{
			k=i/j;
			for(int c=0;c<=4;c++){
				a[c]=c+1;
				}
		}
		catch(ArithmeticException e)
		{
			System.out.println("can not divide by zero"+e); // here we get Arithmetic exeption.
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The max elements value is 4:  "+e);
		}
			System.out.println(k);
		}

		}
