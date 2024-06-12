class program7 {
    public static void main(String[] args) {

        double cost_price = 100; 
        double sell_price = 120;
        double profit = 0, loss = 0;

        profit = sell_price - cost_price;
        loss = cost_price - sell_price;

        if(profit > 0)
            System.out.println("Profit is :"+profit+" for Selling Price :"+sell_price+" & cost price :"+cost_price);
        else 
            System.out.println("Loss is :"+loss+" for Selling Price :"+sell_price+" & cost price :"+cost_price);
    }
}