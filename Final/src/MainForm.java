import java.awt.Color;
import java.awt.Container;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Antonios Koinousis
 */
public class MainForm extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    private String username;

    /** Creates new form MainForm */
    public MainForm() {
        initComponents();
        username = Users.getCurrentUser(); // get current user (logged-in)
        setLocationRelativeTo(null); // position the form at the center of the screen
        Container c = getContentPane();
        c.setBackground(Color.WHITE);
        activityTable.setGridColor(Color.WHITE);
        activityTable.setBackground(Color.WHITE);
        activityTable.setModel(model);
        activityTable.getTableHeader().setReorderingAllowed(false); // Disable re-ordering of table headers
        UserActivity.populateModel(model);
        UserActivity.loadDataToTable(model, username);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtHeight = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        genderBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnCalculate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtBMI = new javax.swing.JTextField();
        txtIdealWeight = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        txtCalories = new javax.swing.JTextField();
        btnExport = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        activityTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        btnStats = new javax.swing.JButton();
        boxSearchType = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        myMenu = new javax.swing.JMenuBar();
        itemUser = new javax.swing.JMenu();
        itemAccount = new javax.swing.JMenuItem();
        itemExit = new javax.swing.JMenuItem();
        itemNotes = new javax.swing.JMenu();
        ItemToDo = new javax.swing.JMenu();
        itemAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BMI Calculator");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 13)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtHeight.setToolTipText("Enter your height here");

        jLabel1.setText("Height (Centimeters)");

        txtWeight.setToolTipText("Enter your weight here");

        jLabel2.setText("Weight (Kilograms)");

        txtAge.setToolTipText("Enter your age here");

        jLabel3.setText("Age");

        genderBox.setBackground(new java.awt.Color(255, 255, 255));
        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderBox.setToolTipText("Select your gender");

        jLabel4.setText("Gender");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnCalculate.setBackground(new java.awt.Color(255, 255, 255));
        btnCalculate.setText("Calculate");
        btnCalculate.setToolTipText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset fields");
        btnReset.setToolTipText("Resets all fields to default values");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtName.setToolTipText("Enter your name here");

        txtSurname.setToolTipText("Enter your surname here");

        jLabel5.setText("Surname");

        jLabel6.setText("Name");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBMI.setEditable(false);
        txtBMI.setBackground(new java.awt.Color(255, 255, 255));
        txtBMI.setText("BMI Result: ~");

        txtIdealWeight.setEditable(false);
        txtIdealWeight.setBackground(new java.awt.Color(255, 255, 255));
        txtIdealWeight.setText("Ideal Weight: ~");

        txtCategory.setEditable(false);
        txtCategory.setBackground(new java.awt.Color(255, 255, 255));
        txtCategory.setText("Category: ~");

        txtCalories.setEditable(false);
        txtCalories.setBackground(new java.awt.Color(255, 255, 255));
        txtCalories.setText("Calories per day: ~");

        btnExport.setBackground(new java.awt.Color(255, 255, 255));
        btnExport.setText("Export results");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBMI, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdealWeight, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCategory, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCalories, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtBMI)
                .addGap(18, 18, 18)
                .addComponent(txtIdealWeight)
                .addGap(18, 18, 18)
                .addComponent(txtCategory)
                .addGap(18, 18, 18)
                .addComponent(txtCalories)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test_results_64px.png"))); // NOI18N
        jLabel7.setText("Your results");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtHeight)
                            .addComponent(txtWeight)
                            .addComponent(txtAge)
                            .addComponent(genderBox, 0, 324, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addComponent(txtSurname))
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalculate)))
                .addGap(37, 37, 37)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHeight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(txtWeight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAge)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderBox)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(158, 158, 158))
        );

        jTabbedPane1.addTab("Main", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        activityTable.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        activityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        activityTable.setRowHeight(25);
        jScrollPane1.setViewportView(activityTable);

        txtSearch.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        txtSearch.setToolTipText("Enter your search term here");
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(255, 255, 255));
        btnRemove.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        btnRemove.setText("Delete selected item");
        btnRemove.setToolTipText("Deletes selected row");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnStats.setBackground(new java.awt.Color(255, 255, 255));
        btnStats.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        btnStats.setText("Calculate BMI and Weight average");
        btnStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatsActionPerformed(evt);
            }
        });

        boxSearchType.setBackground(new java.awt.Color(255, 255, 255));
        boxSearchType.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        boxSearchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free search", "AND search", "OR search" }));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(255, 255, 255));
        btnModify.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        btnModify.setText("Modify");
        btnModify.setToolTipText("Double click on the value you want to modify and then click \"Modify\"");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxSearchType, 0, 128, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStats, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove)
                    .addComponent(btnStats)
                    .addComponent(boxSearchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnModify))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("Activity History", jPanel2);

        myMenu.setBackground(new java.awt.Color(255, 255, 255));
        myMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        myMenu.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N

        itemUser.setText("User");
        itemUser.setFont(new java.awt.Font("Segoe UI Symbol", 0, 13)); // NOI18N

        itemAccount.setText("Account");
        itemAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAccountActionPerformed(evt);
            }
        });
        itemUser.add(itemAccount);

        itemExit.setText("Exit");
        itemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitActionPerformed(evt);
            }
        });
        itemUser.add(itemExit);

        myMenu.add(itemUser);

        itemNotes.setText("Notes");
        itemNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemNotesMouseClicked(evt);
            }
        });
        myMenu.add(itemNotes);

        ItemToDo.setText("To-Do List");
        ItemToDo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemToDoMouseClicked(evt);
            }
        });
        myMenu.add(ItemToDo);

        itemAbout.setText("About");
        itemAbout.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        itemAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemAboutMouseClicked(evt);
            }
        });
        myMenu.add(itemAbout);

        setJMenuBar(myMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, Short.MAX_VALUE)
        );

        pack();
    }//GEN-END:initComponents

    private void btnStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatsActionPerformed
        String result = StatsCalculator.calculateStats(activityTable);
        JOptionPane.showMessageDialog(this, result, "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnStatsActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (!activityTable.getSelectionModel().isSelectionEmpty()) { // Check if user selected a row to delete
            ((DefaultTableModel) activityTable.getModel()).removeRow(activityTable.getSelectedRow());
            UserActivity.saveActivityChanges(activityTable, false, username);
        } else {
            JOptionPane.showMessageDialog(this, "Please select an item first.", "Information",
                                          JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (boxSearchType.getSelectedIndex() == 0) // if free search
            SearchData.freeSearch(activityTable, txtSearch.getText(), model);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (boxSearchType.getSelectedIndex() == 1) { // if AND search
            SearchData.andSearch(activityTable, txtSearch.getText(), model);
        } else if (boxSearchType.getSelectedIndex() == 2) { // if OR search
            SearchData.orSearch(activityTable, txtSearch.getText(), model);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        UserActivity.saveActivityChanges(activityTable, false, username);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void itemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemExitActionPerformed

    private void itemAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemAboutMouseClicked
        new AboutForm().setVisible(true);
    }//GEN-LAST:event_itemAboutMouseClicked

    private void itemNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemNotesMouseClicked
        new NotesForm().setVisible(true);
    }//GEN-LAST:event_itemNotesMouseClicked

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        String name = txtName.getText();
        String surname = txtSurname.getText();
        String bmi = txtBMI.getText();
        String category = txtCategory.getText();
        String ideal = txtIdealWeight.getText();
        String calories = txtCalories.getText();
        StatsCalculator.exportResults(name, surname, bmi, category, ideal, calories); // Export results to a user specified directory
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtName.setText("");
        txtSurname.setText("");
        txtHeight.setText("");
        txtWeight.setText("");
        txtAge.setText("");
        genderBox.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        if (!txtHeight.getText().isEmpty() && !txtWeight.getText().isEmpty() && !txtAge.getText().isEmpty() &&
            !txtName.getText().isEmpty() && !txtSurname.getText().isEmpty()) {
            try {
                int height = Integer.parseInt(txtHeight.getText()); // Convert height to integer
                double weight = Double.parseDouble(txtWeight.getText()); // Convert weight to double
                int age = Integer.parseInt(txtAge.getText()); // Convert age to integer
                String gender = genderBox.getSelectedItem().toString(); // Get gender
                String name = txtName.getText(); // Get name
                String surname = txtSurname.getText(); // Get surname
                StatsCalculator SC =
                    new StatsCalculator(height, weight, age, gender, name, surname); // Create StatsCalculator object
                double bmiResult = SC.calculateBMI();
                double idealResult = SC.calculateIdealWeight();
                Status userCategory = SC.myStatus(bmiResult);
                txtBMI.setText("BMI Result: " + String.valueOf(bmiResult));
                txtCategory.setText("Category: " + String.valueOf(userCategory));
                txtIdealWeight.setText("Ideal Weight: " + String.valueOf(idealResult) + "kg");
                txtCalories.setText("Calories per day: " + SC.calculateCalories());
                UserActivity UA =
                    new UserActivity(StatsCalculator.findDate(), StatsCalculator.findTime(), name, surname, bmiResult);
                int count = activityTable.getRowCount() + 1; // Count entries in activity table
                String userInfo = UA.generateStringToSave(weight, userCategory, count);
                model.addRow(new Object[] { count, UA.getName() + " " + UA.getSurname(), UA.getDate(), UA.getTime(), // add row to JTable
                                            weight, UA.getBmi(), userCategory });
                UA.saveToFile(userInfo, username);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please enter valid input in the fields.", "Information",
                                              JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please fill all the required fields.", "Information",
                                          JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void ItemToDoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemToDoMouseClicked
        new ToDoForm().setVisible(true);
    }//GEN-LAST:event_ItemToDoMouseClicked

    private void itemAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAccountActionPerformed
        new AccountForm().setVisible(true);
    }//GEN-LAST:event_itemAccountActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing
                                                                   .UIManager
                                                                   .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing
                         .UIManager
                         .setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util
                .logging
                .Logger
                .getLogger(MainForm.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util
                .logging
                .Logger
                .getLogger(MainForm.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util
                .logging
                .Logger
                .getLogger(MainForm.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util
                .logging
                .Logger
                .getLogger(MainForm.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt
            .EventQueue
            .invokeLater(new Runnable() {
                public void run() {
                    new MainForm().setVisible(true);
                }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ItemToDo;
    private javax.swing.JTable activityTable;
    private javax.swing.JComboBox<String> boxSearchType;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStats;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JMenu itemAbout;
    private javax.swing.JMenuItem itemAccount;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenu itemNotes;
    private javax.swing.JMenu itemUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuBar myMenu;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBMI;
    private javax.swing.JTextField txtCalories;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtIdealWeight;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

}