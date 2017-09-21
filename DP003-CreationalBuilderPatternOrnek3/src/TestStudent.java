import java.util.Arrays;

public class TestStudent {

    public static void main(String[] args) {

        Student s = new Student.Builder()
			.name("mkyong")
			.age(18)
			.language(Arrays.asList("chinese","english"))
			.build();

        System.out.println(s);
    }

}