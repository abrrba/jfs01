class MyString {
    
    private char [] myString;
	private String strr;
    private int length;
   public String t="";  
  public String s="";
public String newt="";
	public String m="";

public String substr1;
    public char [] getCharArray(int length) {
        return new char[length];
    }

    MyString () {
        length = 0;
    }

    /*
     *  @param array the char array to initialize the string with.
     */

    MyString (char ch, int rep) {
        myString = getCharArray(rep);

        for (int i=0; i < rep; i++) {
            myString[i] = ch;
        }
    }
	MyString(String strn1)
	{
	newt=strn1.trim();
        int count=strn1.length();
	for(int i=0;i<count;i++)
	{
	char c=strn1.charAt(i);	
	boolean check=Character.isUpperCase(c);
	if(check==true)
	{
	t=t+Character.toLowerCase(c);
	}
	else
	{
	t=t+Character.toUpperCase(c);
	}

	if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i'|| c=='I' || c=='o'|| c=='O' || c=='u'|| c=='U')
	{
	boolean check1=Character.isLowerCase(c);
	if(check1==true)
	{
              s=s+Character.toUpperCase(c);
	}
	}
	if((c!='a') && (c!='e') && (c!='i')&& (c!='o')&& ( c!='u'))
	{
	boolean check2=Character.isLowerCase(c);
	if(check2==true)
	{
	m=m+Character.toUpperCase(c);
	}
	if(check2==false)
	{
	m=m+Character.toUpperCase(c);
	}
	}
	strr=strn1.toUpperCase();
	}
	}


	MyString(String str,int offset,int length)
	{
//	String str="hello abhijeet";
         substr1=str.substring(offset,length);
	}

	 MyString (char [] array) {
         length = array.length;
         myString = new char [length];
        for (int i = 0; i < length; i++)
	 {
            myString[i] = array[i];
         }
    }

    MyString (char [] array, int offset, int count) {

        length = count;
        int j = 0;
        myString = getCharArray(length);
        for (int i = offset; i < offset + count; i++) {
            myString[j] = array[i];
            j++;
        }
    }

    public int getLength() {
       return length;
    }


    public char charAt(int index) {
        // TODO - handle the error where the index is more than 
        // the length of the string.
        return myString[index];
    }

    public void printMystring() {
        for (int i = 0; i < myString.length; i++) {
            System.out.print (myString[i]);
        }
    }
    
    public String toUpper()
	{ 
	System.out.println(strr);
	return strr;
	 }

	public String toggle () {
	{
		System.out.println(t);
	        return t;
	}			}
    public String toUpperVowels () {
	System.out.println(s);
	return s;
    }

    public String toUpperConsonants() {
	System.out.println(m);
	return m;
    }

     public String trim()
	{
	System.out.println(newt);
	return newt;
	}

    public String substring() {
	System.out.println(substr1);
	return substr1;
    }


}



