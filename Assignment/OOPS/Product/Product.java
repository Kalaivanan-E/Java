

class Product{
    int id;
    String name;
    int price;

    Product(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double percentage){
        if(percentage <0 || percentage>100){
            System.out.println("Insufficient discount percentage");
            return;
        }
        price = price - (int)(price * percentage / 100.0); 
       }
    public void display(){
        System.out.println(id + name + price );
        // System.out.printf("Product[id=%d, name=%s, price=%.2f]%n", id, name, price);

    }

    public static void main(String[] args) {
        Product pro1 = new Product(101, "Watch", 1000);
        pro1.applyDiscount(10);
        pro1.display();
    }
}
