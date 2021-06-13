package co.com.foodbank.vault.sdk.exception;


/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.sdk.service
 *         4/06/2021
 */
public class SDKVaultServiceException extends Exception {
    private static final long serialVersionUID = 1L;

    public SDKVaultServiceException(Exception e) {
        super(e);
    }

}
