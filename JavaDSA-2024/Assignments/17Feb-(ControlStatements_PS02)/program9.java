/* Error:
 * program9.java:5: error: incompatible types: possible lossy conversion from float to char
    char ch =num=10+55;
                ^

 */

class WhileDemo{

    public static void main(String[] args){
    float num = 10;
    char ch =num=10+55;
    while( num ++ >90){
    System.out.println(num);
    }
    }
    }