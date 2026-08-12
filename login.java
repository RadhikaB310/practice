public class login {
    public static void main(String[] args) {
        String username = "Radhika";
        String password = "12345";

        System.out.println("Login Page");
        System.out.println("Username: " + username);

        if (password.equals("12345")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid password");
        }
    }
}