package Factory.exampleEncryptor;

public class JweEncryptor implements Encryptor{
    @Override
    public void encrypt(){
        System.out.print("Encrypting using JWE");
    };

    @Override
    public void decrypt(){
        System.out.print("Decryption using JWE");
    }
}
