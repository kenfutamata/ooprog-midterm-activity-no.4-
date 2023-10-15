public class Toy extends  Goods implements Taxable{

int minimum_age; 




public Toy(String description, double price, int minimum_age){
super();
this.description = description;
this.price = price;
this.minimum_age = minimum_age;
}

public Toy(){
String s = "";

}

    public String getDescription(){
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void display() {

        System.out.println("The toy "+getDescription()+" requires ages "+ minimum_age);
        System.out.println("The price is "+getPrice());
        System.out.println("The final tax for toy is: "+calculateTax());

    }


    @Override
    public double calculateTax() {

    double finaltaxtoy = getPrice()*tax_rate;
    return finaltaxtoy;
    }
}