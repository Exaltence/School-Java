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
import javax.swing.DefaultListModel;

/**
 *
 * @author shaun
 */
public class AdminStudentPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminStudentPanel
     */
    public AdminStudentPanel() {
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

        comboboxCourses = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listUsers = new javax.swing.JList<>();
        lblAddress = new javax.swing.JLabel();
        txtDob = new org.jdesktop.swingx.JXDatePicker();
        txtAddress = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblFirstname = new javax.swing.JLabel();
        btnEnrol = new javax.swing.JButton();
        txtFirstname = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        lblSSID = new javax.swing.JLabel();
        txtSSID = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        lblDob = new javax.swing.JLabel();
        lblEducation = new javax.swing.JLabel();
        btnDisenrol = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lblAllUsers = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        EducationBLL e = new EducationBLL();
        ArrayList<Education> educations = e.GetAll();
        //String[]opleidingarray = opleidingen.toArray(new String[opleidingen.size()]);
        //String[]opleidingArray = educations.size();
        ArrayList<String> opleidingen = new ArrayList<String>();
        for(Education o : educations){
            opleidingen.add(o.getName());
        }
        String[]opleidingarray = opleidingen.toArray(new String[opleidingen.size()]);
        comboboxCourses.setModel(new javax.swing.DefaultComboBoxModel<>(opleidingarray));
        comboboxCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxCoursesActionPerformed(evt);
            }
        });

        listUsers.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String>namenPersonen = getArrayListPersons();
            public int getSize() { return namenPersonen.size(); }
            public String getElementAt(int i) { return namenPersonen.get(i); }

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

        lblName.setText("Name:");

        lblFirstname.setText("Firstname:");

        btnEnrol.setText("Enrol");
        btnEnrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrolActionPerformed(evt);
            }
        });

        txtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstnameActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete user");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblAllUsers.setText("All users:");

        btnUpdate.setText("Update user");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstname)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtFirstname)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSSID)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEducation)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboboxCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDob)
                                        .addComponent(lblAddress))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSSID)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAllUsers)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEnrol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisenrol, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(lblAllUsers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstname))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDob))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSSID)
                            .addComponent(txtSSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboboxCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEducation)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnEnrol)
                    .addComponent(btnDisenrol))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listUsersMouseClicked
        String selected = listUsers.getSelectedValue().toString();

        //get the first part of the selected item (lastname)
        if (selected.contains(" ")) {
            selected = selected.substring(0, selected.indexOf(" "));

        }

        PersonBLL personbll = new PersonBLL();
        Person person = new Person();
        person = personbll.getByLastName(selected);
        txtFirstname.setText(person.getFirstname());
        txtName.setText(person.getLastname());
        txtAddress.setText(person.getAddress());
        txtDob.setDate(person.getDob());
        txtSSID.setText(person.getSSID());
    }//GEN-LAST:event_listUsersMouseClicked

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnEnrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrolActionPerformed
        Person person = new Person();
        User user = new User();

        UserBLL u = new UserBLL();
        ArrayList<User> users = new ArrayList<User>();
        users = u.GetAll();

        user.setID(users.size() + 1);
        int id = user.getID();

        person.setAddress(txtAddress.getText());
        person.setLastname(txtName.getText());
        person.setFirstname(txtFirstname.getText());
        person.setSSID(txtSSID.getText());
        person.setDob(txtDob.getDate());

        user.setEmail(person.getFirstname() + person.getLastname() + "@gmail.com");
        String f = person.getFirstname();
        String l = person.getLastname();
        user.setPassword(f.substring(0, 1).toLowerCase() + l.substring(0, 1).toLowerCase());
        user.setRoleID(2);

        PersonBLL pb = new PersonBLL();
        ArrayList<Person> persons = pb.GetAll();

        User user1 = u.getByEmail(user.getEmail());
        // user1.getID

        person.setID(user1.getID());

        EducationBLL e = new EducationBLL();
        /*
                    Inschrijving i = new Inschrijving();
            i.setLid(lBLL.getById(Integer.parseInt(txtLidID.getText())));
            i.setEvenement(eBLL.getById(Integer.parseInt(txtEvenementID.getText())));
            iBLL.createLid(i);
         */
        Enrolment enrol = new Enrolment();

        Education edu = new Education();
        edu.setName(comboboxCourses.getSelectedItem().toString());
        EducationBLL edubll = new EducationBLL();
        Education edu1 = edubll.getByName(edu.getName());
        edu.setID(edu1.getID());
        Education_Course ec = new Education_Course();
        ec.setEducation(edu);
        Education_CourseBLL ecBLL = new Education_CourseBLL();
        ArrayList<Integer> courseIDs = new ArrayList<>();
        courseIDs = ecBLL.getAllByEducationID(edu.getID());

        // ec.getCourseID();
        // ArrayList<Course> courses = new ArrayList<>();
        // CourseBLL cbl = new CourseBLL();
        // courses = cbl.GetAll();
        for (Integer i : courseIDs) {
            System.out.println(person.getID() + " " + i);
            Enrolment enrollment = new Enrolment();
            enrollment.setPersonID(person.getID());
            enrollment.setCourseID(i);
            enrollment.setStatus(Status.Enrolled);
            EnrolmentBLL eBLL = new EnrolmentBLL();

            eBLL.enrolUser(enrollment);

        }

    }//GEN-LAST:event_btnEnrolActionPerformed

    private void txtFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstnameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        PersonBLL personbll = new PersonBLL();
        UserBLL userbll = new UserBLL();
        Person person = new Person();

        User user = new User();

        String selected = listUsers.getSelectedValue().toString();
        if (selected.contains(" ")) {
            selected = selected.substring(0, selected.indexOf(" "));

        }
        person = personbll.getByLastName(selected);
        String email = person.getFirstname() + person.getLastname() + "@gmail.com";
        user = userbll.getByEmail(email);
        System.out.println(email);
        // personbll.Delete(person);
        userbll.Delete(user);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        PersonBLL pb = new PersonBLL();
        ArrayList<Person> persons = pb.GetAll();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        ArrayList<String> personNames = new ArrayList<>();

        for (int i = 0; i < persons.size(); i++) {
            personNames.add(persons.get(i).getLastname() + " " + persons.get(i).getFirstname());
        }
        personNames.forEach((i) -> {
            listModel.addElement(i);
        });
        listUsers.setModel(listModel);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void comboboxCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxCoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxCoursesActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        Person person = new Person();
        User user = new User();

        UserBLL u = new UserBLL();
        ArrayList<User> users = new ArrayList<User>();
        users = u.GetAll();

        user.setID(users.size() + 1);
        int id = user.getID();

        person.setAddress(txtAddress.getText());
        person.setLastname(txtName.getText());
        person.setFirstname(txtFirstname.getText());
        person.setSSID(txtSSID.getText());
        person.setDob(txtDob.getDate());

        user.setEmail(person.getFirstname() + person.getLastname() + "@gmail.com");
        String f = person.getFirstname();
        String l = person.getLastname();
        user.setPassword(f.substring(0, 1).toLowerCase() + l.substring(0, 1).toLowerCase());
        user.setRoleID(2);

        u.Create(user);

        PersonBLL pb = new PersonBLL();
        ArrayList<Person> persons = pb.GetAll();

        User user1 = u.getByEmail(user.getEmail());
        // user1.getID

        person.setID(user1.getID());

        pb.Create(person);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDisenrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisenrolActionPerformed
        Person person = new Person();
        User user = new User();

        UserBLL u = new UserBLL();
        ArrayList<User> users = new ArrayList<User>();
        users = u.GetAll();

        user.setID(users.size() + 1);
        int id = user.getID();

        person.setAddress(txtAddress.getText());
        person.setLastname(txtName.getText());
        person.setFirstname(txtFirstname.getText());
        person.setSSID(txtSSID.getText());
        person.setDob(txtDob.getDate());

        user.setEmail(person.getFirstname() + person.getLastname() + "@gmail.com");
        String f = person.getFirstname();
        String l = person.getLastname();
        user.setPassword(f.substring(0, 1).toLowerCase() + l.substring(0, 1).toLowerCase());
        user.setRoleID(2);

        PersonBLL pb = new PersonBLL();
        ArrayList<Person> persons = pb.GetAll();

        User user1 = u.getByEmail(user.getEmail());
        // user1.getID

        person.setID(user1.getID());

        EducationBLL e = new EducationBLL();
        /*
                    Inschrijving i = new Inschrijving();
            i.setLid(lBLL.getById(Integer.parseInt(txtLidID.getText())));
            i.setEvenement(eBLL.getById(Integer.parseInt(txtEvenementID.getText())));
            iBLL.createLid(i);
         */
        Enrolment enrol = new Enrolment();

        Education edu = new Education();
        edu.setName(comboboxCourses.getSelectedItem().toString());
        EducationBLL edubll = new EducationBLL();
        Education edu1 = edubll.getByName(edu.getName());
        edu.setID(edu1.getID());
        Education_Course ec = new Education_Course();
        ec.setEducation(edu);
        Education_CourseBLL ecBLL = new Education_CourseBLL();
        ArrayList<Integer> courseIDs = new ArrayList<>();
        courseIDs = ecBLL.getAllByEducationID(edu.getID());

        // ec.getCourseID();
        // ArrayList<Course> courses = new ArrayList<>();
        // CourseBLL cbl = new CourseBLL();
        // courses = cbl.GetAll();
        for (Integer i : courseIDs) {
            System.out.println(person.getID() + " " + i);
            Enrolment enrollment = new Enrolment();
            enrollment.setPersonID(person.getID());
            enrollment.setCourseID(i);
            enrollment.setStatus(Status.DisEnrolled);
            EnrolmentBLL eBLL = new EnrolmentBLL();

            eBLL.disEnrolUser(enrollment);

        }
    }//GEN-LAST:event_btnDisenrolActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed
    public ArrayList getArrayListPersons() {
        PersonBLL p = new PersonBLL();
        ArrayList<Person> personen = p.GetAll();
        ArrayList<String> namenPersonen = new ArrayList<String>();
        String fullname = "";

        for (int i = 0; i < personen.size(); i++) {
            Person pe = new Person();
            pe = personen.get(i);
            namenPersonen.add(pe.getLastname() + " " + pe.getFirstname());
        }
        return namenPersonen;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisenrol;
    private javax.swing.JButton btnEnrol;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboboxCourses;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAllUsers;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEducation;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSSID;
    private javax.swing.JList<String> listUsers;
    private javax.swing.JTextField txtAddress;
    private org.jdesktop.swingx.JXDatePicker txtDob;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSID;
    // End of variables declaration//GEN-END:variables
}
