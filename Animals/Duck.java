public class Duck extends Animal {
  public String beakColor;

  public Duck(int age, String gender, String beakColor) {
      super(age, gender);
      this.beakColor = beakColor;
  }

  public void swim() {
      System.out.println("Duck swim: swimming on the river");
  }

  public void quack() {
      System.out.println("Duck quack: Quack!");
  }
}
