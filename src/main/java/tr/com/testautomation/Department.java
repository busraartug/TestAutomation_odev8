package tr.com.testautomation;

import java.util.ArrayList;

public class Department {

    private Personnel teamLead;

    private ArrayList<Personnel> personnelList;
    private ArrayList<Personnel> assignmentList;

    private ArrayList<SoftwareTask> softwareTaskList;

    public Department(Personnel teamLead) {
        this.teamLead = teamLead;
        this.assignmentList = new ArrayList<>();
        this.personnelList = new ArrayList<>();
    }

    public void changeTeamLead(Personnel personnel) {
        this.teamLead = personnel;
    }

    public Personnel getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Personnel teamLead) {
        this.teamLead = teamLead;
    }

    public ArrayList<Personnel> getPersonnelList() {
        return personnelList;
    }

    public void setPersonnelList(ArrayList<Personnel> personnelList) {
        this.personnelList = personnelList;
    }

    public ArrayList<Personnel> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(ArrayList<Personnel> assignmentList) {
        this.assignmentList = assignmentList;
    }

    public void addPersonel(Personnel personnel) throws Exception {
        if (teamLead == null)
            throw new Exception("lt isn't contain TeamLead");
        personnelList.add(personnel);
    }

    public ArrayList<SoftwareTask> getTaskList() {
        return softwareTaskList;
    }

    public void createTask(Personnel personnel) {
        SoftwareTask softwareTask = new SoftwareTask("Task-" + softwareTaskList.size(), personnel);
        softwareTaskList.add(softwareTask);
        System.out.println(softwareTask.getTaskName());
    }

}
