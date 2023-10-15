public class Toy extends Food implements Taxable{

int minimum_age; 
String s;

double price;

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
    public void display() {

        System.out.println("The good "+s+" requires ages "+ minimum_age);
        System.out.println("The price is "+pricetoy);

    }


    @Override
    public double calculateTax() {

    double finaltaxtoy = pricetoy*tax_rate;
    return finaltaxtoy;
    }
}