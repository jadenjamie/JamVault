
import java.awt.CardLayout;
import java.nio.file.Path;
import javax.swing.JPanel;
import javazoom.jl.player.Player;


/**
 *
 * @author jadenjamieson
 */
public class mainFrame extends javax.swing.JFrame {
private volatile Player currentPlayer;
private volatile Thread playThread;
private java.nio.file.Path currentTrackPath = null;
private String currentTitle = "", currentArtist = "", currentCoverPath = "";
private final java.nio.file.Path storage =
        java.nio.file.Paths.get(System.getProperty("user.home"), ".myapp", "library");
private final java.nio.file.Path indexFile = storage.resolve("library.txt");


    
    

   
    public mainFrame() {
        initComponents();
      panelLibrary.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));
fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("MP3 files", "mp3"));
panelLibrary.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));
fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("MP3 files", "mp3"));




    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cardPanel = new javax.swing.JPanel();
        loginScreen = new javax.swing.JPanel();
        loginTitle = new javax.swing.JLabel();
        googlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jamVaultPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        googlePanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        passwordPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        passwordTwoPanel = new javax.swing.JPanel();
        checkbox1 = new java.awt.Checkbox();
        jLabel3 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        libraryScreen = new javax.swing.JPanel();
        loginTitle1 = new javax.swing.JLabel();
        libraryPanel = new javax.swing.JPanel();
        libraryLabel = new javax.swing.JLabel();
        scrollLibrary = new java.awt.ScrollPane();
        panelLibrary = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fileChooser = new javax.swing.JFileChooser();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cardPanel.setBackground(new java.awt.Color(0, 0, 0));
        cardPanel.setLayout(new java.awt.CardLayout());

        loginScreen.setBackground(new java.awt.Color(153, 153, 153));
        loginScreen.setPreferredSize(new java.awt.Dimension(992, 697));

        loginTitle.setFont(new java.awt.Font("AppleMyungjo", 0, 48)); // NOI18N
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("Welcome Back");

        googlePanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Email Address");

        usernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout googlePanelLayout = new javax.swing.GroupLayout(googlePanel);
        googlePanel.setLayout(googlePanelLayout);
        googlePanelLayout.setHorizontalGroup(
            googlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(googlePanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(googlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        googlePanelLayout.setVerticalGroup(
            googlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(googlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jamVaultPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jamvault_logo copy 2 7.37.34 PM.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jamvault_logo copy.png"))); // NOI18N

        javax.swing.GroupLayout jamVaultPanelLayout = new javax.swing.GroupLayout(jamVaultPanel);
        jamVaultPanel.setLayout(jamVaultPanelLayout);
        jamVaultPanelLayout.setHorizontalGroup(
            jamVaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jamVaultPanelLayout.createSequentialGroup()
                .addGroup(jamVaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jamVaultPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5))
                    .addGroup(jamVaultPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel6)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jamVaultPanelLayout.setVerticalGroup(
            jamVaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jamVaultPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        googlePanel1.setBackground(new java.awt.Color(153, 153, 153));
        googlePanel1.setPreferredSize(new java.awt.Dimension(512, 79));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-google-20.png"))); // NOI18N
        jButton2.setText("Log in with Google");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout googlePanel1Layout = new javax.swing.GroupLayout(googlePanel1);
        googlePanel1.setLayout(googlePanel1Layout);
        googlePanel1Layout.setHorizontalGroup(
            googlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(googlePanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        googlePanel1Layout.setVerticalGroup(
            googlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, googlePanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        passwordPanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setText("Password");

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        passwordTwoPanel.setBackground(new java.awt.Color(153, 153, 153));

        checkbox1.setLabel("Remember me?");

        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Forgot your password?");

        javax.swing.GroupLayout passwordTwoPanelLayout = new javax.swing.GroupLayout(passwordTwoPanel);
        passwordTwoPanel.setLayout(passwordTwoPanelLayout);
        passwordTwoPanelLayout.setHorizontalGroup(
            passwordTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordTwoPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        passwordTwoPanelLayout.setVerticalGroup(
            passwordTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordTwoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(passwordTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginPanel.setBackground(new java.awt.Color(153, 153, 153));

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Don't have an account yet? Sign up");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout loginScreenLayout = new javax.swing.GroupLayout(loginScreen);
        loginScreen.setLayout(loginScreenLayout);
        loginScreenLayout.setHorizontalGroup(
            loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(googlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordTwoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jamVaultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginScreenLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(googlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(494, Short.MAX_VALUE)))
        );
        loginScreenLayout.setVerticalGroup(
            loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginScreenLayout.createSequentialGroup()
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(googlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTwoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jamVaultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginScreenLayout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(googlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(514, Short.MAX_VALUE)))
        );

        cardPanel.add(loginScreen, "card2");

        libraryScreen.setBackground(new java.awt.Color(153, 153, 153));
        libraryScreen.setPreferredSize(new java.awt.Dimension(992, 697));

        loginTitle1.setFont(new java.awt.Font("AppleMyungjo", 0, 48)); // NOI18N
        loginTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle1.setText("Upload a Song");

        libraryPanel.setBackground(new java.awt.Color(255, 255, 255));

        libraryLabel.setFont(new java.awt.Font("AppleMyungjo", 0, 48)); // NOI18N
        libraryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        libraryLabel.setText("Your Library");

        panelLibrary.setBackground(new java.awt.Color(255, 255, 255));
        scrollLibrary.add(panelLibrary);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-play-pause-96.png"))); // NOI18N
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setText("No Media Playing Currently");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(playButton)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout libraryPanelLayout = new javax.swing.GroupLayout(libraryPanel);
        libraryPanel.setLayout(libraryPanelLayout);
        libraryPanelLayout.setHorizontalGroup(
            libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollLibrary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(libraryLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        libraryPanelLayout.setVerticalGroup(
            libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(libraryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout libraryScreenLayout = new javax.swing.GroupLayout(libraryScreen);
        libraryScreen.setLayout(libraryScreenLayout);
        libraryScreenLayout.setHorizontalGroup(
            libraryScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryScreenLayout.createSequentialGroup()
                .addGroup(libraryScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(libraryScreenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, libraryScreenLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addComponent(libraryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        libraryScreenLayout.setVerticalGroup(
            libraryScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryScreenLayout.createSequentialGroup()
                .addComponent(loginTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(libraryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cardPanel.add(libraryScreen, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
 java.awt.CardLayout cl = (java.awt.CardLayout) cardPanel.getLayout();
    cl.show(cardPanel, "card2");   
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed

    }//GEN-LAST:event_usernameFieldActionPerformed

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
 String cmd = evt.getActionCommand();


    if (!javax.swing.JFileChooser.APPROVE_SELECTION.equals(cmd)) {
        fileChooser.setSelectedFile(null);
        return;
    }

    java.io.File picked = fileChooser.getSelectedFile();
    if (picked == null) {
        fileChooser.setSelectedFile(null);
        return;
    }

    try {
     
        java.nio.file.Files.createDirectories(storage);
        String newName = java.util.UUID.randomUUID().toString() + ".mp3";
        java.nio.file.Path dest = storage.resolve(newName);
        java.nio.file.Files.copy(
                picked.toPath(),
                dest,
                java.nio.file.StandardCopyOption.REPLACE_EXISTING
        );


        javax.swing.JTextField tfArtist = new javax.swing.JTextField();
        javax.swing.JTextField tfTitle  = new javax.swing.JTextField();
        javax.swing.JPanel form = new javax.swing.JPanel(new java.awt.GridLayout(0, 1, 6, 6));
        form.add(new javax.swing.JLabel("Artist:")); form.add(tfArtist);
        form.add(new javax.swing.JLabel("Title:"));  form.add(tfTitle);

        int ok = javax.swing.JOptionPane.showConfirmDialog(
                this, form, "Song Info",
                javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.PLAIN_MESSAGE
        );
        if (ok != javax.swing.JOptionPane.OK_OPTION) return;

        String artist = tfArtist.getText().trim();
        String title  = tfTitle.getText().trim();
        if (artist.isEmpty()) artist = "Unknown Artist";
        if (title.isEmpty())  title  = picked.getName();


        String coverPath = "";
        javax.swing.JFileChooser imgChooser = new javax.swing.JFileChooser();
        imgChooser.setDialogTitle("Select Cover Image (optional)");
        imgChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Images", "png","jpg","jpeg"));
        int imgRes = imgChooser.showOpenDialog(this);
        if (imgRes == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File coverFile = imgChooser.getSelectedFile();
            java.nio.file.Path coversDir = storage.resolve("covers");
            java.nio.file.Files.createDirectories(coversDir);
            String coverName = java.util.UUID.randomUUID().toString() + "-" + coverFile.getName();
            java.nio.file.Path coverDest = coversDir.resolve(coverName);
            java.nio.file.Files.copy(
                    coverFile.toPath(),
                    coverDest,
                    java.nio.file.StandardCopyOption.REPLACE_EXISTING
            );
            coverPath = coverDest.toString();
        }

       
        String line = dest.toString() + "\t" + title + "\t" + artist + "\t" + coverPath + System.lineSeparator();
        java.nio.file.Files.writeString(
                indexFile,
                line,
                java.nio.file.StandardOpenOption.CREATE,
                java.nio.file.StandardOpenOption.APPEND
        );


        javax.swing.ImageIcon icon = null;
        if (!coverPath.isEmpty()) {
            java.awt.Image scaled = new javax.swing.ImageIcon(coverPath)
                    .getImage().getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);
            icon = new javax.swing.ImageIcon(scaled);
        }

        final String capTitle  = title;
        final String capArtist = artist;
        final String capCover  = coverPath;
        final java.nio.file.Path capDest = dest;

        javax.swing.JButton tile = new javax.swing.JButton(capArtist + " — " + capTitle, icon);
        tile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tile.setFocusable(false);
        tile.setPreferredSize(new java.awt.Dimension(150, 180));
        tile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tile.setToolTipText(capDest.getFileName().toString());

        tile.addActionListener(e -> {
            updateNowPlaying(capTitle, capArtist, capCover, capDest);
            playMp3(capDest);
        });

        panelLibrary.add(tile);
        panelLibrary.revalidate();
        panelLibrary.repaint();

        javax.swing.JOptionPane.showMessageDialog(this, "Saved:\n" + capArtist + " — " + capTitle);

    } catch (Exception ex) {
        javax.swing.JOptionPane.showMessageDialog(
                this, "Error: " + ex.getMessage(),
                "Copy failed", javax.swing.JOptionPane.ERROR_MESSAGE
        );
    } finally {

        fileChooser.setSelectedFile(null);
        fileChooser.rescanCurrentDirectory();
    }
    }//GEN-LAST:event_fileChooserActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed

    if (currentPlayer != null) {
        stopPlayback();
        playButton.setToolTipText("Play");
    
    } else if (currentTrackPath != null) {
        playMp3(currentTrackPath);
        playButton.setToolTipText("Stop");
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Pick a song first.");
    }
    }//GEN-LAST:event_playButtonActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardPanel;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JPanel googlePanel;
    private javax.swing.JPanel googlePanel1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jamVaultPanel;
    private javax.swing.JLabel libraryLabel;
    private javax.swing.JPanel libraryPanel;
    private javax.swing.JPanel libraryScreen;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel loginScreen;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel loginTitle1;
    private javax.swing.JPanel panelLibrary;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPanel passwordTwoPanel;
    private javax.swing.JButton playButton;
    private java.awt.ScrollPane scrollLibrary;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    
  private void updateNowPlaying(String title, String artist, String coverPath, java.nio.file.Path mp3) {
    currentTitle = title;
    currentArtist = artist;
    currentCoverPath = coverPath;
    currentTrackPath = mp3;

    jLabel7.setText(title + " — " + artist);


    javax.swing.ImageIcon icon = null;
    if (coverPath != null && !coverPath.isEmpty()) {
        java.awt.Image img = new javax.swing.ImageIcon(coverPath).getImage()
                .getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
        icon = new javax.swing.ImageIcon(img);
    }
    jLabel7.setIcon(icon);         
    jLabel7.setIconTextGap(12);    
}


private void playMp3(java.nio.file.Path mp3Path) {

    stopPlayback();


    playThread = new Thread(() -> {
        try (java.io.BufferedInputStream bis =
                 new java.io.BufferedInputStream(java.nio.file.Files.newInputStream(mp3Path))) {
            currentPlayer = new Player(bis);  
            currentPlayer.play();             
        } catch (Exception ex) {
            javax.swing.SwingUtilities.invokeLater(() ->
                javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Playback error:\n" + ex.getMessage(),
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE));
        } finally {
            currentPlayer = null;
        }
    }, "mp3-play-thread");
    playThread.start();
}

   private void stopPlayback() {
    try {
        if (currentPlayer != null) currentPlayer.close();   
        if (playThread != null && playThread.isAlive()) playThread.interrupt();
    } catch (Exception ignored) {}
}



}
