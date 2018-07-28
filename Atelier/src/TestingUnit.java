public class TestingUnit {
  private String field;
  private String commit1;

  private void method(){
      System.out.print("autre modif");
      System.out.print("modif dist");
      System.out.print("modif autre");

  }

    public String getField() {
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
