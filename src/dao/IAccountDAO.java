package dao;

import java.util.ArrayList;

import model.TaiKhoan;

public interface IAccountDAO {

	public boolean createAccount(Object obj);

	public boolean checkAccount(String username, String password);

	public boolean checkAccountExits(String username);
}
