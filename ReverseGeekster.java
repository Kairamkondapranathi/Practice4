package Practice4;

public class ReverseGeekster {
	public static void main(String[] args) {
		String str = "Geekster is my class room";
		
		String arr[] = str.split(" ");
		
		for(int i= arr.length-1; i>=0 ;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
