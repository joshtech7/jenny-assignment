import java.time.LocalDate;
public class MenstrualCycleCalculator{
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int menstrualCycle;
    private int periodLength;
    private int previousPeriod;
    public MenstrualCycleCalculator(String firstName, String lastName, int yearOfBirth, int menstrualCycle, int periodLength, int previousPeriod){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.menstrualCycle = menstrualCycle;
        this.periodLength = periodLength;
        this.previousPeriod = previousPeriod;
    }
    public MenstrualCycleCalculator(){

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
   public void setLastName(String lastName){
        this.lastName = lastName;
   }
    public String getLastName(){
        return lastName;
    }
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void setMenstrualCycle(int menstrualCycle){
        this.menstrualCycle = menstrualCycle;
    }
    public int getMenstrualCycle(){
        return menstrualCycle;
    }
    public void setPeriodLength(int periodLength){
        this.periodLength = periodLength;
    }
    public int getPeriodLength(){
        return periodLength;
    }
    public void setPreviousPeriod(int previousPeriod){
        this.previousPeriod = previousPeriod;
    }
    public int getPreviousPeriod(){
        return previousPeriod;
    }
    public int getAge(){
        return 2024 - getYearOfBirth();
    }
    }
