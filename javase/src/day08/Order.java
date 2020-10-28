package day08;

/**
 * Author wangyi
 * Create 2020-09-14 22:49
 * ClassName Order
 * Version 1.0
 */
public class Order {
    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    int orderId;
    String orderName;

    @Override
    public boolean equals(Object obj) {
        boolean foag=false;
        if (obj instanceof Order){
            Order order= (Order) obj;
            if (this.orderId==orderId && this.orderName.equals(orderName)){
                foag=true;
            }
        }
        return foag;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
