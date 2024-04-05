package Q9066;

public class Main {
	public static void main(String[]args ) {
	String[] a = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String[] b = new String[26]; 
	int j =0;
		for(int i=25;i>=0 && j<26;i--,j++) {
			b[j]=a[i];
		    if(i==0) {
		    	for(int k=0;k<26; k++) {
		    		System.out.print(b[k]+" ");
		    }
		    	
			}
		}

	}


}