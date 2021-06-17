    class OverloadDemo

    {

        void area(float x)

        {
            float sqArea=x*x;

            System.out.println("the area of the square is "+sqArea+" sq units");

        }

        void area(float x, float y)

        {
            System.out.println("the area of the rectangle is "+x*y+" sq units");

        }

        void area(double x)

        {

            double cirArea = 3.14 * x * x;

            System.out.println("the area of the circle is "+cirArea+" sq units");

        }

    }

    class overload 

    {

         public static void main(String args[]) 

    	{

    	   OverloadDemo ob = new OverloadDemo();

    	   ob.area(7);

    	   ob.area(5,6);

    	   ob.area(8.5);

            }

    }
