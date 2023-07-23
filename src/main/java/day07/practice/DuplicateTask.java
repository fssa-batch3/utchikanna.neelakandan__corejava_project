package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class DuplicateTask {

    private int id;
    private String name;
    private LocalDate deadline;

    public DuplicateTask(String name, int id,String date) {
        this.name = name;
        this.id = id;
        this.deadline = LocalDate.parse(date);
    }

    

    @Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", deadline=" + deadline ;
	}


    @Override
	public int hashCode() {
		return Objects.hash(deadline, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DuplicateTask other = (DuplicateTask) obj;
		return Objects.equals(deadline, other.deadline) && id == other.id && Objects.equals(name, other.name);
	}



	public static void main(String[] args) {
        ArrayList<DuplicateTask> arr = new ArrayList <> ();
        DuplicateTask task1 = new DuplicateTask("Car Wash",1,"2011-09-01");
        DuplicateTask task4 = new DuplicateTask("Car Wash",4,"2011-09-01");
        DuplicateTask task2 = new DuplicateTask("Shopping",3,"2012-05-15");
        DuplicateTask task3 = new DuplicateTask("Haircut",5,"2013-02-24");
        arr.add(task1);
        arr.add(task2);
        arr.add(task3);
        arr.add(task4);

        HashSet<DuplicateTask> distinctTask = new HashSet<>(arr);

        for (DuplicateTask i: distinctTask) {
            System.out.println(i);
        }

    }
}