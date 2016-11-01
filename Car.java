import java.util.*;

public class Car{
  private String name;
  private ArrayList<Consumable> tank;

  public Car(String name){
    this.name = name;
    this.tank = new ArrayList<Consumable>();
  }

  public String getName(){
    return this.name;
  }

  public int fuelCount(){
    return this.tank.size();
  }

  public void refuel(Consumable fuel) {
    this.tank.add(fuel);
  }


}