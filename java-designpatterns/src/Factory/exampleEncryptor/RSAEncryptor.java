package Factory.exampleEncryptor;

public class RSAEncryptor implements Encryptor {
    @Override
    public void encrypt(){
        System.out.print("Encrypting using RSA");
    };

    @Override
    public void decrypt(){
        System.out.print("Decryption using RSA");
    }


}
