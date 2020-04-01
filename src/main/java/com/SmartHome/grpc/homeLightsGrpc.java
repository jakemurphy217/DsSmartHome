package com.SmartHome.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: homeLights.proto")
public final class homeLightsGrpc {

  private homeLightsGrpc() {}

  public static final String SERVICE_NAME = "homeLights";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.SmartHome.grpc.HomeLights.lightStatusRequest,
      com.SmartHome.grpc.HomeLights.APIResponse> getLightStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lightStatus",
      requestType = com.SmartHome.grpc.HomeLights.lightStatusRequest.class,
      responseType = com.SmartHome.grpc.HomeLights.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.SmartHome.grpc.HomeLights.lightStatusRequest,
      com.SmartHome.grpc.HomeLights.APIResponse> getLightStatusMethod() {
    io.grpc.MethodDescriptor<com.SmartHome.grpc.HomeLights.lightStatusRequest, com.SmartHome.grpc.HomeLights.APIResponse> getLightStatusMethod;
    if ((getLightStatusMethod = homeLightsGrpc.getLightStatusMethod) == null) {
      synchronized (homeLightsGrpc.class) {
        if ((getLightStatusMethod = homeLightsGrpc.getLightStatusMethod) == null) {
          homeLightsGrpc.getLightStatusMethod = getLightStatusMethod = 
              io.grpc.MethodDescriptor.<com.SmartHome.grpc.HomeLights.lightStatusRequest, com.SmartHome.grpc.HomeLights.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "homeLights", "lightStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartHome.grpc.HomeLights.lightStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartHome.grpc.HomeLights.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new homeLightsMethodDescriptorSupplier("lightStatus"))
                  .build();
          }
        }
     }
     return getLightStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static homeLightsStub newStub(io.grpc.Channel channel) {
    return new homeLightsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static homeLightsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new homeLightsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static homeLightsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new homeLightsFutureStub(channel);
  }

  /**
   */
  public static abstract class homeLightsImplBase implements io.grpc.BindableService {

    /**
     */
    public void lightStatus(com.SmartHome.grpc.HomeLights.lightStatusRequest request,
        io.grpc.stub.StreamObserver<com.SmartHome.grpc.HomeLights.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLightStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLightStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.SmartHome.grpc.HomeLights.lightStatusRequest,
                com.SmartHome.grpc.HomeLights.APIResponse>(
                  this, METHODID_LIGHT_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class homeLightsStub extends io.grpc.stub.AbstractStub<homeLightsStub> {
    private homeLightsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private homeLightsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected homeLightsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new homeLightsStub(channel, callOptions);
    }

    /**
     */
    public void lightStatus(com.SmartHome.grpc.HomeLights.lightStatusRequest request,
        io.grpc.stub.StreamObserver<com.SmartHome.grpc.HomeLights.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class homeLightsBlockingStub extends io.grpc.stub.AbstractStub<homeLightsBlockingStub> {
    private homeLightsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private homeLightsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected homeLightsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new homeLightsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.SmartHome.grpc.HomeLights.APIResponse lightStatus(com.SmartHome.grpc.HomeLights.lightStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class homeLightsFutureStub extends io.grpc.stub.AbstractStub<homeLightsFutureStub> {
    private homeLightsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private homeLightsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected homeLightsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new homeLightsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.SmartHome.grpc.HomeLights.APIResponse> lightStatus(
        com.SmartHome.grpc.HomeLights.lightStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIGHT_STATUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final homeLightsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(homeLightsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIGHT_STATUS:
          serviceImpl.lightStatus((com.SmartHome.grpc.HomeLights.lightStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.SmartHome.grpc.HomeLights.APIResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class homeLightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    homeLightsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SmartHome.grpc.HomeLights.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("homeLights");
    }
  }

  private static final class homeLightsFileDescriptorSupplier
      extends homeLightsBaseDescriptorSupplier {
    homeLightsFileDescriptorSupplier() {}
  }

  private static final class homeLightsMethodDescriptorSupplier
      extends homeLightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    homeLightsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (homeLightsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new homeLightsFileDescriptorSupplier())
              .addMethod(getLightStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
