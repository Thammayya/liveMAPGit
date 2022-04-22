package basics;

public class DataTypesDeaultEx {

//	Type mismatch: cannot convert from int to byte
	// byte byteVar = 128;
	byte byteVar ;
	byte byteVar1 ;
	short shortVar ;
	int intVar  ;
//		The literal 9223372036854775807 of type int is out of range 
//		long longVar = 9223372036854775807;
	long longMax ;
	float floatMax;
	double doubleMax;
	boolean booleanVar;
	char charVar;
	public static void main(String[] args) {
// 8 primitives [FT]
		DataTypesDeaultEx object = new DataTypesDeaultEx();
		System.out.println("Value Of byte Variable is " + object.byteVar);
		System.out.println("Value Of short Variable is " +  object.shortVar);
		System.out.println("Value Of int Variable is " +  object.intVar);
		System.out.println("Value Of long Variable is " +  object.longMax);
		System.out.println("Value Of float Variable is " +  object.floatMax);
		System.out.println("Value Of double Variable is " +  object.doubleMax);
		System.out.println("Value Of boolean Variable is " +  object.booleanVar);
		System.out.println("Value Of char Variable is " +  object.charVar);
	}
}
