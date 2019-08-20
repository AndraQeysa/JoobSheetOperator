package praktikum1;

public class Datadiri {
    
    public static void main (String [] asgr) {
        // Data
        String name, address, hobby, hair_color, birth, status, grade;
        char gender;
        int age, weight, high;
                
        //Input
        name = "Shevandra Qeysa Adifaputra";
        gender = 'M';
        age = 16;
        weight = 42;
        high = 172;
        hair_color = "Black";
        hobby = "Read, Listening music, and Playing some stories game";
        birth = "22 November 2003, Jombang, East Java, Java, Indonesia";
        status = "Student";
        grade = "X RPL";
        
        //Print
        System.out.println ("Name: " + name);
        System.out.println ("Gender: " + gender);
        System.out.println ("Age: " + age + " Years old");
        System.out.println ("Weight: " + weight + "Kg");
        System.out.println ("High: " + high + "Cm");
        System.out.println ("Hair_color: " + hair_color);
        System.out.println ("Hobby: " + hobby);
        System.out.println ("Birth: " + birth);
        System.out.println ("Grade: " + grade);
        System.out.println ("Status: " + status);
    }
}