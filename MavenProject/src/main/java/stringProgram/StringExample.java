package stringProgram;

public class StringExample {

	public static void main(String[] args) {
		String s="hi";//literal
		System.out.println(s);
		String a=new String("hello");//new keyword
		System.out.println(a);
		//length():It return the length of the string or size.
		System.out.println(s.length());
		//charAt():Returns character of the string based on index.
		System.out.println(s.charAt(1));
		//concat() : add the two strings.
		System.out.println(s.concat(a));
		//contains() : to check whether a character or word in a string.
		String x="Hello World";
		System.out.println(x.contains("World"));
		System.out.println(s.contains("g"));
		//touppercase() : convert small to capital letters.
		System.out.println(s.toUpperCase());
		//tolowercase(): capital to small
		System.out.println(s.toLowerCase());
		//equals(): 
		String f="java";
		String g="java";
		String h="Java";
		String k="selinium";
		System.out.println(f.equals(g));
		System.out.println(f.equals(h));
		System.out.println(f.equals(k));
		//equalsIgnorecase() : small capital ignore
		System.out.println(f.equalsIgnoreCase(h));
		System.out.println(f==g);
		String j=new String("java");
		System.out.println(f==j);//output false(It point different memory location.// equals operator compare the memory location)
		System.out.println(f.equals(j));//output true.(equals method compare content not location.)
		//isempty() :check whether a sting is empty or not
		System.out.println(f.isEmpty());//false
		String u="";
		System.out.println(u.isEmpty());//true
		//trim() : to remove white spaces
		String l=" I can take ";
		System.out.println(l.trim().replaceAll(" ",""));//remove the space
		//substring() : extract the string(based on index)
		System.out.println(x.substring(0,7));//print "Hello"
		//valueof() : to convert any datatype to string.
		int z=55;
		System.out.println(String.valueOf(z));// print 55
		
		
	}

}
