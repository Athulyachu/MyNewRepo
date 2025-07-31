package stringProgram;

public class BufferBuilder {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("World");
		System.out.println(sb);
		StringBuilder sd=new StringBuilder("hii");
		System.out.println(sd);
		//insert() : based on index insert a particular string
		System.out.println(sb.insert(0,"Helolo"));
		//append() : add the new value to string
		System.out.println(sb.append("My"));
		//replace() :replace a particular value based on index
		System.out.println(sb.replace(0, 5,"W"));
		//reverse(): reverese the string
		System.out.println(sb.reverse());
		//delete(): delete elements based on index
		System.out.println(sb.delete(0, 3));
		System.out.println("\n");
		//stringbuilder
		
				//insert() : based on index insert a particular string
				System.out.println(sd.insert(0,"Helolo"));
				//append() : add the new value to string
				System.out.println(sd.append("My"));
				//replace() :replace a particular value based on index
				System.out.println(sd.replace(0, 5,"W"));
				//reverse(): reverese the string
				System.out.println(sd.reverse());
				//delete(): delete elements based on index
				System.out.println(sd.delete(0, 3));
	}

}
