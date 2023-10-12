public class Toy extends Food implements Taxable{

int minimum_age; 
String s;

double price;

double pricetoy;

public Toy(String s, double pricetoy){
super();
this.s = s;
this.pricetoy = pricetoy;
}

public Toy(){
String s = "";

}

public String getGoods(){
return s; 
}

    @Override
    public void display() {
        minimum_age = 4;
        System.out.println("The good "+s+" requires ages "+ minimum_age);
        System.out.println("The price is "+pricetoy);

    }


    @Override
    public double calculateTax() {
    double tax_rate = 0.12;
    double finaltaxtoy = pricetoy*tax_rate;
    return finaltaxtoy;
    }
}