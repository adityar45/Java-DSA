/*Error:
 * program5.java:6: error: constant expression required
    case i :

 */
class ForSwitchDemo{
    public static void main(String[] args){
    int i = 0;
    for(;;i++){
    switch(i){
    case i :
    System.out.print("New ");
    default:
    System.out.println();
    
    }
    if(i==10){
    break;
    }
    }
    }
    }