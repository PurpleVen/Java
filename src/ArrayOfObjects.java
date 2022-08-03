/*
EXP 4
Create a class 'Student' with three data members
which are name, age and address.

The constructor of the class assigns default values name as "unknown", age as
'0' and address as "not available".

It has two members with the same name 'setInfo'.

First method has two parameters for name and age and assigns the same
whereas the second method takes has three parameters
which are assigned to name, age and address
respectively.

Print the name, age and address of 10 students. Hint - Use array of objects.

*/


public class ArrayOfObjects {
    public static void main(String[] args) {
        Student[] obj = new Student[10];
        obj[0] = new Student(19, "Ram", " Lotus Building,Mumbai");
        obj[1] = new Student(19, "Shyam", "June Flats, Mumbai");
        obj[2] = new Student(20, "Monica", "Spring Blues Lane, Mumbai");
        obj[3] = new Student(18, "Diya", "MG Marg, Mumbai");
        obj[4] = new Student(18, "Matt", "Sharjah Park, Mumbai");
        obj[5] = new Student(19, "Latha", "Super M Apartments, Mumbai");
        obj[6] = new Student(19, "Atlee", "Mahatma Gandhi CHS, Mumbai");
        obj[7] = new Student(20, "Larry", "S.V. Building, Mumbai");
        obj[8] = new Student(19, "Miya", "Rose Apartments, Mumbai");
        obj[9] = new Student(19, "Rana", "Shivaji Flats, Mumbai");

        System.out.println("Student 1: ");
        obj[0].display();
        System.out.println("Student 2: ");
        obj[1].display();
        System.out.println("Student 3: ");
        obj[2].display();
        System.out.println("Student 4: ");
        obj[3].display();
        System.out.println("Student 5: ");
        obj[4].display();
        System.out.println("Student 6: ");
        obj[5].display();
        System.out.println("Student 7: ");
        obj[6].display();
        System.out.println("Student 8: ");
        obj[7].display();
        System.out.println("Student 9: ");
        obj[8].display();
        System.out.println("Student 10: ");
        obj[9].display();
        }
       }
        class Student {
        Student(int sage, String n, String add)
            {
                age = sage;
                name = n;
                address = add;
            }
            String name;
            int age;
            String address;
            public Student()
            {
                this.name = "unknown";
                this.age = 0;
                this.address = "not avaliable";
            }
            public void setinfo(int age, String name)
            {
                this.name = name;
                this.age = age;
            }
            public void setinfo(int age, String name, String address)
            {
                this.name = name;
                this.age = age;
                this.address = address;
            }
            public void display() {
                System.out.println("Name = " + name + "  " + "\nAge = " + age + "\nAddress = " + address);
                System.out.println();
            }
        }
