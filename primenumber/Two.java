//palindrome program//
class Two{
	public static void main(String[] args){
		String x="abcdecba";
		int i=0,j=x.length()-1;
		while(i<j){
			if(x.charAt(i)!=x.charAt(j)){
				System.out.println("not palindrome");
			System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("palindrome");
	}
}
		
		