package br.com.augustoccesar.vertxtemplate;

import br.com.augustoccesar.vertxtemplate.endpoints.MainEndpoints;
import br.com.augustoccesar.vertxtemplate.endpoints.OtherEndpoints;
import br.com.augustoccesar.vertxtemplate.endpoints.config.EndpointsManager;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;

/**
 * Author: augustoccesar
 * Date: 02/03/17
 */
public class Application extends AbstractVerticle {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        SharedRouter.initialize(vertx);

        EndpointsManager.registerEndpoints(
                MainEndpoints.class,
                OtherEndpoints.class
        );

        DeploymentOptions options = new DeploymentOptions();
        options.setInstances(5);
        vertx.deployVerticle(Application.class.getName(), options);
    }

    @Override
    public void start() throws Exception {
        vertx
                .createHttpServer()
                .requestHandler(SharedRouter.instance().getRouter()::accept)
                .listen(8080);
    }
}
