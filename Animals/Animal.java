public class Animal {
  public int age;
  public String gender;

  public Animal(int age, String gender)
  {
    this.age = age;
    this.gender = gender;
  }

  /*
   * by default non mammals
   */
  public boolean isMammal()
  {
    System.out.println("Animal is Mammal: False");
    return false;
  }

  public void mate()
  {
    System.out.println("Animal mate: Behavior");
  }
}