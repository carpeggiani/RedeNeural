package redeneural;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Willian
 */
public class RedeNeural extends javax.swing.JFrame {

    public RedeNeural() {
        initComponents();

        //Inicia Evento de cliques na lista
        reconhecerCliquesNaLista();
        setupQuadro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpConfiguracoes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jsPadroes = new javax.swing.JScrollPane();
        jlPadroes = new javax.swing.JList();
        jlUm = new javax.swing.JLabel();
        jlResposta = new javax.swing.JLabel();
        jlDois = new javax.swing.JLabel();
        jlTres = new javax.swing.JLabel();
        jlQuatro = new javax.swing.JLabel();
        jlCinco = new javax.swing.JLabel();
        jlSeis = new javax.swing.JLabel();
        jlSete = new javax.swing.JLabel();
        jlOito = new javax.swing.JLabel();
        jlNove = new javax.swing.JLabel();
        jlDez = new javax.swing.JLabel();
        jlOnze = new javax.swing.JLabel();
        jlDoze = new javax.swing.JLabel();
        jlTreze = new javax.swing.JLabel();
        jlQuatorze = new javax.swing.JLabel();
        jlQuinze = new javax.swing.JLabel();
        jlDezeseis = new javax.swing.JLabel();
        jlDezesete = new javax.swing.JLabel();
        jlDezoito = new javax.swing.JLabel();
        jlDezenove = new javax.swing.JLabel();
        jlVinte = new javax.swing.JLabel();
        jlVinteUm = new javax.swing.JLabel();
        jlVinteDois = new javax.swing.JLabel();
        jlVinteTres = new javax.swing.JLabel();
        jlVinteQuatro = new javax.swing.JLabel();
        jlVinteCinco = new javax.swing.JLabel();
        jpBotoes = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jMBar = new javax.swing.JMenuBar();
        jMArquivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMASair = new javax.swing.JMenuItem();
        jMSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rede Neural");

        jpConfiguracoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuraçoes:"));

        jLabel1.setText("Configuraçoes");

        javax.swing.GroupLayout jpConfiguracoesLayout = new javax.swing.GroupLayout(jpConfiguracoes);
        jpConfiguracoes.setLayout(jpConfiguracoesLayout);
        jpConfiguracoesLayout.setHorizontalGroup(
            jpConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConfiguracoesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpConfiguracoesLayout.setVerticalGroup(
            jpConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConfiguracoesLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jlPadroes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "Y", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Z", "W" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jsPadroes.setViewportView(jlPadroes);

        jlUm.setBackground(new java.awt.Color(255, 255, 255));
        jlUm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlResposta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlDois.setBackground(new java.awt.Color(255, 255, 255));
        jlDois.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTres.setBackground(new java.awt.Color(255, 255, 255));
        jlTres.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlQuatro.setBackground(new java.awt.Color(255, 255, 255));
        jlQuatro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlCinco.setBackground(new java.awt.Color(255, 255, 255));
        jlCinco.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlSeis.setBackground(new java.awt.Color(255, 255, 255));
        jlSeis.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlSete.setBackground(new java.awt.Color(255, 255, 255));
        jlSete.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlOito.setBackground(new java.awt.Color(255, 255, 255));
        jlOito.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlNove.setBackground(new java.awt.Color(255, 255, 255));
        jlNove.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlDez.setBackground(new java.awt.Color(255, 255, 255));
        jlDez.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlOnze.setBackground(new java.awt.Color(255, 255, 255));
        jlOnze.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlDoze.setBackground(new java.awt.Color(255, 255, 255));
        jlDoze.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTreze.setBackground(new java.awt.Color(255, 255, 255));
        jlTreze.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlQuatorze.setBackground(new java.awt.Color(255, 255, 255));
        jlQuatorze.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlQuinze.setBackground(new java.awt.Color(255, 255, 255));
        jlQuinze.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlDezeseis.setBackground(new java.awt.Color(255, 255, 255));
        jlDezeseis.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlDezesete.setBackground(new java.awt.Color(255, 255, 255));
        jlDezesete.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlDezoito.setBackground(new java.awt.Color(255, 255, 255));
        jlDezoito.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlDezenove.setBackground(new java.awt.Color(255, 255, 255));
        jlDezenove.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlVinte.setBackground(new java.awt.Color(255, 255, 255));
        jlVinte.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlVinteUm.setBackground(new java.awt.Color(255, 255, 255));
        jlVinteUm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlVinteDois.setBackground(new java.awt.Color(255, 255, 255));
        jlVinteDois.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlVinteTres.setBackground(new java.awt.Color(255, 255, 255));
        jlVinteTres.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlVinteQuatro.setBackground(new java.awt.Color(255, 255, 255));
        jlVinteQuatro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlVinteCinco.setBackground(new java.awt.Color(255, 255, 255));
        jlVinteCinco.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jpBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha uma opçao:"));

        jButton1.setText("Gerar");

        jButton2.setText("Treinar");

        jButton3.setText("Identificar");

        javax.swing.GroupLayout jpBotoesLayout = new javax.swing.GroupLayout(jpBotoes);
        jpBotoes.setLayout(jpBotoesLayout);
        jpBotoesLayout.setHorizontalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBotoesLayout.setVerticalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2)
                .addComponent(jButton3))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Probabilidade de Acerto:"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jpConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jsPadroes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlUm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDois, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlTres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlSete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlOito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDez, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlOnze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDoze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlTreze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlQuatorze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlQuinze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDezeseis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDezesete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDezoito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDezenove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlVinte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlVinteUm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlVinteDois, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlVinteTres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlVinteQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlVinteCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jlResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jlVinteUm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVinteDois, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVinteTres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVinteQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVinteCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jlDezeseis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlDezesete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlDezoito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlDezenove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVinte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jlOnze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlDoze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlTreze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlQuatorze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlQuinze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jlSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlSete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlOito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlNove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlDez, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jpConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jsPadroes, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jlUm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlDois, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlTres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jMArquivo.setText("Arquivo");

        jMenuItem1.setText("jMenuItem1");
        jMArquivo.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem1");
        jMArquivo.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem1");
        jMArquivo.add(jMenuItem3);
        jMArquivo.add(jSeparator1);

        jMASair.setText("Sair");
        jMArquivo.add(jMASair);

        jMBar.add(jMArquivo);

        jMSobre.setText("Sobre");
        jMBar.add(jMSobre);

        setJMenuBar(jMBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Configura para aparecer a cor de fundo dos labels do quadro de padrões
    public void setupQuadro() {

        jlUm.setOpaque(true);
        jlDois.setOpaque(true);
        jlTres.setOpaque(true);
        jlQuatro.setOpaque(true);
        jlCinco.setOpaque(true);
        jlSeis.setOpaque(true);
        jlSete.setOpaque(true);
        jlOito.setOpaque(true);
        jlNove.setOpaque(true);
        jlDez.setOpaque(true);
        jlOnze.setOpaque(true);
        jlDoze.setOpaque(true);
        jlTreze.setOpaque(true);
        jlQuatorze.setOpaque(true);
        jlQuinze.setOpaque(true);
        jlDezeseis.setOpaque(true);
        jlDezesete.setOpaque(true);
        jlDezoito.setOpaque(true);
        jlDezenove.setOpaque(true);
        jlVinte.setOpaque(true);
        jlVinteUm.setOpaque(true);
        jlVinteDois.setOpaque(true);
        jlVinteTres.setOpaque(true);
        jlVinteQuatro.setOpaque(true);
        jlVinteCinco.setOpaque(true);
    }

    public void limparQuadro() {
        jlUm.setBackground(Color.WHITE);
        jlDois.setBackground(Color.WHITE);
        jlTres.setBackground(Color.WHITE);
        jlQuatro.setBackground(Color.WHITE);
        jlCinco.setBackground(Color.WHITE);
        jlSeis.setBackground(Color.WHITE);
        jlSete.setBackground(Color.WHITE);
        jlOito.setBackground(Color.WHITE);
        jlNove.setBackground(Color.WHITE);
        jlDez.setBackground(Color.WHITE);
        jlOnze.setBackground(Color.WHITE);
        jlDoze.setBackground(Color.WHITE);
        jlTreze.setBackground(Color.WHITE);
        jlQuatorze.setBackground(Color.WHITE);
        jlQuinze.setBackground(Color.WHITE);
        jlDezeseis.setBackground(Color.WHITE);
        jlDezesete.setBackground(Color.WHITE);
        jlDezoito.setBackground(Color.WHITE);
        jlDezenove.setBackground(Color.WHITE);
        jlVinte.setBackground(Color.WHITE);
        jlVinteUm.setBackground(Color.WHITE);
        jlVinteDois.setBackground(Color.WHITE);
        jlVinteTres.setBackground(Color.WHITE);
        jlVinteQuatro.setBackground(Color.WHITE);
        jlVinteCinco.setBackground(Color.WHITE);
    }

    //Efetua o preenchimento dos padrões no quadro
    public void preencherQuadro(int indice) {

        switch (indice) {
            // Número 0
            case 0:
                limparQuadro();
                jlSeis.setBackground(Color.yellow);
                jlSete.setBackground(Color.yellow);
                jlOito.setBackground(Color.yellow);
                jlNove.setBackground(Color.yellow);
                jlDez.setBackground(Color.yellow);
                jlOnze.setBackground(Color.yellow);
                jlQuinze.setBackground(Color.yellow);
                jlDezeseis.setBackground(Color.yellow);
                jlDezesete.setBackground(Color.yellow);
                jlDezoito.setBackground(Color.yellow);
                jlDezenove.setBackground(Color.yellow);
                jlVinte.setBackground(Color.yellow);

                break;
            // Número 1
            case 1:
                limparQuadro();
                jlSete.setBackground(Color.yellow);
                jlDez.setBackground(Color.yellow);
                jlOnze.setBackground(Color.yellow);
                jlDoze.setBackground(Color.yellow);
                jlTreze.setBackground(Color.yellow);
                jlQuatorze.setBackground(Color.yellow);
                jlQuinze.setBackground(Color.yellow);
                jlVinte.setBackground(Color.yellow);
                break;
            // Número 2
            case 2:
                limparQuadro();
                jlSeis.setBackground(Color.yellow);
                jlOito.setBackground(Color.yellow);
                jlNove.setBackground(Color.yellow);
                jlDez.setBackground(Color.yellow);
                jlOnze.setBackground(Color.yellow);
                jlTreze.setBackground(Color.yellow);
                jlQuinze.setBackground(Color.yellow);
                jlDezeseis.setBackground(Color.yellow);
                jlDezesete.setBackground(Color.yellow);
                jlDezoito.setBackground(Color.yellow);
                jlVinte.setBackground(Color.yellow);
                break;
            // Número 3
            case 3:
                limparQuadro();
                jlSeis.setBackground(Color.yellow);
                jlOito.setBackground(Color.yellow);
                jlDez.setBackground(Color.yellow);
                jlOnze.setBackground(Color.yellow);
                jlTreze.setBackground(Color.yellow);
                jlQuinze.setBackground(Color.yellow);
                jlDezeseis.setBackground(Color.yellow);
                jlDezesete.setBackground(Color.yellow);
                jlDezoito.setBackground(Color.yellow);
                jlDezenove.setBackground(Color.yellow);
                jlVinte.setBackground(Color.yellow);
                break;
            // Número 4
            case 4:
                limparQuadro();
                jlSeis.setBackground(Color.yellow);
                jlSete.setBackground(Color.yellow);
                jlOito.setBackground(Color.yellow);
                jlTreze.setBackground(Color.yellow);
                jlDezeseis.setBackground(Color.yellow);
                jlDezesete.setBackground(Color.yellow);
                jlDezoito.setBackground(Color.yellow);
                jlDezenove.setBackground(Color.yellow);
                jlVinte.setBackground(Color.yellow);
                break;
            // Número 5
            case 5:
                limparQuadro();
                jlSeis.setBackground(Color.yellow);
                jlSete.setBackground(Color.yellow);
                jlOito.setBackground(Color.yellow);
                jlDez.setBackground(Color.yellow);
                jlOnze.setBackground(Color.yellow);
                jlTreze.setBackground(Color.yellow);
                jlQuinze.setBackground(Color.yellow);
                jlDezeseis.setBackground(Color.yellow);
                jlDezoito.setBackground(Color.yellow);
                jlDezenove.setBackground(Color.yellow);
                jlVinte.setBackground(Color.yellow);
                break;
            // Número 6
            case 6:
                limparQuadro();
                jlSeis.setBackground(Color.yellow);
                jlSete.setBackground(Color.yellow);
                jlOito.setBackground(Color.yellow);
                jlNove.setBackground(Color.yellow);
                jlDez.setBackground(Color.yellow);
                jlOnze.setBackground(Color.yellow);
                jlTreze.setBackground(Color.yellow);
                jlQuinze.setBackground(Color.yellow);
                jlDezeseis.setBackground(Color.yellow);
                jlDezoito.setBackground(Color.yellow);
                jlDezenove.setBackground(Color.yellow);
                jlVinte.setBackground(Color.yellow);
                break;
            // Número 7
            case 7:
                limparQuadro();
                jlSeis.setBackground(Color.yellow);
                jlOnze.setBackground(Color.yellow);
                jlTreze.setBackground(Color.yellow);
                jlDezeseis.setBackground(Color.yellow);
                jlDezesete.setBackground(Color.yellow);
                jlDezoito.setBackground(Color.yellow);
                jlDezenove.setBackground(Color.yellow);
                jlVinte.setBackground(Color.yellow);
                break;
            // Número 8
            case 8:
                limparQuadro();
                jlSeis.setBackground(Color.yellow);
                jlSete.setBackground(Color.yellow);
                jlOito.setBackground(Color.yellow);
                jlNove.setBackground(Color.yellow);
                jlDez.setBackground(Color.yellow);
                jlOnze.setBackground(Color.yellow);
                jlTreze.setBackground(Color.yellow);
                jlQuinze.setBackground(Color.yellow);
                jlDezeseis.setBackground(Color.yellow);
                jlDezesete.setBackground(Color.yellow);
                jlDezoito.setBackground(Color.yellow);
                jlDezenove.setBackground(Color.yellow);
                jlVinte.setBackground(Color.yellow);
                break;
            // Número 9
            case 9:
                limparQuadro();
                jlSeis.setBackground(Color.yellow);
                jlSete.setBackground(Color.yellow);
                jlOito.setBackground(Color.yellow);
                jlDez.setBackground(Color.yellow);
                jlOnze.setBackground(Color.yellow);
                jlTreze.setBackground(Color.yellow);
                jlQuinze.setBackground(Color.yellow);
                jlDezeseis.setBackground(Color.yellow);
                jlDezesete.setBackground(Color.yellow);
                jlDezoito.setBackground(Color.yellow);
                jlDezenove.setBackground(Color.yellow);
                jlVinte.setBackground(Color.yellow);
                break;
            // Letra A
            case 10:
                limparQuadro();
                jlUm.setBackground(Color.yellow);
                jlDois.setBackground(Color.yellow);
                jlTres.setBackground(Color.yellow);
                jlQuatro.setBackground(Color.yellow);
                jlCinco.setBackground(Color.yellow);
                jlSeis.setBackground(Color.yellow);
                jlOito.setBackground(Color.yellow);
                jlOnze.setBackground(Color.yellow);
                jlTreze.setBackground(Color.yellow);
                jlDezeseis.setBackground(Color.yellow);
                jlDezoito.setBackground(Color.yellow);
                jlVinteUm.setBackground(Color.yellow);
                jlVinteDois.setBackground(Color.yellow);
                jlVinteTres.setBackground(Color.yellow);
                jlVinteQuatro.setBackground(Color.yellow);
                jlVinteCinco.setBackground(Color.yellow);
                break;

        }
    }

    public void reconhecerCliquesNaLista() {

        // Define a seleção única para a lista
        jlPadroes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Permite tratar eventos do mouse
        jlPadroes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int indice = jlPadroes.locationToIndex(e.getPoint());

                    preencherQuadro(indice);

                }
            }
        });
    }

    public static void main(String args[]) {

        //LookAndFeel
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RedeNeural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RedeNeural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RedeNeural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RedeNeural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RedeNeural().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMASair;
    private javax.swing.JMenu jMArquivo;
    private javax.swing.JMenuBar jMBar;
    private javax.swing.JMenu jMSobre;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel jlCinco;
    private javax.swing.JLabel jlDez;
    private javax.swing.JLabel jlDezenove;
    private javax.swing.JLabel jlDezeseis;
    private javax.swing.JLabel jlDezesete;
    private javax.swing.JLabel jlDezoito;
    private javax.swing.JLabel jlDois;
    private javax.swing.JLabel jlDoze;
    private javax.swing.JLabel jlNove;
    private javax.swing.JLabel jlOito;
    private javax.swing.JLabel jlOnze;
    private javax.swing.JList jlPadroes;
    private javax.swing.JLabel jlQuatorze;
    private javax.swing.JLabel jlQuatro;
    private javax.swing.JLabel jlQuinze;
    private javax.swing.JLabel jlResposta;
    private javax.swing.JLabel jlSeis;
    private javax.swing.JLabel jlSete;
    private javax.swing.JLabel jlTres;
    private javax.swing.JLabel jlTreze;
    private javax.swing.JLabel jlUm;
    private javax.swing.JLabel jlVinte;
    private javax.swing.JLabel jlVinteCinco;
    private javax.swing.JLabel jlVinteDois;
    private javax.swing.JLabel jlVinteQuatro;
    private javax.swing.JLabel jlVinteTres;
    private javax.swing.JLabel jlVinteUm;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpConfiguracoes;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JScrollPane jsPadroes;
    // End of variables declaration//GEN-END:variables
}
