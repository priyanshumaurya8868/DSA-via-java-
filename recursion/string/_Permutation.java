package recursion.string;

public class _Permutation {

	public static void main(String[] args) {
		
	String	s="ABC";
		permutation(s,0,s.length()-1);

	}
	public static void permutation(String s,int l,int r) {
		//base case:
		if(l==r) {
			System.out.println(s);
	return;
		}
		for(int i=l;i<=r;i++) {
			s=interchange(s, l, i);
			permutation(s, l+1, r);
			s=interchange(s, l, i);//
		}
	}
	static String interchange(String s,int l,int r) {
		char a[] = s.toCharArray();
		char temp =a[l];
		a[l]=a[r];
		a[r]=temp;
		return String.valueOf(a);
	}

}
