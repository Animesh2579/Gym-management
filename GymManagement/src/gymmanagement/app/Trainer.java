
package gymmanagement.app;

public class Trainer 
{
    private int trainerId;
    private String trainerName;
    private String trainerAge;
    private String trainerGender;
    private String trainerType;
    private String salary;

    public Trainer() {
    }

    public Trainer(String trainerName, String trainerAge, String trainerGender, String trainerType, String salary) {
        
        this.trainerName = trainerName;
        this.trainerAge = trainerAge;
        this.trainerGender = trainerGender;
        this.trainerType = trainerType;
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerAge() {
        return trainerAge;
    }

    public void setTrainerAge(String trainerAge) {
        this.trainerAge = trainerAge;
    }

    public String getTrainerGender() {
        return trainerGender;
    }

    public void setTrainerGender(String trainerGender) {
        this.trainerGender = trainerGender;
    }

    public String getTrainerType() {
        return trainerType;
    }

    public void setTrainerType(String trainerType) {
        this.trainerType = trainerType;
    }
    
    
}
