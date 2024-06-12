class Program11{
	
	public static void main(String[] args){
	
		int num=12; //00000000000000000000000000001100
		
		//Unsigned Left Shift (>>)
		//For num 12
		//12>>3 = 00000000000000000000000000000001 i.e 1
		
		System.out.println(num>>3);

		//Unsigned Right Shift (<<)
                //For num 12
                //12<<3 = 00000000000000000000000000110000 i.e 48

                System.out.println(num<<2);
	}
}