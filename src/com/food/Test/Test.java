import com.food.Errors;
import com.food.FOOD;
import com.food.MainMenu;
import junit.framework.TestCase;

public class Test extends TestCase {

    public void test(){

        Errors errors = new Errors("Items are not selected!!");
        assertEquals("Items are not selected!!" , errors.getErrorMessage());

        System.out.println("test is pass !!! ");

    }


}
