public class TestingUnit {
  private String field;
  private String commit1;

  private void method(){
      System.out.print("autre modif");
      System.out.print("modif dist");
      Integer tata = 20;
      System.out.print("modif autre");
      System.out.print("en local");

  }

    public String getField() {
        System.out.print("modif dans getField");
        System.out.print("autre modif");
      System.out.print("autre modif");
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    private void toto(){
      TestingUnit test = new TestingUnit();


      System.out.print("tata");
    System.out.println("remote");

  }
}
