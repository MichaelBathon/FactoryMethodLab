import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 3/27/16.
 */
public class SpecEmployeeFactory {


    @Test
    public void testMakeEmployeeMethod(){
        SalariedEmployee sallyWorker = new SalariedEmployee("Sally");
        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee testEmployee = employeeFactory.makeEmployee("Sally", "Salary");

        assertEquals("Fails if the factory method doesn't create the right type of employee " +
                "based off the given parameters", sallyWorker.getClass().getName(), testEmployee.getClass().getName());
    }

}
