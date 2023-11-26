package dyj.study.mediator.example;

public class UnitedNationsSercurtityCouncil extends UnitedNations{
    private USA country1;
    private Iraq country2;

    public void setCountry1(USA country1) {
        this.country1 = country1;
    }

    public void setCountry2(Iraq country2) {
        this.country2 = country2;
    }

    @Override
    public void declare(String message, Country country) {
        if(country == country1){
            country2.getMessage(message);
        }else {
            country1.getMessage(message);
        }
    }
}
