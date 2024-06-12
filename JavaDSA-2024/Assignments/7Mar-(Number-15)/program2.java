/* Prime or not */

class program2 {
    public static void main(String[] args) {
        
        int num = 2;
        int temp = num;
        int count = 0;

        while(temp > 0)
        {
            if(num % temp == 0)
            {
                count++;
            }
            temp--;
        }

        if(count == 2)
        {
            System.out.println(num+" is a prime number");
        }
        else
        {
            System.out.println(num+" is not a prime number");   
        }
    }
}