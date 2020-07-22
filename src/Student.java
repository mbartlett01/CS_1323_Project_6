/**
 * A class that can manage students in a school and their fees
 * 
 * @author Michael
 * @version 1.0
 */
public class Student
{

    /**
     * Declare all the variables as mentioned in the UML
    **/
	private int id;
	private String name;
	private int feesPaid;
	private int feesTotal;
	private char grade;

    /**
     * Write the constructor as given in the UML
    **/
	public Student(int initId, String initName, int initFeesPaid)
	{
		//Pass the constructor variables into the private class variables
		id = initId;
		name = initName;
		feesPaid = initFeesPaid;
		feesTotal = 30000;
	}
	

    /**
     * return the number of id of the student
     * 
     * @return the id of the student
    **/
	public int getId()
	{
		//Return the private class variable id
		return id;
	}


    /**
     * add a student's id to the school
     * 
     * @param newId the new id of the student
    **/
	public void setId(int newId)
	{
		//Set the class variable based on the input variable
		id = newId;
	}


    /**
     * return the name of the student in the school
     * 
     * @return the name of the student
    **/
	public String getName()
	{
		//Return the private class variable name
		return name;
	}


    /**
     * add the student name to the school
     * 
     * @param newName the new name of the student
    **/
	public void setName(String newName)
	{
		//Set the class variable name based on the input variable
		name = newName;
	}

    /**
     * return the fees paid by the student
     * 
     * @return the fees paid by the student
    **/
	public int getFeesPaid()
	{
		//Set the class variable feesPaid based on the input variable
		return feesPaid;
	}

	/**
	 * return the total fees of the student
	 * 
     * @return the total fees of the student
    **/
	public int getFeesTotal()
	{
		//Return the private class variable feesTotal
		return feesTotal;
	}


    /**
     *
     * @return the grade of the student.
    **/
	public char getGrade()
	{
		//Return the private class variable grade
		return grade;
	}

	
    /**
     * Used to update the student's grade.
     * @param newGrade new grade of the student.
    **/
	public void setGrade(char newGrade)
	{
		//Set the class variable based on the input variable
		grade = newGrade;
	}

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     *
     * @param fees the fees that the student pays.
    **/
	public void payfees(int fees)
	{
		//Add the fees paid to the feesPaid counter variable
		feesPaid += fees;
	}

    /**
     *
     * @return the remaining fees.
    **/
	public int getRemainingFees()
	{
		return feesTotal - feesPaid;
	}

    /**
     * Display method
    **/
    public String displayInfo()
    {
        return "Name of the Student: " + name +
                " Remaining fees to be paid: $" + getRemainingFees();
    }
}
