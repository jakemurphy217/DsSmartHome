package lightsClientGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.SmartHome.grpc.APILightsResponse;
import com.SmartHome.grpc.HomeLights;
import com.SmartHome.grpc.homeLightsGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import static com.SmartHome.grpc.homeLightsGrpc.newBlockingStub;


public class lightsGUI extends JFrame {
    private JButton lightsBtn;
    private JPanel mainPannel;
    private JLabel hallLights;
    private JLabel sittingRoomLights;
    private JLabel kitchenLights;
    private JPanel leftPannel;
    private JPanel rightPannel;
    private JLabel timer;
    private JButton hallLightsOnBtn;
    private JButton sittingRoomOnBtn;
    private JButton kitchenLightsOnBtn;
    private JButton timerOnBtn;
    private JButton hallLightsOffBtn;
    private JButton sittingRoomOffBtn;
    private JButton kitchenLightsOffBtn;
    private JButton timerOffBtn;


    public lightsGUI() {


        hallLightsOnBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, "i am hall light On");

                HallLightsOn();
            }
        });
        hallLightsOffBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, "i am hall light off");

                HallLightsOff();
            }
        });
        sittingRoomOnBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, "i am sitting Room Light on ");
                SittingRoomLightOns();
            }
        });
        sittingRoomOffBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, "i am sitting room light off");
                SittingRoomLightOff();
            }
        });
        kitchenLightsOnBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, "i am kitchen light on");
            KitchenLightsOn();
            }
        });
        kitchenLightsOffBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, "i am kitchen light off");
                KitchenLightsOff();
            }
        });
        timerOnBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "i am timer on");
            }
        });
        timerOffBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "i am timer off");
            }
        });
    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("lightsGUI");
        frame.setContentPane(new lightsGUI().mainPannel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

    private void HallLightsOn() {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
             .usePlaintext().build();

        homeLightsGrpc.homeLightsBlockingStub hallLightsStub = newBlockingStub(channel);

        com.SmartHome.grpc.hallLightsRequest hallLightsRequest = com
                .SmartHome
                .grpc
                .hallLightsRequest
                .newBuilder().setHallLightsOn("On").build();

        APILightsResponse response = hallLightsStub.hallLights(hallLightsRequest);

        System.out.println(response.getResponseMessage());
        System.out.println("Hall lights turned on");

        channel.shutdown();

    }

    private void HallLightsOff() {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext().build();

        homeLightsGrpc.homeLightsBlockingStub hallLightsStub = newBlockingStub(channel);

        com.SmartHome.grpc.hallLightsRequest hallLightsRequest = com
                .SmartHome
                .grpc
                .hallLightsRequest
                .newBuilder().setHallLightsOff("OFF").build();

        APILightsResponse response = hallLightsStub.hallLights(hallLightsRequest);

        System.out.println(response.getResponseMessage());
        System.out.println("Hall lights turned off");
        channel.shutdown();

    }

    private void SittingRoomLightOns(){

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext().build();

        homeLightsGrpc.homeLightsBlockingStub sittingRoomstub = newBlockingStub(channel);

        com.SmartHome.grpc.sittingRoomLightsRequest sittingRoomLightsRequest = com
                .SmartHome
                .grpc
                .sittingRoomLightsRequest
                .newBuilder().setSittingRoomLightsOn("On").build();

        APILightsResponse response = sittingRoomstub.sittingRoomLights(sittingRoomLightsRequest);

        System.out.println(response.getResponseMessage());
        System.out.println("Sitting room lights turned on");

        channel.shutdown();

    }

    private void SittingRoomLightOff(){

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext().build();

        homeLightsGrpc.homeLightsBlockingStub sittingRoomstub = newBlockingStub(channel);

        com.SmartHome.grpc.sittingRoomLightsRequest sittingRoomLightsRequest = com
                .SmartHome
                .grpc
                .sittingRoomLightsRequest
                .newBuilder().setSittingRoomLightsOff("OFF").build();

        APILightsResponse response = sittingRoomstub.sittingRoomLights(sittingRoomLightsRequest);

        System.out.println(response.getResponseMessage());
        System.out.println("Sitting room lights turned off");

        channel.shutdown();

    }

    private void KitchenLightsOn(){

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext().build();

        homeLightsGrpc.homeLightsBlockingStub kitchenLightsStub = newBlockingStub(channel);

        com.SmartHome.grpc.kitchenLightsRequest kitchenLightsRequest = com
                .SmartHome
                .grpc
                .kitchenLightsRequest
                .newBuilder().setKitchenLightsOn("ON").build();

        APILightsResponse response = kitchenLightsStub.kitchenLights(kitchenLightsRequest);

        System.out.println(response.getResponseMessage());
        System.out.println("Kitchen lights turned on");

        channel.shutdown();
    }

    private void KitchenLightsOff(){

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext().build();

        homeLightsGrpc.homeLightsBlockingStub kitchenLightsStub = newBlockingStub(channel);

        com.SmartHome.grpc.kitchenLightsRequest kitchenLightsRequest = com
                .SmartHome
                .grpc
                .kitchenLightsRequest
                .newBuilder().setKitchenLightsOff("OFF").build();

        APILightsResponse response = kitchenLightsStub.kitchenLights(kitchenLightsRequest);

        System.out.println(response.getResponseMessage());
        System.out.println("Kitchen lights turned OFF");

        channel.shutdown();
    }

    private void TimerOn(){

    }

    private void TimerOff(){

    }
}
