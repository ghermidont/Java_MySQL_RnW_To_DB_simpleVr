package DBAppVr3F;

// доделайте код классов так чтобы main()
// создал и запомнил 3 студентов
// показал список
// удалил бы 1 - го
// и заново показал бы список

public class DBApp {

    public static void main(String[] args) {

        StudentEntityManager StudentManager = new StudentEntityManager();
        //StudentManager.add(new Student(1, "Mike", "Williams", 1982, 8.7F));
        //StudentManager.add(new Student(2, "John", "Witch", 1935, 4.5F));
        //Student s3 = new Student(3, "Jake", "Smith", 1955, 7.2F);
        //StudentManager.add(s3);

        System.out.println(StudentManager.displayDbRecords());

        //StudentManager.delete(s3);

        //System.out.println(StudentManager.displayDbRecords());
    }

}









