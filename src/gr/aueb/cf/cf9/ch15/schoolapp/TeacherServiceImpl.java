package gr.aueb.cf.cf9.ch15.schoolapp;

public class TeacherServiceImpl implements ITeacherService {

    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println("Teacher added syccessfully!");
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        System.out.println("Teacher updated successfully!");

    }

    @Override
    public void removeTeacher(long id) {
        System.out.println("Teacher removed successfully!");

    }

    @Override
    public Teacher getTeacherById(long id) {
        return new Teacher(1L, "Maria" , "Nikolaidi");
    }

    @Override
    public Teacher[] getAllTeachers() {

        return new Teacher[] {
                new Teacher(1L, "Athanasios", "Androutsos"),
                new Teacher(2L, "Theodora" , "Trigka"),
                new Teacher(3L, "Panagiota" , "Tounta"),
                new Teacher(4L, "Miltiadis" , "Tountas")
        };

    }
}
