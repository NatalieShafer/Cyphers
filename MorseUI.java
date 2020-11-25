import java.awt.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MorseUI
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
  
  public MorseUI()
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
    
    JLabel mainlabel = new JLabel("Morse Code");
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
    textOUT.setWrapStyleWord(true);
    textIN.setWrapStyleWord(true);
    
    textIN.setPreferredSize(new Dimension(500, 80));
    textOUT.setPreferredSize(new Dimension(500, 80));
    textIN.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
    textOUT.setBorder(new EtchedBorder(EtchedBorder.LOWERED));         
    
    JButton go = new JButton("GO");
    JButton back = new JButton("BACK");
    JButton reset = new JButton("RESET");   
    JButton backSpace = new JButton("BackSpace");
    JButton dot = new JButton(".");   
    JButton dash = new JButton("_");   
    JButton space = new JButton("Space");   
    JButton slash = new JButton("/");   
    
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
                                                                    .addComponent(dot, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(dash, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(slash, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(LEADING)
                                                                    .addComponent(space, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
                                                      .addComponent(dot, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(dash, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(slash, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(space, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                      
                                                      .addComponent(backSpace, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
    
    layout.linkSize(SwingConstants.HORIZONTAL,  dot, dash, slash);
    layout.linkSize(SwingConstants.VERTICAL, dot, dash, slash);
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
          
          System.out.println("THIS:");
          for (int i = 0; i < length; i++) {ch[i] = Character.toUpperCase(plaininput.charAt(i)); }
          
          for (int i = 0; i < length; i++) { 
            switch(ch[i]) {
              case 'A':
                output[charOUTCount] = ".-  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'B':
                output[charOUTCount] = "-...  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'C':
                output[charOUTCount] = "-.-.  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'D':
                output[charOUTCount] = "-..  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'E':
                output[charOUTCount] = ".  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'F':
                output[charOUTCount] = "..-.  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'G':
                output[charOUTCount] = "--.  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'H':
                output[charOUTCount] = "....  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'I':
                output[charOUTCount] = "..  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'J':
                output[charOUTCount] = ".---  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'K':
                output[charOUTCount] = "-.-  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'L':
                output[charOUTCount] = ".-..  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'M':
                output[charOUTCount] = ".--  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'N':
                output[charOUTCount] = "-.  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'O':
                output[charOUTCount] = "---  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'P':
                output[charOUTCount] = ".--.  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'Q':
                output[charOUTCount] = "--.-  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'R':
                output[charOUTCount] = ".-.  "; 
                charOUTCount=charOUTCount+1;
                break;
              case 'S':
                output[charOUTCount] = "...  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'T':
                output[charOUTCount] = "-  ";
                charOUTCount=charOUTCount+1;
                break;
              case 'U':
                output[charOUTCount] = "..-  ";
                charOUTCount=charOUTCount+1; 
                break;
              case 'V':
                output[charOUTCount] = "...-  ";
                charOUTCount=charOUTCount+1; 
                break;
              case 'W':
                output[charOUTCount] = ".--  ";
                charOUTCount=charOUTCount+1; 
                break;
              case 'X':
                output[charOUTCount] = "-..-  ";
                charOUTCount=charOUTCount+1; 
                break;
              case 'Y':
                output[charOUTCount] = "-.--  ";
                charOUTCount=charOUTCount+1; 
                break;
              case 'Z':
                output[charOUTCount] = "--..  ";
                charOUTCount=charOUTCount+1; 
                break;
              case ' ':
                output[charOUTCount] = "/  ";
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
          String inputMorse = textIN.getText();
          String separate[] = inputMorse.split("  ");
          int length = separate.length;
          
          for (int i = 0; i < length; i++) { 
            switch(separate[i]) {
              case ".-":
                plaininput = plaininput+'A';
                break;
              case "-...":
                plaininput = plaininput+'B';
                break;
              case "-.-.":
                plaininput = plaininput+'C';
                break;
              case "-..":
                plaininput = plaininput+'D';
                break;
              case ".":
                plaininput = plaininput+'E';
                break;
              case "..-.":
                plaininput = plaininput+'F';
                break;
              case "--.":
                plaininput = plaininput+'G';
                break;
              case "....":
                plaininput = plaininput+'H';
                break;
              case "..":
                plaininput = plaininput+'I';
                break;
              case ".---":
                plaininput = plaininput+'J';
                break;
              case "-.-":
                plaininput = plaininput+'K';
                break;
              case ".-..":
                plaininput = plaininput+'L';
                break;
              case "--":
                plaininput = plaininput+'M';
                break;
              case "-.":
                plaininput = plaininput+'N';
                break;
              case "---":
                plaininput = plaininput+'O';
                break;
              case ".--.":
                plaininput = plaininput+'P';
                break;
              case "--.-":
                plaininput = plaininput+'Q';
                break;
              case ".-.":
                plaininput = plaininput+'R';
                break;
              case "...":
                plaininput = plaininput+'S';
                break;
              case "-":
                plaininput = plaininput+'T';
                break;
              case "..-":
                plaininput = plaininput+'U'; 
                break;
              case "...-":
                plaininput = plaininput+'V';
                break;
              case ".--":
                plaininput = plaininput+'W'; 
                break;
              case "-..-":
                plaininput = plaininput+'X';
                break;
              case "-.--":
                plaininput = plaininput+'Y';
                break;
              case "--..":
                plaininput = plaininput+'Z';
                break;
              case "/":
                plaininput = plaininput+' ';
                break;  
                
              default:
                
                plaininput = plaininput+"("+separate[i]+")?";
                
                // code block
            }
          }
          textOUT.setText(plaininput);
        }
      }
    });
    
    dot.addActionListener(new ActionListener(){//when clicked open up this page, and close the main meun
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = ".";
          charINCount=charINCount+1;
          redrawIN();
        }
      }
    });
    
    dash.addActionListener(new ActionListener(){//when clicked open up this page, and close the main meun
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = "-";
          charINCount=charINCount+1;
          redrawIN();
        }
      }
    });
    
    space.addActionListener(new ActionListener(){//when clicked open up this page, and close the main meun
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = "  ";
          charINCount=charINCount+1;
          redrawIN();
        }
      }
    });
    slash.addActionListener(new ActionListener(){//when clicked open up this page, and close the main meun
      public void actionPerformed(ActionEvent e){   
        if(action != "Encrypt")
        {
          input[charINCount] = "/";
          charINCount=charINCount+1;
          redrawIN();
        }
      }
    });
    
    backSpace.addActionListener(new ActionListener(){//when clicked open up this page, and close the main meun
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