public class Food extends Goods{

int calories;



public Food(String description, double price, int calories){
super();
 this.description = description;
this.price = price;
this.calories = calories;
}

public Food(){
String s = "";
double price;
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

  System.out.println("The calories of the good "+getDescription()+" food is: "+calories);
  System.out.println("The cost of the food cost: "+getPrice());
 }


}