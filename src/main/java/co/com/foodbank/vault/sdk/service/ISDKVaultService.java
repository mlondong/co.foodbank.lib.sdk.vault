package co.com.foodbank.vault.sdk.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import co.com.foodbank.vault.dto.VaultDTO;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceException;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceIllegalArgumentException;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceNotAvailableException;
import co.com.foodbank.vault.sdk.model.ResponseVaultData;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.sdk.service
 *         8/06/2021
 */
public interface ISDKVaultService {

    /**
     * @param dto
     * @return {@code ResponseVaultData}
     * @throws JsonMappingException
     * @throws JsonProcessingException
     * @throws SDKVaultServiceException
     * @throws SDKVaultServiceNotAvailableException
     * @throws SDKVaultServiceIllegalArgumentException
     */
    ResponseVaultData create(VaultDTO dto)
            throws JsonMappingException, JsonProcessingException,
            SDKVaultServiceException, SDKVaultServiceNotAvailableException,
            SDKVaultServiceIllegalArgumentException;



    /**
     * @param dto
     * @param id
     * @return {@code ResponseVaultData}
     * @throws JsonMappingException
     * @throws JsonProcessingException
     * @throws SDKVaultServiceException
     * @throws SDKVaultServiceNotAvailableException
     * @throws SDKVaultServiceIllegalArgumentException
     */
    ResponseVaultData update(VaultDTO dto, String id)
            throws JsonMappingException, JsonProcessingException,
            SDKVaultServiceException, SDKVaultServiceNotAvailableException,
            SDKVaultServiceIllegalArgumentException;



}
