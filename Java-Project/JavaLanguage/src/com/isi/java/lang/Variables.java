package com.isi.java.lang;

public class Variables
{
	//////// STATIC:  Class members
	
	//// Constants: public static final
	
	//// STATIC FINAL fields must be initialized either:
	////	a)	at declaration (= at creation), or
	////	b)	in static initializer (like static constructor)
	
	// Byte:	size = 1 byte
	public static final byte byteMin = -128;
	public static final byte byteMax = 127;
	
	// Short:	size = 2 bytes
	public static final short shortMin = -32768;
	public static final short shortMax = 32767;
	
	// Int:		size = 4 bytes
	public static final int intMin = -2147483648;
	public static final int intMax = 2147483647;				// 2.14 billion
	
	// Long:	size = 8 bytes
	public static final long longMin = -9_223_372_036_854_775_808L;
							// With optional _ spacers for clarity
	public static final long longMax = 9223372036854775807L;	// 9.22 quintillion
	
	// Float:	size = 4 bytes	precision = approx. 6-7 digits
	public static final float floatNegativeMax;		// -3.4028235	E+38
	public static final float floatNegativeMin;		// -1.4 		E-45
	public static final float floatPositiveMin;		// +1.4			E-45
	public static final float floatPositiveMax;		// +3.4028235	E+38
	
	// Double:	size = 8 bytes	precision = approx. 15 digits
	public static final double doubleNegativeMax;	// -1.7976931348623157	E+308
	public static final double doubleNegativeMin;	// -4.9					E-324
	public static final double doublePositiveMin;	// +4.9					E-324
	public static final double doublePositiveMax;	// +1.7976931348623157	E+308
	
	// Char:	size = 2 bytes
	public static final char charMin = 0;
	public static final char charMax = 65535;
	
	// Boolean:	size = 1 byte
	public static final boolean booleanMin = false;
	public static final boolean booleanMax = true;
	
	// STATIC INITIALIZER
	// (Like a constructor, but for initializing any static members.
	//  Executed once, when the class is loaded, immediately after
	//  launching the application.)
	static
	{
		System.out.println("Variables class: Static initializer executing ...");
		
		floatNegativeMax = -Float.MAX_VALUE;
		floatNegativeMin = -Float.MIN_VALUE;
		floatPositiveMin = Float.MIN_VALUE;
		floatPositiveMax = Float.MAX_VALUE;
		
		doubleNegativeMax = -Double.MAX_VALUE;
		doubleNegativeMin = -Double.MIN_VALUE;
		doublePositiveMin = Double.MIN_VALUE;
		doublePositiveMax = Double.MAX_VALUE;
		
		displayValueRanges();
		//displayCharValues();
	}
	
	public static void displayValueRanges()
	{
		System.out.println("Byte min:  " + byteMin);
		System.out.println("Byte max:  " + byteMax);
		System.out.println("Short min: " + shortMin);
		System.out.println("Short max: " + shortMax);
		System.out.println("Int min:   " + intMin);
		System.out.println("Int max:   " + intMax);
		System.out.println("Long min:  " + longMin);
		System.out.println("Long max:  " + longMax);		
		System.out.println("Float negative max:  " + floatNegativeMax);
		System.out.println("Float negative min:  " + floatNegativeMin);
		System.out.println("Float positive min:  " + floatPositiveMin);
		System.out.println("Float positive max:  " + floatPositiveMax);
		System.out.println("Double negative max: " + doubleNegativeMax);
		System.out.println("Double negative min: " + doubleNegativeMin);
		System.out.println("Double positive min: " + doublePositiveMin);
		System.out.println("Double positive max: " + doublePositiveMax);
		System.out.println("Char min:     " + (int)charMin);
		System.out.println("Char max:     " + (int)charMax);
		System.out.println("Boolean min:  " + booleanMin);
		System.out.println("Boolean max:  " + booleanMax);
	}
	
	public static void displayCharValues()
	{
		int charactersPerLine = 50;
		for (int i = charMin; i <= charMax; i += charactersPerLine)
		{
			String line = "";
			for (int j = i; j < (i + charactersPerLine); j++)
				line += ((char)j + " ");
			System.out.println(i + ":\t" + line);
		}
	}
	
	
	
	//////// NON-STATIC:  Instance members
	
	// Uninitialized fields: default values
	
	private int defaultInt;			// = 0
	private double defaultDouble;	// = 0d
	private char defaultChar;		// = 0
	private boolean defaultBoolean;	// = false
	private int[] defaultIntArray;	// = null
	private Object defaultObject;	// = null
	private String defaultString;	// = null
	
	// Initialized fields
	
	private byte myByte = 1;
	private short myShort = -10;
	private int myInt;				// initialized in constructor
	private long myLong = -1000L;
	private float myFloat;			// initialized in constructor
	private double myDouble = -9876.12345d;
	private char myChar = 'a';
	private boolean myBoolean = true;
	private int[] myIntArray = { 100, 275, 625, 900 };
	private double[] myDoubleArray = new double[10];
	private Object myObject = new Object();
	private String myString = "Hello";
	
	
	//// Non-static FINAL fields must be initialized either:
	////	a)	at declaration (= at creation), or
	////	b)	in constructor
	
	private final int myFinalInt = 125;
	private final long myFinalLong;
	private final String myFinalString;
	
	
	//// ACCESS LEVELS
	
	private int privateMember;		// Accessible only from inside this class
	
	int packagePrivateMember;		// Accessible only from inside this package
	
	protected int protectedMember;	// Accessible from	a) inside this package, or
									//					b) inside any subclass of this class
	
	public int publicMember;		// Accessible from anywhere
	
	
	public Variables(int myInt, float myFloat, String myFinalString)
	{
		// Call superclass constructor
		super();
		
		System.out.println("Variables instance: Constructor executing ...");
		
		this.myInt = myInt;
		this.myFloat = myFloat;
		
		//this.myFinalInt = 999;	// Cannot modify final field after initialization
		this.myFinalLong = 9191919L;
		this.myFinalString = myFinalString;
		
		this.myBoolean = localVariables(9, new Object());
		
		String ints = "";
		String doubles = "";
		for (int i : myIntArray)
			ints += i + "  ";
		for (double d : myDoubleArray)
			doubles += d + "  ";
		System.out.println("defaultIntArray:  " + defaultIntArray);
		System.out.println("myIntArray:       {  " + ints + "}");
		System.out.println("myDoubleArray:    {  " + doubles + "}");
	}
	
	private boolean localVariables(int intParameter, Object objParameter)
	{
		//double doubleLocal;   // Local variables have no default values.
		//boolean booleanLocal; // They must be initialized
		//Object objectLocal;	// before you can use them.
		
		double doubleLocal = 3.14d;
		boolean booleanLocal = (doubleLocal > 1 && intParameter < 10);
		Object objectLocal = objParameter;
		
		System.out.println(doubleLocal + ", " + booleanLocal + ", " + objectLocal.toString());
		
		return booleanLocal;
	}
	
	private void primitiveTypeCasting()
	{
		// Implicit type-casting: Widening conversion
		// No information loss possible
		
		myShort =	myByte;
		myInt =		myShort;
		myLong =	myInt;
		myFloat =	myLong;
		myDouble =	myFloat;
			// Equivalent, using (unnecessary) explicit cast:
		myShort =	(short)myByte;
		myInt =		(int)myShort;
		myLong =	(long)myInt;
		myFloat =	(float)myLong;
		myDouble =	(double)myFloat;
		
		
		// Explicit type-casting: Narrowing conversion
		// Information loss possible
		
		myByte = 	(byte)myShort;
		myShort =	(short)myInt;
		myInt =		(int)myLong;
		myLong =	(long)myFloat;
		myFloat =	(float)myDouble;
			// Implicit casting not permitted
		//myByte = 	myShort;
		//myShort =	myInt;
		//myInt =	myLong;
		//myLong =	myFloat;
		//myFloat =	myDouble;
	}
}
