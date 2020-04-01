package lights;
import com.SmartHome.grpc.HomeLights;
import com.SmartHome.grpc.homeLightsGrpc.homeLightsImplBase;
import io.grpc.stub.StreamObserver;

public class lightsService extends homeLightsImplBase {
    @Override
    public void lightStatus(HomeLights.lightStatusRequest request, StreamObserver<HomeLights.APIResponse> responseObserver) {
        System.out.println("Checking the status of light bulbs");
        String lightsOn = request.getLightsOn();
        String lightsOff = request.getLightsOff();

        HomeLights.APIResponse.Builder response = HomeLights.APIResponse.newBuilder();

        if (lightsOn.equals(lightsOff)) {
            //if successful
            response.setResponseCode(0).setResponsemessage("SUCCESS");

        }else {
            //not successful
            response.setResponseCode(100).setResponsemessage("LIGHTS ALREADY ON");
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
