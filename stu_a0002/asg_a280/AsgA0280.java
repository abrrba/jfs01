class asga0280

{

 public static void main(String args[])	

 {

    int i, j, k;

    for(i=1;i<=5;i++)

    {

        for(j=1;j<=6-i;j++)

        {

            System.out.print("*");

        }

        for(k=1;k<i;k++)

        {

            System.out.print("  ");

        }

        for(j=1;j<=6-i;j++)

        {

           System.out.print("*");

        }

        System.out.println("");

    }

    for(i=2;i<=5;i++)

    {

        for(j=1;j<=i;j++)

        {

            System.out.print("*");

        }

        for(k=1;k<=5-i;k++)

        {

            System.out.print("  ");

        }

        for(j=1;j<=i;j++)

        {

            System.out.print("*");

        }

        System.out.println("");

    }

}}
