public class User {
    String username = "marvelous";
    String password = "Pass";
    String login() {
        if (username.equals("marvelous") && password.equals("Pass")) {
            return "Logged in";
        } else {
            return "Failed";
        }
    }
    boolean checker() {
        if (3 != 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        User jane = new User();
        User luke = new User();
        System.out.println(marvelous.checker());
        System.out.println(uzoma.login());
    }
}
