class AsgA0126
{
        public static int pri (int num)
        {        int  i=2 ;
                while(i<=num-1)
                {
                        if((num%i)==0)
                        {
                                return(0);
                                 }

                       i=i+1;
                      
                        if(i<=num-1)
{
                        i=i+1;
                        }
                        else
                        {
                                return(1);

                        }
                


                }

                        return(0);
        }
}

