package es39;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyFrame extends JFrame implements ActionListener, ChangeListener {

    JLabel labelSesso, labelVoto, labelMessaggio;
    JSlider voto = new JSlider(1, 10);
    JRadioButton f, m;
    JButton conferma;
    Voto v;
    Amministrazione a;

    MyFrame(Amministrazione amministrazione) {

        a = amministrazione;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 5));
        this.setSize(500, 500);
        this.setTitle("Recenzione");
        this.getContentPane().setBackground(new Color(240, 248, 255));

        labelSesso = new JLabel("Inserisci il sesso");

        f = new JRadioButton("F");
        m = new JRadioButton("M");

        ButtonGroup group = new ButtonGroup();
        group.add(f);
        group.add(m);

        f.addActionListener(this);
        m.addActionListener(this);

        labelVoto = new JLabel("Inserisci il voto");
        voto.setPreferredSize(new Dimension(400, 200));
        voto.setPaintTicks(true);
        voto.setMinorTickSpacing(1);
        voto.setPaintTrack(true);
        voto.setMajorTickSpacing(3);
        voto.setPaintLabels(true);
        voto.setFont(new Font("MV Boli", Font.PLAIN, 15));
        labelVoto.setFont(new Font("MV Boli", Font.PLAIN, 25));
        voto.setOrientation(SwingConstants.VERTICAL);
        labelVoto.setText("Voto = " + voto.getValue());

        voto.addChangeListener(this);

        conferma = new JButton("CONFERMA");
        conferma.addActionListener(this);

        labelMessaggio = new JLabel(" ");

        this.add(labelSesso);
        this.add(f);
        this.add(m);
        this.add(labelVoto);
        this.add(voto);
        this.add(labelMessaggio);
        this.add(conferma);
        this.setVisible(true);
    }

    public Amministrazione getA(){
        return a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        char sesso = ' ';
        if (e.getSource() == f) {
            sesso = 'f';
        } else if (e.getSource() == m) {
            sesso = 'm';
        }
        v = new Voto(voto.getValue(), sesso);

        if (e.getSource() == conferma) {
            if (f.isSelected() == false && m.isSelected() == false) {
                labelMessaggio.setForeground(Color.RED);
                labelMessaggio.setText("ERRORE. Valutazione non è stata aggiunta");
                return;
            }

            if (a.aggiungiVoto(v)) {
                a.aggiungiVoto(v);
                labelMessaggio.setForeground(Color.GREEN);
                labelMessaggio.setText("Valutazione e' stata aggiunta");
                return;
            }

            labelMessaggio.setForeground(Color.RED);
            labelMessaggio.setText("ERRORE. Valutazione non e' stata aggiunta");

        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        labelVoto.setText("Voto = " + voto.getValue());
    }
}
