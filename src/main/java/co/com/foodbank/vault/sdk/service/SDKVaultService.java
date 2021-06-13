package co.com.foodbank.vault.sdk.service;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import co.com.foodbank.vault.dto.VaultDTO;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceException;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceIllegalArgumentException;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceNotAvailableException;

@Service
@Validated
public class SDKVaultService implements ISDKVaultService {

    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private HttpHeaders httpHeaders;


    @Value("${urlSdlVault}")
    private String urlSdlVault;

    @Override
    public String create(VaultDTO dto)
            throws JsonMappingException, JsonProcessingException,
            SDKVaultServiceException, SDKVaultServiceIllegalArgumentException {

        try {

            httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<VaultDTO> entity =
                    new HttpEntity<VaultDTO>(dto, httpHeaders);

            return restTemplate.exchange(urlSdlVault, HttpMethod.POST, entity,
                    String.class).getBody();

        } catch (ResourceAccessException e) {
            throw new SDKVaultServiceNotAvailableException(e);
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode() == HttpStatus.BAD_REQUEST) {
                throw new SDKVaultServiceIllegalArgumentException(e);
            }
            throw new SDKVaultServiceException(e);
        } catch (Exception e) {
            throw new SDKVaultServiceException(e);
        }
    }
}
