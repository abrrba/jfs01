class occ
{
public static void main(String args[])
{
int[] arr={1,2,3,4,4,4,5};
int i,j,count;
int size=arr.length;
    for(i=0; i<size; i++)
    {
        count = 1;
        for(j=i+1; j<size; j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
                freq[j] = 0;
            }
        }
 
        if(freq[i]!=0)
        {
            freq[i] = count;
        }
    }
 
    System.out.println("\nFrequency of all elements of array : \n");
    for(i=0; i<size; i++)
    {
        if(freq[i]!=0)
        {
//            System.out.println(arr[i]);
System.out.println(freq[i]);
        }
    }
 
    
} 
}

