public class Zebra extends Animal {
  public boolean is_wild;

  public Zebra(int age, String gender, boolean is_wild) {
      super(age, gender);
      this.is_wild = is_wild;
  }

  @Override
  public boolean isMammal() {
      System.out.println("Zebre Mammal: true");
      return true;
  }

  public void run() {
      System.out.println("Zebra run: runs in the wild");
  }
}
