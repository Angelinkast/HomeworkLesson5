public class Worker {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Worker(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void methodToPrint() {
        System.out.println(this.name + " " + this.position + " " + this.email + " " + this.phone + " " + this.salary + " " + this.age);
    }

//    public String array() {
//        Worker[] persArray = new Worker[5];
//        persArray[0] = new Worker("Ivan Slepakov", "Lead Engineer", "ivanEng@gmail.com", "+12019733211", 930, 45);
//        persArray[1] = new Worker("Regina Fox", "QA", "reginaFox@gmail.com", "+72019988989", 500, 43);
//        persArray[2] = new Worker("Lisa Boston", "FE engineer", "lisa.biston@gmail.vom", "+13455665454", 710, 29);
//        persArray[3] = new Worker("Dan Sweetheart", "BE Dev", "dan.sw@gmail.com", "+12033455454", 780, 38);
//        persArray[4] = new Worker("Angie Alvidres", "QA", "angelina.al@gmail.com", "+78900989898", 520, 27);
//        for (int i = 0; i < persArray.length; i++) {
//            if (age > 40) {
//                System.out.println(persArray[i]);
//            }
//        }
//    }
}
