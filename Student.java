
public class Student {
    public String name;
    public char grade;
    public char group;

    public String secretNickName;

    public Student( String name,
                    char grade,
                    char group,
                    String secretNickName)
    {
        this.name           = name;
        this.grade          = grade;
        this.group          = group;
        this.secretNickName = secretNickName;
    }
}

class gettersAndSetters {
    public static String getName(Student theStudent) {
        return theStudent.name;
    }
    public static char getGrade(Student theStudent) {
        return theStudent.grade;
    }

    public static void changeGrade(Student theStudent,int increment){
        int gradeInt = theStudent.grade - 'A' + increment;

        if(gradeInt >=0 && gradeInt < 6) theStudent.grade = (char) ('A' + gradeInt);
    }

    public static void upgrade(Student theStudent) {
        changeGrade(theStudent, -1);
    }

    public static void downgrade(Student theStudent) {
        changeGrade(theStudent, +1);
    }
}

class studentStuff {
    public static void main(String[] args) {
        //Student aStudent;

        Student aStudent =  new Student("John", 'C', '2', "Johny");
        Student bStudent =  new Student("Jim", 'A', '3', "Jimmy");
        Student cStudent =  new Student("Fred", 'F', '5', "Freddy");

        System.out.println( aStudent.name + " " +
                            aStudent.grade + " " +
                            aStudent.group + " " +
                            aStudent.secretNickName );

        System.out.println( "> " + gettersAndSetters.getName(aStudent));

        System.out.println( "> " + gettersAndSetters.getGrade(aStudent));

        gettersAndSetters.upgrade(aStudent); System.out.println( "up> " + gettersAndSetters.getGrade(aStudent));
        gettersAndSetters.upgrade(aStudent); System.out.println( "up> " + gettersAndSetters.getGrade(aStudent));
        gettersAndSetters.upgrade(aStudent); System.out.println( "up> " + gettersAndSetters.getGrade(aStudent));

        gettersAndSetters.downgrade(aStudent); System.out.println( "down> " + gettersAndSetters.getGrade(aStudent));
        gettersAndSetters.downgrade(aStudent); System.out.println( "down> " + gettersAndSetters.getGrade(aStudent));
        gettersAndSetters.downgrade(aStudent); System.out.println( "down> " + gettersAndSetters.getGrade(aStudent));
        gettersAndSetters.downgrade(aStudent); System.out.println( "down> " + gettersAndSetters.getGrade(aStudent));
        gettersAndSetters.downgrade(aStudent); System.out.println( "down> " + gettersAndSetters.getGrade(aStudent));
        gettersAndSetters.downgrade(aStudent); System.out.println( "down> " + gettersAndSetters.getGrade(aStudent));

    }
}
