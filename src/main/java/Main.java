import com.sun.net.httpserver.HttpServer;

import java.io.IOException;

public class Main {
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

    public class Main {

        public static void main(String[] args) {
            System.out.println(GetMessage());
        }
        ResourceConfig rc = new ResourceConfig()
                .packages("at.bojana.SoftwareVendor.controller");
        HttpServer server = e.createHttpServer(URI.create("http://localhost:8080/"), rc);


        try {
            System.in.read();
        } catch (
        IOException e) {
            e.printStackTrace();
        }

        server.stop(0);
    }
}
