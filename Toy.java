public class Toy extends Food{

int minimum_age; 
String s; 

public Toy(String s){
super();
this.s = s; 
}

public Toy(){
String s = ""; 
}

public String getGoods(){
return s; 
}

public void display(){
int minimum_age = 4; 
System.out.println("The said goods requires ages "+ minimum_age); 

}


}