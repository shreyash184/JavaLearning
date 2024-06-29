public class User {
    private Integer id;
    private String name;
    private Integer phoneNo;
    private String email;
    private Integer aadhar;

    static Integer count = 5;

    public User(Integer id, String name, Integer phoneNo, String email, Integer aadhar) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.aadhar = aadhar;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNo=" + phoneNo +
                ", email='" + email + '\'' +
                ", aadhar=" + aadhar +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAadhar(Integer aadhar) {
        this.aadhar = aadhar;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAadhar() {
        return aadhar;
    }
}
