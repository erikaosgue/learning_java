

/**
 * The MaxDataType class implements an application that simply prints the
 * maximun value each datatype Number can hold, to the standard output 
 */


class MaxDataType { 
	public static void main(String[] args) {
		byte max_byte = 127;
		short max_short = 32767;
		int max_int = 2147483647;
		long max_long = 9223372036854775807L;
		float max_decimals = 3.1415926f;
		System.out.println("max_byte: " + max_byte); 
		System.out.println("max_short: " +  max_short);
		System.out.println("max_int: " + max_int);
		System.out.println("max_long: " + max_long);
		System.out.println("float max numero de decimales:" + max_decimals);
	}

}
