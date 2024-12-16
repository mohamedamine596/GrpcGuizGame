package cobra.quiz;

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
 * <pre>
 * Service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Quiz.proto")
public final class QuizGameGrpc {

  private QuizGameGrpc() {}

  public static final String SERVICE_NAME = "cobra.quiz.QuizGame";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cobra.quiz.QuizOuterClass.RegisterPlayerRequest,
      cobra.quiz.QuizOuterClass.RegisterPlayerResponse> getRegisterPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPlayer",
      requestType = cobra.quiz.QuizOuterClass.RegisterPlayerRequest.class,
      responseType = cobra.quiz.QuizOuterClass.RegisterPlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cobra.quiz.QuizOuterClass.RegisterPlayerRequest,
      cobra.quiz.QuizOuterClass.RegisterPlayerResponse> getRegisterPlayerMethod() {
    io.grpc.MethodDescriptor<cobra.quiz.QuizOuterClass.RegisterPlayerRequest, cobra.quiz.QuizOuterClass.RegisterPlayerResponse> getRegisterPlayerMethod;
    if ((getRegisterPlayerMethod = QuizGameGrpc.getRegisterPlayerMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getRegisterPlayerMethod = QuizGameGrpc.getRegisterPlayerMethod) == null) {
          QuizGameGrpc.getRegisterPlayerMethod = getRegisterPlayerMethod = 
              io.grpc.MethodDescriptor.<cobra.quiz.QuizOuterClass.RegisterPlayerRequest, cobra.quiz.QuizOuterClass.RegisterPlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cobra.quiz.QuizGame", "RegisterPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cobra.quiz.QuizOuterClass.RegisterPlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cobra.quiz.QuizOuterClass.RegisterPlayerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("RegisterPlayer"))
                  .build();
          }
        }
     }
     return getRegisterPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      cobra.quiz.QuizOuterClass.GetQuizResponse> getGetQuizMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuiz",
      requestType = com.google.protobuf.Empty.class,
      responseType = cobra.quiz.QuizOuterClass.GetQuizResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      cobra.quiz.QuizOuterClass.GetQuizResponse> getGetQuizMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, cobra.quiz.QuizOuterClass.GetQuizResponse> getGetQuizMethod;
    if ((getGetQuizMethod = QuizGameGrpc.getGetQuizMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetQuizMethod = QuizGameGrpc.getGetQuizMethod) == null) {
          QuizGameGrpc.getGetQuizMethod = getGetQuizMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, cobra.quiz.QuizOuterClass.GetQuizResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cobra.quiz.QuizGame", "GetQuiz"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cobra.quiz.QuizOuterClass.GetQuizResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("GetQuiz"))
                  .build();
          }
        }
     }
     return getGetQuizMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cobra.quiz.QuizOuterClass.GetQuestionRequest,
      cobra.quiz.QuizOuterClass.GetQuestionResponse> getGetQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuestion",
      requestType = cobra.quiz.QuizOuterClass.GetQuestionRequest.class,
      responseType = cobra.quiz.QuizOuterClass.GetQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cobra.quiz.QuizOuterClass.GetQuestionRequest,
      cobra.quiz.QuizOuterClass.GetQuestionResponse> getGetQuestionMethod() {
    io.grpc.MethodDescriptor<cobra.quiz.QuizOuterClass.GetQuestionRequest, cobra.quiz.QuizOuterClass.GetQuestionResponse> getGetQuestionMethod;
    if ((getGetQuestionMethod = QuizGameGrpc.getGetQuestionMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetQuestionMethod = QuizGameGrpc.getGetQuestionMethod) == null) {
          QuizGameGrpc.getGetQuestionMethod = getGetQuestionMethod = 
              io.grpc.MethodDescriptor.<cobra.quiz.QuizOuterClass.GetQuestionRequest, cobra.quiz.QuizOuterClass.GetQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cobra.quiz.QuizGame", "GetQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cobra.quiz.QuizOuterClass.GetQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cobra.quiz.QuizOuterClass.GetQuestionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("GetQuestion"))
                  .build();
          }
        }
     }
     return getGetQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cobra.quiz.QuizOuterClass.PlayRequest,
      cobra.quiz.QuizOuterClass.PlayResponse> getPlayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Play",
      requestType = cobra.quiz.QuizOuterClass.PlayRequest.class,
      responseType = cobra.quiz.QuizOuterClass.PlayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cobra.quiz.QuizOuterClass.PlayRequest,
      cobra.quiz.QuizOuterClass.PlayResponse> getPlayMethod() {
    io.grpc.MethodDescriptor<cobra.quiz.QuizOuterClass.PlayRequest, cobra.quiz.QuizOuterClass.PlayResponse> getPlayMethod;
    if ((getPlayMethod = QuizGameGrpc.getPlayMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getPlayMethod = QuizGameGrpc.getPlayMethod) == null) {
          QuizGameGrpc.getPlayMethod = getPlayMethod = 
              io.grpc.MethodDescriptor.<cobra.quiz.QuizOuterClass.PlayRequest, cobra.quiz.QuizOuterClass.PlayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cobra.quiz.QuizGame", "Play"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cobra.quiz.QuizOuterClass.PlayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cobra.quiz.QuizOuterClass.PlayResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("Play"))
                  .build();
          }
        }
     }
     return getPlayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      cobra.quiz.QuizOuterClass.GetPlayerScoresResponse> getGetPlayerScoresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerScores",
      requestType = com.google.protobuf.Empty.class,
      responseType = cobra.quiz.QuizOuterClass.GetPlayerScoresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      cobra.quiz.QuizOuterClass.GetPlayerScoresResponse> getGetPlayerScoresMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, cobra.quiz.QuizOuterClass.GetPlayerScoresResponse> getGetPlayerScoresMethod;
    if ((getGetPlayerScoresMethod = QuizGameGrpc.getGetPlayerScoresMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetPlayerScoresMethod = QuizGameGrpc.getGetPlayerScoresMethod) == null) {
          QuizGameGrpc.getGetPlayerScoresMethod = getGetPlayerScoresMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, cobra.quiz.QuizOuterClass.GetPlayerScoresResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cobra.quiz.QuizGame", "GetPlayerScores"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cobra.quiz.QuizOuterClass.GetPlayerScoresResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("GetPlayerScores"))
                  .build();
          }
        }
     }
     return getGetPlayerScoresMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QuizGameStub newStub(io.grpc.Channel channel) {
    return new QuizGameStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QuizGameBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QuizGameBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QuizGameFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QuizGameFutureStub(channel);
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static abstract class QuizGameImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerPlayer(cobra.quiz.QuizOuterClass.RegisterPlayerRequest request,
        io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.RegisterPlayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterPlayerMethod(), responseObserver);
    }

    /**
     */
    public void getQuiz(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.GetQuizResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQuizMethod(), responseObserver);
    }

    /**
     */
    public void getQuestion(cobra.quiz.QuizOuterClass.GetQuestionRequest request,
        io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.GetQuestionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQuestionMethod(), responseObserver);
    }

    /**
     */
    public void play(cobra.quiz.QuizOuterClass.PlayRequest request,
        io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.PlayResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayMethod(), responseObserver);
    }

    /**
     */
    public void getPlayerScores(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.GetPlayerScoresResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerScoresMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterPlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cobra.quiz.QuizOuterClass.RegisterPlayerRequest,
                cobra.quiz.QuizOuterClass.RegisterPlayerResponse>(
                  this, METHODID_REGISTER_PLAYER)))
          .addMethod(
            getGetQuizMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                cobra.quiz.QuizOuterClass.GetQuizResponse>(
                  this, METHODID_GET_QUIZ)))
          .addMethod(
            getGetQuestionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cobra.quiz.QuizOuterClass.GetQuestionRequest,
                cobra.quiz.QuizOuterClass.GetQuestionResponse>(
                  this, METHODID_GET_QUESTION)))
          .addMethod(
            getPlayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cobra.quiz.QuizOuterClass.PlayRequest,
                cobra.quiz.QuizOuterClass.PlayResponse>(
                  this, METHODID_PLAY)))
          .addMethod(
            getGetPlayerScoresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                cobra.quiz.QuizOuterClass.GetPlayerScoresResponse>(
                  this, METHODID_GET_PLAYER_SCORES)))
          .build();
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class QuizGameStub extends io.grpc.stub.AbstractStub<QuizGameStub> {
    private QuizGameStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QuizGameStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuizGameStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QuizGameStub(channel, callOptions);
    }

    /**
     */
    public void registerPlayer(cobra.quiz.QuizOuterClass.RegisterPlayerRequest request,
        io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.RegisterPlayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuiz(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.GetQuizResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQuizMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuestion(cobra.quiz.QuizOuterClass.GetQuestionRequest request,
        io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.GetQuestionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void play(cobra.quiz.QuizOuterClass.PlayRequest request,
        io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.PlayResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayerScores(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.GetPlayerScoresResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerScoresMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class QuizGameBlockingStub extends io.grpc.stub.AbstractStub<QuizGameBlockingStub> {
    private QuizGameBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QuizGameBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuizGameBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QuizGameBlockingStub(channel, callOptions);
    }

    /**
     */
    public cobra.quiz.QuizOuterClass.RegisterPlayerResponse registerPlayer(cobra.quiz.QuizOuterClass.RegisterPlayerRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public cobra.quiz.QuizOuterClass.GetQuizResponse getQuiz(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetQuizMethod(), getCallOptions(), request);
    }

    /**
     */
    public cobra.quiz.QuizOuterClass.GetQuestionResponse getQuestion(cobra.quiz.QuizOuterClass.GetQuestionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    public cobra.quiz.QuizOuterClass.PlayResponse play(cobra.quiz.QuizOuterClass.PlayRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayMethod(), getCallOptions(), request);
    }

    /**
     */
    public cobra.quiz.QuizOuterClass.GetPlayerScoresResponse getPlayerScores(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerScoresMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class QuizGameFutureStub extends io.grpc.stub.AbstractStub<QuizGameFutureStub> {
    private QuizGameFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QuizGameFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuizGameFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QuizGameFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cobra.quiz.QuizOuterClass.RegisterPlayerResponse> registerPlayer(
        cobra.quiz.QuizOuterClass.RegisterPlayerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterPlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cobra.quiz.QuizOuterClass.GetQuizResponse> getQuiz(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQuizMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cobra.quiz.QuizOuterClass.GetQuestionResponse> getQuestion(
        cobra.quiz.QuizOuterClass.GetQuestionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQuestionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cobra.quiz.QuizOuterClass.PlayResponse> play(
        cobra.quiz.QuizOuterClass.PlayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cobra.quiz.QuizOuterClass.GetPlayerScoresResponse> getPlayerScores(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerScoresMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_PLAYER = 0;
  private static final int METHODID_GET_QUIZ = 1;
  private static final int METHODID_GET_QUESTION = 2;
  private static final int METHODID_PLAY = 3;
  private static final int METHODID_GET_PLAYER_SCORES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QuizGameImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QuizGameImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_PLAYER:
          serviceImpl.registerPlayer((cobra.quiz.QuizOuterClass.RegisterPlayerRequest) request,
              (io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.RegisterPlayerResponse>) responseObserver);
          break;
        case METHODID_GET_QUIZ:
          serviceImpl.getQuiz((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.GetQuizResponse>) responseObserver);
          break;
        case METHODID_GET_QUESTION:
          serviceImpl.getQuestion((cobra.quiz.QuizOuterClass.GetQuestionRequest) request,
              (io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.GetQuestionResponse>) responseObserver);
          break;
        case METHODID_PLAY:
          serviceImpl.play((cobra.quiz.QuizOuterClass.PlayRequest) request,
              (io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.PlayResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_SCORES:
          serviceImpl.getPlayerScores((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<cobra.quiz.QuizOuterClass.GetPlayerScoresResponse>) responseObserver);
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

  private static abstract class QuizGameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QuizGameBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cobra.quiz.QuizOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QuizGame");
    }
  }

  private static final class QuizGameFileDescriptorSupplier
      extends QuizGameBaseDescriptorSupplier {
    QuizGameFileDescriptorSupplier() {}
  }

  private static final class QuizGameMethodDescriptorSupplier
      extends QuizGameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QuizGameMethodDescriptorSupplier(String methodName) {
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
      synchronized (QuizGameGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QuizGameFileDescriptorSupplier())
              .addMethod(getRegisterPlayerMethod())
              .addMethod(getGetQuizMethod())
              .addMethod(getGetQuestionMethod())
              .addMethod(getPlayMethod())
              .addMethod(getGetPlayerScoresMethod())
              .build();
        }
      }
    }
    return result;
  }
}
