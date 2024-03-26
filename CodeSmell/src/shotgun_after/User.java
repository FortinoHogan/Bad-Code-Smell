package shotgun_after;

public class User {
	private UserData userData;

    public void changeName(String newName) {
        userData.setName(newName);
    }

    public void changeEmail(String newEmail) {
        userData.setEmail(newEmail);
    }

    public void changeAddress(String newAddress) {
        userData.setAddress(newAddress);
    }
}
