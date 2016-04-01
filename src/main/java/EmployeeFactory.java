/**
 * Created by michaelbathon on 3/27/16.
 */
public class EmployeeFactory {

    public Employee makeEmployee(String name, String type){
        Employee createdEmployee = null;
        if(type.equals("Hourly")){
            createdEmployee = new HourlyEmployee(name);
        }
        else if(type.equals("Salary")) {
            createdEmployee = new SalariedEmployee(name);
        }
        return createdEmployee;
    }
}
