package CaseStudy03;

interface AdminService
{
	void createAdmin(Admin admin);
	void print();
	//void updateAdmin();
	//void readAdmin();
	//void deleteAdmin();
	
	

}

class Admin
{
	int adminId;
	String emailId;
	String firstName;
	String lastName;
	String password;
	
	Admin(){}

	public Admin(int adminId, String emailId, String firstName, String lastName, String password)
	{
		
		this.adminId = adminId;
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	/**
	 * @return the adminId
	 */
	public int getAdminId() {
		return adminId;
	}

	/**
	 * @param adminId the adminId to set
	 */
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", emailId=" + emailId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", password=" + password + "]";
	}
	
	
		
}
class AdminServiceImpl implements AdminService
{
 public static Admin adminArray[]=new Admin[5]; 
 AdminServiceImpl() {}
static Admin admin;
int n=0;
public void createAdmin(Admin admin) {
	AdminServiceImpl.admin = admin;
	adminArray[n]=admin;
	
	//System.out.println(adminArray[n].toString());
}
public void print()
{
System.out.println(adminArray[n].toString());
}
}
public class Program {

	

	public static void main(String[] args) 
	{
		AdminService adminService= new AdminServiceImpl();
		Admin rajan=new Admin(1004,"rajan@gmail.com","Rajan","Arun","Password4");
		adminService.createAdmin(rajan);
		rajan.setAdminId(2004);
		adminService.print();

	}

}
