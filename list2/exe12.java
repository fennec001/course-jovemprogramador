import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

		System.out.print("\n value I: ");
    int i = input.nextInt();
    System.out.print("\n value A");
    double a = input.nextDouble();  
    System.out.print("\n value B");
    double b = input.nextDouble(); 
    System.out.print("\n value C");
    double c = input.nextDouble(); 
    switch (i){  
      case 1:
      if(a<b&&a<c){
        System.out.println(a);
      }else if(b<a&&b<c){ 
      System.out.println(b);}
      else if(c<a&&c<b){
        System.out.println(c);
      }   
    
    
    if(a>b&&a<c||a>c&&a<b){
      System.out.println(a);
    }else if(b>a&&b<c||b<a&&b>c){
      System.out.println(b);
    }else if(c<a&&c>b||c>a&&c<b){
      System.out.println(c);
    }
  
    if(a>b&&a>c){
    System.out.println(a);
  }else if(b>a&&b>c){
    System.out.println(b);
  }else if(c>b&&c>a){
    System.out.println(c);
    
    

  }
  break;
  case 2:
  if(a>b&&a>c){
    System.out.println(a);
  }else if(b>a&&b>c){ 
  System.out.println(b);}
  else if(c>a&&c>b){
    System.out.println(c);
  }   


if(a>b&&a<c||a<c&&a>b){
  System.out.println(a);
}else if(b<a&&b>c||b>a&&b<c){
  System.out.println(b);
}else if(c>a&&c<b||c<a&&c>b){
  System.out.println(c);
}

if(a<b&&a<c){
System.out.println(a);
}else if(b<a&&b<c){
System.out.println(b);
}else if(c<b&&c<a){
System.out.println(c);




}
		
	} }
}
