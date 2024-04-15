import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


// 1
/* 

public class Online5 {
    public static void main(String[] args) {
        
        // Create File

        // File file = new File("test.txt");

        // try{
        //     System.out.println(file.createNewFile());
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        //     System.out.println("Error");
        // }
        

        
        // Read File
        // char arr[] = new char[100];

        // try{
        //     FileReader fileReader = new FileReader("test.txt");
        //     fileReader.read(arr);
        //     System.out.println(arr);

        //     fileReader.close();
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }
        

        // Write into File

        // String data = "New data added to file";

        // try{
        //     FileWriter fileWriter = new FileWriter("test.txt");
        //     fileWriter.write(data);

        //     fileWriter.close();
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }

        // Delete File

        // File file = new File("test.txt");

        // try{
        //     System.out.println(file.delete());
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        //     System.out.println("Error");
        // }
    } 
}
*/


// 2 


public class Online5 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        try{
            System.out.println(file.createNewFile());
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }

        String data = "Good evening";

        try{
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write(data);

            fileWriter.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        char arr[] = new char[100];

        try{
            FileReader fileReader = new FileReader("test.txt");
            fileReader.read(arr);
            System.out.println(arr);

            fileReader.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        try{
            System.out.println(file.delete());
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}

