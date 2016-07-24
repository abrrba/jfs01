

class AsgA0656{
        public static int fill_array(int[] intmyList,int b)
        {
                int a;
                intmyList = new int[b];
                for(int i=1;i<intmyList.length;i++)

                {
                        intmyList[i] = i*3;


                }
                for(int i=1; i<intmyList.length; i++)
                {

                        a = intmyList[i]%5;
                        if(a == 0)
                        {

                                intmyList[i]=-1;

                        }
                                System.out.print(intmyList[i]+ " ");

                }
                     return(0);

}
