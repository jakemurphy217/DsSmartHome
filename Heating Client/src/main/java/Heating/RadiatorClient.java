package Heating;

import com.proto.homeHeating.radiatorStatusRequest;
import com.proto.homeHeating.radiatorToUpdateRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

import static com.proto.homeHeating.radiatorServiceGrpc.getShowRadiatorStatusMethod;
import static com.proto.homeHeating.radiatorServiceGrpc.newBlockingStub;

public class RadiatorClient extends JFrame {


    private JButton offBtn;
    private JButton StatusBtn;
    private JButton lowTempBtn;
    private JButton mediumTempBtn;
    private JButton highTempBtn;
    private JTextArea textArea;
    private JPanel mainPannel;

    public RadiatorClient() {
        offBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Off button clicked ");
                radiatorToOff();

            }
        });


        highTempBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("High Temp button clicked ");
                radiatorToHigh();

            }
        });
        mediumTempBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Medium Temp button clicked ");
                radiatorToMedium();

            }
        });
        lowTempBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("LowTemp button clicked ");
                radiatorToLow();
            }
        });
        StatusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Status button clicked ");
                radiatorStatus();
            }
        });
        textArea.addComponentListener(new ComponentAdapter() {

        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("lightsGUI");
        frame.setContentPane(new RadiatorClient().mainPannel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

    private void radiatorStatus() {
        System.out.println("radiator status is running");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        com.proto.homeHeating.radiatorServiceGrpc.radiatorServiceBlockingStub radiatorStatusStub = newBlockingStub(channel);

        com.proto.homeHeating.radiatorStatusRequest radiatorRequest = radiatorStatusRequest.newBuilder().setRadiatorId(1).build();

        com.proto.homeHeating.radiatorStatusResponse serverResponse = radiatorStatusStub.showRadiatorStatus(radiatorRequest);

        String result = serverResponse.getRadiator().toString();
//        message_text_area.setText(result);

        System.out.println(result);
        System.out.println("shutting down");
        channel.shutdown();


    }

    private void radiatorToLow(){

        System.out.println("radiator status is Low");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        com.proto.homeHeating.radiatorServiceGrpc.radiatorServiceBlockingStub radiatorStatusStub = newBlockingStub(channel);

        com.proto.homeHeating.radiatorToUpdateRequest radiatorToUpdate = radiatorToUpdateRequest.newBuilder().setRadiatorId(1).build();

        com.proto.homeHeating.radiatorDetailResponse serverResponse = radiatorStatusStub.setRadiatorToLow(radiatorToUpdate);

        String result = serverResponse.getRadiator().toString();
//        message_text_area.setText(result);

        System.out.println(result);
//        System.out.println("shutting down heating low temp client");
        channel.shutdown();

    }

    private void radiatorToMedium(){

        System.out.println("radiator status is Medium");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        com.proto.homeHeating.radiatorServiceGrpc.radiatorServiceBlockingStub radiatorStatusStub = newBlockingStub(channel);

        com.proto.homeHeating.radiatorToUpdateRequest radiatorToUpdate = radiatorToUpdateRequest.newBuilder().setRadiatorId(1).build();

        com.proto.homeHeating.radiatorDetailResponse serverResponse = radiatorStatusStub.setRadiatorToMedium(radiatorToUpdate);

        String result = serverResponse.getRadiator().toString();
//        message_text_area.setText(result);

        System.out.println(result);
//        System.out.println("shutting down heating Medium temp client");
        channel.shutdown();

    }

    private void radiatorToHigh(){

        System.out.println("radiator status is High");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        com.proto.homeHeating.radiatorServiceGrpc.radiatorServiceBlockingStub radiatorStatusStub = newBlockingStub(channel);

        com.proto.homeHeating.radiatorToUpdateRequest radiatorToUpdate = radiatorToUpdateRequest.newBuilder().setRadiatorId(1).build();

        com.proto.homeHeating.radiatorDetailResponse serverResponse = radiatorStatusStub.setRadiatorToHigh(radiatorToUpdate);

        String result = serverResponse.getRadiator().toString();
//        message_text_area.setText(result);

        System.out.println(result);
//        System.out.println("shutting down heating High temp client");
        channel.shutdown();

    }

    private void radiatorToOff(){

        System.out.println("radiator status to Turn Off");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        com.proto.homeHeating.radiatorServiceGrpc.radiatorServiceBlockingStub radiatorStatusStub = newBlockingStub(channel);

        com.proto.homeHeating.radiatorToUpdateRequest radiatorToUpdate = radiatorToUpdateRequest.newBuilder().setRadiatorId(1).build();

        com.proto.homeHeating.radiatorDetailResponse serverResponse = radiatorStatusStub.setRadiatorToOff(radiatorToUpdate);

        String result = serverResponse.getRadiator().toString();
//        message_text_area.setText(result);

        System.out.println(result);
        System.out.println("shutting down heating client");
        channel.shutdown();

    }
}
