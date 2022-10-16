package mypractice.jdbcpractice01;

public class MemberNumController {
	private MemberNumDAO numDao;
	public MemberNumController() {
		numDao = MemberNumDAO.getInstance();
	}
	
	public void searchMemberNumProcess() {
		for(EmployeesDTO eDTO : numDao.searchMemberList()) {
			System.out.printf("%s %s %d\n",
							eDTO.getDptmDTO().getDepartment_name(),
							eDTO.getTo_char(),
							eDTO.getCount());
		}
	}
}
