package lexicon.se;

public class AppUserTest {


    AppUser getExample(){
        return new AppUser("user","password",AppRole.ROLE_APP_USER);
    }
     public void setUsername(){
        AppUser user = getExample();
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class,() ->{
            user.setUsername(null);
        });
        IllegalArgumentException thrown2 = Asserrtions.assertThrows(IllegalArgumentException.class,() -> {
            user.setUsername();
        });
        assertEquals("username can not be null!",thrown.getMessage());
        assertEquals("username can not be empty!",thrown2.getMessage());
     }
     public  void setPassword(){

        AppUser user = getExample();
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class,() -> {
            user.setPassword(null);
        });
        IllegalArgumentException thrown2 =Assertions.assertThrows(IllegalArgumentException.class,() ->{
            user.setPassword();

        });
        assertEquals("password can not be null!",thrown.getMessage());
        assertEquals("password can not be empty!",thrown2.getMessage());

         }



        public void setRole(){
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () ->{
            AppUser user = getExample();
            user.setRole(null);
        });
        assertEquals("role can not be null!",thrown.getMessage());
        }




}
