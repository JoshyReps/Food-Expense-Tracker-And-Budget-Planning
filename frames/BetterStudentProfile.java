
package frames;


import classes.ExpenseProject;
import classes.SimplifiedAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BetterStudentProfile extends javax.swing.JFrame {

    private SimplifiedAccount loggedAccount;

    public BetterStudentProfile() {
        
        initComponents();
        extras();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jbtnMenu = new javax.swing.JButton();
        jbtnDetails = new javax.swing.JButton();
        jbtnLogOut = new javax.swing.JButton();
        jbtnGoal = new javax.swing.JButton();
        jbtnExpenses = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jtxfLogInBudgetGoal = new javax.swing.JTextField();
        jbtnAddBudgetGoal = new javax.swing.JButton();
        jlbWarning = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbMonday = new javax.swing.JLabel();
        jlbSunday = new javax.swing.JLabel();
        jlbTuesday = new javax.swing.JLabel();
        jlbWednesday = new javax.swing.JLabel();
        jlbThursday = new javax.swing.JLabel();
        jlbFriday = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jlbSaturday = new javax.swing.JLabel();
        jlbWeeklyRoot = new javax.swing.JLabel();
        jlbMoneyTree = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jpgbrLevel = new javax.swing.JProgressBar();
        jLabel31 = new javax.swing.JLabel();
        jlbRank = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 243, 236));
        jLabel3.setText("PROFILE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jbtnMenu.setBackground(new java.awt.Color(43, 71, 44));
        jbtnMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnMenu.setForeground(new java.awt.Color(241, 243, 236));
        jbtnMenu.setText("Menu");
        jbtnMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnMenu.setFocusPainted(false);
        jbtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 70, 30));

        jbtnDetails.setBackground(new java.awt.Color(43, 71, 44));
        jbtnDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDetails.setForeground(new java.awt.Color(241, 243, 236));
        jbtnDetails.setText("Details");
        jbtnDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDetails.setFocusPainted(false);
        jbtnDetails.setFocusable(false);
        jbtnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 90, 30));

        jbtnLogOut.setBackground(new java.awt.Color(43, 71, 44));
        jbtnLogOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnLogOut.setForeground(new java.awt.Color(241, 243, 236));
        jbtnLogOut.setText("Log Out");
        jbtnLogOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLogOut.setFocusPainted(false);
        jbtnLogOut.setFocusable(false);
        jbtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 80, 30));

        jbtnGoal.setBackground(new java.awt.Color(43, 71, 44));
        jbtnGoal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnGoal.setForeground(new java.awt.Color(241, 243, 236));
        jbtnGoal.setText("Goal");
        jbtnGoal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnGoal.setFocusPainted(false);
        jbtnGoal.setFocusable(false);
        jbtnGoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGoalActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGoal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 80, 30));

        jbtnExpenses.setBackground(new java.awt.Color(43, 71, 44));
        jbtnExpenses.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnExpenses.setForeground(new java.awt.Color(241, 243, 236));
        jbtnExpenses.setText("Expenses");
        jbtnExpenses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnExpenses.setFocusPainted(false);
        jbtnExpenses.setFocusable(false);
        jbtnExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExpensesActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExpenses, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 100, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 270, 30));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 130, 30));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 120, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 140, 30));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 100, 30));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel1.setBackground(new java.awt.Color(105, 11, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(105, 11, 34));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 26, 51), 3));
        jPanel3.setMaximumSize(new java.awt.Dimension(728, 347));
        jPanel3.setMinimumSize(new java.awt.Dimension(728, 347));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(205, 76, 94));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtxfLogInBudgetGoal.setBackground(new java.awt.Color(255, 249, 227));
        jtxfLogInBudgetGoal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxfLogInBudgetGoal.setForeground(new java.awt.Color(0, 0, 0));
        jtxfLogInBudgetGoal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jtxfLogInBudgetGoal.setMinimumSize(new java.awt.Dimension(64, 40));
        jtxfLogInBudgetGoal.setPreferredSize(new java.awt.Dimension(64, 30));

        jbtnAddBudgetGoal.setBackground(new java.awt.Color(35, 32, 19));
        jbtnAddBudgetGoal.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jbtnAddBudgetGoal.setForeground(new java.awt.Color(254, 254, 180));
        jbtnAddBudgetGoal.setText("Add");
        jbtnAddBudgetGoal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jbtnAddBudgetGoal.setFocusPainted(false);
        jbtnAddBudgetGoal.setFocusable(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jtxfLogInBudgetGoal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jbtnAddBudgetGoal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jtxfLogInBudgetGoal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jbtnAddBudgetGoal)
                .addContainerGap())
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 230, 100));

        jlbWarning.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jlbWarning.setForeground(new java.awt.Color(255, 84, 84));
        jlbWarning.setText("*Required To Continue*");
        jPanel3.add(jlbWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 192, 24));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MiniRUI.gif"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 110));
        jPanel3.add(jlbMonday, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 150, 50, 60));
        jPanel3.add(jlbSunday, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 50, 60));
        jPanel3.add(jlbTuesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 50, 60));
        jPanel3.add(jlbWednesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 60, 60));
        jPanel3.add(jlbThursday, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 50, 60));
        jPanel3.add(jlbFriday, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 50, 60));

        jLabel34.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(254, 254, 180));
        jLabel34.setText("Keep RUI's Budget Tree Alive");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel29.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(254, 228, 180));
        jLabel29.setText("Hit Daily Goals for a Week to Unlock Discounts!");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));
        jPanel3.add(jlbSaturday, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 60, 60));

        jlbWeeklyRoot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WeekRootGame.png"))); // NOI18N
        jPanel3.add(jlbWeeklyRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, 280));

        jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree1.png"))); // NOI18N
        jPanel3.add(jlbMoneyTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 30, -1, 120));

        jLabel10.setFont(new java.awt.Font("Sitka Heading", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 180));
        jLabel10.setText(" Daily Budget Goal");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 250, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 58, 730, 350));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(217, 225, 198));
        jLabel26.setText("Goal");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 100, 60));

        jpgbrLevel.setForeground(new java.awt.Color(255, 255, 153));
        jpgbrLevel.setMaximum(7);
        jpgbrLevel.setMinimum(1);
        jpgbrLevel.setToolTipText("Your Level Progress");
        jpgbrLevel.setValue(5);
        jpgbrLevel.setBorder(null);
        jPanel1.add(jpgbrLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 260, 10));
        jpgbrLevel.getAccessibleContext().setAccessibleDescription("");

        jLabel31.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 153));
        jLabel31.setText("Level");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 30));

        jlbRank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RankBronze.png"))); // NOI18N
        jPanel1.add(jlbRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GradientRedBG.png"))); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel24.setMaximumSize(new java.awt.Dimension(760, 411));
        jLabel24.setMinimumSize(new java.awt.Dimension(760, 411));
        jLabel24.setPreferredSize(new java.awt.Dimension(760, 411));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 430));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel4.setBackground(new java.awt.Color(105, 11, 34));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(105, 11, 34));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 26, 51), 3));

        jPanel6.setBackground(new java.awt.Color(205, 76, 94));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 225), 3));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 204));
        jLabel11.setText("Today :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(241, 243, 236));
        jLabel14.setText("Past Daily Avg :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 204));
        jLabel12.setText("This Week :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 204));
        jLabel13.setText("This Month :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(241, 243, 236));
        jLabel15.setText("Past Weekly Avg :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(241, 243, 236));
        jLabel16.setText("Past Monthly Avg :");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(241, 243, 236));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(20, 20, 20)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(241, 243, 236));
        jLabel9.setText("SUMMARY");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180), 3));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(241, 243, 236));
        jLabel23.setText("MY SPENDINGS");

        jComboBox1.setBackground(new java.awt.Color(43, 71, 44));
        jComboBox1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Most Bought", "Highest Total", "Newest", "Oldest" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jComboBox1.setFocusable(false);

        jComboBox2.setBackground(new java.awt.Color(43, 71, 44));
        jComboBox2.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Weekly", "Monthly" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jComboBox2.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jLabel23)
                    .addContainerGap(419, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(288, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 720, 350));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(217, 225, 198));
        jLabel21.setText("Expenses");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 150, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GradientRedBG.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setMaximumSize(new java.awt.Dimension(760, 411));
        jLabel4.setMinimumSize(new java.awt.Dimension(760, 411));
        jLabel4.setPreferredSize(new java.awt.Dimension(760, 411));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        jTabbedPane1.addTab("tab2", jPanel4);

        jPanel5.setBackground(new java.awt.Color(105, 11, 34));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(105, 11, 34));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 26, 51), 3));
        jPanel7.setMaximumSize(new java.awt.Dimension(728, 347));
        jPanel7.setMinimumSize(new java.awt.Dimension(728, 347));
        jPanel7.setPreferredSize(new java.awt.Dimension(728, 347));

        jPanel8.setBackground(new java.awt.Color(205, 76, 94));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Username");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 51, 0));
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel12.setBackground(new java.awt.Color(205, 76, 94));

        jLabel27.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 204));
        jLabel27.setText("Password");

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 51, 0));
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 51, 0));
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel28.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 204));
        jLabel28.setText("New Password");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel28)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel9.setBackground(new java.awt.Color(205, 76, 94));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));

        jList1.setBackground(new java.awt.Color(105, 11, 34));
        jList1.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jList1.setForeground(new java.awt.Color(204, 255, 204));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));

        jButton7.setBackground(new java.awt.Color(102, 0, 0));
        jButton7.setForeground(new java.awt.Color(254, 254, 180));
        jButton7.setText("Delete");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);

        jButton9.setBackground(new java.awt.Color(0, 51, 0));
        jButton9.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(254, 254, 180));
        jButton9.setText("Add");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel10.setBackground(new java.awt.Color(205, 76, 94));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jList2.setBackground(new java.awt.Color(105, 11, 34));
        jList2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jList2.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jList2.setForeground(new java.awt.Color(255, 255, 204));
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(241, 243, 236));
        jLabel17.setText("Account Details");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(241, 243, 236));
        jLabel18.setText("Restrictions");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(241, 243, 236));
        jLabel19.setText("Budget List");

        jRadioButton1.setBackground(new java.awt.Color(105, 11, 34));
        jRadioButton1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(238, 240, 233));
        jRadioButton1.setText("Update");
        jRadioButton1.setFocusPainted(false);
        jRadioButton1.setFocusable(false);

        jButton1.setBackground(new java.awt.Color(0, 51, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 180));
        jButton1.setText("Click");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(69, 69, 69))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 55, -1, 353));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(217, 225, 198));
        jLabel20.setText("Details");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 20, 150, 31));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GradientRedBG.png"))); // NOI18N
        jLabel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel25.setMaximumSize(new java.awt.Dimension(760, 411));
        jLabel25.setMinimumSize(new java.awt.Dimension(760, 411));
        jLabel25.setPreferredSize(new java.awt.Dimension(760, 411));
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        jTabbedPane1.addTab("tab3", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 760, 430));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogInBackground.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //For Providing Account ----------------------------------------------------
    public void setAccount (JSONObject loggedAccount) {
        this.loggedAccount = new SimplifiedAccount(loggedAccount);
        setGoalDetails();
        setExpense();
    }
    //--------------------------------------------------------------------------
    
    //Ignore -------------------------------------------------------------------
    private ActionEvent evtAnnoyingThingy (ActionEvent evt) {
        return(evt);
    }
    //--------------------------------------------------------------------------
    
    //For Getting To Menu ------------------------------------------------------
    private void jbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMenuActionPerformed
        evtAnnoyingThingy(evt);
        
        this.setVisible(false);
        ExpenseProject.foodMenu.setVisible(true);
    }//GEN-LAST:event_jbtnMenuActionPerformed
    //--------------------------------------------------------------------------
    
    //For Logging Out ---------------------------------------------------------
    private void jbtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogOutActionPerformed
        evtAnnoyingThingy(evt);
        
        evtAnnoyingThingy(evt);
        this.setVisible(false);
        ExpenseProject.logIn.setVisible(true);
    }//GEN-LAST:event_jbtnLogOutActionPerformed
    //--------------------------------------------------------------------------
    
    
    //TABBED PANE ==============================================================
    //2 = Details --------------------------------------------------------------
    private void jbtnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDetailsActionPerformed
        evtAnnoyingThingy(evt);
        
        jTabbedPane1.setSelectedIndex(2);
        jbtnDetails.setForeground(new Color(241,235,210));
    }//GEN-LAST:event_jbtnDetailsActionPerformed
    
    //0 = Goal -----------------------------------------------------------------
    private void jbtnGoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGoalActionPerformed
        evtAnnoyingThingy(evt);
        
        jTabbedPane1.setSelectedIndex(0);
        jbtnGoal.setForeground(new Color(241,235,210));
    }//GEN-LAST:event_jbtnGoalActionPerformed
    
    //1 = Expenses -------------------------------------------------------------
    private void jbtnExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExpensesActionPerformed
        evtAnnoyingThingy(evt);
        
        jTabbedPane1.setSelectedIndex(1);
        jbtnExpenses.setForeground(new Color(241,235,210));
    }//GEN-LAST:event_jbtnExpensesActionPerformed
    //--------------------------------------------------------------------------
    //==========================================================================
    
    
    //Tab 1 - Set Goal Tab Details ---------------------------------------------
    private void setGoalDetails () {
        
        if(loggedAccount.getBudgetGoal() == 0.0) { // if DOES NOT have a budget goal which is required
            
            jlbWarning.setText("*Required To Continue*");
            jbtnAddBudgetGoal.setText("Add");
            
            //Disable Buttons
            for (JButton button : new JButton[]{jbtnExpenses, jbtnDetails, jbtnMenu}) {
                button.setEnabled(false);
            }
        }
        else { //if has a budget goal
            
            jlbWarning.setText("");
            jbtnAddBudgetGoal.setText("Update");
            
            //Set Text Box with the Budget Goal
            jtxfLogInBudgetGoal.setText("" + loggedAccount.getBudgetGoal());
            
            //Set Weekly Money Tree Game ------------------------------------------------------------------------------------------------------|
            int countFalse = 0;
            int index = 0;

            for(JLabel labelDays : new JLabel[]{jlbMonday, jlbTuesday, jlbWednesday, jlbThursday, jlbFriday, jlbSaturday, jlbSunday}) {
                
                boolean dayByDayPerformance = loggedAccount.getWeeklyPerformance()[index++];
                
                if(!dayByDayPerformance) {
                    labelDays.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NoMoney.png"))); countFalse++;
                }
                else if (dayByDayPerformance) labelDays.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GoldMoney.png"))); 
            }
            
            switch (countFalse) {
                case 0,1 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree1.png")));
                case 2 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree2.png"))); 
                case 3 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree3.png"))); 
                case 4 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree4.png"))); 
                case 5 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree5.png"))); 
                case 6 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree6.png"))); 
                case 7 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree7.png"))); 
            }
            //---------------------------------------------------------------------------------------------------------------------------------|
        
            //Set Level and Rank 
            jpgbrLevel.setValue(loggedAccount.getLevel());
            
            jlbRank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rank" +  loggedAccount.getRank().toString() + ".png"))); 
        }
    }
    //--------------------------------------------------------------------------
    
    
    //Tab 2 Set Expense Details ------------------------------------------------
    private void setExpense() {
        
        JSONArray accountExpense = new JSONArray();
        
        try(FileReader reader = new FileReader(loggedAccount.getExpensesPath())) {
            accountExpense = (JSONArray) ((JSONObject) new JSONParser().parse(reader)).get("expenses");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        List<Object[]> dailyExpenses = new ArrayList<>(), weeklyExpenses = new ArrayList<>(), monthlyExpesnes = new ArrayList<>();
        List<List<Object[]>> dailyExpensePurchases = new ArrayList<>(), weeklyExpensePurchases = new ArrayList<>(), monthlyExpensePurchases = new ArrayList<>();
        
        //recent account, day, recent week, recent month
        JSONObject recentExpense = (JSONObject) accountExpense.get(0);
        
        String recentExpenseDay = ((String)(recentExpense.get("date")));
        int recentDay = Integer.parseInt((recentExpenseDay).substring(recentExpenseDay.lastIndexOf("-") + 1));
        
        int recentWeek = Integer.parseInt(String.valueOf((String)recentExpense.get("weekYearBought")));
        
        //temp variables
        
        Double dailySum = 0.0, weeklySum = 0.0, monthlySum = 0.0;
        
        int dailyIndex = 0, intWeeklyIndex = 0, intMonthlyIndex = 0;
        
        int currentDay = recentDay, currentWeek = recentWeek, currentMonth = 0;
        
        Integer currentYear = Integer.valueOf(((String)recentExpense.get("date")).substring(0,((String)recentExpense.get("date")).indexOf("-")));
        
        Object[] newDailyExpense = new Object[4], newWeeklyExpense = new Object[4], newMonthlyExpense = new Object[4];
        
        //temp objects
        
        
        //main loop
        for(Object expense : accountExpense) {
            
            JSONObject jsonExpense = (JSONObject) expense;

            String currentExpenseFoodName = (String) jsonExpense.get("foodName");
            Integer currentExpensePrice = Integer.valueOf((String) jsonExpense.get("price"));
            Integer currentExpenseWeekYear = Integer.valueOf((String) jsonExpense.get("weekYearBought"));
            Integer currentExpenseMonthBought = Integer.valueOf((String) jsonExpense.get("monthBoughtInNum"));
            String currentExpenseDateBought = (String) jsonExpense.get("date");
            Integer currentExpenseYearBought = Integer.valueOf(currentExpenseDateBought.substring(0,currentExpenseDateBought.indexOf("-")));
            
            Integer currentExpenseDayBought = Integer.valueOf(currentExpenseDateBought.substring(currentExpenseDateBought.lastIndexOf("-") + 1));
            
            Object[] objectExpense = new Object[3];
            
            objectExpense[0] = currentExpenseFoodName;
            objectExpense[1] = currentExpensePrice;
            objectExpense[2] = (currentExpensePrice < loggedAccount.getBudgetGoal());
            
            //Daily Code ---------------------------------------------------------------------------------------------------------------------
            if(dailySum == 0) dailyExpensePurchases.add(new ArrayList<>());
            
            if(currentExpenseDayBought == currentDay && currentExpenseYearBought.equals(currentYear)) {
                
                if(dailySum == 0) {
                    
                    dailyExpensePurchases.get(dailyIndex).add(objectExpense);
                    dailySum += currentExpensePrice;
                    
                    newDailyExpense = new Object[3];
                    
                    newDailyExpense[0] = currentExpenseDateBought;
                    newDailyExpense[1] = (double) dailySum / (double) dailyExpensePurchases.get(dailyIndex).size();
                    newDailyExpense[2] = (dailySum / dailyExpensePurchases.get(dailyIndex).size()) <= loggedAccount.getBudgetGoal();

                    dailyExpenses.add(newDailyExpense);
                }
                else {
                    
                    dailyExpensePurchases.get(dailyIndex).add(objectExpense);
                    dailySum += currentExpensePrice;
                    
                    newDailyExpense[1] = (double) dailySum / (double) dailyExpensePurchases.get(dailyIndex).size();
                    newDailyExpense[2] = (dailySum / dailyExpensePurchases.get(dailyIndex).size()) <= loggedAccount.getBudgetGoal();
                }
            }
            else {
                
                    dailyExpensePurchases.add(new ArrayList<>());
                    dailyIndex++;
                    dailySum = 0.0;
                    currentDay = currentExpenseDayBought;
                
                    dailyExpensePurchases.get(dailyIndex).add(objectExpense);
                    dailySum += currentExpensePrice;
                    
                    newDailyExpense = new Object[3];
                    
                    newDailyExpense[0] = currentExpenseDateBought;
                    newDailyExpense[1] = dailySum / dailyExpensePurchases.get(dailyIndex).size();
                    newDailyExpense[2] = (dailySum / dailyExpensePurchases.get(dailyIndex).size()) <= loggedAccount.getBudgetGoal();

                    dailyExpenses.add(newDailyExpense);
            }
            //-----------------------------------------------------------------------------------------------------------------------------------
        
            // Weekly Code ----------------------------------------------------------------------------------------------------------------------
            newWeeklyExpense = (currentExpenseWeekYear == currentWeek && !weeklyExpenses.isEmpty()) ? weeklyExpenses.get(intWeeklyIndex) : new Object[3];

            newWeeklyExpense[0] = (currentExpenseWeekYear == recentWeek) ? "this week" : "" + (((((currentExpenseYearBought - currentYear) == 0) ? currentExpenseWeekYear : (52 * (currentExpenseYearBought - currentYear)))) - recentWeek) + " week ago";
            
            if(currentExpenseWeekYear == currentWeek && currentExpenseYearBought.equals(currentYear)) {
                
                weeklySum += currentExpensePrice;
                
                if(newWeeklyExpense[1] == null) {
                    
                    weeklyExpensePurchases.add(new ArrayList<>());
                    weeklyExpenses.add(newWeeklyExpense);
                    newWeeklyExpense[1] = weeklySum;
                }
                else newWeeklyExpense[1] = (Double) (weeklySum / ((weeklyExpensePurchases.get(intWeeklyIndex).isEmpty()) ? 1 : weeklyExpensePurchases.get(intWeeklyIndex).size() + 1));
                
                newWeeklyExpense[2] = ((Double)newWeeklyExpense[1]) < loggedAccount.getBudgetGoal();
                weeklyExpensePurchases.get(intWeeklyIndex).add(objectExpense);
            }
            else {
                
                weeklySum = (double) currentExpensePrice;
                
                if(newWeeklyExpense[1] == null) {
                    
                    weeklyExpensePurchases.add(new ArrayList<>());
                    weeklyExpenses.add(newWeeklyExpense);
                    newWeeklyExpense[1] = weeklySum;
                }
                
                currentWeek = currentExpenseWeekYear;
                        
                intWeeklyIndex++;
                
                newWeeklyExpense[1] = (Double) (weeklySum / ((weeklyExpensePurchases.get(intWeeklyIndex).isEmpty()) ? 1 : weeklyExpensePurchases.get(intWeeklyIndex).size() + 1));
                newWeeklyExpense[2] = ((Double)newWeeklyExpense[1]) < loggedAccount.getBudgetGoal();
                
                weeklyExpensePurchases.get(intWeeklyIndex).add(objectExpense);
            }
            //-----------------------------------------------------------------------------------------------------------------------------------
            
            
            // Monthly Code ---------------------------------------------------------------------------------------------------------------------
            
            // ----------------------------------------------------------------------------------------------------------------------------------
        }
        
//        for (Object[] expense : dailyExpenses) {
//            System.out.println(Arrays.toString(expense));
//        }
//        
//        for (Object[] expense : weeklyExpenses) {
//            System.out.println(Arrays.toString(expense));
//        }
        
        for (var list : weeklyExpensePurchases) {
            System.out.println("List-----------");
            for (Object[] ar : list) {
                System.out.println(Arrays.toString(ar));
            }
        }
    }
    //--------------------------------------------------------------------------

    
    //Extra Codes (Mostly For UI Design) ---------------------------------------
    public final void extras() {
        
       
        jTabbedPane1.setLayout(new CardLayout());
        
        JButton[] buttons = {jbtnMenu,jbtnDetails,jbtnLogOut,jbtnGoal,jbtnExpenses};
        
        for(JButton button : buttons) {
            button.setContentAreaFilled( false );
            button.setBorder( null );
            
            button.addMouseListener(new MouseAdapter() {
                
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setForeground(new Color(204,204,255));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                button.setForeground(new Color(241,243,236));
            }
        });
        }
    }
    //--------------------------------------------------------------------------
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbtnAddBudgetGoal;
    private javax.swing.JButton jbtnDetails;
    private javax.swing.JButton jbtnExpenses;
    private javax.swing.JButton jbtnGoal;
    private javax.swing.JButton jbtnLogOut;
    private javax.swing.JButton jbtnMenu;
    private javax.swing.JLabel jlbFriday;
    private javax.swing.JLabel jlbMonday;
    private javax.swing.JLabel jlbMoneyTree;
    private javax.swing.JLabel jlbRank;
    private javax.swing.JLabel jlbSaturday;
    private javax.swing.JLabel jlbSunday;
    private javax.swing.JLabel jlbThursday;
    private javax.swing.JLabel jlbTuesday;
    private javax.swing.JLabel jlbWarning;
    private javax.swing.JLabel jlbWednesday;
    private javax.swing.JLabel jlbWeeklyRoot;
    private javax.swing.JProgressBar jpgbrLevel;
    private javax.swing.JTextField jtxfLogInBudgetGoal;
    // End of variables declaration//GEN-END:variables
}
