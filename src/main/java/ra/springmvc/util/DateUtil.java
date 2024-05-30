package ra.springmvc.util;

import ra.springmvc.model.entity.Student;

import java.text.SimpleDateFormat;

public class DateUtil {

    public static String formatStudentBirthday(Student student) {
        if (student.getBirthday() == null) {
            return "";
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  // Customize format as needed
        return formatter.format(student.getBirthday());
    }
}
