package lexicon.se;

import java.time.LocalDate;

public class TodoItemTaskTest {
    TodoItemTask getExample(){
        return  new TodoItemTask(1,false, new TodoItem(1,"Test Title",null);

    }
    @Test
    public void isAssigned(){
        TodoItemTask itemTask = getExample();

        itemTask.setAssignee(null);
        assertFalse(itemTask.isAssigned());
        itemTask.setAssignee(new Person(1,"firstName","lastName","email"));
        assertTrue(itemTask.isAssigned());
    }


    public void setTodoItem(){
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class,() -> {
            TodoItemTask itemTask = getExample();
            itemTask.setTodoItem();
        });
        assertEquals("todoItem can not be null!",thrown.getMessage());
    }

}
