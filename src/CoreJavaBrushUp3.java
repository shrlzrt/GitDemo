
public class CoreJavaBrushUp3 {

	
	public static void main(String[] args) {
		/**String literal - Only 1 object will be saved**/
//		String a = "shar";
//		String b = "shar";
//		System.out.println(a==b); //true
	
		/**String object - 2 new objects will be saved**/
//		String c = new String("zarate");
//		String d = new String("zarate");
//		System.out.println(c==d); //false
		
		
		String s = "shar lyn zarate";
//		String[] splitString = s.split(" "); //it becomes an array
//		System.out.println(splitString[0]);
//		System.out.println(splitString[1]);
//		System.out.println(splitString[2]);	
		
//		String[] splitString = s.split("lyn");
//		System.out.println(splitString[0]);
//		System.out.println(splitString[1]);
//		
//		System.out.println(splitString[1].trim());
				
//		for(int i=0; i<s.length(); i++)
//		{
//		System.out.println(s.charAt(i));
//		}	
		
		for(int i=s.length()-1; i>=0; i--) //reverse
		{
		System.out.println(s.charAt(i));
		}	
	}
	
}
