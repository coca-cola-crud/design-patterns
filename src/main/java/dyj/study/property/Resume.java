package dyj.study.property;

public class Resume implements ICloneable{
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;
    public Resume(String name){
        this.name = name;
        work = new WorkExperience();
    }


    @Override
    public Resume copy() throws CloneNotSupportedException {
        Resume resume = new Resume(this.name);
        resume.setPersonalInfo(this.sex,this.age);
        resume.setWorkExperience(this.work);
        return resume;
    }

    @Override
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    @Override
    public void setWorkExperience(String timeArea, String company) {
        work.setWorkDate(timeArea);
        work.setCompany(company);
    }
    public void setWorkExperience(WorkExperience workExperience){
        this.work = workExperience;
    }

    @Override
    public void Display() {
        System.out.println(this.name+this.sex+this.age);
        System.out.println(this.work.getWorkDate()+this.work.getCompany());
    }
}
