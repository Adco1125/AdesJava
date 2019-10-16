package charremover;
import java.util.*;

public class CharRemover {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        
        String statement;
        
        System.out.print("Statement to be Printed: ");
        
        statement = console.nextLine();
        
        for(int x = 0; x<3; x++){
            statement = statement.replaceFirst("([M,m])","");
        }
     
        System.out.print("\nCourse Name: ");
        System.out.print(statement);
    }   
}
