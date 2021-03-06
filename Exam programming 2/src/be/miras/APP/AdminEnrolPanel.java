/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.APP;

import be.miras.BLL.EducationBLL;
import be.miras.BLL.Education_CourseBLL;
import be.miras.BLL.EnrolmentBLL;
import be.miras.BLL.PersonBLL;
import be.miras.BLL.UserBLL;
import be.miras.DOMAIN.Education;
import be.miras.DOMAIN.Education_Course;
import be.miras.DOMAIN.Enrolment;
import be.miras.DOMAIN.Person;
import be.miras.DOMAIN.Status;
import be.miras.DOMAIN.User;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author shaun
 */
public class AdminEnrolPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminStudentPanel
     */
    public AdminEnrolPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbEducation = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listUsers = new javax.swing.JList<>();
        lblAddress = new javax.swing.JLabel();
        dpDob = new org.jdesktop.swingx.JXDatePicker();
        txtAddress = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        lblFirstname = new javax.swing.JLabel();
        btnEnrol = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        lblSSID = new javax.swing.JLabel();
        txtSSID = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        lblDob = new javax.swing.JLabel();
        lblEducation = new javax.swing.JLabel();
        btnDisenrol = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lblAllUsers = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(500, 500));

        EducationBLL e = new EducationBLL();
        ArrayList<Education> educations = e.GetAll();
        //String[]opleidingarray = opleidingen.toArray(new String[opleidingen.size()]);
        //String[]opleidingArray = educations.size();
        ArrayList<String> opleidingen = new ArrayList<String>();
        for(Education o : educations){
            opleidingen.add(o.getName());
        }
        String[]opleidingarray = opleidingen.toArray(new String[opleidingen.size()]);
        cbEducation.setModel(new javax.swing.DefaultComboBoxModel<>(opleidingarray));
        cbEducation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEducationActionPerformed(evt);
            }
        });

        listUsers.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String>namenUsers = getArrayListUsers();
            public int getSize() { return namenUsers.size(); }
            public String getElementAt(int i) { return namenUsers.get(i); }

        });
        listUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listUsers);

        lblAddress.setText("Address:");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        lblLastName.setText("Last name:");

        lblFirstname.setText("First name:");

        btnEnrol.setText("Enrol");
        btnEnrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrolActionPerformed(evt);
            }
        });

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblSSID.setText("SSID:");

        btnRefresh.setText("Refresh List");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblDob.setText("Date of birth:");

        lblEducation.setText("Education:");

        btnDisenrol.setText("Disenrol");
        btnDisenrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisenrolActionPerformed(evt);
            }
        });

        btnCreate.setText("Create Person credentials");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblAllUsers.setText("All users:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtID.setEditable(false);

        lblID.setText("ID");

        lblEmail.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(txtID)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEducation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbEducation, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSSID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSSID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblFirstname)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblDob)
                                            .addGap(2, 2, 2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblAddress)
                                            .addGap(33, 33, 33)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAddress)
                                        .addComponent(dpDob, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLastName)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(lblAllUsers)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEnrol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisenrol, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAllUsers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEnrol)
                            .addComponent(btnDisenrol)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDob)
                            .addComponent(dpDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSSID)
                            .addComponent(txtSSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEducation)
                            .addComponent(cbEducation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreate)
                .addContainerGap(215, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listUsersMouseClicked
        String selected = listUsers.getSelectedValue().toString();

        //get the first part of the selected item (lastname)
        if (selected.contains(" ")) {
            selected = selected.substring(0, selected.indexOf(" "));

        }
        UserBLL ubll = new UserBLL();
        User user = new User();
        user = ubll.getByEmail(selected);
        txtID.setText(Integer.toString(user.getID()));
        txtEmail.setText(user.getEmail());

        PersonBLL pbll = new PersonBLL();
        Person person = new Person();
        person = pbll.GetById(user.getID());
        Enrolment enrol = new Enrolment();
        EnrolmentBLL enrolbll = new EnrolmentBLL();
        enrol = enrolbll.GetById(person.getID());

        //txtStatus.setText(enrol.getStatus().toString());
        EducationBLL edubll = new EducationBLL();
        Education edu = new Education();

        txtFirstName.setText(person.getFirstname());
        txtLastName.setText(person.getLastname());
        txtAddress.setText(person.getAddress());
        dpDob.setDate(person.getDob());
        txtSSID.setText(person.getSSID());
    }//GEN-LAST:event_listUsersMouseClicked

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnEnrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrolActionPerformed

        User user = new User();
        UserBLL ubll = new UserBLL();
        ArrayList<User> users = new ArrayList<>();
        users = ubll.GetAll();
        String selected = listUsers.getSelectedValue().toString();
        user = ubll.getByEmail(selected);

        txtID.setText(Integer.toString(user.getID()));
        txtEmail.setText(selected);

        /*
        Person person = new Person();
        PersonBLL pbll = new PersonBLL();
        Enrolment enrol = new Enrolment();
        EnrolmentBLL eBLL = new EnrolmentBLL();
        Education edu = new Education();
        
       person = pbll.GetById(Integer.parseInt(txtID.getText()));
       int personid = person.getID();

        if (personid==) {
            
            person.setID(user.getID());
            person.setAddress(txtAddress.getText());
            person.setLastname(txtLastName.getText());
            person.setFirstname(txtFirstName.getText());
            person.setSSID(txtSSID.getText());
            person.setDob(dpDob.getDate());
            
            txtAddress.setText(person.getAddress());
            txtLastName.setText(person.getLastname());
            txtFirstName.setText(person.getFirstname());
            txtSSID.setText(person.getSSID());
            dpDob.setDate(person.getDob());

            pbll.Create(person);
            enrol.setStatus(Status.DisEnrolled);
            enrol.setPersonID(user.getID());
            enrol.setCourseID(0);
            eBLL.Create(enrol);
            

        } else {
      
            
            person = pbll.GetById(user.getID());
            
            txtAddress.setText(person.getAddress());
            txtLastName.setText(person.getLastname());
            txtFirstName.setText(person.getFirstname());
            txtSSID.setText(person.getSSID());
            dpDob.setDate(person.getDob());
                

        }
        
        

       
        
                    Inschrijving i = new Inschrijving();
            i.setLid(lBLL.getById(Integer.parseInt(txtLidID.getText())));
            i.setEvenement(eBLL.getById(Integer.parseInt(txtEvenementID.getText())));
            iBLL.createLid(i);
         */
        Enrolment enrol = new Enrolment();
        EnrolmentBLL eBLL = new EnrolmentBLL();

        EducationBLL edubll = new EducationBLL();
        Education edu = edubll.getByName(cbEducation.getSelectedItem().toString());

        Education_Course ec = new Education_Course();
        ec.setEducation(edu);

        Education_CourseBLL ecBLL = new Education_CourseBLL();
        ArrayList<Integer> courseIDs = ecBLL.getAllByEducationID(edu.getID());

        Iterator<Integer> i = courseIDs.iterator();
        while (i.hasNext()) {

            int c = i.next();
            System.out.println(user.getID());
            if (eBLL.Create(new Enrolment(Status.Enrolled, user.getID(), c)) == null) {
                // error message
                JOptionPane.showMessageDialog(null, "User already enlisted.");
            }
        }
        // ec.getCourseID();
        // ArrayList<Course> courses = new ArrayList<>();
        // CourseBLL cbl = new CourseBLL();
        // courses = cbl.GetAll();
//        for (Integer i : courseIDs) {
//            System.out.println(user.getID() + " " + i);
//            Enrolment enrollment = new Enrolment();
//            enrollment.setPersonID(user.getID());
//            enrollment.setCourseID(i);
//            enrollment.setStatus(Status.Enrolled);
//
//            eBLL.Create(enrollment);
//
//        }

    }//GEN-LAST:event_btnEnrolActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        UserBLL ubll = new UserBLL();
        ArrayList<User> users = ubll.GetAll();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        ArrayList<String> userNames = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            userNames.add(users.get(i).getEmail());
        }
        userNames.forEach((i) -> {
            listModel.addElement(i);
        });
        listUsers.setModel(listModel);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void cbEducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEducationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEducationActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        Person person = new Person();
        User user = new User();

        UserBLL u = new UserBLL();
        ArrayList<User> users = new ArrayList<User>();
        users = u.GetAll();

        person.setID(Integer.parseInt(txtID.getText()));

        person.setAddress(txtAddress.getText());
        person.setLastname(txtLastName.getText());
        person.setFirstname(txtFirstName.getText());
        person.setSSID(txtSSID.getText());
        person.setDob(dpDob.getDate());

        PersonBLL pb = new PersonBLL();
        ArrayList<Person> persons = pb.GetAll();

        pb.Create(person);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDisenrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisenrolActionPerformed

        User user = new User();
        UserBLL ubll = new UserBLL();
        ArrayList<User> users = new ArrayList<>();
        users = ubll.GetAll();
        String selected = listUsers.getSelectedValue().toString();
        user = ubll.getByEmail(selected);

        txtID.setText(Integer.toString(user.getID()));
        txtEmail.setText(selected);

        Enrolment enrol = new Enrolment();
        EnrolmentBLL eBLL = new EnrolmentBLL();

        EducationBLL edubll = new EducationBLL();
        Education edu = edubll.getByName(cbEducation.getSelectedItem().toString());

        Education_Course ec = new Education_Course();
        ec.setEducation(edu);

        Education_CourseBLL ecBLL = new Education_CourseBLL();
        ArrayList<Integer> courseIDs = ecBLL.getAllByEducationID(edu.getID());

        Iterator<Integer> i = courseIDs.iterator();
        while (i.hasNext()) {
            int c = i.next();
            eBLL.Delete(new Enrolment(Status.Enrolled, user.getID(), c));
        }

    }//GEN-LAST:event_btnDisenrolActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed
    public ArrayList getArrayListUsers() {
        UserBLL u = new UserBLL();
        ArrayList<User> users = u.GetAll();
        ArrayList<String> nameUsers = new ArrayList<>();

        for (int i = 0; i < users.size(); i++) {
            User pe = new User();
            pe = users.get(i);
            nameUsers.add(pe.getEmail());
        }
        return nameUsers;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDisenrol;
    private javax.swing.JButton btnEnrol;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox<String> cbEducation;
    private org.jdesktop.swingx.JXDatePicker dpDob;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAllUsers;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEducation;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSSID;
    private javax.swing.JList<String> listUsers;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSSID;
    // End of variables declaration//GEN-END:variables
}
