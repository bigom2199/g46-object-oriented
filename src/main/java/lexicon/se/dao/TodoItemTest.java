package lexicon.se.dao;

import com.sun.org.apache.xpath.internal.operations.Equals;
import lexicon.se.TodoItem;

import java.time.LocalDate;

public class TodoItemTest {

    public TodoItemTest(String testTitle, LocalDate now) {
    }

    TodoItem getExample() {
        return new TodoItem(1, "Test Todo", LocalDate.now());
    }

    void setTitle() {
        TodoItem item = getExample();
        NullPointerException thrown = Assertion.assertThrows(NullPointerException.class, () ->);
        item.setTitle(null);
    });
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->);
        item.setTitle("");
        assertEquals("title can not be null!",thrown.getMessage());
}
        void setDeadLine(){
      TodoItem item = getExample();
      NullPointerException thrown = Assertions.assertThrows(NullPointerException.class,() ->);
               item.setDeadLine();
               assert Equals("deadLine can not be null!", thrown.getMessage());
        }

}

