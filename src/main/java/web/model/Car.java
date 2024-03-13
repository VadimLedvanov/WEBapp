package web.model;

public class Car {
    private int id;
    private String model;
    private int releaseYear;

    public Car(int id, String model, int releaseYear) {
        this.id = id;
        this.model = model;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return releaseYear;
    }

    public void setYear(short releaseYear) {
        this.releaseYear = releaseYear;
    }
}
