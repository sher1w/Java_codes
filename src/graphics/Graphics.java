import java.io.*;

class ReadStudentFile {

    public static void main(String[] args) {
        DataInputStream dis = null;

        try {
            // Open the file for reading
            dis = new DataInputStream(new FileInputStream("student.dat"));

            // Keep reading records until the end of the file
            while (true) {
                try {
                    // Read the student data from the file
                    int rollNumber = dis.readInt();
                    String name = dis.readUTF();
                    double marks = dis.readDouble();

                    // Print the student details
                    System.out.println("Roll Number: " + rollNumber);
                    System.out.println("Name: " + name);
                    System.out.println("Marks: " + marks);
                    System.out.println("----------------------");

                } catch (EOFException e) {
                    // End of file reached
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            // Close the input stream
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}
