import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class BitTorrent {
    static Shape node1,node2,node3,node4,node5,node6,frame11,frame12,frame13,ack11,ack12,ack13,frame21,frame22,frame23,ack21,ack22,ack23;
    static Shape frame31,frame32,frame33,ack31,ack32,ack33,frame41,frame42,frame43,ack41,ack42,ack43;
    static Shape frame51,frame52,frame53,ack51,ack52,ack53,frame61,frame62,frame63,ack61,ack62,ack63;
    static Shape line31,line36,line32,line56,line51,line52,line12,line64,line62,line14,line24;
    static Graphics2D g2;
    static JFrame frame;
    static JPanel panel;
    static int count = 0;

    public static void main(String[] args) {
        frame = new JFrame("BitTorrent Network Demonstration");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setBackground(Color.white);

        JButton next = new JButton("Next");

        panel = new JPanel(){
            public void paintComponent(Graphics g){
                g2 = (Graphics2D)g;
                Draw();
            }
        };

        frame.add(panel,BorderLayout.CENTER);
        frame.add(next,BorderLayout.SOUTH);

        frame.setVisible(true);

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                panel.setVisible(false);
                panel = new JPanel(){
                    public void paintComponent(Graphics g){
                        g2 = (Graphics2D)g;
                        Draw();
                        switch (count){
                            case 0: g2.setColor(Color.BLUE);
                                g2.draw(line31);
                                g2.setColor(Color.green);
                                g2.draw(line36);
                                g2.setColor(Color.magenta);
                                g2.draw(line51);
                                g2.setColor(Color.BLUE);
                                g2.draw(line56);
                                g2.setColor(Color.white);
                                count++;
                                break;

                            case 1: g2.setColor(Color.BLUE);
                                g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.white);
                                count++;
                                break;

                            case 2: g2.setColor(Color.BLUE);
                                g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.green);
                                g2.draw(line36);
                                g2.setColor(Color.magenta);
                                g2.draw(line51);
                                g2.setColor(Color.BLUE);
                                g2.draw(line56);
                                g2.setColor(Color.white);
                                count++;
                                break;

                            case 3: g2.setColor(Color.BLUE);
                                g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.RED);
                                g2.fill(ack32);
                                g2.setColor(Color.GREEN);
                                g2.fill(ack33);g2.fill(ack51);g2.fill(ack52);
                                g2.setColor(Color.white);
                                count++;
                                break;

                            case 4: g2.setColor(Color.BLUE);
                                g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.BLUE);
                                g2.draw(line31);
                                g2.fill(frame11);
                                g2.draw(line31);
                                count++;
                                break;

                            case 5: g2.setColor(Color.BLUE);
                                g2.fill(frame61);g2.fill(frame11);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.GREEN);
                                g2.fill(ack32);
                                count++;
                                break;

                            case 6: g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.magenta);
                                g2.draw(line32);
                                g2.setColor(Color.green);
                                g2.draw(line52);
                                g2.setColor(Color.white);
                                count++;
                                break;

                            case 7: g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.green);
                                g2.fill(frame21);
                                g2.setColor(Color.magenta);
                                g2.fill(frame22);
                                count++;
                                break;

                            case 8: g2.setColor(Color.magenta);
                                g2.draw(line32);
                                g2.setColor(Color.green);
                                g2.draw(line52);
                                g2.fill(ack31);g2.fill(ack53);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.green);
                                g2.fill(frame21);
                                g2.setColor(Color.magenta);
                                g2.fill(frame22);
                                count++;
                                break;

                            case 9: g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.green);
                                g2.fill(frame21);
                                g2.setColor(Color.magenta);
                                g2.fill(frame22);
                                g2.setColor(Color.green);
                                g2.draw(line12);
                                g2.setColor(Color.magenta);
                                g2.draw(line62);
                                count++;
                                break;

                            case 10: g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.green);
                                g2.fill(frame21);
                                g2.setColor(Color.magenta);
                                g2.fill(frame22);
                                g2.setColor(Color.green);
                                g2.fill(frame13);
                                g2.setColor(Color.magenta);
                                g2.fill(frame63);
                                count++;
                                break;

                            case 11: g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.green);
                                g2.fill(frame21);
                                g2.setColor(Color.magenta);
                                g2.fill(frame22);
                                g2.setColor(Color.green);
                                g2.fill(frame13);
                                g2.setColor(Color.magenta);
                                g2.fill(frame63);
                                g2.setColor(Color.green);
                                g2.draw(line12);
                                g2.fill(ack21);g2.fill(ack22);
                                g2.setColor(Color.magenta);
                                g2.draw(line62);
                                count++;
                                break;

                            case 12: g2.setColor(Color.BLUE);
                                g2.draw(line12);
                                g2.setColor(Color.MAGENTA);
                                g2.draw(line64);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.green);
                                g2.fill(frame21);
                                g2.setColor(Color.magenta);
                                g2.fill(frame22);
                                g2.setColor(Color.green);
                                g2.fill(frame13);
                                g2.setColor(Color.magenta);
                                g2.fill(frame63);
                                count++;
                                break;

                            case 13: g2.setColor(Color.BLUE);
                                g2.fill(frame23);
                                g2.setColor(Color.MAGENTA);
                                g2.fill(frame41);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.green);
                                g2.fill(frame21);
                                g2.setColor(Color.magenta);
                                g2.fill(frame22);
                                g2.setColor(Color.green);
                                g2.fill(frame13);
                                g2.setColor(Color.magenta);
                                g2.fill(frame63);
                                count++;
                                break;

                            case 14: g2.setColor(Color.BLUE);
                                g2.draw(line12);
                                g2.setColor(Color.MAGENTA);
                                g2.draw(line64);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame23);
                                g2.setColor(Color.MAGENTA);
                                g2.fill(frame41);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);g2.fill(ack11);g2.fill(ack63);
                                g2.setColor(Color.green);
                                g2.fill(frame21);
                                g2.setColor(Color.magenta);
                                g2.fill(frame22);
                                g2.setColor(Color.green);
                                g2.fill(frame13);
                                g2.setColor(Color.magenta);
                                g2.fill(frame63);
                                count++;
                                break;

                            case 15: g2.setColor(Color.green);
                                g2.draw(line24);
                                g2.setColor(Color.BLUE);
                                g2.draw(line14);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame23);
                                g2.setColor(Color.MAGENTA);
                                g2.fill(frame41);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.green);
                                g2.fill(frame21);
                                g2.setColor(Color.magenta);
                                g2.fill(frame22);
                                g2.setColor(Color.green);
                                g2.fill(frame13);
                                g2.setColor(Color.magenta);
                                g2.fill(frame63);
                                count++;
                                break;

                            case 16: g2.setColor(Color.BLUE);
                                g2.fill(frame42);
                                g2.setColor(Color.green);
                                g2.fill(frame43);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame23);
                                g2.setColor(Color.MAGENTA);
                                g2.fill(frame41);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.green);
                                g2.fill(frame21);
                                g2.setColor(Color.magenta);
                                g2.fill(frame22);
                                g2.setColor(Color.green);
                                g2.fill(frame13);
                                g2.setColor(Color.magenta);
                                g2.fill(frame63);
                                count++;
                                break;

                            case 17: g2.setColor(Color.green);
                                g2.draw(line24);
                                g2.setColor(Color.BLUE);
                                g2.draw(line14);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame42);
                                g2.setColor(Color.green);
                                g2.fill(frame43);g2.fill(ack21);g2.fill(ack11);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame23);
                                g2.setColor(Color.MAGENTA);
                                g2.fill(frame41);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.green);
                                g2.fill(frame21);
                                g2.setColor(Color.magenta);
                                g2.fill(frame22);
                                g2.setColor(Color.green);
                                g2.fill(frame13);
                                g2.setColor(Color.magenta);
                                g2.fill(frame63);
                                count++;
                                break;

                            case 18: g2.setColor(Color.BLUE);
                                g2.fill(frame42);
                                g2.setColor(Color.green);
                                g2.fill(frame43);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame23);
                                g2.setColor(Color.MAGENTA);
                                g2.fill(frame41);
                                g2.setColor(Color.BLUE);
                                g2.fill(frame11);g2.fill(frame61);
                                g2.setColor(Color.magenta);
                                g2.fill(frame12);
                                g2.setColor(Color.green);
                                g2.fill(frame62);
                                g2.setColor(Color.green);
                                g2.fill(frame21);
                                g2.setColor(Color.magenta);
                                g2.fill(frame22);
                                g2.setColor(Color.green);
                                g2.fill(frame13);
                                g2.setColor(Color.magenta);
                                g2.fill(frame63);
                                break;

                        }
                    }
                };
                panel.setVisible(true);
                frame.add(panel,BorderLayout.CENTER);
            }
        });
    }

    static void Draw(){

        node1 = new Ellipse2D.Double(400,100,50,50);
        frame11 = new Rectangle(400,80,10,15);
        frame12 = new Rectangle(410,80,10,15);
        frame13 = new Rectangle(420,80,10,15);
        ack11 = new Rectangle(400,70,5,5);
        ack12 = new Rectangle(410,70,5,5);
        ack13 = new Rectangle(420,70,5,5);

        node2 = new Ellipse2D.Double(200,200,50,50);
        frame21 = new Rectangle(150,200,10,15);
        frame22 = new Rectangle(160,200,10,15);
        frame23 = new Rectangle(170,200,10,15);
        ack21 = new Rectangle(150,190,5,5);
        ack22 = new Rectangle(160,190,5,5);
        ack23 = new Rectangle(170,190,5,5);

        node3 = new Ellipse2D.Double(600,200,50,50);
        frame31 = new Rectangle(680,200,10,15);
        frame32 = new Rectangle(690,200,10,15);
        frame33 = new Rectangle(700,200,10,15);
        ack31 = new Rectangle(680,190,5,5);
        ack32 = new Rectangle(690,190,5,5);
        ack33 = new Rectangle(700,190,5,5);

        node4 = new Ellipse2D.Double(200,300,50,50);
        frame41 = new Rectangle(150,300,10,15);
        frame42 = new Rectangle(160,300,10,15);
        frame43 = new Rectangle(170,300,10,15);
        ack41 = new Rectangle(150,290,5,5);
        ack42 = new Rectangle(160,290,5,5);
        ack43 = new Rectangle(170,290,5,5);

        node5 = new Ellipse2D.Double(600,300,50,50);
        frame51 = new Rectangle(680,300,10,15);
        frame52 = new Rectangle(690,300,10,15);
        frame53 = new Rectangle(700,300,10,15);
        ack51 = new Rectangle(680,290,5,5);
        ack52 = new Rectangle(690,290,5,5);
        ack53 = new Rectangle(700,290,5,5);

        node6 = new Ellipse2D.Double(400,400,50,50);
        frame61 = new Rectangle(400,470,10,15);
        frame62 = new Rectangle(410,470,10,15);
        frame63 = new Rectangle(420,470,10,15);
        ack61 = new Rectangle(400,460,5,5);
        ack62 = new Rectangle(410,460,5,5);
        ack63 = new Rectangle(420,460,5,5);

        line12 = new Line2D.Double(400,130,250,220);
        line14 = new Line2D.Double(400,130,250,320);
        line62 = new Line2D.Double(400,430,250,230);
        line64 = new Line2D.Double(400,430,250,320);
        line24 = new Line2D.Double(225,250,225,300);

        line31 = new Line2D.Double(600,230,450,130);
        line36 = new Line2D.Double(600,230,450,430);
        line32 = new Line2D.Double(600,230,250,230);

        line56 = new Line2D.Double(600,330,450,430);
        line51 = new Line2D.Double(450,130,600,330);
        line52 = new Line2D.Double(600,330,250,230);

        g2.setColor(Color.ORANGE);
        g2.fill(node1);
        g2.setColor(Color.CYAN);
        g2.fill(node2);
        g2.setColor(Color.RED);
        g2.fill(node3);
        g2.setColor(Color.BLACK);
        g2.fill(node4);
        g2.setColor(Color.PINK);
        g2.fill(node5);
        g2.setColor(Color.GRAY);
        g2.fill(node6);

        g2.setColor(Color.magenta);
        g2.fill(frame31);g2.fill(frame51);
        g2.setColor(Color.BLUE);
        g2.fill(frame32);g2.fill(frame52);
        g2.setColor(Color.GREEN);
        g2.fill(frame33);g2.fill(frame53);
        g2.setColor(Color.BLACK);

        g2.draw(node1);
        g2.draw(node2);
        g2.draw(node3);
        g2.draw(frame31);g2.draw(frame32);g2.draw(frame33);
        g2.draw(ack11);g2.draw(ack12);g2.draw(ack13);
        g2.draw(ack21);g2.draw(ack22);g2.draw(ack23);
        g2.draw(ack31);g2.draw(ack32);g2.draw(ack33);
        g2.draw(ack41);g2.draw(ack42);g2.draw(ack43);
        g2.draw(ack51);g2.draw(ack52);g2.draw(ack53);
        g2.draw(ack61);g2.draw(ack62);g2.draw(ack63);
        g2.draw(node4);
        g2.draw(node5);
        g2.draw(frame51);g2.draw(frame52);g2.draw(frame53);
        g2.draw(node6);

        g2.setColor(Color.white);
    }
}
