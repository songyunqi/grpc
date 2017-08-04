package com.rpc.mail.server;

import com.rpc.mail.SendMailServiceGrpc;
import com.rpc.mail.impl.SendMailServiceImpl;
import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;

public class GrpcServer {

    public static void main(String[] args) throws Exception {
        Server server = NettyServerBuilder.forPort(8081).addService(SendMailServiceGrpc.bindService(new SendMailServiceImpl())).build();
        server.start();
        System.out.println("server startup at 8080");
        server.awaitTermination();
    }
}
