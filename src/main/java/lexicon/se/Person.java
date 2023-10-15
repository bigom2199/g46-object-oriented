package lexicon.se;

public class Person {
    private String firstName;
    private String lastName;
    private int id;
    private String email;
    private AppUser credentials;
    public Person (int id,String firstName,String lastName,String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public AppUser getCredentials(){
        return  credentials;
    }
    public void setCredentials(AppUser credentials){
        this.credentials =credentials;
    }

       public int getId(){
        return id;

       }
          public void setId(){
        this.id=id;
          }
          public String getFirstName(){
        return firstName=firstName;
          }
          public void setFirstName(){
        this.firstName= firstName;
          }
          public  String getLastName(){
        return lastName;
          }
          public void setLastName(){
        this.lastName =lastName;
          }
 public String getEmail(){
        return email;
 }
            public void setEmail(){
        this.email= email;
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
       public String getSummary(){
        return this.toString();

       }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ",firstName =" + firstName + '\'' +
                ",lastName = ' " + lastName + '\'' +
                " ,email = ' " + email + '\'' +
                '}';



    }


}













