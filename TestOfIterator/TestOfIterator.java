import java.util.Iterator;

public class TestOfIterator {
    public static void main(String[] args) throws Exception {
        Students students = new Students(10);
        for (Student student : students) {
            System.out.println(student.getNumber() + ":" + student.getName());
        }
		
    }
}



class Students implements Iterable<Student> {

	private Student [] students;
	public Students(int size) {
		students = new Student[size];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student("Ñ§Éú" + String.valueOf(i), String.valueOf(i));
		}
	}


    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator();
    }


	private class StudentIterator implements Iterator<Student> {
		private int index = 0;
		
		@Override
		public boolean hasNext() {
			return index != students.length;
		}

		@Override
		public Student next() {
			return students[index++];
		}


	}
}








class Student {
	private String name;
	private String number;

	public Student(String name, String number) {
		setName(name);
		setNumber(number);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}


    @Override
	public String toString(){
		return name + "'s number is " + number; 
	}

}