package tr.com.testautomation;

public class SoftwareTask extends Task {

    public SoftwareTask(String taskName, Personnel assignee) {
        super(taskName, assignee);
    }

    @Override
    public void changeTask() {
        super.changeTask();
        System.out.println(getTaskName());
    }

    @Override
    public void taskSucceed() {
        System.out.println(getTaskState());
    }
}
