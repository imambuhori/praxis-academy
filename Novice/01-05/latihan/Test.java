import java.io.*;
class Contoh implements java.io.Serializable{

    public int a;
    public String b;

    //default constructor
    public Contoh(int a, String b){
        this.a = a;
        this.b = b;
    }
}

class Test{
    public static void main(String[] args){

        Contoh object = new Contoh(1, "Geeksforgeeks");
        String filename = "file.ser";

        //Serialization
        try{
            //saving of object in a life
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            //method for serialization of object 
            out.writeObject(object);

            out.close();
            file.close();
            
            System.out.println("Object has been serialization");
            }

        catch(IOException ex){
            System.out.println("IOException is caught");
        }

        Contoh object1 = null;
        try{
            //reading the object form a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            //method for deseralization
            object1 =(Contoh)in.readObject();

            in.close();
            file.close();

            System.out.println("Objec has been deseralization ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }
        
        catch(IOException ex){
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex){
            System.out.println("ClassNotfoundException is caught");
        }
    }
}