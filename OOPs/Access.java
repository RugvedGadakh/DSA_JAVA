class Modifiers {
    // public
    public String name;

    // default
    int age;

    // protected
    protected String email;

    // private
    private String Passwoard;

    // getters && settrers ----------> to acess private acess modifiers
    public String getPasswoard() {
        return this.Passwoard;
    }

    public void setPasswoard(String pass) {
        this.Passwoard = pass;
    }
}

public class Access {

    public static void main(String[] args) {
        Modifiers mod = new Modifiers();

        mod.name = "rugved";
        mod.email = "rugved122003@gmail.com";
        // mod.Passwoard = "admin";
        mod.setPasswoard("admin");
        System.out.println(mod.getPasswoard());

    }

}
