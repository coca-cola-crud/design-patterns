package dyj.study.property;

public interface ICloneable {
    public Object copy() throws CloneNotSupportedException;
    public void setPersonalInfo(String sex,String age);
    public void setWorkExperience(String timeArea,String company);
    public void Display();
}
