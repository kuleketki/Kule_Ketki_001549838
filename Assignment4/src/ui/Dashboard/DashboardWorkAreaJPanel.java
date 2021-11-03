/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Dashboard;

import java.awt.BorderLayout;
import ui.Patient.*;
import ui.Admin.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.Encounter;
import model.Patient;
import model.Person;
import model.System;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class DashboardWorkAreaJPanel extends javax.swing.JPanel {

    JPanel displayPanel;
    System system;
    DefaultCategoryDataset defaultGraphDataset;

    /**
     * Creates new form ManagePersonJPanel
     */
    public DashboardWorkAreaJPanel(JPanel displayPanel, System system) {
        initComponents();
        this.displayPanel = displayPanel;
        this.system = system;
        loadData();

    }

    public void loadData() {
        for (City c : system.getCityDirectory().getCityList()) {
            cbCityList.addItem(c.getCityName());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        cbCityList = new javax.swing.JComboBox<>();
        lblPersonList = new javax.swing.JLabel();
        lblPersonList1 = new javax.swing.JLabel();
        cbCommunityList = new javax.swing.JComboBox<>();
        pieChartJPanel = new javax.swing.JPanel();
        lblAbnormalCases = new javax.swing.JLabel();
        txtAbnormalCases = new javax.swing.JLabel();
        graphChartJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(134, 118, 102));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(134, 118, 102), 2, true));

        lblTitle1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Dashboard");

        btnBack.setBackground(new java.awt.Color(234, 226, 214));
        btnBack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(134, 118, 102));
        btnBack.setText("<< Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setContentAreaFilled(false);
        btnBack.setOpaque(true);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cbCityList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCityListActionPerformed(evt);
            }
        });

        lblPersonList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPersonList.setForeground(new java.awt.Color(255, 255, 255));
        lblPersonList.setText("Select City :");

        lblPersonList1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPersonList1.setForeground(new java.awt.Color(255, 255, 255));
        lblPersonList1.setText("Select Community :");

        cbCommunityList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCommunityListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pieChartJPanelLayout = new javax.swing.GroupLayout(pieChartJPanel);
        pieChartJPanel.setLayout(pieChartJPanelLayout);
        pieChartJPanelLayout.setHorizontalGroup(
            pieChartJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        pieChartJPanelLayout.setVerticalGroup(
            pieChartJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        lblAbnormalCases.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAbnormalCases.setForeground(new java.awt.Color(255, 255, 255));
        lblAbnormalCases.setText("Total Abnormal Cases :");

        txtAbnormalCases.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAbnormalCases.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout graphChartJPanelLayout = new javax.swing.GroupLayout(graphChartJPanel);
        graphChartJPanel.setLayout(graphChartJPanelLayout);
        graphChartJPanelLayout.setHorizontalGroup(
            graphChartJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );
        graphChartJPanelLayout.setVerticalGroup(
            graphChartJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258)
                .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addGap(473, 473, 473))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(532, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPersonList, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(cbCityList, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPersonList1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAbnormalCases, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbCommunityList, 0, 231, Short.MAX_VALUE)
                            .addComponent(txtAbnormalCases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(426, 426, 426))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(pieChartJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(graphChartJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonList, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCityList, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonList1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCommunityList, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAbnormalCases, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAbnormalCases, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pieChartJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(graphChartJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbCityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCityListActionPerformed
        // TODO add your handling code here:
        cbCommunityList.removeAllItems();

        java.lang.System.out.println("City selected" + cbCityList.getSelectedIndex());
        for (Community community : system.getCityDirectory().getCityList().get(cbCityList.getSelectedIndex()).getCommunityList()) {
            cbCommunityList.addItem(community.getCommunityName());
        }

        loadCharts();


    }//GEN-LAST:event_cbCityListActionPerformed

    private void cbCommunityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCommunityListActionPerformed
        // TODO add your handling code here:
        loadCharts();
    }//GEN-LAST:event_cbCommunityListActionPerformed

    private void backAction() {
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.last(displayPanel);
    }

    public void loadCharts() {
        pieChartJPanel.removeAll();
        pieChartJPanel.revalidate();
        // This will create the dataset
        PieDataset dataset = createDataset();
        // based on the dataset we create the chart
        JFreeChart chart = createChart(dataset, "Abnormal BP based on age group");
        // we put the chart into a panel
        ChartPanel chartPanel = new ChartPanel(chart);
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(600, 450));
        // add it to our application
        pieChartJPanel.setLayout(new BorderLayout());
        pieChartJPanel.add(chartPanel, BorderLayout.NORTH);

        loadGraphChart();
    }

    private PieDataset createDataset() {
        //add patients of selected community
        ArrayList<Patient> patientsList = new ArrayList<>();

        for (Patient p : system.getPatientDirectory().getPatientsList()) {
            if (p.getPerson().getHouse().getCityId() == cbCityList.getSelectedIndex() && p.getPerson().getHouse().getCommunityId() == cbCommunityList.getSelectedIndex()) {
                patientsList.add(p);
            }
        }

        ArrayList<Patient> ageGroup1 = new ArrayList<>(); //1-20
        ArrayList<Patient> ageGroup2 = new ArrayList<>(); //21-30
        ArrayList<Patient> ageGroup3 = new ArrayList<>(); //31-40
        ArrayList<Patient> ageGroup4 = new ArrayList<>(); //41-50
        ArrayList<Patient> ageGroup5 = new ArrayList<>(); //51-60
        ArrayList<Patient> ageGroup6 = new ArrayList<>(); //61-70
        ArrayList<Patient> ageGroup7 = new ArrayList<>(); //71-90
        ArrayList<Patient> ageGroup8 = new ArrayList<>(); //91 and above
        ArrayList<Patient> abnormalTemp = new ArrayList<>();
        ArrayList<Patient> abnormalPulseRate = new ArrayList<>();
        ArrayList<Patient> abnormalRespirationRate = new ArrayList<>();
        ArrayList<Patient> abnormalWeightHeight = new ArrayList<>();

        for (Patient p : patientsList) {
            boolean isAbornmal = false;
            //get Latest encounter
            if (p.getEncounterHistory().getEncounters().size() > 0) {
                Encounter encounter = p.getEncounterHistory().getEncounters().get(p.getEncounterHistory().getEncounters().size() - 1);
                //BP
                if (encounter.getVitalSigns().getSystolicPressure() > 120 || encounter.getVitalSigns().getDiastolicPressure() > 80) {
                    int ageGroup = 0;
                    if (p.getPerson().getAge() < 21) {
                        ageGroup1.add(p);
                    } else if (p.getPerson().getAge() < 31) {
                        ageGroup2.add(p);
                    } else if (p.getPerson().getAge() < 41) {
                        ageGroup3.add(p);
                    } else if (p.getPerson().getAge() < 51) {
                        ageGroup4.add(p);
                    } else if (p.getPerson().getAge() < 61) {
                        ageGroup5.add(p);
                    } else if (p.getPerson().getAge() < 71) {
                        ageGroup6.add(p);
                    } else if (p.getPerson().getAge() < 81) {
                        ageGroup7.add(p);
                    } else {
                        ageGroup8.add(p);
                    }
                }

                //Temp
                if (encounter.getVitalSigns().getBodyTemp() > 100) {
                    abnormalTemp.add(p);
                }

                //PulseRate
                if (encounter.getVitalSigns().getPulseRate() < 40 || encounter.getVitalSigns().getPulseRate() > 100) {
                    abnormalPulseRate.add(p);
                }

                //respiration Rate
                if (encounter.getVitalSigns().getRespirationRate() < 12 || encounter.getVitalSigns().getRespirationRate() > 16) {
                    abnormalRespirationRate.add(p);
                }

                //BMI
                double bmi = encounter.getVitalSigns().getWeight() / Math.pow(2, (encounter.getVitalSigns().getHeight() / 100));
                if (bmi >= 25.0) {
                    abnormalWeightHeight.add(p);
                }
            }
        }
        int totalAbnormalCases = ageGroup1.size() + ageGroup2.size() + ageGroup3.size() + ageGroup4.size() + ageGroup5.size() + ageGroup6.size() + ageGroup7.size() + ageGroup8.size();
        txtAbnormalCases.setText(totalAbnormalCases + "");

        //Graph
        defaultGraphDataset = new DefaultCategoryDataset();
        defaultGraphDataset.setValue(abnormalTemp.size(), "Patients", "Temperature");
        defaultGraphDataset.setValue(abnormalPulseRate.size(), "Patients", "Pulse Rate");
        defaultGraphDataset.setValue(abnormalRespirationRate.size(), "Patients", "Respiration Rate");
        defaultGraphDataset.setValue(abnormalWeightHeight.size(), "Patients", "Height/Weight");

        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Age 20 and below", ageGroup1.size());
        result.setValue("Age 21-30", ageGroup2.size());
        result.setValue("Age 31-40", ageGroup3.size());
        result.setValue("Age 41-50", ageGroup4.size());
        result.setValue("Age 51-60", ageGroup5.size());
        result.setValue("Age 61-70", ageGroup6.size());
        result.setValue("Age 71-90", ageGroup7.size());
        result.setValue("Age 91 and above", ageGroup8.size());
        return result;

    }

    /**
     * Creates a chart
     */
    private JFreeChart createChart(PieDataset dataset, String title) {

        JFreeChart chart = ChartFactory.createPieChart3D(
                title, // chart title
                dataset, // data
                true, // include legend
                true,
                false
        );

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;

    }

    private JFreeChart createGraphChart(CategoryDataset dataset) {

        JFreeChart barChart = ChartFactory.createBarChart(
                "Patients With Abnormal Vital Signs Other Than BP",
                "Vital Signs",
                "Patients",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        return barChart;
    }

    private void loadGraphChart() {
        graphChartJPanel.removeAll();
        graphChartJPanel.revalidate();
        JFreeChart chart = createGraphChart(defaultGraphDataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);

        Color color = new Color(168, 168, 72);
        /* Get instance of CategoryPlot */
        CategoryPlot plot = chart.getCategoryPlot();

        /* Change Bar colors */
        BarRenderer renderer = (BarRenderer) plot.getRenderer();

        renderer.setSeriesPaint(0, color);

        renderer.setDrawBarOutline(false);
        renderer.setItemMargin(0);

        // add it to our application
        graphChartJPanel.setLayout(new BorderLayout());
        graphChartJPanel.add(chartPanel, BorderLayout.NORTH);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cbCityList;
    private javax.swing.JComboBox<String> cbCommunityList;
    private javax.swing.JPanel graphChartJPanel;
    private javax.swing.JLabel lblAbnormalCases;
    private javax.swing.JLabel lblPersonList;
    private javax.swing.JLabel lblPersonList1;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JPanel pieChartJPanel;
    private javax.swing.JLabel txtAbnormalCases;
    // End of variables declaration//GEN-END:variables
}