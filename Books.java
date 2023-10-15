public class Books extends Goods implements Taxable{
    String author;
    String s;
    double pricebook;
    public Books(String s, double pricebook, String author){
        super();
        this.s = s;
        this.pricebook = pricebook;
        this.author = author;
    }

    public Books(){
        String s = " ";

    }

    public String getGoods(){
        return s;
    }
    public double getPrice(){
        return pricebook;
    }

    @Override
    public void display() {

        System.out.println("The author of book "+getGoods()+" is authored by "+author);
        System.out.println("The price of the book cost "+getPrice());

    }

    @Override
    public double calculateTax() {

        double finaltaxbooks = getPrice()*tax_rate;
        return finaltaxbooks;

    }
}
