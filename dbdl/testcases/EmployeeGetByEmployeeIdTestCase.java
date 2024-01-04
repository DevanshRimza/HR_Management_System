import com.thinking.machines.hr.dl.exceptions.*;
import com.thinking.machines.enums.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.dao.*;
import java.util.*;
import java.text.*;
public class EmployeeGetByEmployeeIdTestCase
{
public static void main(String gg[])
{
String employeeId=gg[0];
try
{
EmployeeDAOInterface employeeDAO;
employeeDAO=new EmployeeDAO();
EmployeeDTOInterface employeeDTO;
employeeDTO=employeeDAO.getByEmployeeId(employeeId);
SimpleDateFormat simpleDateFormat;
simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
System.out.println("Employee Id : " +employeeDTO.getEmployeeId());
System.out.println("Name : " +employeeDTO.getName());
System.out.println("Designation Code : " +employeeDTO.getDesignationCode());
System.out.println("Date of birth : " +employeeDTO.getDateOfBirth());
System.out.println("Gender : " +employeeDTO.getGender());
System.out.println("IsIndian : " +employeeDTO.getIsIndian());
System.out.println("Basic Salary : " +employeeDTO.getBasicSalary());
System.out.println("PAN Number : " +employeeDTO.getPANNumber());
System.out.println("Aadhar card Number : " +employeeDTO.getAadharCardNumber());
System.out.println("************************************************");
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}