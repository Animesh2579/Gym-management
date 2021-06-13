
package gymmanagement.app;

public class UserSignUp 
{
    private int regNo;
    private String userId;
    private String name;
    private String contactNo;
    private String emailId;
    private String gender;
    private String password;
    private String address;
    private float height;
    private float weight;
    private String dob;

    public UserSignUp() {
    }

    public UserSignUp(String userId, String name, String contactNo, String emailId, String gender, String password, String address, float height, float weight, String dob) {
        
        this.userId = userId;
        this.name = name;
        this.contactNo = contactNo;
        this.emailId = emailId;
        this.gender = gender;
        this.password = password;
        this.address = address;
        this.height = height;
        this.weight = weight;
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
}
