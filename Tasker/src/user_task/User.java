package user_task;

import exceptions.InvalidPasswordLengthException;

/***
 * This class models the user
 * @author Alejandro Molina Lara (SilverPigtail)
 *
 */
public class User {
	private String nickname;
	private String email;
	private String password;
	private int id;
	
	
	/***
	 * This constructor models this class and the user
	 * @param nn -> The nickname of the user
	 * @param em -> The email of the user
	 * @param pw -> The password of the user
	 * @param id -> The id of the user
	 */
	public User(String nn, String em, String pw, int id) {
		

		this.nickname=nn;
		this.email=em;
		this.password=pw;
		this.id=id;
		
		
	}
	
	
	/***
	 * The getter of the user's nickname
	 * @return nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/***
	 * The setter of the user's nickname
	 * @param cnn -> nickname
	 */
	public void setNickname(String cnn) {
		
		this.nickname=cnn;
		
	}

	/***
	 * The getter of the user's email
	 * @return -> email
	 */
	public String getEmail() {
		return email;
	}

	/***
	 * The getter of the user's email
	 * @param cem -> email
	 */
	public void setEmail(String cem) {
		
		this.email=cem;
		
	}
	
	/***
	 * The getter of the user's password
	 * @return -> password
	 */
	public String getPassword() {
		return password;
	}

	/***
	 * The The setter of the user's password
	 * @param cpw -> password
	 * @throws InvalidPasswordLengthException -> The exception that is thrown when the password is longer than eight characters
	 */
	public void setPassword(String cpw) throws InvalidPasswordLengthException {
		
		if(this.password.length()>=8) {
			
			this.password=cpw;
			
		}else {
			
			throw new InvalidPasswordLengthException("The password that you have entered is too short");
		}
	}
	
	/***
	 * The getter of the user's id
	 * @return id
	 */
	public int getId() {
		return id;
		
	}
	
	/***
	 * The setter of the user's id
	 * @param id -> id
	 */
	public void setId(int id) {
		
		this.id=id;
		
	}

}


