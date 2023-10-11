public class Food extends Goods{

int calories; 
String s;

public Food(String s){
super(); 
this.s = s; 
}

public Food(){
String s = ""; 
}

public String getGoods(){
return s; 
}

public void display(){
int calories = 200; 
System.out.println("The calories of the said food is: "+calories); 
}

}