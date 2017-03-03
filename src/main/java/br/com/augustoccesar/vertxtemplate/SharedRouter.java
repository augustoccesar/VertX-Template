package br.com.augustoccesar.vertxtemplate;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

/**
 * Author: augustoccesar
 * Date: 03/03/17
 */
public class SharedRouter {
    private static SharedRouter sharedRouter;
    private Router router;

    private SharedRouter(Vertx vertx) {
        this.router = Router.router(vertx);
    }

    public static SharedRouter instance(){
        return sharedRouter;
    }

    public static void initialize(Vertx vertx){
        sharedRouter = new SharedRouter(vertx);
    }

    public Router getRouter(){
        return this.router;
    }
}
