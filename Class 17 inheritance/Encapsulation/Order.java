

// this is a pointer pointing current object
// to refer class member inside a class

class Order{
   private String order_Detail;

  public void set_OrderDetails(String name){
    this.order_Detail = name;
  }
  public String get_orderDetails(){
    return this.order_Detail;
  }
   
}