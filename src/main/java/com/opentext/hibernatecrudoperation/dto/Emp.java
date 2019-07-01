package com.opentext.hibernatecrudoperation.dto;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="emp_info")

	public class Emp {
		@Id
		@Column(name="Eid")
		private int eId;
		@Column(name="Ename")
		private String eName;
		@Column(name="DOB")
		private String dob;
		@Column(name="Gender")
		private String gender;
		@Column(name="PhoneNo")
		private long phoneNo;
		@Column(name="EmailId")
		private String emailId;
		
		@Column(name="Designation")
		private String designation;
		@Column(name="JoiningDate")
		private String joiningDate;
		@Column(name="Salary")
		private int salary;
		@Column(name="MGR_ID")
		private int mgrId;
		@Column(name="DEPT_ID")
		private int deptId;
		
		public int geteId() {
			return eId;
		}
		public void seteId(int eId) {
			this.eId = eId;
		}
		public String geteName() {
			return eName;
		}
		public void seteName(String eName) {
			this.eName = eName;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public long getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getJoiningDate() {
			return joiningDate;
		}
		public void setJoiningDate(String joiningDate) {
			this.joiningDate = joiningDate;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getMgrId() {
			return mgrId;
		}
		public void setMgrId(int mgrId) {
			this.mgrId = mgrId;
		}
		public int getDeptId() {
			return deptId;
		}
		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}
		
	}

