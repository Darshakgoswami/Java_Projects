package basic;

public class Product 
{
    int product_id;
    double product_price;
    String product_name;

    Product(int product_id, double product_price, String product_name) 
    {
        this.product_id = product_id;
        this.product_price = product_price;
        this.product_name = product_name;
    }

    void show_productdata() 
    {
        System.out.println("Product ID " + product_id);
        System.out.println("Product Price " + product_price);
        System.out.println("Product Name " + product_name);
    }

    public static void main(String[] args) 
    {
        Product p = new Product(10,20.93,"abc");
        p.show_productdata();
    }
}