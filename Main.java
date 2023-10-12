
public class Main{


    public static void main(String[] args) {

        Food f = new Food("Spagetti", 28.75);
        Toy T = new Toy("Rubics cube", 30.45);
        Books B = new Books("What is java programming?", 80.75);
        f.display();
        T.display();
        B.display();

        System.out.println("The final tax for toy is: "+T.calculateTax());
        System.out.println("The final tax for book is: "+B.calculateTax());

    }


}
