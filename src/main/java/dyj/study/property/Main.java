package dyj.study.property;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("大鸟");
        resume.setPersonalInfo("男","29");
        resume.setWorkExperience("1998-2000","XX公司");
        Resume resume1 = (Resume) resume.copy();
        resume1.setWorkExperience("1998-2006","YY企业");
        Resume resume2 = (Resume) resume.copy();
        resume2.setPersonalInfo("男","24");
        resume2.setWorkExperience("1998-2003","ZZ企业");
        resume.Display();
        resume1.Display();
        resume2.Display();
    }
}
