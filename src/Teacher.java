
public class Teacher
{

    /**
     * Declare all the variables as mentioned in the UML
    **/
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;


    /**
     * Write the constructor as given in the UML
     *
    **/
	public Teacher(int id, String name, int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


    /**
     * return the number of id of the teacher
     * 
     * @return the id number of the teacher
    **/
	public int getId()
	{
		return id;
	}

    /**
     * add a teacher's id to the school
     * 
     * @param id the new id number
    **/
	public void setId(int id)
	{
		this.id = id;
	}

    /**
     * return the name of the teachers in the school
     * 
     * @return the name of the teacher
    **/
	public String getName()
	{
		return name;
	}

    /**
     * add the teacher name to the school
     * 
     * @param name the new name of the teacher
    **/
	public void setName(String name)
	{
		this.name = name;
	}


    /**
     * return the salary of the teachers in the school
     * 
     * @return the salary of the teacher
    **/
	public int getSalary()
	{
		return salary;
	}


    /**
     * add the salary of teacher to the school
     * 
     * @param salary the new salary of the teacher
    **/
	public void setSalary(int salary)
	{
		this.salary = salary;
	}


    /**
     * Adds to salaryEarned.
     * Removes from the total money earned by the school.
     * @param salary the amount paid to the teacher
    **/
	public void receiveSalary(int salary)
	{
		salaryEarned += salary;
	}


    /**
     * Display method
    **/

    public String displayInfo()
    {
        return "Name of the teacher: " + name +
                " Total salary earned so far: $" + salaryEarned;
    }
}
