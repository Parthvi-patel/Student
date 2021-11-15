package com.salesProject.Sales.Model;

public class SalesModel {

    String sales_id;
    String customer_id;
    String order_date;
    String deliver_date;
    int quantity;

    public SalesModel(String sales_id, String customer_id, String order_date, String deliver_date, int quantity) {
        this.sales_id = sales_id;
        this.customer_id = customer_id;
        this.order_date = order_date;
        this.deliver_date = deliver_date;
        this.quantity = quantity;
    }

    public String getSales_id() {
        return sales_id;
    }

    public void setSales_id(String sales_id) {
        this.sales_id = sales_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getDeliver_date() {
        return deliver_date;
    }

    public void setDeliver_date(String deliver_date) {
        this.deliver_date = deliver_date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
