import java.awt.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cyphers
{
    private JPanel contentPane;
    private int hgap;
    private int vgap;

    public Cyphers()
    {
        hgap = 5;
        vgap = 5;
        
        Color mybackground = new Color(225,225,225);
        JFrame frame = new JFrame("Cyphers");
        JPanel contentPane = new JPanel();
        contentPane.setOpaque(true);
        contentPane.setBackground(mybackground);
        contentPane.setBorder(
        BorderFactory.createEmptyBorder(hgap, hgap, hgap, hgap));
        contentPane.setLayout(new GridLayout(1,0));
        
        JLabel mainlabel = new JLabel("Simple Cyphers");
        mainlabel.setFont(new Font("Serif", Font.BOLD, 24));
       
        
        JButton caesar = new JButton("Caeser Cypher");
        JButton pigpen = new JButton("Pigpen Cypher");
        JButton playfair = new JButton("Playfair Cypher");
        JButton morse = new JButton("Morse Cypher");
        
        JPanel topPanel = new JPanel(); 
        topPanel.setOpaque(true);
        topPanel.setBackground(Color.WHITE);      
        topPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        
        GroupLayout layout = new GroupLayout(topPanel);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
     
        layout.setHorizontalGroup(layout.createSequentialGroup()
                                   

                                    
                                    
                                    .addGroup(layout.createParallelGroup(CENTER)
                                                .addComponent(mainlabel)
                                                .addGroup(layout.createSequentialGroup()
                                                            
                                                          
                                                                         .addComponent(caesar)
                                                               
                                                               
                                                                           .addComponent(pigpen)
                                                               
                                                               
                                                                           //.addComponent(playfair)
                                                               
                                                              
                                                                           .addComponent(morse)
            
                                                               
                                                            )
                                                         )
                                             
                                 );
           
        layout.setVerticalGroup(layout.createSequentialGroup()
                                  .addGroup(layout.createParallelGroup(CENTER)
                                              .addComponent(mainlabel)  )
                               
                                   .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(BASELINE)
                                                             
                                                                         .addComponent(caesar)
                                                               
                                                               
                                                                           .addComponent(pigpen)
                                                               
                                                               
                                                                         //  .addComponent(playfair)
                                                               
                                                               
                                                                           .addComponent(morse)
            
                                                               
                                                            )
                                                         )
                               );
        //
       // layout.linkSize(SwingConstants.HORIZONTAL, encode1, encode2);

        topPanel.setLayout(layout);
        contentPane.add(topPanel);

    caesar.addActionListener(new ActionListener()//when clicked open up this page, and close the main meun
    { public void actionPerformed(ActionEvent e)
      {new CaesarUI(); frame.dispose();}
    });
    
    pigpen.addActionListener(new ActionListener()//when clicked open up this page, and close the main meun
    { public void actionPerformed(ActionEvent e)
      {new PigpenUI(); frame.dispose();}
    }); 
    /*
    playfair.addActionListener(new ActionListener()//when clicked open up this page, and close the main meun
    { public void actionPerformed(ActionEvent e)
      {new PlayfairUI(); frame.dispose();}
    });
    */
    morse.addActionListener(new ActionListener()//when clicked open up this page, and close the main meun
    { public void actionPerformed(ActionEvent e)
      {new MorseUI(); frame.dispose();}
    });
    
    
    frame.setContentPane(contentPane);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.setLocationByPlatform(true);
    frame.setVisible(true);
    }
    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Cyphers();
            }
        });
    }
}