import java.awt.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.InputStream;
import javax.imageio.ImageIO;


public class PigpenUI
{
  private JPanel contentPane;
  private int hgap;
  private int vgap;
  private String action;
  private String[] output;
  private String[] input;
  private int charOUTCount;
  private int charINCount;
  private JTextArea textIN;
  private JTextArea textOUT;
  
  public PigpenUI()
  {
    hgap = 5;
    vgap = 5;
    
    charOUTCount=0;
    charINCount=0;
    
    Color mybackground = new Color(225,225,225);
    JFrame frame = new JFrame("Cyphers");
    JPanel contentPane = new JPanel();
    contentPane.setOpaque(true);
    contentPane.setBackground(mybackground);
    contentPane.setBorder(BorderFactory.createEmptyBorder(hgap, hgap, hgap, hgap));
    contentPane.setLayout(new GridLayout(1,0));
    
    JLabel mainlabel = new JLabel("Standard Pigpen Cypher");
    mainlabel.setFont(new Font("Serif", Font.BOLD, 24));
    
    JComboBox<String> encryptDecrypt = new JComboBox<String>(new String[] {"Encrypt", "Decrypt"});
    action = "Encrypt";
    encryptDecrypt.setPreferredSize(new Dimension(50, 20));    
    
    output = new String[500];
    input = new String[500];
    
    textIN = new JTextArea();
    textOUT = new JTextArea();
    textOUT.setLineWrap(true);
    textIN.setLineWrap(true);
    
    textIN.setPreferredSize(new Dimension(500, 80));
    textOUT.setPreferredSize(new Dimension(500, 80));
    textIN.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
    textOUT.setBorder(new EtchedBorder(EtchedBorder.LOWERED));         
    
    JButton go = new JButton("GO");
    JButton back = new JButton("BACK");
    JButton reset = new JButton("RESET");   
    JButton space= new JButton("Space");
    JButton backSpace = new JButton("BackSpace");
    
    Icon iconA = null, iconB = null, iconC = null, iconD = null, iconE = null, iconF = null,
    iconG = null, iconH = null, iconI = null, iconJ = null, iconK = null, iconL = null, iconM = null,
    iconN = null, iconO = null, iconP = null, iconQ = null, iconR = null, iconS = null, iconT = null,
    iconU = null, iconV = null, iconW = null, iconX = null, iconY = null, iconZ = null;

    InputStream stream = getClass().getResourceAsStream("pigpenA.png");
    try{iconA = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenB.png");
    try{iconB = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenC.png");
    try{iconC = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenD.png");
    try{iconD = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenE.png");
    try{iconE = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenF.png");
    try{iconF = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenG.png");
    try{iconG = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenH.png");
    try{iconH = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenI.png");
    try{iconI = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenJ.png");
    try{iconJ = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenK.png");
    try{iconK = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenL.png");
    try{iconL = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenM.png");
    try{iconM = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenN.png");
    try{iconN = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenO.png");
    try{iconO = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenP.png");
    try{iconP = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenQ.png");
    try{iconQ = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenR.png");
    try{iconR = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenS.png");
    try{iconS = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenT.png");
    try{iconT = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenU.png");
    try{iconU = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenV.png");
    try{iconV = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenW.png");
    try{iconW = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenX.png");
    try{iconX = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenY.png");
    try{iconY = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
    stream = getClass().getResourceAsStream("pigpenZ.png");
    try{iconZ = new ImageIcon(ImageIO.read(stream));}
    catch(Exception i){}
        
    //Icon iconA = new ImageIcon("pigpenA.png");
    JButton pigpenA = new JButton(iconA);   
    pigpenA.setPreferredSize(new Dimension(10, 10));
    pigpenA.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenB = new JButton(iconB);   
    pigpenB.setPreferredSize(new Dimension(10, 10));
    pigpenB.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenC = new JButton(iconC);   
    pigpenC.setPreferredSize(new Dimension(10, 10));
    pigpenC.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenD = new JButton(iconD);   
    pigpenD.setPreferredSize(new Dimension(10, 10));
    pigpenD.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenE = new JButton(iconE);   
    pigpenE.setPreferredSize(new Dimension(10, 10));
    pigpenE.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenF = new JButton(iconF);   
    pigpenF.setPreferredSize(new Dimension(10, 10));
    pigpenF.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenG = new JButton(iconG);   
    pigpenG.setPreferredSize(new Dimension(10, 10));
    pigpenG.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenH = new JButton(iconH);   
    pigpenH.setPreferredSize(new Dimension(10, 10));
    pigpenH.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenI = new JButton(iconI);   
    pigpenI.setPreferredSize(new Dimension(10, 10));
    pigpenI.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenJ = new JButton(iconJ);   
    pigpenJ.setPreferredSize(new Dimension(10, 10));
    pigpenJ.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenK = new JButton(iconK);   
    pigpenK.setPreferredSize(new Dimension(10, 10));
    pigpenK.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenL = new JButton(iconL);   
    pigpenL.setPreferredSize(new Dimension(10, 10));
    pigpenL.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenM = new JButton(iconM);   
    pigpenM.setPreferredSize(new Dimension(10, 10));
    pigpenM.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenN = new JButton(iconN);   
    pigpenN.setPreferredSize(new Dimension(10, 10));
    pigpenN.setMargin(new Insets(0, 0, 0, 0));
    
    JButton pigpenO = new JButton(iconO);   
    pigpenO.setPreferredSize(new Dimension(10, 10));
    pigpenO.setMargin(new Insets(0, 0, 0, 0));

    JButton pigpenP = new JButton(iconP);   
    pigpenP.setPreferredSize(new Dimension(10, 10));
    pigpenP.setMargin(new Insets(0, 0, 0, 0));

    JButton pigpenQ = new JButton(iconQ);   
    pigpenQ.setPreferredSize(new Dimension(10, 10));
    pigpenQ.setMargin(new Insets(0, 0, 0, 0));

    JButton pigpenR = new JButton(iconR);   
    pigpenR.setPreferredSize(new Dimension(10, 10));
    pigpenR.setMargin(new Insets(0, 0, 0, 0));

    JButton pigpenS = new JButton(iconS);   
    pigpenS.setPreferredSize(new Dimension(10, 10));
    pigpenS.setMargin(new Insets(0, 0, 0, 0));

    JButton pigpenT = new JButton(iconT);   
    pigpenT.setPreferredSize(new Dimension(10, 10));
    pigpenT.setMargin(new Insets(0, 0, 0, 0));

    JButton pigpenU = new JButton(iconU);   
    pigpenU.setPreferredSize(new Dimension(10, 10));
    pigpenU.setMargin(new Insets(0, 0, 0, 0));

    JButton pigpenV = new JButton(iconV);   
    pigpenV.setPreferredSize(new Dimension(10, 10));
    pigpenV.setMargin(new Insets(0, 0, 0, 0));

    JButton pigpenW = new JButton(iconW);   
    pigpenW.setPreferredSize(new Dimension(10, 10));
    pigpenW.setMargin(new Insets(0, 0, 0, 0));

    JButton pigpenX = new JButton(iconX);   
    pigpenX.setPreferredSize(new Dimension(10, 10));
    pigpenX.setMargin(new Insets(0, 0, 0, 0));

    JButton pigpenY = new JButton(iconY);   
    pigpenY.setPreferredSize(new Dimension(10, 10));
    pigpenY.setMargin(new Insets(0, 0, 0, 0));

    JButton pigpenZ = new JButton(iconZ);   
    pigpenZ.setPreferredSize(new Dimension(10, 10));
    pigpenZ.setMargin(new Insets(0, 0, 0, 0));
    
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
                                                        
                                                     )
                                            
                                            .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenA, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenD, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenE, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenF, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenG, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenH, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenI, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenJ, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenL, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenM, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                     )
                                            
                                            .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenN, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenO, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenP, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenQ, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenR, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenS, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenT, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenU, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenV, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenW, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenX, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenY, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(pigpenZ, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                     )
                                            
                                            .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(space))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(backSpace))
                                                     )
                                            
                                            .addGroup(layout.createParallelGroup(CENTER)
                                                        .addComponent(textIN, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)  )
                                            
                                            .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(CENTER)
                                                                    .addComponent(go)  )//go
                                                        
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
                              
                              .addGroup(layout.createParallelGroup(BASELINE)
                                          .addComponent(back)
                                          .addComponent(encryptDecrypt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                          
                                       )
                              .addGroup(layout.createSequentialGroup()
                                          .addGroup(layout.createParallelGroup(BASELINE)
                                                      .addComponent(pigpenA, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenD, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenE, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenF, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenG, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenH, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenI, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenJ, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenL, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenM, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                   )
                                          
                                          .addGroup(layout.createParallelGroup(BASELINE)
                                                      .addComponent(pigpenN, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenO, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenP, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenQ, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenR, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenS, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenT, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenU, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenV, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenW, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenX, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenY, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(pigpenZ, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      
                                                   )
                                          
                                          .addGroup(layout.createParallelGroup(BASELINE)
                                                      .addComponent(space)
                                                      .addComponent(backSpace)
                                                   )
                                          
                                          
                                          .addGroup(layout.createParallelGroup(CENTER)
                                                      .addComponent(textIN, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)  )
                                          .addGroup(layout.createSequentialGroup() 
                                                      .addGroup(layout.createParallelGroup(LEADING)
                                                                  .addComponent(go)//go 
                                                                  .addComponent(reset)
                                                               )
                                                   )
                                          .addGroup(layout.createParallelGroup(CENTER)
                                                      .addComponent(textOUT, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)  ) 
                                       )
                           );
    
    layout.linkSize(SwingConstants.HORIZONTAL,  reset, back );
    layout.linkSize(SwingConstants.VERTICAL, reset, back);
    topPanel.setLayout(layout);
    contentPane.add(topPanel);
    
    go.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        
        //if encript
        if(action == "Encrypt")
        {
          charOUTCount=0;
          String plaininput = textIN.getText();
          int length = plaininput.length();
          int loctaiton = 0;
          char[] ch = new char[plaininput.length()]; 
          
          for (int i = 0; i < length; i++) {ch[i] = Character.toUpperCase(plaininput.charAt(i)); }
          
          for (int i = 0; i < length; i++) { 
            switch(ch[i]) {
              case 'A':
                output[charOUTCount] = "_|  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'B':
                output[charOUTCount] = "|_|  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'C':
                output[charOUTCount] = "|_  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'D':
                output[charOUTCount] = "]  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'E':
                output[charOUTCount] = "[]  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'F':
                output[charOUTCount] = "[  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'G':
                output[charOUTCount] = "-|  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'H':
                output[charOUTCount] = "|-|  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'I':
                output[charOUTCount] = "|-  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'J':
                output[charOUTCount] = "._|  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'K':
                output[charOUTCount] = "|._|  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'L':
                output[charOUTCount] = "|._  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'M':
                output[charOUTCount] = ".]  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'N':
                output[charOUTCount] = "[.]  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'O':
                output[charOUTCount] = "[.  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'P':
                output[charOUTCount] = ".-|  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'Q':
                output[charOUTCount] = "|.-|  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'R':
                output[charOUTCount] = "|.-  "; 
                charOUTCount=charOUTCount+1;
                break;
              case 'S':
                output[charOUTCount] = "v  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'T':
                output[charOUTCount] = ">  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'U':
                output[charOUTCount] = "<  ";
                charOUTCount=charOUTCount+1; 
                break;
              case 'V':
                output[charOUTCount] = "^  ";
                charOUTCount=charOUTCount+1; 
                break;
              case 'W':
                output[charOUTCount] = ".v  ";
                charOUTCount=charOUTCount+1; 
                break;
              case 'X':
                output[charOUTCount] = ".>  ";
                charOUTCount=charOUTCount+1; 
                break;
              case 'Y':
                output[charOUTCount] = ".<  ";
                charOUTCount=charOUTCount+1; 
                break;
              case 'Z':
                output[charOUTCount] = ".^  ";
                charOUTCount=charOUTCount+1; 
                break;
              case ' ':
                output[charOUTCount] = "    ";
                charOUTCount=charOUTCount+1; 
                break;  
                
              default:
                // code block
            }
          }
          redrawOUT();
        }
        /////////////////////////////////////////////////////////
        else
        {
          charOUTCount=0;
          String plaininput = "";
          
          for (int i = 0; i < charINCount; i++) { 
            switch(input[i]) {
              case "_|  ":
                plaininput = plaininput+'A';
                break;
              case "|_|  ":
                plaininput = plaininput+'B';
                break;
              case "|_  ":
                plaininput = plaininput+'C';
                break;
              case "]  ":
                plaininput = plaininput+'D';
                break;
              case "[]  ":
                plaininput = plaininput+'E';
                break;
              case "[  ":
                plaininput = plaininput+'F';
                break;
              case "-|  ":
                plaininput = plaininput+'G';
                break;
              case "|-|  ":
                plaininput = plaininput+'H';
                break;
              case "|-  ":
                plaininput = plaininput+'I';
                break;
              case "._|  ":
                plaininput = plaininput+'J';
                break;
              case "|._|  ":
                plaininput = plaininput+'K';
                break;
              case "|._  ":
                plaininput = plaininput+'L';
                break;
              case ".]  ":
                plaininput = plaininput+'M';
                break;
              case "[.]  ":
                plaininput = plaininput+'N';
                break;
              case "[.  ":
                plaininput = plaininput+'O';
                break;
              case ".-|  ":
                plaininput = plaininput+'P';
                break;
              case "|.-|  ":
                plaininput = plaininput+'Q';
                break;
              case "|.-  ":
                plaininput = plaininput+'R';
                break;
              case "v  ":
                plaininput = plaininput+'S';
                break;
              case ">  ":
                plaininput = plaininput+'T';
                break;
              case "<  ":
                plaininput = plaininput+'U';
                break;
              case "^  ":
                plaininput = plaininput+'V'; 
                break;
              case ".v  ":
                plaininput = plaininput+'W';
                break;
              case ".>  ":
                plaininput = plaininput+'X'; 
                break;
              case ".<  ":
                plaininput = plaininput+'Y';
                break;
              case ".^  ":
                plaininput = plaininput+'Z';
                break;
              case "    ":
                plaininput = plaininput+' ';
                break;  
                
              default:
                // code block
            }
          }
          textOUT.setText(plaininput);
        }
      }
    });
    
    pigpenA.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = "_|  ";
          charINCount=charINCount+1;
          redrawIN();
        }
      }
    });
    
    pigpenB.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = "|_|  ";
          charINCount=charINCount+1;
          redrawIN();
        }
      }
    });
    
    pigpenC.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){   
        
        if(action != "Encrypt")
        {
          input[charINCount] = "|_  ";
          charINCount=charINCount+1;
          redrawIN();
        }
      }
    });
    pigpenD.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = "]  ";
          charINCount=charINCount+1;
          redrawIN();
        }
      }
    });
    
    pigpenE.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = "[]  ";
          charINCount=charINCount+1;
          redrawIN();
        }
      }
    });
    pigpenF.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){  
        if(action != "Encrypt")
        {
          input[charINCount] = "[  ";
          charINCount=charINCount+1;
          redrawIN();
        }
      }
    });
    
    pigpenG.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if(action != "Encrypt")
        {
          input[charINCount] = "-|  ";
          charINCount=charINCount+1;
          redrawIN();
        }
      }
    });
    
    pigpenH.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = "|-|  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenI.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){  
        if(action != "Encrypt")
        {
          input[charINCount] = "|-  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenJ.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = "._|  ";
          charINCount=charINCount+1;
          redrawIN();
        }
      }
    });
    
    pigpenK.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = "|._|  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenL.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){ 
        if(action != "Encrypt")
        {
          input[charINCount] = "|._  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenM.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){ 
        if(action != "Encrypt")
        {
          input[charINCount] = ".]  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenN.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = "[.]  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenO.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = "[.  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenP.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){ 
        if(action != "Encrypt")
        {
          input[charINCount] = ".-|  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenQ.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){  
        if(action != "Encrypt")
        {
          input[charINCount] = "|.-|  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenR.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){  
        if(action != "Encrypt")
        {
          input[charINCount] = "|.-  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenS.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if(action != "Encrypt")
        {
          input[charINCount] = "v  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenT.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){ 
        if(action != "Encrypt")
        {
          input[charINCount] = ">  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenU.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){  
        if(action != "Encrypt")
        {
          input[charINCount] = "<  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenV.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){ 
        if(action != "Encrypt")
        {
          input[charINCount] = "^  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenW.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = ".v  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    
    pigpenX.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){  
        if(action != "Encrypt")
        {
          input[charINCount] = ".>  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenY.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){  
        if(action != "Encrypt")
        {
          input[charINCount] = ".<  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    pigpenZ.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if(action != "Encrypt")
        {
          input[charINCount] = ".^  ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    space.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){ 
        if(action != "Encrypt")
        {
          input[charINCount] = "    ";
          charINCount=charINCount+1;
          redrawIN();
        }}
    });
    
    
    backSpace.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if(action != "Encrypt")
        {
          if(charINCount>0)
          {
            charINCount=charINCount-1;
            input[charINCount] = "";
            redrawIN();
          }
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
        charOUTCount=0;
        charINCount=0;
      }
    });
    
    encryptDecrypt.addActionListener(new ActionListener() {//CLEAR SEARCHED IMAGE LISTENER
      public void actionPerformed(ActionEvent event) { 
        JComboBox encryptDecrypt = (JComboBox)event.getSource();
        action = String.valueOf(encryptDecrypt.getSelectedItem());
        if(action == "Decrypt")
        {textIN.setEditable(false);}
        else
        {textIN.setEditable(true);}
        
        textIN.setText("");
        textOUT.setText("");
      }
    });
    
    frame.setContentPane(contentPane);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  
  public void redrawIN()
  {
    String hold ="";
    for(int i=0; i<charINCount; i++ )
    {hold = hold +input[i];    }
    textIN.setText(hold);
  }
  
  public void redrawOUT()
  {
    String hold ="";
    for(int i=0; i<charOUTCount; i++ )
    {      hold = hold +output[i];    }
    textOUT.setText(hold);
  }
  
}