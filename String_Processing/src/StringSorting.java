
public class StringSorting {

	public static void main(String[] args) {
		String str[]= {"Apple","orange","lime","Mango","banana","Stawberry","pineapple"};
		
//		for sorting by asc
		String temp;
		for(int i=0;i<str.length-1;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].compareTo(str[j])>0) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				};
			}
		}
		//display the sorting result
		System.out.print("Ascending order of string arr: ");
		for(String s:str)
			System.out.print(s+" ");
		
//		for sorting by asc to adjust upper and lowercase
		for(int i=0;i<str.length-1;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].toLowerCase().compareTo(str[j].toLowerCase())>0) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				};
			}
		}
		//display the sorting result
		System.out.println();
		System.out.print("Ascending order of string arr by adjust the type case: ");
		for(String s:str)
			System.out.print(s+" ");
	}
}
