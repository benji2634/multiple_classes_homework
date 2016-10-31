import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CarTest{
  Car car;
  Diesel diesel;

  @Before 
  public void before(){
    car = new Car("BMW");
    diesel = new Diesel();
  }

  @Test
  public void carHasName(){
    assertEquals( "BMW", car.getName() );
  }

  @Test
  public void tankStartsEmpty(){
    assertEquals( 0, car.fuelCount() );
  }

}
