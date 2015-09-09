package venturesty;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedString {

	public static void main(String... strings){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Total number of strings ");
		try{
			int totalNumberOfStrings = scanner.nextInt();
			System.out.print("Enter "+totalNumberOfStrings+" names: ");
			SortedMap sm = new TreeMap();
			String name = null;
			for(int i=0;i<totalNumberOfStrings;i++){
				name = scanner.next();
				sm.put(name.toUpperCase(),name);
			}
			for(Object value : sm.values()){
				System.out.println(value.toString());
			}
		}
		catch(Exception e){
			System.out.println("enter integer only");
		}
		finally{
			scanner.close();
		}
	}
}
