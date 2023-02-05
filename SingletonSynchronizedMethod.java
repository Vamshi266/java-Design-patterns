class Singleton
{
  private static Singleton instance;
  
  private Singleton(){}
  
  public static synchronized Singleton getInstance()
  {
      if(instance != null)
        return instance;
    
    
      instance = new Singleton();
      
      return instance;
  }
}


public class Main
{
	public static void main(String[] args) {
	    var v1 = Singleton.getInstance();
	    
	    var v2 = Singleton.getInstance();
	    
	    System.out.print(v1.equals(v2));
	}
}