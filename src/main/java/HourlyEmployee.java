/**
 * Created by michaelbathon on 3/27/16.
 */
public class HourlyEmployee extends Employee {

    HourlyEmployee(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setPayment(int payment){
        this.payment = payment;
    }
    public int getPayment(){
        return payment;
    }
}
