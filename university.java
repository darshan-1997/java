package minor;

public class university {
	
	public String CETCODE="E30 and E241";
	school [] s =new school[8];
}
	class school extends university
	{
		private String sprogramcode;
		private String schoolCoordinator;
		private int inumber_of_students;
		private int inumber_of_staff;
		public String getSprogramcode() {
			return sprogramcode;
		}
		public String getSchoolCoordinator() {
			return schoolCoordinator;
		}
		public int getInumber_of_students() {
			return inumber_of_students;
		}
		public int getInumber_of_staff() {
			return inumber_of_staff;
		}
		public school(String sprogramcode, String schoolCoordinator,
				int inumber_of_students, int inumber_of_staff) {
			
			this.sprogramcode = sprogramcode;
			this.schoolCoordinator = schoolCoordinator;
			this.inumber_of_students = inumber_of_students;
			this.inumber_of_staff = inumber_of_staff;
		}
	
	
		void ready()
		{
			s[0]=new school("CHEMISTRY","ROHIT",86,23);
			s[1]=new school("PHYSICS","VIRAT",123,41);
			s[2]=new school("MATHEMATICS","RAINA",68,16);
			s[3]=new school("BIOLOGY","RAHUL",95,10);
			
			s[4]=new school("ELECTRONICS","DHONI",42,6);
			s[5]=new school("COMPUTER_SCIENCE","DHAWAN",89,27);
			s[6]=new school("SOCIAL_SCIENCE","YUVRAJ",76,15);
			s[7]=new school("JOURNLISM","SACHIN",92,14);
			
		}
		
		void calculate()
		{
			int j;
			for(j=0;j<8;j++)
			{
				if (s[j].getInumber_of_students()> 120)
				{
					System.out.println("code " + s[j].getSprogramcode() +"exeeded limit");;
				}
				else 
					System.out.println("total strenth of" + s[j].getSprogramcode() +"is" + s[j].getInumber_of_students());
			}
		}
		
		
		
}
