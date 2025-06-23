package life_changing_app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserver {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserver swingObserver = new SwingObserver();
        swingObserver.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("할까? 말까?");
//        button.addActionListener(new AngelListener());
//        button.addActionListener(new DevilListener());
        button.addActionListener(event -> System.out.println("하지 마! 아마 후회할 걸?"));
        button.addActionListener(event -> System.out.println("그냥 저질러 버려!"));

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

//    class AngelListener implements ActionListener {
//        public void actionPerformed(ActionEvent event) {
//            System.out.println("하지 마! 아마 후회할 걸?");
//        }
//    }
//
//    class DevilListener implements ActionListener {
//        public void actionPerformed(ActionEvent event) {
//            System.out.println("그냥 저질러 버려!");
//        }
//    }
}
