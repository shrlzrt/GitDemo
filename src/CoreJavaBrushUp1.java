
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int myNum = 5;
//		double decimal1 = 10.99; //can also use float
//		float decimal2 = 10.99f;	
//		String nickname = "shar123";
//		char myLetter = 's';
//		boolean myCard = false;
//		
//		System.out.println(myNum);
//		System.out.println("myNum");
//		System.out.println("myNum" + "is the variable");
//		System.out.println(myNum + "is the variable");
//		System.out.println(myNum + " " + "is the variable");
			
		/**Arrays**/
//		int[] arr = new int[5];
//		arr[0]=1;
//		arr[1]=3;
//		arr[2]=5;
//		arr[3]=6;
//		arr[4]=7;
		
//		int[] arr = new int[] {1,3,5,6,7}; // -> alternative
		
		int[] arr = {1,3,5,6,7}; // -> alternative
		String[] arr2 = {"shar","zarate","123"};
		
//		System.out.println(arr[2]);
		
		/**For Loop**/
//		for(int i=0; i<arr.length; i++) { //length is 5
//			System.out.println(arr[i]);
//		}
//		
//		for(int i=1; i<arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		
		/**Enhanced For Loop**/
		for(String s: arr2) {
			System.out.println(s);
		}		
		
		for(int z:arr) {
			System.out.println(z);
		}
		
		
	}

}
