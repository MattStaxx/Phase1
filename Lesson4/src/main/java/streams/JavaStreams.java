package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class JavaStreams {

	public static void main(String[] args) throws IOException {

		IntStream.range(1, 10)
		.sum();
		//.forEach(System.out.println());
		//.forEach(x->System.out.println(x));
		Stream.of("Matt", "John", "Rob")
		.sorted()
		.findFirst().ifPresent(System.out::println);
		
		String[] names = {"Al", "Mark", "Mike", "Fred"};
		Arrays.stream(names)
		.filter(x->x.startsWith("M"))
		.sorted()
		.forEach(System.out::println);
		
		//String[] names = {"Al", "Mark", "Mike", "Fred"};
		Arrays.stream(new int[] {2,5,2,7,9,6,4})
		.filter(x-> x % 2 == 0)
		//.map(x->x*x)
		//.average()
		//.ifPresent(System.out::println);
		.forEach(System.out::print);
		System.out.println("\n");
		
		List<String> person = Arrays.asList("G", "e", "P", "W", "pe");
		person.stream()
		.map(String::toLowerCase)
		.filter(x->x.startsWith("p"))
		.forEach(System.out::println);
		System.out.println("\n");
		
		Stream<String> rows = Files.lines(Paths.get("C:\\Users\\Matt\\Desktop\\StreamsPrac.txt"));
		rows.sorted()
		.filter(x -> x.length() > 25)
		.forEach(System.out::println);

		List<String> rows1 = Files.lines(Paths.get("C:\\Users\\Matt\\Desktop\\StreamsPrac.txt"))
		.filter(x -> !x.contains("ie"))
		.collect(Collectors.toList());
		rows1.forEach(System.out::println);

		System.out.println("=============");
		Stream<String> rows2 = Files.lines(Paths.get("C:\\Users\\Matt\\Desktop\\StreamsPrac.txt"));
			int rowCount = (int) rows2.map(x -> x.split(" "))
			.filter(x -> {System.out.print(x[0] + " "); 
			return x[0].length() > 4;} )
				.count();
			System.out.print(rowCount + " rows");
		rows2.close();
		
		//double total = (double) Stream.of(7.3, 8.0, 3, 9)
			//	.reduce(0.0, (a, b) -> a + b);
				//System.out.println("Total " + total);
		
		System.out.println("\nNormal");
		IntStream range = IntStream.range(1, 10);
		range.forEach(System.out::print);
		
		System.out.println("\nParallel");
		IntStream range2 = IntStream.range(1, 10);
		range2.parallel().forEach(System.out::print);
		
		System.out.println("\nNormal...");
		List<String> alpha = getData();
		alpha.stream().forEach(System.out::print);
		
		System.out.println("\nParallel...");
		List<String> alpha2 = getData();
		alpha2.parallelStream().forEach(System.out::print);
	}
	
	private static List<String> getData() {
		List<String> a1 = new ArrayList<>();
		int n = 97;

		while(n <= 122) {
			char c = (char)n;
		a1.add(String.valueOf(c));
		n++;}
		return a1;
	}
}
