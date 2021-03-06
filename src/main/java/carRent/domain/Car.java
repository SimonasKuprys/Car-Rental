package carRent.domain;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue
    private int id;

    private String brand;
    private String model;
    private CarBodyTyoeEnum typeEnum;
    private int productionYear;
    private String color;
    private int milage;
    private CarStatusEnum statusEnum;

    public Car(int id, String brand, String model, CarBodyTyoeEnum typeEnum, int productionYear, String color, int milage, CarStatusEnum statusEnum) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.typeEnum = typeEnum;
        this.productionYear = productionYear;
        this.color = color;
        this.milage = milage;
        this.statusEnum = statusEnum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarBodyTyoeEnum getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(CarBodyTyoeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public CarStatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(CarStatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }
}
