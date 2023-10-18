package lexicon.se.dao;

import lexicon.se.Person;
import lexicon.se.TodoItem;
import lexicon.se.TodoItemTask;

import java.time.LocalDate;

public class TodoItemTaskTest {
       TodoItemTask getExample(){
          return new TodoItemTest(1,false,new TodoItem((1,"Test Title",null,LocalDate.now()));



      }
      void isAssigned(){
           TodoItemTask itemTask = getExample();
           itemTask.setAssignee(null);
           assertFalse(itemTask.isAssigned());

           itemTask.setAssignee(new Person(1,"FirstName","LastName","email"));
           assertTrue(itemTask.isAssigned());
      }


      void setTodoItem() {
          NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
          TodoItemTask itemTask = getExample();
          itemTask.setTodoItem();

           assertEquals("todoItem can not be null!",thrown.getMessage());

      });

    @Override

    public void  hashCodeAndEquals() {
           TodoItemTask item1 = getExample();
           item1.setAssignee(new Person(2,"RandomFirstName","RandomLastName","lexicon@exampl.com"));

           TodoItemTask item2 = getExample();
           item2.setAssigned(true);
           TodoItemTask item3 = new TodoItemTask(3,false,
                   new TodoItem(2,"D Todo item ",null,LocalDate.now().));
           assert Equals(item1,item2);
           assertNotEquals(item1,item3);
           assertEquals(item1.hashCode(),item2.hashCode());
           assertNotEquals(item1.hashCode(),item3.hashCode());

    }
}


    }






