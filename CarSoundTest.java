import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CarSoundTest {

    String make = "Honda"; 
    String model = "Civic"; 
    String sound = "Vrooom Vroom!";
    Car testCar = new Car(make, model); 
    

    @Test
    public void testMake(){
        System.out.println("Running sound Test 1!");
        Assertions.assertEquals(sound, testCar.makeSound(),"Expected vehicle did not make a sound"); 
    }

    
}
