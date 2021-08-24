package Lesson5;

public class Employee {

        protected String FullName;
        protected String Position;
        protected String eMail;
        protected Integer PhoneNumber;
        protected Integer Salary;
        protected Integer Age;

        public Employee(String FullName, String Position, String eMail, int PhoneNumber, int Salary, int Age){

                this.FullName = FullName;
                this.Position = Position;
                this.eMail = eMail;
                this.PhoneNumber = PhoneNumber;
                this.Salary = Salary;
                this.Age = Age;

        }

        public void info() {
                        System.out.println("ФИО: " + FullName + "; Должность: " + Position + "; eMail: " + eMail
                                + "; Номер телефона: " + PhoneNumber + "; Зарплата: " + Salary + "; Возраст: " + Age);
        }


}
