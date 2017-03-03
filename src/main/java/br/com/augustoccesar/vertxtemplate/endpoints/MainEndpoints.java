package br.com.augustoccesar.vertxtemplate.endpoints;

import br.com.augustoccesar.vertxtemplate.SharedRouter;
import br.com.augustoccesar.vertxtemplate.endpoints.config.Endpoint;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

/**
 * Author: augustoccesar
 * Date: 02/03/17
 */
public class MainEndpoints implements Endpoint {
    public MainEndpoints() {
        Router router = SharedRouter.instance().getRouter();

        router.get("/main").handler(this::index);
    }

    // Endpoint methods

    private void index(RoutingContext routingContext) {
        routingContext.response().setStatusCode(200).end();
    }
}
