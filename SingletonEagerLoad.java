class Singleton //Eagerload implementation
{
  private static Singleton instance = new Singleton(); //we initialize beforehand . that's why it's called Eager laod
  
  private Singleton(){}
  
  public static Singleton getInstance()
  {
      return instance;
  }
}


public class SingletonEagerLoad
{
	public static void main(String[] args) {
	    var v1 = Singleton.getInstance();
	    
	    var v2 = Singleton.getInstance();
	    
	    System.out.print(v1.equals(v2));
	}
}