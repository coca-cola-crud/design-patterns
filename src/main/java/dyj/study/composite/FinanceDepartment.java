package dyj.study.composite;

public class FinanceDepartment extends Company{
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        System.out.println("FinanceDepartment can't add company");
    }

    @Override
    public void remove(Company company) {
        System.out.println("FinanceDepartment can't remove company");
    }

    @Override
    public void display(int depth) {
        String str = "-";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < depth; i++) {
            sb.append(str);
        }

        String repeated = sb.toString();
        System.out.println(repeated+name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+" FinanceDepartment lineOfDuty");
    }
}
