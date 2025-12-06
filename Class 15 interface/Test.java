// whethere we declare or not all interface method 
// by default are public and abstract
interface User{
     void login();
     void logout();
}
class userImple implements User{
    public void login(){
        System.out.println("Login Success");
    }
    public void logout(){
        System.out.println("Logout success");
    }
    public static void main(String[] args) {
        User u1 = new userImple();
        u1.login();  // Login success
        u1.logout(); // logout success
    }
}