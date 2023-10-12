public class Books extends Toy implements Taxable{
    String author;
    String s;
    double pricebook;
    public Books(String s, double pricebook){
        super();
        this.s = s;
        this.pricebook = pricebook;
    }

    public Books(){
        String s = " ";

    }

    public String getGoods(){
        return s;
    }

    @Override
    public void display() {
        author = "Kento Futamata";
        System.out.println("The author of book "+getGoods()+" is authored by "+author);
        System.out.println("The price of the book cost "+pricebook);

    }

    @Override
    public double calculateTax() {
        double tax_rate = 0.12;
        double finaltaxbooks = pricebook*tax_rate;
        return finaltaxbooks;

    }
}
