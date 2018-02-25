package hibernate_mapping;


	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToOne;
	import javax.persistence.PrimaryKeyJoinColumn;
	import javax.persistence.Table;

	@Entity
	@Table(name="student")
public class Student
	{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="student_id")
		private long studentId;
		
		@Column(name="student_name")
		private String studentName;
		
		@Column(name="course_name")
		private String courseName;
		
		
		
		 
		
		@OneToOne(cascade = CascadeType.ALL)
		@PrimaryKeyJoinColumn
		private Address studentAddress;

		public Student()
		{
			super();
		}

		public Student(String studentName, String courseName)
		{
			super();
			this.studentName = studentName;
			this.courseName = courseName;
		}

		public long getStudentId()
		{
			return studentId;
		}

		public void setStudentId(long studentId)
		{
			this.studentId = studentId;
		}

		public String getStudentName()
		{
			return studentName;
		}

		public void setStudentName(String studentName)
		{
			this.studentName = studentName;
		}

		public String getCourseName()
		{
			return courseName;
		}

		public void setCourseName(String courseName)
		{
			this.courseName = courseName;
		}

		public Address getStudentAddress()
		{
			return studentAddress;
		}

		public void setStudentAddress(Address studentAddress)
		{
			this.studentAddress = studentAddress;
		}

		@Override
		public String toString()
		{
			return "\nStudent [studentId=" + studentId + ", studentName=" + studentName + ", courseName=" + courseName
					+ ", studentAddress=" + studentAddress + "]";
		}
		
		

	}


