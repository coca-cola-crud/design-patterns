package dyj.study.composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company{
    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        company.remove(company);
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
        for (Company company : children) {
            company.display(depth+2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : children) {
            company.lineOfDuty();
        }
    }
}
