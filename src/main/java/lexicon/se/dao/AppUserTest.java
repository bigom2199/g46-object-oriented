package lexicon.se.dao;

import lexicon.se.AppRole;
import lexicon.se.AppUser;

public class AppUserTest {
    AppUser getExample() {


        return new AppUser("user", "password", AppRole.ROLE_APP_USER);

        void setUsername () {


            AppUser user = getExample();
            NullPointerException thrown1 = Assertions.assertThrows(NullPointerException.class, () ->);
            user.setUsername(null);
        }
        IllegalArgumentException thrown2 = Asstions.assertThrows(IllegalArgumentException.class, () ->);
        user.setUsername("");
    }

    assertEquals("username can  not  be null!",thrown.getMessage);

    assertEquals("username can not be null!",thrown2.getMessage());

    void setPassword() {
        AppUser user = getExample();
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () ->);
        user.setPassword(null);
    }

    IllegalArgumentException thrown2 = Assertions.assertThrows(IllegalArgumentException.class, () ->);
      user.setPassword();

    assertEquals("password can not be null!",thrown.getMessage());


     void setAppRole(){
         NullPointerException thrown = Assertion.assertThrows(NullPointerException.class,() ->);
         AppUser user = getExample();
         user.setRole(null);
         assertEquals("role can not be null!",thrown.getMessage());
     }


}

