class MainMyString {
    public static void main (String args[]) {
        char [] charArray = { 'a', 'b', 'C', 'D', 'e', 'f', 'g', 'h','u'};

        MyString str1 = new MyString (charArray);
	 System.out.println ("\nString is " + str1);
        str1.printMystring();
	
	String strr=new String(charArray);
 	MyString strn=new MyString(strr);
	System.out.println("\n\nthe Uppercase of " +strn);
	strn.toUpper();

//	String strr1=new String(charArray);
        MyString t=new MyString(strr);
	System.out.println("\nthe toggle case of " +t);
	t.toggle();

	MyString s=new MyString(strr);
	System.out.println("\nthe upper vowels of" +s);
	s.toUpperVowels();

	MyString m=new MyString(strr);
	System.out.println("\nupper consonants of " +m);
	m.toUpperConsonants();

        MyString newt=new MyString(strr);
	System.out.println("\nthe trim string of " +newt);
	newt.trim();

	System.out.println("\nThe substring is");
	MyString substr1=new MyString(strr,3,5);
	substr1.substring();

	System.out.println ("\nThe next consturctor");
        MyString str2 = new MyString (charArray, 3, 2);
        str2.printMystring();
        
        
        System.out.println ("\nThe next consturctor");
        MyString str3 = new MyString ('a', 10);
        str3.printMystring();
    }
}
