abstract class Goods{

String description; 
double price; 

public Goods(String description){
this.description =description;
}

public Goods(){
String description = "";
}


public String getDescription(){
return description; 
}

public double getPrice(){
return price; 
}

public abstract void display();


}