package heranca_polimorfismo.domain;

public non-sealed class Manager extends Employee {
	private String login;
	private String password;
	private double comission;

	public Manager() {
	}

	public Manager(String code, String name, String address, int age, double salary,
			       String login, String password, double comission) {
		super(code, name, address, age, salary);
		this.login = login;
		this.password = password;
		this.comission = comission;
	}

	@Override
	public String getCode() {
		return "MN - " + this.code;
	}
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getComission() {
		return comission;
	}

	public void setComission(double comission) {
		this.comission = comission;
	}

	@Override
	public double getFullSalary() {
		return this.salary + this.comission;
	}
}
