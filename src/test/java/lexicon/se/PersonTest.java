package lexicon.se;

public class PersonTest {
    Person getExample() {

        return new Person(1, "FirstName", "lastName", "email");
    }


    public void setFirstName() {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            Person person = getExample();
            person.setFirstName();

        });
        assertEquals("first name can not be null!", thrown.getMessage());
    }


    public void setLastName() {
        NullPointerException thrown = Assertion.assertThrows(NullPointerException.class, () -> {
            Person person = getExample();
            person.setLastName();
            assertEquals("last name can not be null!", thrown.getMessage());
        });


        void setEmail () {
            NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
                Person person = getExample();
                person.setEmail();
            });
            assertEquals("email can not be null!", thrown.getMessage());


        }


    }