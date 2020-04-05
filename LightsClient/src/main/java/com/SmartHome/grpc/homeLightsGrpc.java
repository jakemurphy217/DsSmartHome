package com.SmartHome.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
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
  private static volatile io.grpc.MethodDescriptor<com.SmartHome.grpc.lightStatusRequest,
      com.SmartHome.grpc.APIResponseRequest> getLightStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lightStatus",
      requestType = com.SmartHome.grpc.lightStatusRequest.class,
      responseType = com.SmartHome.grpc.APIResponseRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.SmartHome.grpc.lightStatusRequest,
      com.SmartHome.grpc.APIResponseRequest> getLightStatusMethod() {
    io.grpc.MethodDescriptor<com.SmartHome.grpc.lightStatusRequest, com.SmartHome.grpc.APIResponseRequest> getLightStatusMethod;
    if ((getLightStatusMethod = homeLightsGrpc.getLightStatusMethod) == null) {
      synchronized (homeLightsGrpc.class) {
        if ((getLightStatusMethod = homeLightsGrpc.getLightStatusMethod) == null) {
          homeLightsGrpc.getLightStatusMethod = getLightStatusMethod = 
              io.grpc.MethodDescriptor.<com.SmartHome.grpc.lightStatusRequest, com.SmartHome.grpc.APIResponseRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "homeLights", "lightStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartHome.grpc.lightStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartHome.grpc.APIResponseRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new homeLightsMethodDescriptorSupplier("lightStatus"))
                  .build();
          }
        }
     }
     return getLightStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.SmartHome.grpc.hallLightsRequest,
      com.SmartHome.grpc.APILightsResponse> getHallLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hallLights",
      requestType = com.SmartHome.grpc.hallLightsRequest.class,
      responseType = com.SmartHome.grpc.APILightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.SmartHome.grpc.hallLightsRequest,
      com.SmartHome.grpc.APILightsResponse> getHallLightsMethod() {
    io.grpc.MethodDescriptor<com.SmartHome.grpc.hallLightsRequest, com.SmartHome.grpc.APILightsResponse> getHallLightsMethod;
    if ((getHallLightsMethod = homeLightsGrpc.getHallLightsMethod) == null) {
      synchronized (homeLightsGrpc.class) {
        if ((getHallLightsMethod = homeLightsGrpc.getHallLightsMethod) == null) {
          homeLightsGrpc.getHallLightsMethod = getHallLightsMethod = 
              io.grpc.MethodDescriptor.<com.SmartHome.grpc.hallLightsRequest, com.SmartHome.grpc.APILightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "homeLights", "hallLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartHome.grpc.hallLightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartHome.grpc.APILightsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new homeLightsMethodDescriptorSupplier("hallLights"))
                  .build();
          }
        }
     }
     return getHallLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.SmartHome.grpc.sittingRoomLightsRequest,
      com.SmartHome.grpc.APILightsResponse> getSittingRoomLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sittingRoomLights",
      requestType = com.SmartHome.grpc.sittingRoomLightsRequest.class,
      responseType = com.SmartHome.grpc.APILightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.SmartHome.grpc.sittingRoomLightsRequest,
      com.SmartHome.grpc.APILightsResponse> getSittingRoomLightsMethod() {
    io.grpc.MethodDescriptor<com.SmartHome.grpc.sittingRoomLightsRequest, com.SmartHome.grpc.APILightsResponse> getSittingRoomLightsMethod;
    if ((getSittingRoomLightsMethod = homeLightsGrpc.getSittingRoomLightsMethod) == null) {
      synchronized (homeLightsGrpc.class) {
        if ((getSittingRoomLightsMethod = homeLightsGrpc.getSittingRoomLightsMethod) == null) {
          homeLightsGrpc.getSittingRoomLightsMethod = getSittingRoomLightsMethod = 
              io.grpc.MethodDescriptor.<com.SmartHome.grpc.sittingRoomLightsRequest, com.SmartHome.grpc.APILightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "homeLights", "sittingRoomLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartHome.grpc.sittingRoomLightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartHome.grpc.APILightsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new homeLightsMethodDescriptorSupplier("sittingRoomLights"))
                  .build();
          }
        }
     }
     return getSittingRoomLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.SmartHome.grpc.kitchenLightsRequest,
      com.SmartHome.grpc.APILightsResponse> getKitchenLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "kitchenLights",
      requestType = com.SmartHome.grpc.kitchenLightsRequest.class,
      responseType = com.SmartHome.grpc.APILightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.SmartHome.grpc.kitchenLightsRequest,
      com.SmartHome.grpc.APILightsResponse> getKitchenLightsMethod() {
    io.grpc.MethodDescriptor<com.SmartHome.grpc.kitchenLightsRequest, com.SmartHome.grpc.APILightsResponse> getKitchenLightsMethod;
    if ((getKitchenLightsMethod = homeLightsGrpc.getKitchenLightsMethod) == null) {
      synchronized (homeLightsGrpc.class) {
        if ((getKitchenLightsMethod = homeLightsGrpc.getKitchenLightsMethod) == null) {
          homeLightsGrpc.getKitchenLightsMethod = getKitchenLightsMethod = 
              io.grpc.MethodDescriptor.<com.SmartHome.grpc.kitchenLightsRequest, com.SmartHome.grpc.APILightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "homeLights", "kitchenLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartHome.grpc.kitchenLightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartHome.grpc.APILightsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new homeLightsMethodDescriptorSupplier("kitchenLights"))
                  .build();
          }
        }
     }
     return getKitchenLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.SmartHome.grpc.timerLightsRequest,
      com.SmartHome.grpc.APILightsResponse> getTimerLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "timerLights",
      requestType = com.SmartHome.grpc.timerLightsRequest.class,
      responseType = com.SmartHome.grpc.APILightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.SmartHome.grpc.timerLightsRequest,
      com.SmartHome.grpc.APILightsResponse> getTimerLightsMethod() {
    io.grpc.MethodDescriptor<com.SmartHome.grpc.timerLightsRequest, com.SmartHome.grpc.APILightsResponse> getTimerLightsMethod;
    if ((getTimerLightsMethod = homeLightsGrpc.getTimerLightsMethod) == null) {
      synchronized (homeLightsGrpc.class) {
        if ((getTimerLightsMethod = homeLightsGrpc.getTimerLightsMethod) == null) {
          homeLightsGrpc.getTimerLightsMethod = getTimerLightsMethod = 
              io.grpc.MethodDescriptor.<com.SmartHome.grpc.timerLightsRequest, com.SmartHome.grpc.APILightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "homeLights", "timerLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartHome.grpc.timerLightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartHome.grpc.APILightsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new homeLightsMethodDescriptorSupplier("timerLights"))
                  .build();
          }
        }
     }
     return getTimerLightsMethod;
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
    public void lightStatus(com.SmartHome.grpc.lightStatusRequest request,
        io.grpc.stub.StreamObserver<com.SmartHome.grpc.APIResponseRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getLightStatusMethod(), responseObserver);
    }

    /**
     */
    public void hallLights(com.SmartHome.grpc.hallLightsRequest request,
        io.grpc.stub.StreamObserver<com.SmartHome.grpc.APILightsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHallLightsMethod(), responseObserver);
    }

    /**
     */
    public void sittingRoomLights(com.SmartHome.grpc.sittingRoomLightsRequest request,
        io.grpc.stub.StreamObserver<com.SmartHome.grpc.APILightsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSittingRoomLightsMethod(), responseObserver);
    }

    /**
     */
    public void kitchenLights(com.SmartHome.grpc.kitchenLightsRequest request,
        io.grpc.stub.StreamObserver<com.SmartHome.grpc.APILightsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getKitchenLightsMethod(), responseObserver);
    }

    /**
     */
    public void timerLights(com.SmartHome.grpc.timerLightsRequest request,
        io.grpc.stub.StreamObserver<com.SmartHome.grpc.APILightsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTimerLightsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLightStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.SmartHome.grpc.lightStatusRequest,
                com.SmartHome.grpc.APIResponseRequest>(
                  this, METHODID_LIGHT_STATUS)))
          .addMethod(
            getHallLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.SmartHome.grpc.hallLightsRequest,
                com.SmartHome.grpc.APILightsResponse>(
                  this, METHODID_HALL_LIGHTS)))
          .addMethod(
            getSittingRoomLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.SmartHome.grpc.sittingRoomLightsRequest,
                com.SmartHome.grpc.APILightsResponse>(
                  this, METHODID_SITTING_ROOM_LIGHTS)))
          .addMethod(
            getKitchenLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.SmartHome.grpc.kitchenLightsRequest,
                com.SmartHome.grpc.APILightsResponse>(
                  this, METHODID_KITCHEN_LIGHTS)))
          .addMethod(
            getTimerLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.SmartHome.grpc.timerLightsRequest,
                com.SmartHome.grpc.APILightsResponse>(
                  this, METHODID_TIMER_LIGHTS)))
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

    @Override
    protected homeLightsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new homeLightsStub(channel, callOptions);
    }

    /**
     */
    public void lightStatus(com.SmartHome.grpc.lightStatusRequest request,
        io.grpc.stub.StreamObserver<com.SmartHome.grpc.APIResponseRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hallLights(com.SmartHome.grpc.hallLightsRequest request,
        io.grpc.stub.StreamObserver<com.SmartHome.grpc.APILightsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHallLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sittingRoomLights(com.SmartHome.grpc.sittingRoomLightsRequest request,
        io.grpc.stub.StreamObserver<com.SmartHome.grpc.APILightsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSittingRoomLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kitchenLights(com.SmartHome.grpc.kitchenLightsRequest request,
        io.grpc.stub.StreamObserver<com.SmartHome.grpc.APILightsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKitchenLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void timerLights(com.SmartHome.grpc.timerLightsRequest request,
        io.grpc.stub.StreamObserver<com.SmartHome.grpc.APILightsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTimerLightsMethod(), getCallOptions()), request, responseObserver);
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

    @Override
    protected homeLightsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new homeLightsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.SmartHome.grpc.APIResponseRequest lightStatus(com.SmartHome.grpc.lightStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.SmartHome.grpc.APILightsResponse hallLights(com.SmartHome.grpc.hallLightsRequest request) {
      return blockingUnaryCall(
          getChannel(), getHallLightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.SmartHome.grpc.APILightsResponse sittingRoomLights(com.SmartHome.grpc.sittingRoomLightsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSittingRoomLightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.SmartHome.grpc.APILightsResponse kitchenLights(com.SmartHome.grpc.kitchenLightsRequest request) {
      return blockingUnaryCall(
          getChannel(), getKitchenLightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.SmartHome.grpc.APILightsResponse timerLights(com.SmartHome.grpc.timerLightsRequest request) {
      return blockingUnaryCall(
          getChannel(), getTimerLightsMethod(), getCallOptions(), request);
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

    @Override
    protected homeLightsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new homeLightsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.SmartHome.grpc.APIResponseRequest> lightStatus(
        com.SmartHome.grpc.lightStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.SmartHome.grpc.APILightsResponse> hallLights(
        com.SmartHome.grpc.hallLightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHallLightsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.SmartHome.grpc.APILightsResponse> sittingRoomLights(
        com.SmartHome.grpc.sittingRoomLightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSittingRoomLightsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.SmartHome.grpc.APILightsResponse> kitchenLights(
        com.SmartHome.grpc.kitchenLightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getKitchenLightsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.SmartHome.grpc.APILightsResponse> timerLights(
        com.SmartHome.grpc.timerLightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTimerLightsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIGHT_STATUS = 0;
  private static final int METHODID_HALL_LIGHTS = 1;
  private static final int METHODID_SITTING_ROOM_LIGHTS = 2;
  private static final int METHODID_KITCHEN_LIGHTS = 3;
  private static final int METHODID_TIMER_LIGHTS = 4;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIGHT_STATUS:
          serviceImpl.lightStatus((com.SmartHome.grpc.lightStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.SmartHome.grpc.APIResponseRequest>) responseObserver);
          break;
        case METHODID_HALL_LIGHTS:
          serviceImpl.hallLights((com.SmartHome.grpc.hallLightsRequest) request,
              (io.grpc.stub.StreamObserver<com.SmartHome.grpc.APILightsResponse>) responseObserver);
          break;
        case METHODID_SITTING_ROOM_LIGHTS:
          serviceImpl.sittingRoomLights((com.SmartHome.grpc.sittingRoomLightsRequest) request,
              (io.grpc.stub.StreamObserver<com.SmartHome.grpc.APILightsResponse>) responseObserver);
          break;
        case METHODID_KITCHEN_LIGHTS:
          serviceImpl.kitchenLights((com.SmartHome.grpc.kitchenLightsRequest) request,
              (io.grpc.stub.StreamObserver<com.SmartHome.grpc.APILightsResponse>) responseObserver);
          break;
        case METHODID_TIMER_LIGHTS:
          serviceImpl.timerLights((com.SmartHome.grpc.timerLightsRequest) request,
              (io.grpc.stub.StreamObserver<com.SmartHome.grpc.APILightsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SmartHome.grpc.HomeLights.getDescriptor();
    }

    @Override
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

    @Override
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
              .addMethod(getHallLightsMethod())
              .addMethod(getSittingRoomLightsMethod())
              .addMethod(getKitchenLightsMethod())
              .addMethod(getTimerLightsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
