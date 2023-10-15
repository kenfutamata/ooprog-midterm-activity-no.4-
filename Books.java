public class Books extends Goods implements Taxable{
    String author;


    public Books(String description, double price, String author){
        super();
        this.description = description;
        this.price = price;
        this.author = author;
    }

    public Books(){
        String s = " ";

    }

    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public void display() {

        System.out.println("The author of book "+getDescription()+" is authored by "+author);
        System.out.println("The price of the book cost "+getPrice());
        System.out.println("The final tax for book is: "+calculateTax());

    }

    @Override
    public double calculateTax() {

        double finaltaxbooks = getPrice()*tax_rate;
        return finaltaxbooks;

    }
}
