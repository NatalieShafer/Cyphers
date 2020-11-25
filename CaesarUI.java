import java.awt.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CaesarUI
{
    private JPanel contentPane;
    private int hgap;
    private int vgap;
    private int shift;
    private String action;

    public CaesarUI()
    {
        hgap = 5;
        vgap = 5;
        shift = 1;
        
        Color mybackground = new Color(225,225,225);
        JFrame frame = new JFrame("Cyphers");
        JPanel contentPane = new JPanel();
        contentPane.setOpaque(true);
        contentPane.setBackground(mybackground);
        contentPane.setBorder(
        BorderFactory.createEmptyBorder(hgap, hgap, hgap, hgap));
        contentPane.setLayout(new GridLayout(1,0));
        
        JLabel shiftLable = new JLabel("Shift Used in the Cypher:");
        JLabel mainlabel = new JLabel("Caesar Cypher (Shift Cypher)");
        mainlabel.setFont(new Font("Serif", Font.BOLD, 24));
       
        JComboBox<String> encryptDecrypt = new JComboBox<String>(new String[] {"Encrypt", "Decrypt"});
        action = "Encrypt";
        encryptDecrypt.setPreferredSize(new Dimension(50, 20));
        JComboBox<Integer> shifts = new JComboBox<Integer>(new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26});
        
        char[] alphLARGE = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] alphSMALL = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        shifts.setPreferredSize(new Dimension(50, 20));

        JTextArea textIN = new JTextArea();
        JTextArea textOUT = new JTextArea();
        
        textIN.setPreferredSize(new Dimension(500, 80));
        textOUT.setPreferredSize(new Dimension(500, 80));
        textIN.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        textOUT.setBorder(new EtchedBorder(EtchedBorder.LOWERED));         
          
        JButton go = new JButton("GO");
        JButton back = new JButton("BACK");
        JButton reset = new JButton("RESET");   
        
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
                                                            .addGroup(layout.createParallelGroup(LEADING)
                                                                        .addComponent(back))
                                                            
                                                            .addGroup(layout.createParallelGroup(LEADING)
                                                                        .addComponent(encryptDecrypt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createParallelGroup(LEADING)
                                                                        .addComponent(shiftLable))
                                                            .addGroup(layout.createParallelGroup(LEADING)
                                                                        .addComponent(shifts, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                         )
                                                
                                                .addGroup(layout.createParallelGroup(CENTER)
                                                            .addComponent(textIN, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)  )
                                                
                                                .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(CENTER)
                                                                        .addComponent(go)  )
                                                            
                                                            .addGroup(layout.createParallelGroup(CENTER)
                                                                        .addComponent(reset)  )
                                                         )
                                                
                                                .addGroup(layout.createParallelGroup(CENTER)
                                                            .addComponent(textOUT, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)  ) 
                                             )
                                 );
        
        layout.setVerticalGroup(layout.createSequentialGroup()
                                  .addGroup(layout.createParallelGroup(BASELINE)
                                              .addComponent(mainlabel)  )
                                  
                                  
                                  .addGroup(layout.createSequentialGroup()
                                              .addGroup(layout.createParallelGroup(BASELINE)
                                                          .addComponent(back)
                                                          .addComponent(encryptDecrypt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                          .addComponent(shiftLable)
                                                          .addComponent(shifts, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                       )
                                              
                                              .addGroup(layout.createParallelGroup(CENTER)
                                                          .addComponent(textIN, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)  )
                                              .addGroup(layout.createSequentialGroup() 
                                                          .addGroup(layout.createParallelGroup(LEADING)
                                                                      .addComponent(go) 
                                                                      .addComponent(reset)
                                                                   )
                                                       )
                                              .addGroup(layout.createParallelGroup(CENTER)
                                                          .addComponent(textOUT, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)  ) 
                                           )
                               );
        
         layout.linkSize(SwingConstants.HORIZONTAL, go, reset, back );
         layout.linkSize(SwingConstants.VERTICAL, go, reset, back);
         topPanel.setLayout(layout);
         contentPane.add(topPanel);
         
        go.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            
            //if encript
            if(action == "Encrypt")
            {
              String input = textIN.getText();
              int length = input.length();
              int loctaiton = 0;
              char[] ch = new char[input.length()]; 
              
              System.out.println("THIS:");
              for (int i = 0; i < length; i++) {ch[i] = input.charAt(i); }
              
              for (int i = 0; i < length; i++) { 
                for (int j = 0; j < 26; j++){
                  if(ch[i] ==  alphLARGE[j])
                  {
                    System.out.println("THIS:"+j);
                    loctaiton = j + shift;
                    if(loctaiton > 25)
                    {loctaiton=loctaiton-26;}
                
                    ch[i] = alphLARGE[loctaiton];
                    break;
                  }
                  if(ch[i] ==  alphSMALL[j])
                  {
                    System.out.println("THIS:"+j);
                    loctaiton = j + shift;
                    if(loctaiton > 25)
                    {loctaiton=loctaiton-26;}
                
                    ch[i] = alphSMALL[loctaiton];
                    break;
                  }
                  
                }
              }
          input="";
          
          for (int i = 0; i < length; i++) { input = input+ch[i]; }
          textOUT.setText(input);
            }
            /////////////////////////////////////////////////////////
            else
            {
              String input = textIN.getText();
              int length = input.length();
              int loctaiton = 0;
              char[] ch = new char[input.length()]; 
              
              for (int i = 0; i < length; i++) {ch[i] = input.charAt(i); }
              
              for (int i = 0; i < length; i++) { 
                for (int j = 0; j < 26; j++){
                  if(ch[i] ==  alphLARGE[j])
                  {
                    
                    loctaiton = j - shift;
                   if(loctaiton < 0)
                    {loctaiton = loctaiton + 26;}
                    ch[i] = alphLARGE[loctaiton];
                    break;
                  }
                  if(ch[i] ==  alphSMALL[j])
                  {
                    
                    loctaiton = j - shift;
                   if(loctaiton < 0)
                    {loctaiton = loctaiton + 26;}
                    ch[i] = alphSMALL[loctaiton];
                    break;
                  }
                }
              }
              input="";
              
              for (int i = 0; i < length; i++) { input = input+ch[i]; }
              textOUT.setText(input);
            }
          }
        });
    
        back.addActionListener(new ActionListener(){//when clicked open up this page, and close the main meun
          public void actionPerformed(ActionEvent e){
            new Cyphers(); frame.dispose();
          }
        });
        
        reset.addActionListener(new ActionListener(){//when clicked open up this page, and close the main meun
          public void actionPerformed(ActionEvent e){
            textIN.setText("");
            textOUT.setText("");
          }
        });
    
        shifts.addActionListener(new ActionListener() {//CLEAR SEARCHED IMAGE LISTENER
          public void actionPerformed(ActionEvent event) { 
            JComboBox shifts = (JComboBox)event.getSource();
            String holder2 = String.valueOf(shifts.getSelectedItem());
            shift = Integer.parseInt(holder2);
          }
        });
        
        encryptDecrypt.addActionListener(new ActionListener() {//CLEAR SEARCHED IMAGE LISTENER
          public void actionPerformed(ActionEvent event) { 
            JComboBox encryptDecrypt = (JComboBox)event.getSource();
            action = String.valueOf(encryptDecrypt.getSelectedItem());
          }
        });
        
    frame.setContentPane(contentPane);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }
}