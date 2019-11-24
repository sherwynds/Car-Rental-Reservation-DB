/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alansmacbook
 */

package ui;

import database.DataBaseHandler;
import exceptions.InputException;

public class Reservation extends javax.swing.JFrame {

    DataBaseHandler database;

    /**
     * Creates new form Reservation
     */
    public Reservation(DataBaseHandler db, String name,String license,String type,String location,
                       String pdate,String ptime,String rdate,String rtime) throws InputException {
        initComponents();
        database = db;
        setValues(name,license,type,location, pdate,ptime,rdate,rtime);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ConfirmResButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ResName = new javax.swing.JLabel();
        ResDLicense = new javax.swing.JLabel();
        ResLocation = new javax.swing.JLabel();
        ResType = new javax.swing.JLabel();
        ResPDate = new javax.swing.JLabel();
        ResPTime = new javax.swing.JLabel();
        ResRDate = new javax.swing.JLabel();
        ResRTime = new javax.swing.JLabel();
        ResRID = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ResCost = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Reservation Confirmed");

        jLabel2.setText("Name");

        ConfirmResButton.setText("Close");
        ConfirmResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmResButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("Return Time");

        jLabel12.setText("Return Date");

        jLabel11.setText("Pickup Time");

        jLabel10.setText("Pickup Date");

        jLabel9.setText("Location");

        jLabel8.setText("Car Type");

        jLabel3.setText("Drivers Licence");

        jLabel4.setText("Confirmation Number");

        ResName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ResName.setText("<NAME>");

        ResDLicense.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ResDLicense.setText("<DLICENSE>");

        ResLocation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ResLocation.setText("<LOCATION>");

        ResType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ResType.setText("<TYPE>");

        ResPDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ResPDate.setText("<PDATE>");

        ResPTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ResPTime.setText("<PTIME>");

        ResRDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ResRDate.setText("<RDATE>");

        ResRTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ResRTime.setText("<RTIME>");

        ResRID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ResRID.setText("<RID>");

        jLabel20.setText("Estimated Cost");

        ResCost.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ResCost.setText("<COST>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(ConfirmResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ResName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResLocation, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResType, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResPDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResPTime, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResRDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResRTime, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResDLicense, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResCost, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResRID, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ResName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ResDLicense))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ResType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ResLocation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ResPDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ResPTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ResRDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ResRTime))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(ResCost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ResRID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConfirmResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setValues(String name,String license,String type,String location, String pdate,String ptime,String rdate,String rtime) throws InputException{

        if (license.equals("") || type.equals("") || location.equals("")  || pdate.equals("") || ptime.equals("")  ||
                rdate.equals("") ||rtime.equals("")) throw new InputException("Entries must be filled!");

        //query for person on licencse, if it returns nothing throw new InputException("You must register first!");
        model.Reservation r = database.makeReservation(name, license, type, location, pdate, ptime, rdate, rtime);

        //add other exception cases here like the time period being wack, its like 8 marks on the rubric. just put custom messages

        ResDLicense.setText(r.getVtname());
        ResLocation.setText(location);
        ResName.setText(name);
        ResPDate.setText(r.getFromDate().toString());
        ResPTime.setText(r.getFromDate().toString());
        ResRDate.setText(r.getToDate().toString());
        ResRTime.setText(r.getToDate().toString());
        ResType.setText(r.getDlicense());
        ResRID.setText(Integer.toString(r.getConfNo())); // this may have to have a unique value so be careful

        ResCost.setText(String.valueOf(calculateCost()));
    }

    private double calculateCost() {
        //do the math with the rate and stuff
        return 0.0;
    }

    private void ConfirmResButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //do the insertion here i think??
        this.dispose();
    }


    private javax.swing.JButton ConfirmResButton;
    private javax.swing.JLabel ResCost;
    private javax.swing.JLabel ResDLicense;
    private javax.swing.JLabel ResLocation;
    private javax.swing.JLabel ResName;
    private javax.swing.JLabel ResPDate;
    private javax.swing.JLabel ResPTime;
    private javax.swing.JLabel ResRDate;
    private javax.swing.JLabel ResRID;
    private javax.swing.JLabel ResRTime;
    private javax.swing.JLabel ResType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
}
