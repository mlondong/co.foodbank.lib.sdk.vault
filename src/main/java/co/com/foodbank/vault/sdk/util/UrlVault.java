package co.com.foodbank.vault.sdk.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Class to handle Url for sdk vault.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.sdk.util 25/08/2021
 */
@Component
@Validated
public class UrlVault {

    @Value("${sdk.service.vault.scheme}")
    private String urlScheme;

    @Value("${sdk.service.vault.url}")
    private String urlBase;


    public String toCreate() {
        return UriComponentsBuilder.newInstance().scheme(urlScheme)
                .host(urlBase).path(SDKVaultParameters.PATH_CREATE_VAULT)
                .build().toString();
    }

    public String toUpdate(String idVault) {
        return UriComponentsBuilder.newInstance().scheme(urlScheme)
                .host(urlBase)
                .path(SDKVaultParameters.PATH_UPDATE_VAULT + idVault)
                .buildAndExpand(encode(idVault)).toString();
    }


    /**
     * Method for encode
     * 
     * @param value url
     * @return utf8 encoded url
     */
    private String encode(String value) {
        try {
            return URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

}
