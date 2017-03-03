package br.com.augustoccesar.vertxtemplate.endpoints;

import br.com.augustoccesar.vertxtemplate.SharedRouter;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

/**
 * Author: augustoccesar
 * Date: 03/03/17
 */
public class OtherEndpoints {
    public OtherEndpoints() {
        Router router = SharedRouter.instance().getRouter();

        router.get("/other").handler(this::index);
    }

    private void index(RoutingContext routingContext){
        routingContext.response().setStatusCode(200).end();
    }
}
