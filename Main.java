class SecureCore {
    public final void encryptData(String data) {
        System.out.println("Encrypting data securely: " + data);
    }
    public final boolean authenticateUser(String username, String password) {
        System.out.println("Performing secure authentication for user: " + username);
        return username.equals("admin") && password.equals("secure123");
    }
}
interface Authentication {
    void authenticate();
}
class PasswordAuth implements Authentication {
    private String username;
    private String password;

    public PasswordAuth(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    public void authenticate() {
        System.out.println("Authenticating " + username + " using password.");
    }
}
class BiometricAuth implements Authentication {
    private String biometricData;

    public BiometricAuth(String biometricData) {
        this.biometricData = biometricData;
    }
    @Override
    public void authenticate() {
        System.out.println("Authenticating using biometric data: " + biometricData);
    }
}
class AdvancedAuth implements Authentication {
    private PasswordAuth passwordAuth;
    private BiometricAuth biometricAuth;

    public AdvancedAuth(String username, String password, String biometricData) {
        this.passwordAuth = new PasswordAuth(username, password);
        this.biometricAuth = new BiometricAuth(biometricData);
    }

    @Override
    public void authenticate() {
        System.out.println("Performing multi-factor authentication:");
        passwordAuth.authenticate();
        biometricAuth.authenticate();
    }
}
public class Main {
    public static void main(String[] args) {
        SecureCore secureSystem = new SecureCore();
        secureSystem.encryptData("SensitiveInfo123");
        Authentication passwordAuth = new PasswordAuth("user1", "mypassword");
        passwordAuth.authenticate();
        Authentication biometricAuth = new BiometricAuth("fingerprint_data");
        biometricAuth.authenticate();
        Authentication advancedAuth = new AdvancedAuth("user1", "mypassword", "fingerprint_data");
        advancedAuth.authenticate();
    }
}
