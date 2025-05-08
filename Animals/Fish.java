public class Fish extends Animal {
  private int sizeInFt;
  private boolean canEat;

  public Fish(int age, String gender, int sizeInFt, boolean canEat) {
      super(age, gender);
      this.sizeInFt = sizeInFt;
      this.canEat = canEat;
  }

  public void swim() {
      System.out.println("Fish swim: swimming in the ocean");
  }
}
