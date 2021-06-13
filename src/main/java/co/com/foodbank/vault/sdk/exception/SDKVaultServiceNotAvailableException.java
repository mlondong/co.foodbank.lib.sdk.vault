package co.com.foodbank.vault.sdk.exception;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.sdk.config.exception
 *         8/06/2021
 */
public class SDKVaultServiceNotAvailableException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * @param e
     */
    public SDKVaultServiceNotAvailableException(Exception e) {
        super(e);
    }
}
