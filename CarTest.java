import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CarTest{
  Car car;
  Diesel diesel;
  Biodiesel biodiesel;

  @Before 
  public void before(){
    car = new Car("BMW");
    diesel = new Diesel();
    biodiesel = new Biodiesel();
  }

  @Test
  public void carHasName(){
    assertEquals( "BMW", car.getName() );
  }

  @Test
  public void tankStartsEmpty(){
    assertEquals( 0, car.fuelCount() );
  }

  @Test
  public void canTakeDieselFuel() {
    car.refuel(diesel);
    assertEquals( 1, car.fuelCount() );
  }

  @Test
  public void canTakeBiodieselFuel() {
    car.refuel(biodiesel);
    assertEquals( 1, car.fuelCount() );
  }

}
