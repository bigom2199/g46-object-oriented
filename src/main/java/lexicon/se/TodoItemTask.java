package lexicon.se;

public class TodoItemTask {
    private Person assignee;
    private boolean assigned;
    private TodoItem todoItem;
    private int id;

    public TodoItemTask(Person assignee, TodoItem todoItem, boolean assigned, int id) {
        this.todoItem = todoItem;
        this.id = id;
        this.assigned = assigned;

    }

    public Person getAssignee() {
        return assignee;
    }


    public boolean isAssigned() {
        return assigned;
    }

    public boolean setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }


    public void setTodoItem() {
        this.todoItem = todoItem;
    }

      public void setAssignee(Person assignee){
        this.assignee =assignee ;
        this.assignee = assignee;
      }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "assignee=" + assignee +
                ", assigned=" + assigned +
                ", todoItem=" + todoItem +
                ", id=" + id +
                '}';
    }
}













