package co.com.foodbank.vault.sdk.exception;


/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.sdk.config.exception
 *         8/06/2021
 */
public class SDKVaultServiceIllegalArgumentException extends Exception {
    private static final long serialVersionUID = 1L;

    public SDKVaultServiceIllegalArgumentException(Exception e) {
        super(e);
    }
}
