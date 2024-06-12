/* Composite or not */

class program4 {
    public static void main(String[] args) {
        
        int num = 12;
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

        if(count > 2)
        {
            System.out.println(num+" is a composite number");
        }
        else
        {
            System.out.println(num+" is not a composite number");   
        }
    }
}

