public class TestAnimals {
  public static void main(String[] args) {
      
      System.out.println("\n=== Zebra ==:");
      Zebra z = new Zebra(7, "male", true);
      System.out.println("age:" + z.age + " gender:" + z.gender + " is_wild:" + z.is_wild);
      z.isMammal();
      z.mate();
      z.run();

      System.out.println("\nFish:");
      Fish f = new Fish(2, "female", 3, true);
      System.out.println("age:" + f.age + " gender:" + f.gender);
      f.isMammal();
      f.mate();
      f.swim();

      System.out.println("\nDuck:");
      Duck d = new Duck(1, "male", "black");
      System.out.println("age:" + d.age + " gender:" + d.gender + " beak Color:" + d.beakColor);
      d.isMammal();
      d.mate();
      d.swim();
      d.quack();
  }
}
