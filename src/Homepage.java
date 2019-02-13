
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import javax.swing.SwingUtilities;


public class Homepage extends javax.swing.JFrame {
    public static int count = 0;
    public static int year1 = 0;
    public static int year2 = 0;
    public static float e = 0;
    public static String state;
    public static boolean done = false;
    
    /**
     * Creates new form Homepage
     */
    public Homepage() {
       //initComponents();
       initComponents2(); 
    }

    public void initComponents2() {
        
        button2010 = new javax.swing.JToggleButton();
        button2011 = new javax.swing.JToggleButton();
        button2012 = new javax.swing.JToggleButton();
        button2013 = new javax.swing.JToggleButton();
        button2014 = new javax.swing.JToggleButton();
        button2015 = new javax.swing.JToggleButton();
        button2016 = new javax.swing.JToggleButton();
        submit = new javax.swing.JButton();
        California = new javax.swing.JLabel();
        Nevada = new javax.swing.JLabel();
        Oregon = new javax.swing.JLabel();
        Washington = new javax.swing.JLabel();
        Alaska = new javax.swing.JLabel();
        Idaho = new javax.swing.JLabel();
        Utah = new javax.swing.JLabel();
        Arizona = new javax.swing.JLabel();
        Montana = new javax.swing.JLabel();
        Wyoming = new javax.swing.JLabel();
        Colorado = new javax.swing.JLabel();
        NewMexico = new javax.swing.JLabel();
        Texas = new javax.swing.JLabel();
        NorthDakota = new javax.swing.JLabel();
        SouthDakota = new javax.swing.JLabel();
        Nebraska = new javax.swing.JLabel();
        Kansas = new javax.swing.JLabel();
        Oklahoma = new javax.swing.JLabel();
        Minnesota = new javax.swing.JLabel();
        Iowa = new javax.swing.JLabel();
        Missouri = new javax.swing.JLabel();
        Arkansas = new javax.swing.JLabel();
        Louisiana = new javax.swing.JLabel();
        Wisconsin = new javax.swing.JLabel();
        Illinois = new javax.swing.JLabel();
        Michigan = new javax.swing.JLabel();
        Indiana = new javax.swing.JLabel();
        Kentucky = new javax.swing.JLabel();
        Tennessee = new javax.swing.JLabel();
        Mississippi = new javax.swing.JLabel();
        Alabama = new javax.swing.JLabel();
        Georgia = new javax.swing.JLabel();
        SouthCarolina = new javax.swing.JLabel();
        Florida = new javax.swing.JLabel();
        PR = new java.awt.Label();
        NorthCarolina = new javax.swing.JLabel();
        Ohio = new javax.swing.JLabel();
        Hawaii = new javax.swing.JLabel();
        PuertoRico = new javax.swing.JLabel();
        Virginia = new javax.swing.JLabel();
        WestVirginia = new javax.swing.JLabel();
        Pennsylvania = new javax.swing.JLabel();
        NewYork = new javax.swing.JLabel();
        Vermont = new javax.swing.JLabel();
        NewHampshire = new javax.swing.JLabel();
        Maryland = new javax.swing.JLabel();
        Delaware = new javax.swing.JLabel();
        NewJersey = new javax.swing.JLabel();
        Connecticut = new javax.swing.JLabel();
        RhodeIsland = new javax.swing.JLabel();
        Maine = new javax.swing.JLabel();
        Massachusetts = new javax.swing.JLabel();
        DC = new java.awt.Label();
        DistrictOfColumbia = new javax.swing.JLabel();
        Map = new javax.swing.JLabel();
     //jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTextArea();
        mergeSort = new javax.swing.JToggleButton();
        bubbleSort = new javax.swing.JToggleButton();
        quickSort = new javax.swing.JToggleButton();
        quickSortImproved = new javax.swing.JToggleButton();
        runtime = new javax.swing.JLabel();
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        getContentPane().setLayout(null);
        getContentPane().setPreferredSize(new Dimension(1500,1000));
        getContentPane().setMinimumSize(new Dimension(1300,800));
        
        // taken from initComponents()
        button2010.setText("2010");
        button2010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2010ActionPerformed(evt);
            }
        });
        getContentPane().add(button2010);
        button2010.setBounds(40, 40, 76, 29);

        button2011.setText("2011");
        button2011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2011ActionPerformed(evt);
            }
        });
        getContentPane().add(button2011);
        button2011.setBounds(150, 40, 76, 29);

        button2012.setText("2012");
        button2012.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2012ActionPerformed(evt);
            }
        });
        getContentPane().add(button2012);
        button2012.setBounds(260, 40, 76, 29);

        button2013.setText("2013");
        button2013.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2013ActionPerformed(evt);
            }
        });
        getContentPane().add(button2013);
        button2013.setBounds(360, 40, 76, 29);

        button2014.setText("2014");
        button2014.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2014ActionPerformed(evt);
            }
        });
        getContentPane().add(button2014);
        button2014.setBounds(470, 40, 76, 29);

        button2015.setText("2015");
        button2015.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2015ActionPerformed(evt);
            }
        });
        getContentPane().add(button2015);
        button2015.setBounds(580, 40, 76, 29);

        button2016.setText("2016");
        button2016.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2016ActionPerformed(evt);
            }
        });
        getContentPane().add(button2016);
        button2016.setBounds(680, 40, 76, 29);

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(360, 10, 88, 29);
        getContentPane().add(California);
        California.setBounds(40, 320, 60, 20);
        getContentPane().add(Nevada);
        Nevada.setBounds(85, 280, 50, 20);
        getContentPane().add(Oregon);
        Oregon.setBounds(35, 190, 70, 20);
        getContentPane().add(Washington);
        Washington.setBounds(65, 130, 60, 20);
        getContentPane().add(Alaska);
        Alaska.setBounds(65, 490, 60, 20);
        getContentPane().add(Idaho);
        Idaho.setBounds(130, 210, 60, 20);
        getContentPane().add(Utah);
        Utah.setBounds(150, 300, 40, 20);
        getContentPane().add(Arizona);
        Arizona.setBounds(125, 376, 60, 20);

        Montana.setText("     ");
        getContentPane().add(Montana);
        Montana.setBounds(180, 166, 100, 20);

        Wyoming.setText("     ");
        getContentPane().add(Wyoming);
        Wyoming.setBounds(210, 240, 60, 16);

        Colorado.setText("     ");
        getContentPane().add(Colorado);
        Colorado.setBounds(220, 310, 70, 16);

        NewMexico.setText("          ");
        getContentPane().add(NewMexico);
        NewMexico.setBounds(210, 400, 70, 16);

        Texas.setText("     ");
        getContentPane().add(Texas);
        Texas.setBounds(290, 450, 130, 16);

        NorthDakota.setText("     ");
        getContentPane().add(NorthDakota);
        NorthDakota.setBounds(300, 160, 70, 16);

        SouthDakota.setText("     ");
        getContentPane().add(SouthDakota);
        SouthDakota.setBounds(300, 216, 80, 20);

        Nebraska.setText("     ");
        getContentPane().add(Nebraska);
        Nebraska.setBounds(320, 270, 70, 16);

        Kansas.setText("     ");
        getContentPane().add(Kansas);
        Kansas.setBounds(320, 326, 90, 20);

        Oklahoma.setText("     ");
        getContentPane().add(Oklahoma);
        Oklahoma.setBounds(350, 380, 60, 16);

        Minnesota.setText("     ");
        getContentPane().add(Minnesota);
        Minnesota.setBounds(390, 200, 40, 16);

        Iowa.setText("                         ");
        getContentPane().add(Iowa);
        Iowa.setBounds(400, 260, 60, 16);

        Missouri.setText("     ");
        getContentPane().add(Missouri);
        Missouri.setBounds(420, 330, 50, 16);

        Arkansas.setText("           ");
        getContentPane().add(Arkansas);
        Arkansas.setBounds(420, 390, 50, 16);

        Louisiana.setText("     ");
        getContentPane().add(Louisiana);
        Louisiana.setBounds(430, 460, 60, 16);

        Wisconsin.setText("            ");
        getContentPane().add(Wisconsin);
        Wisconsin.setBounds(458, 220, 40, 16);

        Illinois.setText("               ");
        getContentPane().add(Illinois);
        Illinois.setBounds(470, 290, 40, 16);

        Michigan.setText("       ");
        getContentPane().add(Michigan);
        Michigan.setBounds(520, 200, 28, 16);

        Indiana.setText("       ");
        getContentPane().add(Indiana);
        Indiana.setBounds(510, 290, 28, 16);

        Kentucky.setText("       ");
        getContentPane().add(Kentucky);
        Kentucky.setBounds(500, 326, 70, 20);

        Tennessee.setText("           ");
        getContentPane().add(Tennessee);
        Tennessee.setBounds(490, 360, 44, 16);

        Mississippi.setText("       ");
        getContentPane().add(Mississippi);
        Mississippi.setBounds(465, 430, 40, 16);

        Alabama.setText("         ");
        getContentPane().add(Alabama);
        Alabama.setBounds(516, 420, 40, 16);

        Georgia.setText("         ");
        getContentPane().add(Georgia);
        Georgia.setBounds(565, 420, 50, 16);

        SouthCarolina.setText("         ");
        getContentPane().add(SouthCarolina);
        SouthCarolina.setBounds(610, 390, 36, 16);

        Florida.setText("         ");
        getContentPane().add(Florida);
        Florida.setBounds(620, 500, 36, 16);

        PR.setText("PR");
        getContentPane().add(PR);
        PR.setBounds(500, 540, 20, 20);
        PR.getAccessibleContext().setAccessibleName("label1");

        NorthCarolina.setText("          ");
        getContentPane().add(NorthCarolina);
        NorthCarolina.setBounds(630, 350, 40, 16);

        Ohio.setText("          ");
        getContentPane().add(Ohio);
        Ohio.setBounds(550, 280, 40, 16);

        Hawaii.setText("                  ");
        getContentPane().add(Hawaii);
        Hawaii.setBounds(230, 550, 80, 16);

        PuertoRico.setText("                        ");
        getContentPane().add(PuertoRico);
        PuertoRico.setBounds(470, 560, 90, 16);

        Virginia.setText("          ");
        getContentPane().add(Virginia);
        Virginia.setBounds(620, 310, 60, 16);

        WestVirginia.setText("       ");
        getContentPane().add(WestVirginia);
        WestVirginia.setBounds(590, 300, 28, 16);

        Pennsylvania.setText("            ");
        getContentPane().add(Pennsylvania);
        Pennsylvania.setBounds(610, 250, 60, 16);

        NewYork.setText("        ");
        getContentPane().add(NewYork);
        NewYork.setBounds(620, 210, 60, 16);

        Vermont.setText("               ");
        getContentPane().add(Vermont);
        Vermont.setBounds(600, 150, 60, 16);

        NewHampshire.setText("           ");
        getContentPane().add(NewHampshire);
        NewHampshire.setBounds(670, 110, 44, 16);

        Maryland.setText("              ");
        getContentPane().add(Maryland);
        Maryland.setBounds(720, 290, 56, 16);

        Delaware.setText("                 ");
        getContentPane().add(Delaware);
        Delaware.setBounds(720, 270, 68, 16);

        NewJersey.setText("               ");
        getContentPane().add(NewJersey);
        NewJersey.setBounds(720, 250, 60, 16);

        Connecticut.setText("          ");
        getContentPane().add(Connecticut);
        Connecticut.setBounds(740, 230, 60, 20);

        RhodeIsland.setText("         ");
        getContentPane().add(RhodeIsland);
        RhodeIsland.setBounds(750, 220, 36, 16);

        Maine.setText("           ");
        getContentPane().add(Maine);
        Maine.setBounds(710, 120, 40, 16);

        Massachusetts.setText("             ");
        getContentPane().add(Massachusetts);
        Massachusetts.setBounds(760, 180, 50, 20);

        DC.setText("Wash. DC");
        getContentPane().add(DC);
        DC.setBounds(700, 420, 60, 20);

        DistrictOfColumbia.setText("                    ");
        getContentPane().add(DistrictOfColumbia);
        DistrictOfColumbia.setBounds(690, 436, 90, 20);

        Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/USmap.jpg"))); // NOI18N
        getContentPane().add(Map);
        Map.setBounds(0, 80, 768, 512);
        
 
        
        mergeSort.setText("Merge Sort");
        mergeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mergeSortActionPerformed(evt);
            }
        });
        getContentPane().add(mergeSort);
        mergeSort.setBounds(890, 550, 100, 29);
        mergeSort.setBackground(new java.awt.Color(238, 238, 238));

        bubbleSort.setText("Bubble Sort");
        bubbleSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubbleSortActionPerformed(evt);
            }
        });
        getContentPane().add(bubbleSort);
        bubbleSort.setBounds(1000, 550, 100, 29);
        bubbleSort.setBackground(new java.awt.Color(238, 238, 238));

        quickSort.setText("Quick Sort");
        quickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickSortActionPerformed(evt);
            }
        });
        getContentPane().add(quickSort);
        quickSort.setBounds(1110, 550, 100, 29);
        quickSort.setBackground(new java.awt.Color(238, 238, 238));

        quickSortImproved.setText("Quick Sort (v2.0)");
        quickSortImproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickSortImprovedActionPerformed(evt);
            }
        });
        getContentPane().add(quickSortImproved);
        quickSortImproved.setBounds(1219, 550, 140, 29);
        quickSortImproved.setBackground(new java.awt.Color(238, 238, 238));
        
        dataTable.setColumns(1);
        dataTable.setRows(57);
        jScrollPane2.setViewportView(dataTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(890, 30, 460, 510);
        
        dataTable.setText(null);
        for (int i = 0; i < Main.CensusData.size(); i++) { 
            dataTable.setText(Main.changeAndGeo.get(i).getGeoArea());
            //dataTable.append(Main.changeAndGeo.get(i).getGeoArea());   
        }
        dataTable.setVisible(true);
        
        runtime.setForeground(new java.awt.Color(100, 0, 0));
        runtime.setText("Runtime: ");
        getContentPane().add(runtime);
        runtime.setBounds(940, 10, 360, 16);
        
        pack();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2010 = new javax.swing.JToggleButton();
        button2011 = new javax.swing.JToggleButton();
        button2012 = new javax.swing.JToggleButton();
        button2013 = new javax.swing.JToggleButton();
        button2014 = new javax.swing.JToggleButton();
        button2015 = new javax.swing.JToggleButton();
        button2016 = new javax.swing.JToggleButton();
        submit = new javax.swing.JButton();
        California = new javax.swing.JLabel();
        Nevada = new javax.swing.JLabel();
        Oregon = new javax.swing.JLabel();
        Washington = new javax.swing.JLabel();
        Alaska = new javax.swing.JLabel();
        Idaho = new javax.swing.JLabel();
        Utah = new javax.swing.JLabel();
        Arizona = new javax.swing.JLabel();
        Montana = new javax.swing.JLabel();
        Wyoming = new javax.swing.JLabel();
        Colorado = new javax.swing.JLabel();
        NewMexico = new javax.swing.JLabel();
        Texas = new javax.swing.JLabel();
        NorthDakota = new javax.swing.JLabel();
        SouthDakota = new javax.swing.JLabel();
        Nebraska = new javax.swing.JLabel();
        Kansas = new javax.swing.JLabel();
        Oklahoma = new javax.swing.JLabel();
        Minnesota = new javax.swing.JLabel();
        Iowa = new javax.swing.JLabel();
        Missouri = new javax.swing.JLabel();
        Arkansas = new javax.swing.JLabel();
        Louisiana = new javax.swing.JLabel();
        Wisconsin = new javax.swing.JLabel();
        Illinois = new javax.swing.JLabel();
        Michigan = new javax.swing.JLabel();
        Indiana = new javax.swing.JLabel();
        Kentucky = new javax.swing.JLabel();
        Tennessee = new javax.swing.JLabel();
        Mississippi = new javax.swing.JLabel();
        Alabama = new javax.swing.JLabel();
        Georgia = new javax.swing.JLabel();
        SouthCarolina = new javax.swing.JLabel();
        Florida = new javax.swing.JLabel();
        PR = new java.awt.Label();
        NorthCarolina = new javax.swing.JLabel();
        Ohio = new javax.swing.JLabel();
        Hawaii = new javax.swing.JLabel();
        PuertoRico = new javax.swing.JLabel();
        Virginia = new javax.swing.JLabel();
        WestVirginia = new javax.swing.JLabel();
        Pennsylvania = new javax.swing.JLabel();
        NewYork = new javax.swing.JLabel();
        Vermont = new javax.swing.JLabel();
        NewHampshire = new javax.swing.JLabel();
        Maryland = new javax.swing.JLabel();
        Delaware = new javax.swing.JLabel();
        NewJersey = new javax.swing.JLabel();
        Connecticut = new javax.swing.JLabel();
        RhodeIsland = new javax.swing.JLabel();
        Maine = new javax.swing.JLabel();
        Massachusetts = new javax.swing.JLabel();
        DC = new java.awt.Label();
        DistrictOfColumbia = new javax.swing.JLabel();
        Map = new javax.swing.JLabel();
        mergeSort = new javax.swing.JToggleButton();
        bubbleSort = new javax.swing.JToggleButton();
        quickSort = new javax.swing.JToggleButton();
        quickSortImproved = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTextArea();
        runtime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        button2010.setText("2010");
        button2010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2010ActionPerformed(evt);
            }
        });
        getContentPane().add(button2010);
        button2010.setBounds(40, 40, 76, 29);

        button2011.setText("2011");
        button2011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2011ActionPerformed(evt);
            }
        });
        getContentPane().add(button2011);
        button2011.setBounds(150, 40, 76, 29);

        button2012.setText("2012");
        button2012.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2012ActionPerformed(evt);
            }
        });
        getContentPane().add(button2012);
        button2012.setBounds(260, 40, 76, 29);

        button2013.setText("2013");
        button2013.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2013ActionPerformed(evt);
            }
        });
        getContentPane().add(button2013);
        button2013.setBounds(360, 40, 76, 29);

        button2014.setText("2014");
        button2014.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2014ActionPerformed(evt);
            }
        });
        getContentPane().add(button2014);
        button2014.setBounds(470, 40, 76, 29);

        button2015.setText("2015");
        button2015.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2015ActionPerformed(evt);
            }
        });
        getContentPane().add(button2015);
        button2015.setBounds(580, 40, 76, 29);

        button2016.setText("2016");
        button2016.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2016ActionPerformed(evt);
            }
        });
        getContentPane().add(button2016);
        button2016.setBounds(680, 40, 76, 29);

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(360, 10, 88, 29);
        getContentPane().add(California);
        California.setBounds(40, 320, 60, 20);
        getContentPane().add(Nevada);
        Nevada.setBounds(85, 280, 50, 20);
        getContentPane().add(Oregon);
        Oregon.setBounds(35, 190, 70, 20);
        getContentPane().add(Washington);
        Washington.setBounds(65, 130, 60, 20);
        getContentPane().add(Alaska);
        Alaska.setBounds(65, 490, 60, 20);
        getContentPane().add(Idaho);
        Idaho.setBounds(130, 210, 60, 20);
        getContentPane().add(Utah);
        Utah.setBounds(150, 300, 40, 20);
        getContentPane().add(Arizona);
        Arizona.setBounds(125, 376, 60, 20);

        Montana.setText("     ");
        getContentPane().add(Montana);
        Montana.setBounds(180, 166, 100, 20);

        Wyoming.setText("     ");
        getContentPane().add(Wyoming);
        Wyoming.setBounds(210, 240, 60, 16);

        Colorado.setText("     ");
        getContentPane().add(Colorado);
        Colorado.setBounds(220, 310, 70, 16);

        NewMexico.setText("          ");
        getContentPane().add(NewMexico);
        NewMexico.setBounds(210, 400, 70, 16);

        Texas.setText("     ");
        getContentPane().add(Texas);
        Texas.setBounds(290, 450, 130, 16);

        NorthDakota.setText("     ");
        getContentPane().add(NorthDakota);
        NorthDakota.setBounds(300, 160, 70, 16);

        SouthDakota.setText("     ");
        getContentPane().add(SouthDakota);
        SouthDakota.setBounds(300, 216, 80, 20);

        Nebraska.setText("     ");
        getContentPane().add(Nebraska);
        Nebraska.setBounds(320, 270, 70, 16);

        Kansas.setText("     ");
        getContentPane().add(Kansas);
        Kansas.setBounds(320, 326, 90, 20);

        Oklahoma.setText("     ");
        getContentPane().add(Oklahoma);
        Oklahoma.setBounds(350, 380, 60, 16);

        Minnesota.setText("     ");
        getContentPane().add(Minnesota);
        Minnesota.setBounds(390, 200, 40, 16);

        Iowa.setText("                         ");
        getContentPane().add(Iowa);
        Iowa.setBounds(400, 260, 60, 16);

        Missouri.setText("     ");
        getContentPane().add(Missouri);
        Missouri.setBounds(420, 330, 50, 16);

        Arkansas.setText("           ");
        getContentPane().add(Arkansas);
        Arkansas.setBounds(420, 390, 50, 16);

        Louisiana.setText("     ");
        getContentPane().add(Louisiana);
        Louisiana.setBounds(430, 460, 60, 16);

        Wisconsin.setText("            ");
        getContentPane().add(Wisconsin);
        Wisconsin.setBounds(458, 220, 40, 16);

        Illinois.setText("               ");
        getContentPane().add(Illinois);
        Illinois.setBounds(470, 290, 40, 16);

        Michigan.setText("       ");
        getContentPane().add(Michigan);
        Michigan.setBounds(520, 200, 28, 16);

        Indiana.setText("       ");
        getContentPane().add(Indiana);
        Indiana.setBounds(510, 290, 28, 16);

        Kentucky.setText("       ");
        getContentPane().add(Kentucky);
        Kentucky.setBounds(500, 326, 70, 20);

        Tennessee.setText("           ");
        getContentPane().add(Tennessee);
        Tennessee.setBounds(490, 360, 44, 16);

        Mississippi.setText("       ");
        getContentPane().add(Mississippi);
        Mississippi.setBounds(465, 430, 40, 16);

        Alabama.setText("         ");
        getContentPane().add(Alabama);
        Alabama.setBounds(516, 420, 40, 16);

        Georgia.setText("         ");
        getContentPane().add(Georgia);
        Georgia.setBounds(565, 420, 50, 16);

        SouthCarolina.setText("         ");
        getContentPane().add(SouthCarolina);
        SouthCarolina.setBounds(610, 390, 36, 16);

        Florida.setText("         ");
        getContentPane().add(Florida);
        Florida.setBounds(620, 500, 36, 16);

        PR.setText("PR");
        getContentPane().add(PR);
        PR.setBounds(500, 540, 20, 20);
        PR.getAccessibleContext().setAccessibleName("label1");

        NorthCarolina.setText("          ");
        getContentPane().add(NorthCarolina);
        NorthCarolina.setBounds(630, 350, 40, 16);

        Ohio.setText("          ");
        getContentPane().add(Ohio);
        Ohio.setBounds(550, 280, 40, 16);

        Hawaii.setText("                  ");
        getContentPane().add(Hawaii);
        Hawaii.setBounds(230, 550, 80, 16);

        PuertoRico.setText("                        ");
        getContentPane().add(PuertoRico);
        PuertoRico.setBounds(470, 560, 90, 16);

        Virginia.setText("          ");
        getContentPane().add(Virginia);
        Virginia.setBounds(620, 310, 60, 16);

        WestVirginia.setText("       ");
        getContentPane().add(WestVirginia);
        WestVirginia.setBounds(590, 300, 28, 16);

        Pennsylvania.setText("            ");
        getContentPane().add(Pennsylvania);
        Pennsylvania.setBounds(610, 250, 60, 16);

        NewYork.setText("        ");
        getContentPane().add(NewYork);
        NewYork.setBounds(620, 210, 60, 16);

        Vermont.setText("               ");
        getContentPane().add(Vermont);
        Vermont.setBounds(600, 150, 60, 16);

        NewHampshire.setText("           ");
        getContentPane().add(NewHampshire);
        NewHampshire.setBounds(670, 110, 44, 16);

        Maryland.setText("              ");
        getContentPane().add(Maryland);
        Maryland.setBounds(720, 290, 56, 16);

        Delaware.setText("                 ");
        getContentPane().add(Delaware);
        Delaware.setBounds(720, 270, 68, 16);

        NewJersey.setText("               ");
        getContentPane().add(NewJersey);
        NewJersey.setBounds(720, 250, 60, 16);

        Connecticut.setText("          ");
        getContentPane().add(Connecticut);
        Connecticut.setBounds(740, 230, 60, 20);

        RhodeIsland.setText("         ");
        getContentPane().add(RhodeIsland);
        RhodeIsland.setBounds(750, 220, 60, 16);

        Maine.setText("           ");
        getContentPane().add(Maine);
        Maine.setBounds(710, 120, 40, 16);

        Massachusetts.setText("             ");
        getContentPane().add(Massachusetts);
        Massachusetts.setBounds(760, 180, 50, 20);

        DC.setText("Wash. DC");
        getContentPane().add(DC);
        DC.setBounds(700, 420, 60, 20);

        DistrictOfColumbia.setText("                    ");
        getContentPane().add(DistrictOfColumbia);
        DistrictOfColumbia.setBounds(690, 436, 90, 20);

        Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/USmap.jpg"))); // NOI18N
        getContentPane().add(Map);
        Map.setBounds(0, 80, 768, 512);

        mergeSort.setText("Merge Sort");
        mergeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mergeSortActionPerformed(evt);
            }
        });
        getContentPane().add(mergeSort);
        mergeSort.setBounds(890, 550, 100, 29);

        bubbleSort.setText("Bubble Sort");
        bubbleSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubbleSortActionPerformed(evt);
            }
        });
        getContentPane().add(bubbleSort);
        bubbleSort.setBounds(1000, 550, 100, 29);

        quickSort.setText("Quick Sort");
        quickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickSortActionPerformed(evt);
            }
        });
        getContentPane().add(quickSort);
        quickSort.setBounds(1110, 550, 100, 29);

        quickSortImproved.setText("Quick Sort (v2.0)");
        quickSortImproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickSortImprovedActionPerformed(evt);
            }
        });
        getContentPane().add(quickSortImproved);
        quickSortImproved.setBounds(1219, 550, 140, 29);

        dataTable.setColumns(20);
        dataTable.setRows(5);
        jScrollPane2.setViewportView(dataTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(890, 30, 460, 510);

        runtime.setForeground(new java.awt.Color(100, 0, 0));
        runtime.setText("Runtime: ");
        getContentPane().add(runtime);
        runtime.setBounds(940, 10, 360, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2010ActionPerformed
        // TODO add your handling code here:
        button2010.setBackground(new java.awt.Color(0, 250, 0));
        count++;
        if (count == 1) {
            year1 = 2010;
        }
        if (count == 2) {
            year2 = 2010;
        }
    }//GEN-LAST:event_button2010ActionPerformed

    private void button2011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2011ActionPerformed
        // TODO add your handling code here:
        button2011.setBackground(new java.awt.Color(0, 250, 0));
        count++;
        if (count == 1) {
            year1 = 2011;
        }
        if (count == 2) {
            year2 = 2011;
        }
    }//GEN-LAST:event_button2011ActionPerformed

    private void button2012ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2012ActionPerformed
        // TODO add your handling code here:
        button2012.setBackground(new java.awt.Color(0, 250, 0));
        count++;
        if (count == 1) {
            year1 = 2012;
        }
        if (count == 2) {
            year2 = 2012;
        }
    }//GEN-LAST:event_button2012ActionPerformed

    private void button2013ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2013ActionPerformed
        // TODO add your handling code here:
        button2013.setBackground(new java.awt.Color(0, 250, 0));
        count++;
        if (count == 1) {
            year1 = 2013;
        }
        if (count == 2) {
            year2 = 2013;
        }
    }//GEN-LAST:event_button2013ActionPerformed

    private void button2014ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2014ActionPerformed
        // TODO add your handling code here:
        button2014.setBackground(new java.awt.Color(0, 250, 0));
        count++;
        if (count == 1) {
            year1 = 2014;
        }
        if (count == 2) {
            year2 = 2014;
        }
    }//GEN-LAST:event_button2014ActionPerformed

    private void button2015ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2015ActionPerformed
        // TODO add your handling code here:
        button2015.setBackground(new java.awt.Color(0, 250, 0));
        count++;
        if (count == 1) {
            year1 = 2015;
        }
        if (count == 2) {
            year2 = 2015;
        }
    }//GEN-LAST:event_button2015ActionPerformed

    private void button2016ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2016ActionPerformed
        // TODO add your handling code here:
        button2016.setBackground(new java.awt.Color(0, 250, 0));
        count++;
        if (count == 1) {
            year1 = 2016;
        }
        if (count == 2) {
            year2 = 2016;
        }
    }//GEN-LAST:event_button2016ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        if (count == 2) { 
            button2010.setBackground(new java.awt.Color(238, 238, 238));
            button2011.setBackground(new java.awt.Color(238, 238, 238));
            button2012.setBackground(new java.awt.Color(238, 238, 238));
            button2013.setBackground(new java.awt.Color(238, 238, 238));
            button2014.setBackground(new java.awt.Color(238, 238, 238));
            button2015.setBackground(new java.awt.Color(238, 238, 238));
            button2016.setBackground(new java.awt.Color(238, 238, 238));
            count = 0;
            
            /*dataTable.setText(null);
            for (int i = 0; i < Main.percents.length; i++) {
                state = Main.CensusData.get(i).getGeoArea();
                dataTable.append(state + ":               " + Main.percents[i] + "\n");   
            }
            dataTable.setVisible(true);*/

            
            String[] args = new String[] {"1,2,3"};
            try {
                Main.main(args);
                for (int i = 0; i < Main.CensusData.size(); i++) {
                    if (Main.CensusData.get(i).getGeoArea().equals("Alaska")) { 
                        Alaska.setText(Float.toString(Main.percents[i]));
                        if (Main.percents[i] >= 0) {
                            Alaska.setForeground(new java.awt.Color(0, 240, 0));
                        }
                        else {
                            Alaska.setForeground(new java.awt.Color(255, 0, 0));
                        }
                    }
                    if (Main.CensusData.get(i).getGeoArea().equals("Arizona")) { 
                        Arizona.setText(Float.toString(Main.percents[i]));
                        if (Main.percents[i] >= 0) {
                            Arizona.setForeground(new java.awt.Color(0, 240, 0));
                        }
                        else {
                            Arizona.setForeground(new java.awt.Color(255, 0, 0));
                        }
                    }
                    if (Main.CensusData.get(i).getGeoArea().equals("California")) { 
                        California.setText(Float.toString(Main.percents[i]));
                        if (Main.percents[i] >= 0) {
                            California.setForeground(new java.awt.Color(0, 240, 0));
                        }
                        else {
                            California.setForeground(new java.awt.Color(255, 0, 0));
                        }
                    }
                    if (Main.CensusData.get(i).getGeoArea().equals("Idaho")) { 
                        Idaho.setText(Float.toString(Main.percents[i]));
                        if (Main.percents[i] >= 0) {
                            Idaho.setForeground(new java.awt.Color(0, 240, 0));
                        }
                        else {
                            Idaho.setForeground(new java.awt.Color(255, 0, 0));
                        }
                    }
                    if (Main.CensusData.get(i).getGeoArea().equals("Nevada")) { 
                        Nevada.setText(Float.toString(Main.percents[i]));
                        if (Main.percents[i] >= 0) {
                            Nevada.setForeground(new java.awt.Color(0, 240, 0));
                        }
                        else {
                            Nevada.setForeground(new java.awt.Color(255, 0, 0));
                        }
                    }
                    if (Main.CensusData.get(i).getGeoArea().equals("Oregon")) { 
                        Oregon.setText(Float.toString(Main.percents[i]));
                        if (Main.percents[i] >= 0) {
                            Oregon.setForeground(new java.awt.Color(0, 240, 0));
                        }
                        else {
                            Oregon.setForeground(new java.awt.Color(255, 0, 0));
                        }
                    }
                    if (Main.CensusData.get(i).getGeoArea().equals("Utah")) { 
                        Utah.setText(Float.toString(Main.percents[i]));
                        if (Main.percents[i] >= 0) {
                            Utah.setForeground(new java.awt.Color(0, 240, 0));
                        }
                        else {
                            Utah.setForeground(new java.awt.Color(255, 0, 0));
                        }
                    }
                    

    if (Main.CensusData.get(i).getGeoArea().equals("Alaska")) { 

        Alaska.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

            Alaska.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

            Alaska.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Georgia")) { 

        Georgia.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Georgia.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Georgia.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Florida")) { 

		Florida.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Florida.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Florida.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Alabama")) { 

		Alabama.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Alabama.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Alabama.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("SouthCarolina")) { 

		SouthCarolina.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	SouthCarolina.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	SouthCarolina.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("NorthCarolina")) { 

		NorthCarolina.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	NorthCarolina.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	NorthCarolina.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Tennessee")) { 

		Tennessee.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Tennessee.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Tennessee.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Kentucky")) { 

		Kentucky.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Kentucky.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {
        	Kentucky.setForeground(new java.awt.Color(255, 0, 0));
        }

    }
	if (Main.CensusData.get(i).getGeoArea().equals("Virginia")) { 

		Virginia.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Virginia.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {
        	Virginia.setForeground(new java.awt.Color(255, 0, 0));
        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("WestVirginia")) { 

		WestVirginia.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	WestVirginia.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	WestVirginia.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("WestVirginia")) { 

		WestVirginia.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	WestVirginia.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	WestVirginia.setForeground(new java.awt.Color(255, 0, 0));

        }

    }
	if (Main.CensusData.get(i).getGeoArea().equals("DistrictofColumbia")) { 

		DistrictOfColumbia.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	DistrictOfColumbia.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	DistrictOfColumbia.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Mississippi")) { 

		Mississippi.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Mississippi.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Mississippi.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Indiana")) { 

		Indiana.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Indiana.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {
        	Indiana.setForeground(new java.awt.Color(255, 0, 0));
        }

    }

	if (Main.CensusData.get(i).getGeoArea().equals("Michigan")) { 

		Michigan.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Michigan.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Michigan.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Ohio")) { 

		Ohio.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Ohio.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Ohio.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Maryland")) { 

		Maryland.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Maryland.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Maryland.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Delaware")) { 

		Delaware.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Delaware.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Delaware.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("NewJersey")) { 

		NewJersey.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	NewJersey.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	NewJersey.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Connecticut")) { 

		Connecticut.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Connecticut.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Connecticut.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("RhodeIsland")) { 

		RhodeIsland.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	RhodeIsland.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	RhodeIsland.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("NewYork")) { 

		NewYork.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	NewYork.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	NewYork.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Massachusetts")) { 

		Massachusetts.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Massachusetts.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Massachusetts.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Vermont")) { 

		Vermont.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Vermont.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Vermont.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("NewHampshire")) { 

		NewHampshire.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	NewHampshire.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	NewHampshire.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Maine")) { 

		Maine.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Maine.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Maine.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("PuertoRico")) { 

		PuertoRico.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	PuertoRico.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	PuertoRico.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Pennsylvania")) { 

		Pennsylvania.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Pennsylvania.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Pennsylvania.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Louisiana")) { 

		Louisiana.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Louisiana.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Louisiana.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Arkansas")) { 

		Arkansas.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Arkansas.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Arkansas.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Missouri")) { 

		Missouri.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Missouri.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Missouri.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Illinois")) { 

		Illinois.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Illinois.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Illinois.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Wisconsin")) { 

		Wisconsin.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Wisconsin.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Wisconsin.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Iowa")) { 

		Iowa.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Iowa.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Iowa.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Minnesota")) { 

		Minnesota.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Minnesota.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Minnesota.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Texas")) { 

		Texas.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Texas.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Texas.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Oklahoma")) { 

		Oklahoma.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Oklahoma.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Oklahoma.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Kansas")) { 

		Kansas.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Kansas.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Kansas.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Nebraska")) { 

		Nebraska.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Nebraska.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Nebraska.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("SouthDakota")) { 

		SouthDakota.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	SouthDakota.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	SouthDakota.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("NorthDakota")) { 

		NorthDakota.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	NorthDakota.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	NorthDakota.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("NewMexico")) { 

		NewMexico.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	NewMexico.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	NewMexico.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Colorado")) { 

		Colorado.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Colorado.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Colorado.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Wyoming")) { 

		Wyoming.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Wyoming.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Wyoming.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Montana")) { 

		Montana.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Montana.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Montana.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Washington")) { 

		Washington.setText(Float.toString(Main.percents[i]));

        if (Main.percents[i] >= 0) {

        	Washington.setForeground(new java.awt.Color(0, 240, 0));

        }

        else {

        	Washington.setForeground(new java.awt.Color(255, 0, 0));

        }

    }

	

	if (Main.CensusData.get(i).getGeoArea().equals("Hawaii")) { 

            Hawaii.setText(Float.toString(Main.percents[i]));

            if (Main.percents[i] >= 0) {
                    Hawaii.setForeground(new java.awt.Color(0, 240, 0));
            }
            else {
                    Hawaii.setForeground(new java.awt.Color(255, 0, 0));
            }
        }  
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (count > 3) {
            System.out.println("Sorry, please only select 2 years"); 
            button2010.setBackground(new java.awt.Color(238, 238, 238));
            button2011.setBackground(new java.awt.Color(238, 238, 238));
            button2012.setBackground(new java.awt.Color(238, 238, 238));
            button2013.setBackground(new java.awt.Color(238, 238, 238));
            button2014.setBackground(new java.awt.Color(238, 238, 238));
            button2015.setBackground(new java.awt.Color(238, 238, 238));
            button2016.setBackground(new java.awt.Color(238, 238, 238));
            count = 0;
        }
    }//GEN-LAST:event_submitActionPerformed

    
    private void mergeSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mergeSortActionPerformed
        
        mergeSort.setBackground(new java.awt.Color(238, 238, 238));
        bubbleSort.setBackground(new java.awt.Color(238, 238, 238));
        quickSort.setBackground(new java.awt.Color(238, 238, 238));
        quickSortImproved.setBackground(new java.awt.Color(238, 238, 238));
        
        mergeSort.setBackground(new java.awt.Color(0, 238, 0));
        
        //dataTable.setForeground(Color.black);
        dataTable.setText(null);
        
        float[] temp = new float[Main.CensusData.size()];
        try {
            temp = Main.runAlgo(year1, year2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        long s = System.nanoTime();
        e = (System.nanoTime() - s);
 
        float[] finalData = sortingAlgos.mergeSort(temp, 0, temp.length-1);
        state = "";
        
       /* for (int i = 0; i < Main.percents.length; i++) {
            for (int j = 0; j < Main.CensusData.size(); j++) {
                if (temp[i] == Main.changeAndGeo.get(j).getPercent()) {
                    state = Main.changeAndGeo.get(j).getGeoArea();

                }
            }
            dataTable.append(state + ":               " + temp[i] + "\n");
        }
        
        dataTable.setVisible(true);
        done = true;*/
        state = "";
        for (int i = 0; i < Main.percents.length; i++) {
            for (int j = 0; j < Main.CensusData.size(); j++) {
                if (temp[temp.length-1-i] == Main.changeAndGeo.get(j).getPercent()) {
                    state = Main.changeAndGeo.get(j).getGeoArea();
                } 
            }
            dataTable.append(state + ":                                             " + temp[temp.length-1-i] + "\n");
            dataTable.setVisible(true);
            done = true;
        }
        
        runtime.setText(null);
        runtime.setText("Runtime: " + Float.toString(e/1000000));
        revalidate();
        validate();
        repaint();
        
    }//GEN-LAST:event_mergeSortActionPerformed

    private void bubbleSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubbleSortActionPerformed
        // TODO add your handling code here:
       // mergeSort.setBackground(new java.awt.Color(238, 238, 238));
        //bubbleSort.setBackground(new java.awt.Color(238, 238, 238));
        //quickSort.setBackground(new java.awt.Color(238, 238, 238));
       // quickSortImproved.setBackground(new java.awt.Color(238, 238, 238));
        
       // bubbleSort.setBackground(new java.awt.Color(0, 238, 0));
        mergeSort.setBackground(new java.awt.Color(238, 238, 238));
        bubbleSort.setBackground(new java.awt.Color(238, 238, 238));
        quickSort.setBackground(new java.awt.Color(238, 238, 238));
        quickSortImproved.setBackground(new java.awt.Color(238, 238, 238));
        
        bubbleSort.setBackground(new java.awt.Color(0, 238, 0));
       
        
        
        
        float[] temp = new float[Main.CensusData.size()];
        try {
            temp = Main.runAlgo(year1, year2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       // dataTable.setForeground(Color.black);
        long s = System.nanoTime();
        
        e = (System.nanoTime() - s);
        
        float[] temp2 = Main.percents;
        temp = sortingAlgos.bubbleSort(temp2);
        state = "";
        
        dataTable.setText(null);
        /*for (int i = 0; i < Main.percents.length; i++) {
            for (int j = 0; j < Main.CensusData.size(); j++) {
                if (temp[i] == Main.changeAndGeo.get(j).getPercent()) {
                    state = Main.changeAndGeo.get(j).getGeoArea();   
                }
            }
            dataTable.append(state + ":               " + temp[i] + "\n");
        }
            dataTable.setVisible(true);
            done = true;
        //}*/
        state = "";
        for (int i = 0; i < Main.percents.length; i++) {
            for (int j = 0; j < Main.CensusData.size(); j++) {
                if (temp[temp.length-1-i] == Main.changeAndGeo.get(j).getPercent()) {
                    state = Main.changeAndGeo.get(j).getGeoArea();
                } 
            }
            dataTable.append(state + ":                                             " + temp[temp.length-1-i] + "\n");
            dataTable.setVisible(true);
            done = true;
        }
        
        runtime.setText(null);
        runtime.setText("Runtime: " + Float.toString(e/1000000));
    }//GEN-LAST:event_bubbleSortActionPerformed

    private void quickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickSortActionPerformed
        // TODO add your handling code here:
        //mergeSort.setBackground(new java.awt.Color(238, 238, 238));
       // bubbleSort.setBackground(new java.awt.Color(238, 238, 238));
        //quickSort.setBackground(new java.awt.Color(238, 238, 238));
        //quickSortImproved.setBackground(new java.awt.Color(238, 238, 238));
       // quickSort.setBackground(new java.awt.Color(0, 238, 0));
        mergeSort.setBackground(new java.awt.Color(238, 238, 238));
        bubbleSort.setBackground(new java.awt.Color(238, 238, 238));
        quickSort.setBackground(new java.awt.Color(238, 238, 238));
        quickSortImproved.setBackground(new java.awt.Color(238, 238, 238));
        
        quickSort.setBackground(new java.awt.Color(0, 238, 0));
        
        dataTable.setText(null);
        float[] temp = new float[Main.CensusData.size()];
        float[] temp2 = Main.percents;
        try {
            temp = Main.runAlgo(year1, year2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dataTable.setForeground(Color.black);
        long s = System.nanoTime();
        temp = sortingAlgos.quickSort(temp2, 0,temp2.length-1);
        e = (System.nanoTime() - s);
        
        //if (done == false) {
            /*state = "";
            
            for (int i = 0; i < Main.percents.length; i++) {
                for (int j = 0; j < Main.CensusData.size(); j++) {
                    if (temp[i] == Main.changeAndGeo.get(j).getPercent()) {
                        state = Main.changeAndGeo.get(j).getGeoArea();
                        
                    }
                }  
                dataTable.append(state + ":               " + temp[i] + "\n"); 
            }
            dataTable.setVisible(true);
            done = true;*/
            state = "";
        for (int i = 0; i < Main.percents.length; i++) {
            for (int j = 0; j < Main.CensusData.size(); j++) {
                if (temp[temp.length-1-i] == Main.changeAndGeo.get(j).getPercent()) {
                    state = Main.changeAndGeo.get(j).getGeoArea();
                } 
            }
            dataTable.append(state + ":                                             " + temp[temp.length-1-i] + "\n");
            dataTable.setVisible(true);
            done = true;
        }
        //}
        
        runtime.setText(null);
        runtime.setText("Runtime: " + Float.toString(e/1000000));
    }//GEN-LAST:event_quickSortActionPerformed

    private void quickSortImprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickSortImprovedActionPerformed
        // TODO add your handling code here:
       // mergeSort.setBackground(new java.awt.Color(238, 238, 238));
        //bubbleSort.setBackground(new java.awt.Color(238, 238, 238));
        //quickSort.setBackground(new java.awt.Color(238, 238, 238));
        //quickSortImproved.setBackground(new java.awt.Color(238, 238, 238));
        //quickSortImproved.setBackground(new java.awt.Color(0, 238, 0));
        mergeSort.setBackground(new java.awt.Color(238, 238, 238));
        bubbleSort.setBackground(new java.awt.Color(238, 238, 238));
        quickSort.setBackground(new java.awt.Color(238, 238, 238));
        quickSortImproved.setBackground(new java.awt.Color(238, 238, 238));
        
        quickSortImproved.setBackground(new java.awt.Color(0, 238, 0));
        
        dataTable.setText(null);
        float[] temp = new float[Main.CensusData.size()];
        try {
            temp = Main.runAlgo(year1, year2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dataTable.setForeground(Color.black);
        long s = System.nanoTime();
        float[] temp2 = Main.percents;
        temp = sortingAlgos.quickSortImproved(temp2, 0, temp2.length-1);
        e = (System.nanoTime() - s);
        
        state = "";
        for (int i = 0; i < Main.percents.length; i++) {
            for (int j = 0; j < Main.CensusData.size(); j++) {
                if (temp[temp.length-1-i] == Main.changeAndGeo.get(j).getPercent()) {
                    state = Main.changeAndGeo.get(j).getGeoArea();
                } 
            }
            dataTable.append(state + ":                                             " + temp[temp.length-1-i] + "\n");
            dataTable.setVisible(true);
            done = true;
        }
        runtime.setText(null);
        runtime.setText("Runtime: " + Float.toString(e/1000000));
    }//GEN-LAST:event_quickSortImprovedActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
      
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alabama;
    private javax.swing.JLabel Alaska;
    private javax.swing.JLabel Arizona;
    private javax.swing.JLabel Arkansas;
    private javax.swing.JLabel California;
    private javax.swing.JLabel Colorado;
    private javax.swing.JLabel Connecticut;
    private java.awt.Label DC;
    private javax.swing.JLabel Delaware;
    private javax.swing.JLabel DistrictOfColumbia;
    private javax.swing.JLabel Florida;
    private javax.swing.JLabel Georgia;
    private javax.swing.JLabel Hawaii;
    private javax.swing.JLabel Idaho;
    private javax.swing.JLabel Illinois;
    private javax.swing.JLabel Indiana;
    private javax.swing.JLabel Iowa;
    private javax.swing.JLabel Kansas;
    private javax.swing.JLabel Kentucky;
    private javax.swing.JLabel Louisiana;
    private javax.swing.JLabel Maine;
    private javax.swing.JLabel Map;
    private javax.swing.JLabel Maryland;
    private javax.swing.JLabel Massachusetts;
    private javax.swing.JLabel Michigan;
    private javax.swing.JLabel Minnesota;
    private javax.swing.JLabel Mississippi;
    private javax.swing.JLabel Missouri;
    private javax.swing.JLabel Montana;
    private javax.swing.JLabel Nebraska;
    private javax.swing.JLabel Nevada;
    private javax.swing.JLabel NewHampshire;
    private javax.swing.JLabel NewJersey;
    private javax.swing.JLabel NewMexico;
    private javax.swing.JLabel NewYork;
    private javax.swing.JLabel NorthCarolina;
    private javax.swing.JLabel NorthDakota;
    private javax.swing.JLabel Ohio;
    private javax.swing.JLabel Oklahoma;
    private javax.swing.JLabel Oregon;
    private java.awt.Label PR;
    private javax.swing.JLabel Pennsylvania;
    private javax.swing.JLabel PuertoRico;
    private javax.swing.JLabel RhodeIsland;
    private javax.swing.JLabel SouthCarolina;
    private javax.swing.JLabel SouthDakota;
    private javax.swing.JLabel Tennessee;
    private javax.swing.JLabel Texas;
    private javax.swing.JLabel Utah;
    private javax.swing.JLabel Vermont;
    private javax.swing.JLabel Virginia;
    private javax.swing.JLabel Washington;
    private javax.swing.JLabel WestVirginia;
    private javax.swing.JLabel Wisconsin;
    private javax.swing.JLabel Wyoming;
    private javax.swing.JToggleButton bubbleSort;
    private javax.swing.JToggleButton button2010;
    private javax.swing.JToggleButton button2011;
    private javax.swing.JToggleButton button2012;
    private javax.swing.JToggleButton button2013;
    private javax.swing.JToggleButton button2014;
    private javax.swing.JToggleButton button2015;
    private javax.swing.JToggleButton button2016;
    private javax.swing.JTextArea dataTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton mergeSort;
    private javax.swing.JToggleButton quickSort;
    private javax.swing.JToggleButton quickSortImproved;
    private javax.swing.JLabel runtime;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
