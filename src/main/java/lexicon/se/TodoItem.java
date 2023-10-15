package lexicon.se;

import java.time.LocalDate;

public class TodoItem {

  private String title;
  private String description ;
  private LocalDate deadLine;
  private boolean done;
  private Person creator;
  private  int id;
  public TodoItem(String title,String description,Person creator,boolean done,int id){
       this.creator=creator;
       this.title= title;
       this.done= done;
       this.description= description;
       this.id= id;
  }
     public int getId(){
      return id;
     }
          public void setId(){
      this.id= id;
          }
          public String getTitle(){
      return title;

          }
          public void setTitle(String title){
      if(title.isEmpty()){
          throw new IllegalArgumentException("title is not empty!");
      }
       this.title = title;
          }
       public String getDescription(){
      return description;
       }
       public void setDescription(){
      this.description = description;
       }
        public LocalDate getDeadLine(){
      return deadLine;
        }
         public void setDeadLine(){
      this.deadLine = deadLine;

         }
         public boolean isDone(){
      return done;
         }
          public boolean isOverdue(){
      return  LocalDate.now().isAfter(this.deadLine);
          }


          public void setDone(boolean done){
      this.done = done;

          }
          public Person getCreator(){
      return creator;
          }
           public void setCreator(Person creator){
          this.creator= creator;
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
    public String toString() {
        return "TodoItem{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                ", creator=" + creator +
                ", id=" + id +
                '}';
    }
}











