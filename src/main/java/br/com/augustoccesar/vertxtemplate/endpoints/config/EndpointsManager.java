package br.com.augustoccesar.vertxtemplate.endpoints.config;

/**
 * Author: augustoccesar
 * Date: 03/03/17
 */
public class EndpointsManager {
    public static void registerEndpoints(Class... endpoints) {
        for (Class endpoint : endpoints) {
            try {
                endpoint.newInstance();
                System.out.println(String.format("Registered endpoint \"%s\"", endpoint.getName()));
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
