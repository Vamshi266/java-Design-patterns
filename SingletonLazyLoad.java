class Singleton // Lazy laod implementation
{
  private static Singleton instance;
  
  private Singleton(){}
  
  public static Singleton getInstance()
  {
      if(instance != null) // first we check for object .
        return instance;//  if it's initialzed already we return it else we initialize it and return it instead .
    
    
      instance = new Singleton();
      
      return instance;
  }
}


public class SingletonLazyLoad
{
	public static void main(String[] args) {
	    var v1 = Singleton.getInstance();
	    
	    var v2 = Singleton.getInstance();
	    
	    System.out.print(v1.equals(v2));
	}
}