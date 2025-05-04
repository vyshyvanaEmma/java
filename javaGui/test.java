package javaGui;
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import javax.swing.JFrame;
public class Main
{
	public static void main(String[] args) {
		/*JFrame frame = new JFrame();
		frame.setTitle("JFrame Title");//titolo
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //per uscire
		frame.setResizable(false); //non puo cambiare la dimensione del frame
		frame.setSize(420, 420);//dimensione
		frame.setVisible(true);//far vedere il frame
		
		//impostazione del logo
		ImageIcon img = newImageIcon("logo.png"); // logo 
		frame.setIconImage(img.getImage()); //imposta il logo
		frame.getContentPane().setBackgroung(new Color(255, 0, 255)); // imposta il colore dello sfondo
*/
        MyFrame frm = new MyFrame();
	}
}

//frame 
public class MyFrame extends JFrame{
    
    MyFrame(){
        this.setTitle("JFrame Title");//titolo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //per uscire
		this.setResizable(false); //non puo cambiare la dimensione del frame
		this.setSize(420, 420);//dimensione
		this.setVisible(true);//far vedere il frame
		
		//impostazione del logo (sopra nella riga principale dove c'è la x di chiusura)
		ImageIcon img = newImageIcon("logo.png"); // logo 
		this.setIconImage(img.getImage()); //imposta il logo
		this.getContentPane().setBackgroung(new Color(255, 0, 255)); // imposta il colore dello sfondo

    }
}

//label - una scritto sul frame
public class Main
{
	public static void main(String[] args) {
	    
	    ImageIcon img = new ImageIcon("img.png"); // imagine 
	    Border border = BorderFactory.createLineBorder(Color.green,3);
	    
	    
        JLabel label = new JLabel();
        label.setText("Label");
        label.setIcon(img); // aggiungo un immagine dentro il frame, cioè il campo effettivo
        //posizionano
        label.setHorizontalTextPosition(JLabel.CENTER); // posiziona il testo LEFT; CENTER; RIGHT of img
        label.setVerticalTextPosition(JLabel.TOP); // posiziona il testo TOP; CENTER, BOTTOM of img
        
        label.setForeground(new Color(0x00fFF00)); //cambia il colore del testo
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); // imposta il Font
        label.setIconTextGap(100); // imposta la distanza del testo a imagine
        label.setBackground(Color.black) // imposta il backgrounf Color
        label.setOpaque(true); // display background Color
        label.setBorder(border); // imposta il bordo
        //alineano
        label.setVerticalAlignment(JLabel.CENTER); // alinea tutto i n sul
        label.setHorizontalAlignment(JLabel.CENTER) // alinea tutto 
        
        //label.setBounds(100, 100, 250, 250); // posizina il label in layout 
        
        JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //per uscire
		//frame.setSize(500, 500);//dimensione
		//frame.setLayout(null); // tutto vuoto
		frame.setVisible(true);//far vedere il frame
		frame.add(label);
		frame.pack();//prende tutto il contenuto e crea la dimensione del campo che serve, non bisogna set setSize
		
		
	}
}




