package ejercicio2.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable {
    public Integer Id;
    private String nameClient;
    private Integer tankValue;
    private Integer points;

    public ProductDTO(Integer id, String nameClient, Integer tankValue, Integer points) {
        Id = id;
        this.nameClient = nameClient;
        this.tankValue = tankValue;
        this.points = points;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public Integer getTankValue() {
        return tankValue;
    }

    public void setTankValue(Integer tankValue) {
        this.tankValue = tankValue;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "Id=" + Id +
                ", nameClient='" + nameClient + '\'' +
                ", tankValue=" + tankValue +
                ", points=" + points +
                '}';
    }
}

