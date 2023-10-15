public class Toy extends  Goods implements Taxable{

int minimum_age; 
String s;



double pricetoy;

public Toy(String s, double pricetoy, int minimum_age){
super();
this.s = s;
this.pricetoy = pricetoy;
this.minimum_age = minimum_age;
}

public Toy(){
String s = "";

}

public String getGoods(){
return s; 
}

    @Override
    public double getPrice() {
        return pricetoy;
    }

    @Override
    public void display() {

        System.out.println("The toy "+getGoods()+" requires ages "+ minimum_age);
        System.out.println("The price is "+getPrice());

    }


    @Override
    public double calculateTax() {

    double finaltaxtoy = getPrice()*tax_rate;
    return finaltaxtoy;
    }
}