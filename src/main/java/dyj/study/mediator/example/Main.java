package dyj.study.mediator.example;

public class Main {
    public static void main(String[] args) {
        UnitedNationsSercurtityCouncil unitedNationsSercurtityCouncil = new UnitedNationsSercurtityCouncil();
        Iraq iraq = new Iraq(unitedNationsSercurtityCouncil);
        USA usa = new USA(unitedNationsSercurtityCouncil);
        unitedNationsSercurtityCouncil.setCountry1(usa);
        unitedNationsSercurtityCouncil.setCountry2(iraq);

        usa.declare("不准研制核武器");
        iraq.declare("没有研制核武器");
    }
}
