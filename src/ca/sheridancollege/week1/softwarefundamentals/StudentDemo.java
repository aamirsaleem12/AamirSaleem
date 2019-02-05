
package ca.sheridancollege.week1.softwarefundamentals;

public class StudentDemo 
{
  private String studentID;
  private String name;
  
  /** my first comment added after branch creation.*/
  

    public StudentDemo(String givenID, String givenName)
  {
      studentID = givenID;
      name = givenName;
      
  }

         public void setStudentID(String givenID)
                 
  {
      studentID=givenID;
  }
 
  public String getStudentID()
  {
      return studentID;
  }

    /**
     * A method to return the student's name
     * @return the name
     */
    public String getName() {
                        return name;
    }

    /**
     * A method to set the student's name
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }
    
}
