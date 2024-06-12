class program6{
    public static void main(String[] args) {
char alphabet = 'A';

System.out.println("Consonant alphabets from A to Z:");

while (alphabet <= 'Z') {
    if (alphabet != 'A' && alphabet != 'E' && alphabet != 'I' && alphabet != 'O' && alphabet != 'U') {
        System.out.print(alphabet + " ");
    }
    alphabet++;

}
System.out.println();
}
}