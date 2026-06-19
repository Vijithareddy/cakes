class StringDemo{
	public static void main(String[]args){
		String str1 = "Hello BITS";
		String str2 = "Hello BITS";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		if(str1==str2)
		System.out.println("equal");
		else
		System.out.println(" not equal");
		String str3 = str1;
		System.out.println(str3.hashCode());
		String s1 = new String("Hello BITS");
		System.out.println(s1.hashCode());
		if(str1==s1)
		System.out.println("equal");
		else
		System.out.println(" not equal");
		char clg[]={'b','i','t','s'};
		String s2= new String(clg);
		int number = 1236;
		String binary = Integer.toBinaryString(number);
		System.out.println("binary = "+ binary);
		String octal = Integer.toOctalString(number);
		System.out.println("Octal = "+ octal);
		String hexa = Integer.toHexString(number);
		System.out.println("hex-decimal = "+ hexa);
		System.out.println(Integer.toString(number,2));

	}
}


