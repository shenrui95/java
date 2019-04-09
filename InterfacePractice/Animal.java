interface Animal{             
    public void eat(Food food); 
}
class Cat implements Animal 
{
	
	private static final String CatLike = "CatLike";

	public void eat(Food food) 
    { 
      System.out.println(CatLike+food.getName()); 
    } 
}
class Dog implements Animal 
{ 
    public void eat(Food food) //interface
    { 
      System.out.println("DogLike"+food.getName()); 
    } 
}
abstract class Food 
{ 
    protected String name; 
    public String getName() { 
      return name; 
    } 
    public void setName(String name) { 
      this.name = name; 
    } 
}
class Fish extends Food //a kind of food; extend food.
{ 
   public Fish(String name) {   
      this.name = name; 
    } 
}

class Bone extends Food 
{  
   public Bone(String name) {    
      this.name = name; 
    } 
}

