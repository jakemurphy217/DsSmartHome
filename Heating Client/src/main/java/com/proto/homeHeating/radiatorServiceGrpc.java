package com.proto.homeHeating;

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
    comments = "Source: homeHeating.proto")
public final class radiatorServiceGrpc {

  private radiatorServiceGrpc() {}

  public static final String SERVICE_NAME = "homeHeating.radiatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorStatusRequest,
      com.proto.homeHeating.radiatorStatusResponse> getShowRadiatorStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showRadiatorStatus",
      requestType = com.proto.homeHeating.radiatorStatusRequest.class,
      responseType = com.proto.homeHeating.radiatorStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorStatusRequest,
      com.proto.homeHeating.radiatorStatusResponse> getShowRadiatorStatusMethod() {
    io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorStatusRequest, com.proto.homeHeating.radiatorStatusResponse> getShowRadiatorStatusMethod;
    if ((getShowRadiatorStatusMethod = radiatorServiceGrpc.getShowRadiatorStatusMethod) == null) {
      synchronized (radiatorServiceGrpc.class) {
        if ((getShowRadiatorStatusMethod = radiatorServiceGrpc.getShowRadiatorStatusMethod) == null) {
          radiatorServiceGrpc.getShowRadiatorStatusMethod = getShowRadiatorStatusMethod = 
              io.grpc.MethodDescriptor.<com.proto.homeHeating.radiatorStatusRequest, com.proto.homeHeating.radiatorStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "homeHeating.radiatorService", "showRadiatorStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.homeHeating.radiatorStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.homeHeating.radiatorStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new radiatorServiceMethodDescriptorSupplier("showRadiatorStatus"))
                  .build();
          }
        }
     }
     return getShowRadiatorStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorToUpdateRequest,
      com.proto.homeHeating.radiatorDetailResponse> getSetRadiatorToLowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setRadiatorToLow",
      requestType = com.proto.homeHeating.radiatorToUpdateRequest.class,
      responseType = com.proto.homeHeating.radiatorDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorToUpdateRequest,
      com.proto.homeHeating.radiatorDetailResponse> getSetRadiatorToLowMethod() {
    io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorToUpdateRequest, com.proto.homeHeating.radiatorDetailResponse> getSetRadiatorToLowMethod;
    if ((getSetRadiatorToLowMethod = radiatorServiceGrpc.getSetRadiatorToLowMethod) == null) {
      synchronized (radiatorServiceGrpc.class) {
        if ((getSetRadiatorToLowMethod = radiatorServiceGrpc.getSetRadiatorToLowMethod) == null) {
          radiatorServiceGrpc.getSetRadiatorToLowMethod = getSetRadiatorToLowMethod = 
              io.grpc.MethodDescriptor.<com.proto.homeHeating.radiatorToUpdateRequest, com.proto.homeHeating.radiatorDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "homeHeating.radiatorService", "setRadiatorToLow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.homeHeating.radiatorToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.homeHeating.radiatorDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new radiatorServiceMethodDescriptorSupplier("setRadiatorToLow"))
                  .build();
          }
        }
     }
     return getSetRadiatorToLowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorToUpdateRequest,
      com.proto.homeHeating.radiatorDetailResponse> getSetRadiatorToMediumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setRadiatorToMedium",
      requestType = com.proto.homeHeating.radiatorToUpdateRequest.class,
      responseType = com.proto.homeHeating.radiatorDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorToUpdateRequest,
      com.proto.homeHeating.radiatorDetailResponse> getSetRadiatorToMediumMethod() {
    io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorToUpdateRequest, com.proto.homeHeating.radiatorDetailResponse> getSetRadiatorToMediumMethod;
    if ((getSetRadiatorToMediumMethod = radiatorServiceGrpc.getSetRadiatorToMediumMethod) == null) {
      synchronized (radiatorServiceGrpc.class) {
        if ((getSetRadiatorToMediumMethod = radiatorServiceGrpc.getSetRadiatorToMediumMethod) == null) {
          radiatorServiceGrpc.getSetRadiatorToMediumMethod = getSetRadiatorToMediumMethod = 
              io.grpc.MethodDescriptor.<com.proto.homeHeating.radiatorToUpdateRequest, com.proto.homeHeating.radiatorDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "homeHeating.radiatorService", "setRadiatorToMedium"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.homeHeating.radiatorToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.homeHeating.radiatorDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new radiatorServiceMethodDescriptorSupplier("setRadiatorToMedium"))
                  .build();
          }
        }
     }
     return getSetRadiatorToMediumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorToUpdateRequest,
      com.proto.homeHeating.radiatorDetailResponse> getSetRadiatorToHighMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setRadiatorToHigh",
      requestType = com.proto.homeHeating.radiatorToUpdateRequest.class,
      responseType = com.proto.homeHeating.radiatorDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorToUpdateRequest,
      com.proto.homeHeating.radiatorDetailResponse> getSetRadiatorToHighMethod() {
    io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorToUpdateRequest, com.proto.homeHeating.radiatorDetailResponse> getSetRadiatorToHighMethod;
    if ((getSetRadiatorToHighMethod = radiatorServiceGrpc.getSetRadiatorToHighMethod) == null) {
      synchronized (radiatorServiceGrpc.class) {
        if ((getSetRadiatorToHighMethod = radiatorServiceGrpc.getSetRadiatorToHighMethod) == null) {
          radiatorServiceGrpc.getSetRadiatorToHighMethod = getSetRadiatorToHighMethod = 
              io.grpc.MethodDescriptor.<com.proto.homeHeating.radiatorToUpdateRequest, com.proto.homeHeating.radiatorDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "homeHeating.radiatorService", "setRadiatorToHigh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.homeHeating.radiatorToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.homeHeating.radiatorDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new radiatorServiceMethodDescriptorSupplier("setRadiatorToHigh"))
                  .build();
          }
        }
     }
     return getSetRadiatorToHighMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorToUpdateRequest,
      com.proto.homeHeating.radiatorDetailResponse> getSetRadiatorToOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setRadiatorToOff",
      requestType = com.proto.homeHeating.radiatorToUpdateRequest.class,
      responseType = com.proto.homeHeating.radiatorDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorToUpdateRequest,
      com.proto.homeHeating.radiatorDetailResponse> getSetRadiatorToOffMethod() {
    io.grpc.MethodDescriptor<com.proto.homeHeating.radiatorToUpdateRequest, com.proto.homeHeating.radiatorDetailResponse> getSetRadiatorToOffMethod;
    if ((getSetRadiatorToOffMethod = radiatorServiceGrpc.getSetRadiatorToOffMethod) == null) {
      synchronized (radiatorServiceGrpc.class) {
        if ((getSetRadiatorToOffMethod = radiatorServiceGrpc.getSetRadiatorToOffMethod) == null) {
          radiatorServiceGrpc.getSetRadiatorToOffMethod = getSetRadiatorToOffMethod = 
              io.grpc.MethodDescriptor.<com.proto.homeHeating.radiatorToUpdateRequest, com.proto.homeHeating.radiatorDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "homeHeating.radiatorService", "setRadiatorToOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.homeHeating.radiatorToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.homeHeating.radiatorDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new radiatorServiceMethodDescriptorSupplier("setRadiatorToOff"))
                  .build();
          }
        }
     }
     return getSetRadiatorToOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static radiatorServiceStub newStub(io.grpc.Channel channel) {
    return new radiatorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static radiatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new radiatorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static radiatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new radiatorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class radiatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showRadiatorStatus(com.proto.homeHeating.radiatorStatusRequest request,
        io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowRadiatorStatusMethod(), responseObserver);
    }

    /**
     */
    public void setRadiatorToLow(com.proto.homeHeating.radiatorToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetRadiatorToLowMethod(), responseObserver);
    }

    /**
     */
    public void setRadiatorToMedium(com.proto.homeHeating.radiatorToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetRadiatorToMediumMethod(), responseObserver);
    }

    /**
     */
    public void setRadiatorToHigh(com.proto.homeHeating.radiatorToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetRadiatorToHighMethod(), responseObserver);
    }

    /**
     */
    public void setRadiatorToOff(com.proto.homeHeating.radiatorToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetRadiatorToOffMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowRadiatorStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.homeHeating.radiatorStatusRequest,
                com.proto.homeHeating.radiatorStatusResponse>(
                  this, METHODID_SHOW_RADIATOR_STATUS)))
          .addMethod(
            getSetRadiatorToLowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.homeHeating.radiatorToUpdateRequest,
                com.proto.homeHeating.radiatorDetailResponse>(
                  this, METHODID_SET_RADIATOR_TO_LOW)))
          .addMethod(
            getSetRadiatorToMediumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.homeHeating.radiatorToUpdateRequest,
                com.proto.homeHeating.radiatorDetailResponse>(
                  this, METHODID_SET_RADIATOR_TO_MEDIUM)))
          .addMethod(
            getSetRadiatorToHighMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.homeHeating.radiatorToUpdateRequest,
                com.proto.homeHeating.radiatorDetailResponse>(
                  this, METHODID_SET_RADIATOR_TO_HIGH)))
          .addMethod(
            getSetRadiatorToOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.homeHeating.radiatorToUpdateRequest,
                com.proto.homeHeating.radiatorDetailResponse>(
                  this, METHODID_SET_RADIATOR_TO_OFF)))
          .build();
    }
  }

  /**
   */
  public static final class radiatorServiceStub extends io.grpc.stub.AbstractStub<radiatorServiceStub> {
    private radiatorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private radiatorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected radiatorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new radiatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void showRadiatorStatus(com.proto.homeHeating.radiatorStatusRequest request,
        io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowRadiatorStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRadiatorToLow(com.proto.homeHeating.radiatorToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetRadiatorToLowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRadiatorToMedium(com.proto.homeHeating.radiatorToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetRadiatorToMediumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRadiatorToHigh(com.proto.homeHeating.radiatorToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetRadiatorToHighMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRadiatorToOff(com.proto.homeHeating.radiatorToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetRadiatorToOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class radiatorServiceBlockingStub extends io.grpc.stub.AbstractStub<radiatorServiceBlockingStub> {
    private radiatorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private radiatorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected radiatorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new radiatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.homeHeating.radiatorStatusResponse showRadiatorStatus(com.proto.homeHeating.radiatorStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowRadiatorStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.homeHeating.radiatorDetailResponse setRadiatorToLow(com.proto.homeHeating.radiatorToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetRadiatorToLowMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.homeHeating.radiatorDetailResponse setRadiatorToMedium(com.proto.homeHeating.radiatorToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetRadiatorToMediumMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.homeHeating.radiatorDetailResponse setRadiatorToHigh(com.proto.homeHeating.radiatorToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetRadiatorToHighMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.homeHeating.radiatorDetailResponse setRadiatorToOff(com.proto.homeHeating.radiatorToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetRadiatorToOffMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class radiatorServiceFutureStub extends io.grpc.stub.AbstractStub<radiatorServiceFutureStub> {
    private radiatorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private radiatorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected radiatorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new radiatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.homeHeating.radiatorStatusResponse> showRadiatorStatus(
        com.proto.homeHeating.radiatorStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowRadiatorStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.homeHeating.radiatorDetailResponse> setRadiatorToLow(
        com.proto.homeHeating.radiatorToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetRadiatorToLowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.homeHeating.radiatorDetailResponse> setRadiatorToMedium(
        com.proto.homeHeating.radiatorToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetRadiatorToMediumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.homeHeating.radiatorDetailResponse> setRadiatorToHigh(
        com.proto.homeHeating.radiatorToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetRadiatorToHighMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.homeHeating.radiatorDetailResponse> setRadiatorToOff(
        com.proto.homeHeating.radiatorToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetRadiatorToOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_RADIATOR_STATUS = 0;
  private static final int METHODID_SET_RADIATOR_TO_LOW = 1;
  private static final int METHODID_SET_RADIATOR_TO_MEDIUM = 2;
  private static final int METHODID_SET_RADIATOR_TO_HIGH = 3;
  private static final int METHODID_SET_RADIATOR_TO_OFF = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final radiatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(radiatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_RADIATOR_STATUS:
          serviceImpl.showRadiatorStatus((com.proto.homeHeating.radiatorStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorStatusResponse>) responseObserver);
          break;
        case METHODID_SET_RADIATOR_TO_LOW:
          serviceImpl.setRadiatorToLow((com.proto.homeHeating.radiatorToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorDetailResponse>) responseObserver);
          break;
        case METHODID_SET_RADIATOR_TO_MEDIUM:
          serviceImpl.setRadiatorToMedium((com.proto.homeHeating.radiatorToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorDetailResponse>) responseObserver);
          break;
        case METHODID_SET_RADIATOR_TO_HIGH:
          serviceImpl.setRadiatorToHigh((com.proto.homeHeating.radiatorToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorDetailResponse>) responseObserver);
          break;
        case METHODID_SET_RADIATOR_TO_OFF:
          serviceImpl.setRadiatorToOff((com.proto.homeHeating.radiatorToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.homeHeating.radiatorDetailResponse>) responseObserver);
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

  private static abstract class radiatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    radiatorServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.homeHeating.HomeHeating.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("radiatorService");
    }
  }

  private static final class radiatorServiceFileDescriptorSupplier
      extends radiatorServiceBaseDescriptorSupplier {
    radiatorServiceFileDescriptorSupplier() {}
  }

  private static final class radiatorServiceMethodDescriptorSupplier
      extends radiatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    radiatorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (radiatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new radiatorServiceFileDescriptorSupplier())
              .addMethod(getShowRadiatorStatusMethod())
              .addMethod(getSetRadiatorToLowMethod())
              .addMethod(getSetRadiatorToMediumMethod())
              .addMethod(getSetRadiatorToHighMethod())
              .addMethod(getSetRadiatorToOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
