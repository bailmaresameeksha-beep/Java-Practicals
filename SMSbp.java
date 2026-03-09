class Student
{
    int id
    String name
    double marks

    method display()
}

class Management
{
    ArrayList<Student> students

    method addStudent()
    method displayStudents()
    method searchStudent(int id)
    method updateStudent(int id)
    method deleteStudent(int id)
}

class SMS
{
    method main()
    {
        create Scanner object
        create Management object

        while(true)
        {
            display menu:
                1. Add Student
                2. Display Students
                3. Search Student
                4. Update Student
                5. Delete Student
                6. Exit

            take user input choice

            switch(choice)
            {
                case 1:
                    call addStudent()
                    break

                case 2:
                    call displayStudents()
                    break

                case 3:
                    call searchStudent()
                    break

                case 4:
                    call updateStudent()
                    break

                case 5:
                    call deleteStudent()
                    break

                case 6:
                    exit program
            }
        }
    }
}