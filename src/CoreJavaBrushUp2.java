import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int[] arr = {1,5,10,15,200,250,253};
//		for(int i=0; i<arr.length; i++) {
//			
//			if (arr[i] % 5 == 0) //show only numbers that are divisible by 5
//			{
//				System.out.println(arr[i]);
//				break;
//			}
//			
//			else 
//			System.out.println(arr[i] + " " + "Integer is not divisible by 5");
//			break;
//		}	
				
		/**ArrayList**/
//		ArrayList<String> arrlist = new ArrayList<String>();
//		
//		arrlist.add("shar");
//		arrlist.add("zarate");
//		arrlist.add("selenium");
//		arrlist.remove("sel123");
//		System.out.println(arrlist.get(1));		
//				
//		/** ArrayList - For Loop **/
//		for(int i=0; i<arrlist.size(); i++) 
//		{
//			System.out.println(arrlist.get(i));
//		}
		
		/** ArrayList - Enhanced For Loop**/
//		for(String ssh: arrlist) 
//		{
//			System.out.println(ssh);
//		}		
//		
//		System.out.println(arrlist.contains("zarate"));

		
		/** Convert Array to Arraylist**/
		String[] arrlist = {"shar","zarate","123"};
		List<String> arrlist2 = Arrays.asList(arrlist);
		System.out.println(arrlist2.contains("Zarate"));
	}	

}
