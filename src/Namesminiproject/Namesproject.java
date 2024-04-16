package Namesminiproject;

import java.util.Scanner;

public class Namesproject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(_A(10));
		System.out.println(_B(10));
		System.out.println(_C(10));
		System.out.println(_D(10));
		System.out.println(_E(10));
		System.out.println(_F(10));
		System.out.println(_G(10));
		System.out.println(_H(10));
		System.out.println(_I(10));
		System.out.println(_J(10));
		System.out.println(_K(10));
		System.out.println(_L(10));
		System.out.println(_M(10));
		System.out.println(_N(10));
		System.out.println(_O(10));
		System.out.println(_P(10));
		System.out.println(_Q(10));
		System.out.println(_R(10));
		System.out.println(_S(10));
		System.out.println(_T(10));
		System.out.println(_U(10));
		System.out.println(_V(10));
		System.out.println(_W(10));
		System.out.println(_X(10));
		System.out.println(_Y(10));
		System.out.println(_Z(10));*/
		
		Scanner read=new Scanner(System.in);
		System.out.println("enter you are name ");
		String name=read.next();
		System.out.println("enter pattern length");
		int n=read.nextInt();
		String[] s1=printname(name,n);
		for(int i=0;i<n;i++){
			String[] s2;
			String s3="";
		for(int j=0;j<s1.length;j++){
			s2=line(s1[j]);
			s3+=s2[i] +"  ";
		}
		System.out.println(s3);
	}
}
		
		public static String[] line(String s){
			String[] l=s.split("\n");
			return l;
		}
	public static String _A(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || i==n/2+1 || j==1 || j==n){
					result+="A";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _B(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if((i==1 && j==n) || i==n && j==n){
					result+=" ";
				}
				else if(i==1 || i==n/2+1 || j==1 || j==n || i==n){
					result+="B";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _C(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||  j==1 || i==n){
					result+="C";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _D(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if((i==1 && j==n) || i==n && j==n){
					result+=" ";
				}
				else if(i==1 ||  j==1 || j==n || i==n){
					result+="D";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _E(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||  j==1 || i==n || i==n/2+1){
					result+="E";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _F(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||  j==1  || i==n/2+1){
					result+="F";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _G(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||  j==1  || (i==n/2+1 && j>=n/2+1) || (i==n && j<n/2+1) || (j==n && i>=n/2+1) || (j==n/2+1 && i>=n/2+1)){
					result+="G";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _H(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==n ||  j==1  || i==n/2+1){
					result+="H";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _I(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||  i==n  || j==n/2+1){
					result+="I";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _J(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||  (i==n && j<=n/2+1)  || j==n/2+1){
					result+="J";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _K(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1 || i<=n/2+1 && j<=n/2+1 && j==(n/2+1)+1-i || i>=n/2 && j<=n/2+1 && i-j==n/2-1){
					result+="K";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _L(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1 ||   i==n){
					result+="L";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _M(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1 ||   j==n || (i==j && i<n/2+1) || i<n/2+1 && (n-i)==j-1 ){
					result+="M";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _N(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1 ||   j==n || j==i){
					result+="N";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _O(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||   j==1 || j==n || i==n){
					result+="O";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _P(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||   j==1 || j==n && i<=n/2+1 || i==n/2+1){
					result+="P";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _Q(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 && j<=n-1 ||   j==1 && i<n-1 || i==n-1 && j<=n-1 || j==n-1 && i<n-1 || i>n/2+1 && j>n/2+1 && i==j ){
					result+="Q";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _R(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||   j==1 || j==n && i<=n/2 || i==n/2+1 || j>n/2+1 && i==j){
					result+="R";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _S(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||   i==n || j==1 && i<=n/2+1 || i==n/2+1 || j==n && i>n/2+1){
					result+="S";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _T(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||   j==n/2+1){
					result+="T";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _U(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(   j==1 || j==n || i==n){
					result+="U";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _V(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1 && i<=n/2+1 ||j==n && i<=n/2+1 || i>n/2 && (i-j)== n/2+1  || i>=n/2 && j>=n/2+1 && n-i== j-(n/2+1)) {
					result+="V";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _W(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if( j==1 || j==n || i>=n/2+1 && j<=n/2+1 && n-i==j-1 || i>=n/2+1 && j>=n/2+1 && i==j ){
					result+="W";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _X(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j || n-i==j-1 ){
					result+="X";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _Y(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j && i<=n/2 || i<n/2+1 && (n-i)==j-1 || i>=n/2+1 && j==n/2 ){
					result+="Y";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _Z(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || n-i==j-1  || i==n){
					result+="Z";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String[] printname(String name,int n){
		String name1=name.toLowerCase();
		String[] s=new String[name1.length()];
		for(int i=0;i<name.length();i++){
			char b=name1.charAt(i);
			switch(b){
			case 'a':
				s[i]=_A(n);
				break;
			case 'b':
				s[i]=_B(n);
				break;
			case 'c':
				s[i]=_C(n);
				break;
			case 'd':
				s[i]=_D(n);
				break;
			case 'e':
				s[i]=_E(n);
				break;
			case 'f':
				s[i]=_F(n);
				break;
			case 'g':
				s[i]=_G(n);
				break;
			case 'h':
				s[i]=_H(n);
				break;
			case 'i':
				s[i]=_I(n);
				break;
			case 'j':
				s[i]=_J(n);
				break;
			case 'k':
				s[i]=_K(n);
				break;
			case 'l':
				s[i]=_L(n);
				break;
			case 'm':
				s[i]=_M(n);
				break;
			case 'n':
				s[i]=_N(n);
				break;
			case 'o':
				s[i]=_O(n);
				break;
			case 'p':
				s[i]=_P(n);
				break;
			case 'q':
				s[i]=_Q(n);
				break;
			case 'r':
				s[i]=_R(n);
				break;
			case 's':
				s[i]=_S(n);
				break;
			case 't':
				s[i]=_T(n);
				break;
			case 'u':
				s[i]=_U(n);
				break;
			case 'v':
				s[i]=_V(n);
				break;
			case 'w':
				s[i]=_W(n);
				break;
			case 'x':
				s[i]=_X(n);
				break;
			case 'y':
				s[i]=_Y(n);
				break;
			case 'z':
				s[i]=_Z(n);
				break;
			}
		}
		return s;
		
	}
}

