public class Main {

    public static void main(String[] args) {
            Worker[] workers = {
          new Worker("Ivan Slepakov", "Lead Engineer", "ivanEng@gmail.com", "+12019733211", 930, 45),
          new Worker("Regina Fox", "QA", "reginaFox@gmail.com", "+72019988989", 500, 43),
          new Worker("Lisa Boston", "FE engineer", "lisa.biston@gmail.vom", "+13455665454", 710, 29),
          new Worker("Dan Sweetheart", "BE Dev", "dan.sw@gmail.com", "+12033455454", 780, 38),
          new Worker("Angie Alvidres", "QA", "angelina.al@gmail.com", "+78900989898", 520, 27)};
            int age = 40;
            for (Worker worker : workers) {
                if (worker.age > 40) {
                    worker.methodToPrint();
                    System.out.println();
                }
            }
        }
    }
