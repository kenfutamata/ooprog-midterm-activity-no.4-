public class Food extends Goods{

 int calories = 200;
String s;
double pricefood;

public Food(String s, double pricefood){
super(); 
this.s = s;
this.pricefood = pricefood;
}

public Food(){
String s = "";
double pricefood;
}

public String getGoods(){
return s; 
}

 @Override
 public void display() {

  System.out.println("The calories of the good "+s+" food is: "+calories);
  System.out.println("The cost of the food cost: "+pricefood);
 }


}