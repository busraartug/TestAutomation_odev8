package tr.com.testautomation;

import java.util.ArrayList;

public class Company {
    public enum RemovePersonnelResult {
        SUCCESS,
        NOT_FOUND,
        TEAM_LEADER
    }

    private final String companyName;
    private ArrayList<Personnel> personels;

    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        personels = new ArrayList<>();
        departments = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public ArrayList<Personnel> getPersonels() {
        return personels;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void addPersonnel(Personnel personnel) {
        this.personels.add(personnel);
    }

    public RemovePersonnelResult removePersonnel(Personnel personnel) {
        this.personels.remove(personnel);
        RemovePersonnelResult result = RemovePersonnelResult.NOT_FOUND;
        for (Department department : departments) {
            if (result == RemovePersonnelResult.NOT_FOUND) {
                if (department.getTeamLead() == personnel) {
                    result = RemovePersonnelResult.TEAM_LEADER;
                } else if (department.getPersonnelList().contains(personnel)) {
                    department.getPersonnelList().remove(personnel);
                    result = RemovePersonnelResult.SUCCESS;
                }
            }
        }
        return result;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }
}
