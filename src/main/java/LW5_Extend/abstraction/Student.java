package LW5_Extend.abstraction;
public class Student extends Person {
        private int group;
        private int idNumber;

        public Student(String surname, String name, int age, int group, int number){
            super(surname,name,age);
            this.group = group;
            this.idNumber = number;
        }

        public int getGroup() {
            return group;
        }

        public void setGroup(int group) {
            this.group = group;
        }

        public int getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(int idNumber) {
            this.idNumber = idNumber;
        }

        @Override
        public String printInfo(){
            return "Student group "+group+" "+surname+" "+name+", age: "+age+".student ID number: "+ idNumber;
        }
    }
