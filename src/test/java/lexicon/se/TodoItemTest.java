package lexicon.se;

public class TodoItemTest {
    TodoItem getExample(){
        return  new TodoItem(1,"Test Todo",null,false,null);
    }
    public void setTitle(){
        TodoItem item = getExample();
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class,() ->{
            item.setTitle(null);
        });
        IllegalArgumentException thrown2 = assertion.assertThrows(IllegalArgumentException.class,() ->{
            item.setTitle("");
        });
        assertEquals("title can not be null!",thrown.getMessage());
        assertEquals("title is not empty!",thrown2.getMessage());
    }
    public void setDeadLine(){
        TodoItem item = getExample();
        NullPointerException thrown =  Assertions.assertThrows(NullPointerException.class,() -> {
            item.setDeadLine();
        });
        assertEquals("deadLine can not be null!",thrown.getMessage());
    }
}
