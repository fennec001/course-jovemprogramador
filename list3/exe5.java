public class exe5 {
    public static void main(String[] args) {
  int heightC = 150;
  int heightZ = 110;

  int years = 0;
 while (heightC >= heightZ){
  years++;
  heightC = 2+heightC;
  heightZ = 3+heightZ; 
}
    System.out.println("Chico's height: "+heightC);
    System.out.println("Ze's height: "+heightZ);
    System.out.println("Years eloped: "+years);
}
}
