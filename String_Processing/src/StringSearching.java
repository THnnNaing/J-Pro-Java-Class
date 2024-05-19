
public class StringSearching {

	public static void main(String[] args) {
		String str[]= {"Apple","orange","lime","lemon","Mango","banana","Stawberry","pineapple"};
		
		int foundPos=-1;
		String searchData="Lemon";
		
		for(int i=0;i<str.length;i++) {
			if(searchData.equalsIgnoreCase(str[i])) {
				foundPos=i;
				break;
			}
		}
		
		if(foundPos>-1) {
			System.out.println("Found at: "+foundPos);
		}
		else System.out.println("Not Found");
	}

}
