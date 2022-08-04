import java.util.Date;

public class InsurancePolicy {
    private int id;
    private String lastName;
    private String type;
    private Date dateStart;
    private Double price;


    public InsurancePolicy(int id, String lastName, String type, Date dateStart, Double price){
        this.id=id;
        this.lastName=lastName;
        this.type=type;
        this.dateStart=dateStart;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
