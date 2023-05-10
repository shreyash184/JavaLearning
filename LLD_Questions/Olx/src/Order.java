public class Order {
    private Integer id;
    private Status status;
    private Integer propertyId;
    private Integer buyerId;

    static int count = 0;

    public Order(Integer id, Status status, Integer propertyId, Integer buyerId) {
        this.id = id;
        this.status = status;
        this.propertyId = propertyId;
        this.buyerId = buyerId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public Integer getBuyerId() {
        return buyerId;
    }


}
