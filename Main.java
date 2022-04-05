class Main {
  public static void main(String[] args) {
    int a,b;
    for(a=0;a<5;a++)
    {
          for(b=0;b<5*2;b++)
      {
      if(b>(a)) 
      {
      System.out.print(" "); 
      }
          else 
      {
        System.out.print("*");
      }
      }
       System.out.println();
    }
    
  }
}