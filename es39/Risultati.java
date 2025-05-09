package es39;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Risultati extends JFrame {

    JLabel labelNumMax, labelNumVotF, labelNumVotM, labelMediaM, labelMediaF;
    JLabel riSlabelNumMax, riSlabelNumVotF, riSlabelNumVotM, rislabelMediaF, rislabelMediaM;

    Risultati(Amministrazione amministrazione) {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 5));
        this.setSize(500, 500);
        this.setTitle("Risultatii");
        this.getContentPane().setBackground(new Color(240, 248, 255));

        labelNumMax = new JLabel("Il numero dei voti massimi (10)");
        riSlabelNumMax = new JLabel(" " + amministrazione.contaVotiMax());

        labelNumVotF = new JLabel("Le valutazione immerse da F");
        riSlabelNumVotF = new JLabel(" " + amministrazione.contaVotF());
        labelNumVotM = new JLabel("Le valutazione immerse da M");
        riSlabelNumVotF = new JLabel(" " + amministrazione.contaVotM());

        labelMediaF = new JLabel("Media dei vori di f");
        rislabelMediaF = new JLabel(" " + amministrazione.mediaVotiF());

        labelMediaM = new JLabel("Media dei vori di m");
        rislabelMediaM = new JLabel(" " + amministrazione.mediaVotiF());

        this.add(labelNumMax);
        this.add(riSlabelNumMax);
        this.add(labelNumVotF);
        this.add(riSlabelNumVotF);
        this.add(labelNumVotM);
        this.add(riSlabelNumVotF);
        this.add(labelMediaF);
        this.add(rislabelMediaF);
        this.add(labelMediaM);
        this.add(rislabelMediaM);

        this.setVisible(true);
    }
}