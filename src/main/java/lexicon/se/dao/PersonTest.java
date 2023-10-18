package lexicon.se.dao;

import com.sun.org.apache.xpath.internal.operations.Equals;
import lexicon.se.Person;

public class PersonTest {
       Person getExample(){

           return new Person(1,"FirstName","lastName","email");
       }


         void setFirstName() {
             NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
                 Person person = getExample() {
                     person.setFirstName();
                 }
                 assertEquals("first name can not be null!", thrown.getMessage());
             });

             void setLastName () {
                 NullPointerException thrown = Assertion.assertThrows(NullPointerException.class, () -> {
                     Person person = getExample();
                     person.setLastName();
                     assert Equlas("last name can not be null!", thrown.getMessage());
                 });


                 void setEmail() {
                     NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
                         Person person = getExample();
                         person.setEmail();
                         assert Equals("email can not be null!", thrown.getMessage());

                     });

                 }
             }
         }
       }