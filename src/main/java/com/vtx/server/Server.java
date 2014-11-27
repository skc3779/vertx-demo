package com.vtx.server;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServer;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

/**
 * Created by seokangchun on 14. 11. 27..
 */
public class Server extends Verticle {
    public void start() {
        HttpServer listen = vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
            public void handle(HttpServerRequest req) {
                String file = req.path().equals("/") ? "index.html" : req.path();
                req.response().sendFile("web/" + file);
            }
        }).listen(8000);
    }
}
