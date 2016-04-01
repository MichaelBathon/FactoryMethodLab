/**
 * Created by michaelbathon on 3/27/16.
 */
public abstract class Employee {

    String name;
    String type;
    int payment;

    public abstract void setName(String name);
    public abstract String getName();
    public abstract void setType(String type);
    public abstract String getType();
    public abstract void setPayment(int payment);
    public abstract int getPayment();
}
