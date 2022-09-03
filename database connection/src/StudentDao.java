import java.util.*;
import java.sql.SQLException;


public interface StudentDao {
	public int add(Student std)
		throws SQLException;
	public void delete(int stId)
		throws SQLException;
	public Student getStudent(int stId)
		throws SQLException;
	public List<Student> getStudent()
		throws SQLException;
	public void update(Student std)
		throws SQLException;

}
