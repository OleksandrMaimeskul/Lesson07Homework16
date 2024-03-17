public class DecryptApp {
    public static void main(String[] args) {
        String message = "-$''$<k<#\"?.k9*))\"?";
        String key = "%&";

        Decryptor decryptor = new Decryptor();
        String decrMsg = decryptor.decryptMessage(message, key);
        System.out.println("Decrypted msg is - " + decrMsg);
    }
}

