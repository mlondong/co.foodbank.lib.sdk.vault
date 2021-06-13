package co.com.foodbank.vault.sdk.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import co.com.foodbank.vault.dto.VaultDTO;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceException;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceIllegalArgumentException;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceNotAvailableException;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.sdk.service
 *         8/06/2021
 */
public interface ISDKVaultService {

    String create(VaultDTO dto)
            throws JsonMappingException, JsonProcessingException,
            SDKVaultServiceException, SDKVaultServiceNotAvailableException,
            SDKVaultServiceIllegalArgumentException;

}
