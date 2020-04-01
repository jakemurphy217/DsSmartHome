package gRPCServer;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import lights.lightsService;

import java.io.IOException;

public class gRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(3000)
                .addService(new lightsService()).build();
        server.start();

        System.out.println("Server Started at"+" " + server.getPort());

        server.awaitTermination();
    }
}
