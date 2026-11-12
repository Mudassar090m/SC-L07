package task4;

import java.util.Comparator;

/** External ordering (separate class): descending by cgpa. */
public class CgpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        // b first, then a, so the HIGHER cgpa comes first.
        return Double.compare(b.getCgpa(), a.getCgpa());
    }
}
