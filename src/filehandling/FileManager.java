package filehandling;

import java.io.*;

public class FileManager {

    public void saveData(Object object, String fileName) {

        try {

            File folder = new File("data");

            if (!folder.exists()) {
                folder.mkdir();
            }

            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream(fileName)
                    );

            out.writeObject(object);
            out.close();

            System.out.println("Data saved successfully.");

        } catch (IOException e) {

            System.out.println(
                    "Error saving data: "
                            + e.getMessage()
            );
        }
    }

    public Object loadData(String fileName) {

        try {

            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream(fileName)
                    );

            Object object = in.readObject();

            in.close();

            System.out.println("Data loaded successfully.");

            return object;

        } catch (IOException | ClassNotFoundException e) {

            System.out.println(
                    "Error loading data: "
                            + e.getMessage()
            );
        }

        return null;
    }
}