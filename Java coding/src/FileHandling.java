import java.io.*;
// import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        // Code to create a new file
        /* 
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
        */


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
