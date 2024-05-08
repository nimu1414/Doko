package test;

import dao.AccountsDAO;
import model.Account;
import model.Login;

public class AccountsDAOTest {
	public static void main(String[] args) {
		testFindByLoginOK();
		testFindByLoginNG();
	}
	public static void testFindByLoginOK() {
		Login login = new Login("minato", "1234");
		AccountsDAO dao = new AccountsDAO();
		Account result = dao.findByLogin(login);
		if (result != null &&
			result.getUserId().equals("minato") &&
			result.getPass().equals("1234") &&
			result.getMail().equals("yusukeminato@miyabilink.jp") &&
			result.getName().equals("湊 雄輔") &&
			result.getAge() == 23 ) {
			System.out.println("成功");
		}else {
			System.out.println("失敗");
		}
	}
	public static void testFindByLoginNG() {
		Login login = new Login("minato" , "12345");
		AccountsDAO dao = new AccountsDAO();
		Account result = dao.findByLogin(login);
		if (result == null) {
			System.out.println("成功");
		}else {
			System.out.println("失敗");
		}
	}
}
