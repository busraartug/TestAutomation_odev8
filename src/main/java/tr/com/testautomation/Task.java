package tr.com.testautomation;

public abstract class Task {
    public enum TaskState {
        UNDONE,
        DONE
    }

    private String taskName;
    private Personnel asignee;
    private TaskState taskState;

    public Task(String taskName, Personnel assignee) {
        this.taskName = taskName;
        this.asignee = assignee;
        this.taskState = TaskState.UNDONE;
    }

    public String getTaskName() {
        return taskName;
    }

    public Personnel getAsignee() {
        return asignee;
    }

    public TaskState getTaskState() {
        return taskState;
    }



    public void changeTask(){
        System.out.println(getAsignee());
    }

    public abstract void taskSucceed();
}
