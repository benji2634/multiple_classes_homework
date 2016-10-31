public class Car{
  private String name;
  private Diesel[] tank;

  public Car(String name){
    this.name = name;
    this.tank = new Diesel[50];
  }

  public String getName(){
    return this.name;
  }

  public int fuelCount(){
    int counter = 0;

    for (Diesel fuel : tank) {
      if (fuel != null) {
        counter++;
      }
    }
    return counter;
  }


}