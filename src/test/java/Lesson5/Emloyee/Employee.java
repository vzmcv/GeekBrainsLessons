package Lesson5.Emloyee;

public class Employee {

         String FullName;
         String Position;
         String eMail;
         Integer PhoneNumber;
         Integer Salary;
         Integer Age;

        public Employee(String FullName, String Position, String eMail, int PhoneNumber, int Salary, int Age){

                this.FullName = FullName;
                this.Position = Position;
                this.eMail = eMail;
                this.PhoneNumber = PhoneNumber;
                this.Salary = Salary;
                this.Age = Age;

        }

        public void info() {
                if(this.Age>40)
                        System.out.println("ФИО: " + FullName + "; Должность: " + Position + "; eMail: " + eMail
                                + "; Номер телефона: " + PhoneNumber + "; Зарплата: " + Salary + "; Возраст: " + Age);
        }


}
