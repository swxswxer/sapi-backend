package com.swx.sapiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.google.gson.Gson;
import com.swx.sapiclientsdk.model.City;
import com.swx.sapiclientsdk.model.User;

import java.util.HashMap;
import java.util.Map;

import static com.swx.sapiclientsdk.utils.SignUtils.genSign;

/**
 * 调用第三方接口的客户端
 */
public class SapiClient {

//    private static final String GATEWAY_HOST = "http://sapi-gateway:8090";
    private static final String GATEWAY_HOST = "http://10.15.25.23:8090";

    private String accessKey;
    private String secretKey;

    public SapiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }


    private Map<String, String> getHeaderMap(String body) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("accessKey", accessKey);
        //密钥 一定不可以放在请求中
//        hashMap.put("secretKey",secretKey);

        String nonce = RandomUtil.randomNumbers(4);
        hashMap.put("nonce", nonce);
        hashMap.put("body", body);
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        hashMap.put("sign", genSign(nonce, secretKey));
        return hashMap;
    }




    public String getNameByGet(String name) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.get(GATEWAY_HOST+"/api/name/", paramMap);
        System.out.println("result = " + result);
        return result;
    }

    public String getUsernameByPost(String requestParams) {
//        String json = JSONUtil.toJsonStr(user);
        String json = requestParams;
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST+"/api/name/user")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println("result = " + result);
        return result;
    }

    public String getWeatherByCity(String requestParams) {
        Gson gson = new Gson();
        String json = requestParams;
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST+"/api/weather/weather")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();

        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println("result = " + result);
        return result;
    }

    public String getRandomUsername() {
//        String result = HttpUtil.get(GATEWAY_HOST+"/api/name/randomUsername");
        HttpResponse httpResponse = HttpRequest.get(GATEWAY_HOST+"/api/name/randomUsername")
                .addHeaders(getHeaderMap(null))
                .execute();

        String result = httpResponse.body();
        System.out.println("result = " + result);
        return result;
    }

    public String getRandomLoveTalk() {
//        String result = HttpUtil.get(GATEWAY_HOST+"/api/name/randomUsername");
        HttpResponse httpResponse = HttpRequest.get(GATEWAY_HOST+"/api/lovetalk/")
                .addHeaders(getHeaderMap(null))
                .execute();

        String result = httpResponse.body();
        System.out.println("result = " + result);
        return result;
    }

    public String getRandomToxicSoups() {
        HttpResponse httpResponse = HttpRequest.get(GATEWAY_HOST+"/api/toxicsoups/")
                .addHeaders(getHeaderMap(null))
                .execute();

        String result = httpResponse.body();
        System.out.println("result = " + result);
        return result;
    }


}
