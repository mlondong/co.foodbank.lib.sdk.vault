package co.com.foodbank.vault.sdk.util;

public final class SDKVaultParameters {

    public static final String _PREFIX = "/vault";
    public static final String _SUFIX_CREATE_VAULT = "/createVault";
    public static final String _SUFIX_UPDATE_VAULT = "/updateVault/id/";


    public static final String PATH_CREATE_VAULT =
            _PREFIX + _SUFIX_CREATE_VAULT;
    public static final String PATH_UPDATE_VAULT =
            _PREFIX + _SUFIX_UPDATE_VAULT;


    public SDKVaultParameters() {}
}
