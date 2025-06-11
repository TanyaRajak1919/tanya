import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehadling {
    public static void main(String[] args) {
        try {
            File file = new File("new text");

            if (file.createNewFile()) {
                System.out.println("File created:" + file.getName());

            } else {
                System.out.println("File already exits");

            }
        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }
}

class WriteTofile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("new.txt");
            writer.write("Hello,this is a test message written to the file");
            writer.close();
            System.out.println("Sucessesfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();

        }

    }
}

class ReadFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("new.txt");
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);

            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error Occured");
            e.printStackTrack();

        }

    }

}

class ArrayInsertExample {
    public static void main(String[] args) {
        // step 1: arraylist created
        ArrayList<Integer> numbers = new ArrayList<>();
        // step 2: Scanner se user se input
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to insert?");
        int n = sc.nextInt();
        // step 3: loop me values insert karo
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number" + (i + 1) + ":");
            int value = sc.nextInt();
            numbers.add(value);
        }
        // step 4 : print inserted values
        System.out.println("Instered numbers:" + numbers);
    }
}
