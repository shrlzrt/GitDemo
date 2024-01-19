import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

//	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ana");
		names.add("Shar");
		names.add("Anne");
		names.add("Anton");
		names.add("Lyn");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

//	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Anallyn");
		names.add("Shar");
		names.add("Anne");
		names.add("Anton");
		names.add("Lyn");
		/* Convert ArrayList to Stream. [s->s.startsWith("A")] -> lambda expression */
		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		/* Alternative version. Doesn't need to declare ArrayList */
		System.out.println(Stream.of("Anallyn", "Shar", "Anne", "Anton", "Lyn").filter(s -> s.startsWith("A")).count());

		/* Alternative version 2 without using ArrayList */
		Long d = Stream.of("Anallyn", "Shar", "Anne", "Anton", "Lyn").filter(s -> {
			return s.startsWith("A");
		}).count();
		System.out.println(d);

		/* Print the name > 4 letters */
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		/* Print the name > 4 letters but limit to 1 only: It will only print the 1st string that starts with "A" with 4 letters */
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

//	@Test
	public void streamMap() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("one");
		names.add("two");
		names.add("ten");
		
		/* Print all the names that ends in "n" in uppercase */
		Stream.of("Anallyn", "Shar", "Anton", "Anne", "Lyn").filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));;
		
		/* Print names which have first letter as "a" with uppercase and sorted */
		List<String> names1 = Arrays.asList("Anallyn", "Shar", "Anton", "Anne", "Lyn");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		/* Merging 2 different lists and sorted */
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		
		/* Use 'anyMatch' to validate if the object is present */
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("two"));
		System.out.println(flag);
		Assert.assertTrue(flag);		
	}
	
	@Test
	public void streamCollect() {
		
		List<String> ls = Stream.of("Anallyn", "Shar", "Anton", "Anne", "Lyn").filter(s->s.endsWith("n")).map(s->s.toUpperCase()).collect(Collectors.toList());	
		System.out.println(ls.get(0)); //It will only print "ANALLYN"
		
		/* Print unique/distinct numbers and sort */
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		/* Get the 3rd item (2nd index) in the distinct sorted out list: 1,2,[3],5,7,9 */
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}
}






