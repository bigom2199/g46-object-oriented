package lexicon.se;

public class AppUser {
    private String username;
    private String password;
    private AppRole role;
      public AppUser(String username,String password,AppRole role) {
          setUsername(username);
          setPassword(password);
          setRole(role);
          this.password = password;
          this.username= username;
          this.role = role;
      }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setUsername(String username) {
          if (username.isEmpty()){
              throw new IllegalArgumentException("username can not be empty!");
          }

        this.username = username;
    }

    public void setPassword(String password) {
          if (password.isEmpty()){
              throw new IllegalArgumentException("password can not be empty!");
          }

        this.password = password;
    }

    public void setRole(AppRole role) {
          if (password== null()){
              throw new IllegalArgumentException("role can not be null!");
          }

        this.role = role;
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

