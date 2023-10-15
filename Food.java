public class Food extends Goods{

int calories;
String s;
double pricefood;

public Food(String s, double pricefood, int calories){
super(); 
this.s = s;
this.pricefood = pricefood;
this.calories = calories;
}

public Food(){
String s = "";
double pricefood;
}

public String getGoods(){
return s; 
}

 @Override
 public double getPrice() {
  return pricefood;
 }

 @Override
 public void display() {

  System.out.println("The calories of the good "+getGoods()+" food is: "+calories);
  System.out.println("The cost of the food cost: "+getPrice());
 }


}