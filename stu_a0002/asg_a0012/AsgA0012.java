class AsgA0012{

      public static void main(String args[]){

            int num = Integer.parseInt(args[0]);      

            int temp = num,result=0;

           

            while(temp>0){

               result = result + temp;

               temp--;

            }

            System.out.println("Sum of Digit for "+num+" is : "+result);

           

            temp = num;

            result = 1;

            while(temp > 0){

                 result = result * temp;

                 temp--;

            }

            System.out.println("Product of Digit for "+num+" is : "+result);

   }
}
