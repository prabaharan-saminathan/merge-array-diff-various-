public class com_f {
	public static void main(String[] args) {
		int []a= {1,2,3,4};
		int []b= {5,6,7,8,9};
		int []c=new int[a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			else if(i>=a.length) {
				c[i]=b[i-a.length];
			}
		}
		
		System.out.println(Arrays.toString(c));

	}

}
