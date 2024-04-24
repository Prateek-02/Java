import java.io.*;
// import java.util.Scanner;

// 1
/*
public class FileHandling {
    public static void main(String[] args) {

        // Code to create a new file
        File myFile =  new File("test.txt");
        try{
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("Unable to create the file");
            e.printStackTrace();
        }
        

        //Code to write into a file
        try {
            FileWriter myFileWriter = new FileWriter("test.txt");
            myFileWriter.write("Namaste Duniya!!\nOk now byee");
            myFileWriter.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        


        // Reading a FILE
        File myfile = new File("test.txt");
        try{
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        


        // Deleting a file

        File myFile = new File("test.txt");
        if(myFile.delete()){
            System.out.println("File: "+myFile.getName()+" deleted!");
        }
        else{
            System.out.println("Some error occured while deleteing the file");
        }
    }
}
*/


// 2

public class FileHandling {
    public static void main(String[] args) {
        /*
        File myfile = new File("test2.txt");
        try{
            myfile.createNewFile();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        

        // Write into file

        try{
            FileWriter myfile = new FileWriter("test2.txt");
            myfile.write("Namste Duniyaa!!!");
            myfile.close();
        }
        
        catch(IOException e){
            e.printStackTrace();
        }
        

        // Read from file

        File myfile = new File("test2.txt");
        try{
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        */

        // Deleting a file

        File myFile = new File("test2.txt");
        if(myFile.delete()){
            System.out.println("File: "+myFile.getName()+" deleted");
        }
        else{
            System.out.println("Some error occured");
        }

    }
}

