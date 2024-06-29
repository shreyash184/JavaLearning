public class Property {
    private Integer id;
    private Integer ownerId;

    private String location;
    private Double price;
    private String description;
    private Integer rating;

    static int count = 7;

    public Property(Integer id, Integer ownerId, String location, Double price, String description) {
        this.id = id;
        this.ownerId = ownerId;
        this.location = location;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", ownerId=" + ownerId +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getLocation() {
        return location;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Integer getRating() {
        return rating;
    }




}
