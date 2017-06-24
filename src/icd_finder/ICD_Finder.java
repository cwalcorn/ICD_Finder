/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icd_finder;

import java.awt.Cursor;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;

/**
 *
 * @author alcorn
 */
public class ICD_Finder extends javax.swing.JFrame {
	private static final String VERSION_NUMBER = "0.3.1a";
	private static final String VERSION_COMMENT = "(not intended for production use)";
	private static final String spaces = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";

	
        private DAO dao = null;
	private Connection conn = null;
	private int selectedRevision;
	/**
	 * Creates new form ICD_Finder
	 */
	public ICD_Finder() {
		initComponents();
		//getRootPane().setDefaultButton(jButton1); 
		//jButton1.requestFocus();
		//getRootPane().setDefaultButton(jButton2); 
		//jButton2.requestFocus();
		jTextPane1.requestFocus();
		setTitle("ICD_Finder");
		setLocationRelativeTo(null);
		jLabel2.setText("Version: " + VERSION_NUMBER + " " + VERSION_COMMENT);
		try {
			dao = new DAO("ICD_Codes/ICD_6_10");
			conn = dao.getConnection();
		} catch	(Exception e) {
			e.printStackTrace();    // could not start db
		}
		selectedRevision = 0;
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                revisionButtons = new javax.swing.ButtonGroup();
                jRadioButton06 = new javax.swing.JRadioButton();
                jRadioButton07 = new javax.swing.JRadioButton();
                jRadioButton08 = new javax.swing.JRadioButton();
                jRadioButton09 = new javax.swing.JRadioButton();
                jRadioButton10 = new javax.swing.JRadioButton();
                jRadioButtonAny = new javax.swing.JRadioButton();
                icdCode = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTextPane1 = new javax.swing.JTextPane();
                jButton1 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jButton2 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                descriptionText = new javax.swing.JTextField();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jMenuBar1 = new javax.swing.JMenuBar();
                jMenu1 = new javax.swing.JMenu();
                jMenuItem1 = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setResizable(false);

                revisionButtons.add(jRadioButton06);
                jRadioButton06.setText("6th");
                jRadioButton06.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jRadioButton06ActionPerformed(evt);
                        }
                });

                revisionButtons.add(jRadioButton07);
                jRadioButton07.setText("7th");
                jRadioButton07.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jRadioButton07ActionPerformed(evt);
                        }
                });

                revisionButtons.add(jRadioButton08);
                jRadioButton08.setText("8th");
                jRadioButton08.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jRadioButton08ActionPerformed(evt);
                        }
                });

                revisionButtons.add(jRadioButton09);
                jRadioButton09.setText("9th");
                jRadioButton09.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jRadioButton09ActionPerformed(evt);
                        }
                });

                revisionButtons.add(jRadioButton10);
                jRadioButton10.setText("10th");
                jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jRadioButton10ActionPerformed(evt);
                        }
                });

                revisionButtons.add(jRadioButtonAny);
                jRadioButtonAny.setSelected(true);
                jRadioButtonAny.setText("Any");
                jRadioButtonAny.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jRadioButtonAnyActionPerformed(evt);
                        }
                });

                icdCode.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
                icdCode.setForeground(java.awt.Color.black);
                icdCode.setText("ICD code.");
                icdCode.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                icdCodeFocusGained(evt);
                        }
                });
                icdCode.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                icdCodeKeyReleased(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
                jLabel1.setLabelFor(icdCode);
                jLabel1.setText("ICD Code");

                jTextPane1.setEditable(false);
                jTextPane1.setContentType("text/html"); // NOI18N
                jScrollPane1.setViewportView(jTextPane1);

                jButton1.setText("Search by ICD Code");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jLabel2.setBackground(java.awt.Color.yellow);
                jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
                jLabel2.setForeground(java.awt.Color.red);
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                jLabel2.setFocusable(false);
                jLabel2.setOpaque(true);

                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/questionMarkIcon_Small.png"))); // NOI18N
                jButton2.setToolTipText("Help");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
                jLabel3.setText("Revision");

                jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
                jLabel4.setText("Text");

                descriptionText.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
                descriptionText.setForeground(java.awt.Color.black);
                descriptionText.setText("Text to search for.");
                descriptionText.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                descriptionTextFocusGained(evt);
                        }
                });

                jButton3.setText("Search in Descriptions");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/questionMarkIcon_Small.png"))); // NOI18N
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jMenu1.setText("File");
                jMenu1.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N

                jMenuItem1.setText("Exit");
                jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jMenuItem1ActionPerformed(evt);
                        }
                });
                jMenu1.add(jMenuItem1);

                jMenuBar1.add(jMenu1);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel4))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(icdCode, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(117, 117, 117)
                                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jRadioButton06)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButton07)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButton08)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButton09)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButton10)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButtonAny)))
                                                .addGap(0, 193, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(icdCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel1)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton4))))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jRadioButton06)
                                        .addComponent(jRadioButton07)
                                        .addComponent(jRadioButton08)
                                        .addComponent(jRadioButton09)
                                        .addComponent(jRadioButton10)
                                        .addComponent(jRadioButtonAny))
                                .addGap(9, 9, 9)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jRadioButton06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton06ActionPerformed
                selectedRevision = 6;
        }//GEN-LAST:event_jRadioButton06ActionPerformed

        private void jRadioButton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton07ActionPerformed
                selectedRevision = 7;
        }//GEN-LAST:event_jRadioButton07ActionPerformed

        private void jRadioButton08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton08ActionPerformed
                selectedRevision = 8;
        }//GEN-LAST:event_jRadioButton08ActionPerformed

        private void jRadioButton09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton09ActionPerformed
                selectedRevision = 9;
        }//GEN-LAST:event_jRadioButton09ActionPerformed

        private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
                selectedRevision = 10;
        }//GEN-LAST:event_jRadioButton10ActionPerformed

        private void jRadioButtonAnyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAnyActionPerformed
                selectedRevision = 0;
        }//GEN-LAST:event_jRadioButtonAnyActionPerformed

//(REVISION INTEGER,
//	GROUPCODE CHARACTER(8),
//	GROUPDESC VARCHAR(1024),
//	CODE CHARACTER(8),
//	DESC VARCHAR(1024))
	
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		String queryString = null;
		String rev = null;
		String icd = null;
		
		icd = icdCode.getText().toUpperCase();
		
		if (icd.length() == 0) {
			try {
				displayResults(null);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}
		
		if (Character.isAlphabetic(icd.charAt(0))) {
			if (icd.length() > 4) {
				icd = icd.substring(0,4).toUpperCase();
			}
		}
		else {
			if (icd.length() > 3) {
				icd = icd.substring(0,3).toUpperCase();
			}
		}
		
		if (selectedRevision != 0) {
			rev = " Revision = " + selectedRevision + " ";
		}
		else {
			rev = null;
		}
				
		if (rev != null && icd.length() == 0) {
			queryString =  "SELECT * FROM ICD_6_10 WHERE "
			      	      + rev
				      + " AND FALSE "
				      + " ORDER BY REVISION, GROUPCODE, CODE, DESC LIMIT 20";
		}		else if (rev == null && icd.length() != 0) {
			int ssLen;
			if (Character.isAlphabetic(icd.charAt(0)) && icd.length() > 3) {
				ssLen = 4;
			}
			else {
				ssLen = 3;
			}
			queryString =  "SELECT * FROM ICD_6_10 WHERE "
			 	      + " ((SUBSTR(CODE,1," + ssLen + ") = " + "SUBSTR('" + icd + "',1," + ssLen + ")" + ") "
				      + " OR "
				      + " (GROUPCODE = " + "SUBSTR('" + icd + "',1," + ssLen + ")" + " "
				      + " AND "
				      + " CODE = '-')) "
				      + " ORDER BY REVISION, GROUPCODE, CODE, DESC";
		}
		else if (rev != null && icd.length() != 0) {
			int ssLen;
			if (Character.isAlphabetic(icd.charAt(0)) && icd.length() > 3) {
				ssLen = 4;
			}
			else {
				ssLen = 3;
			}
			queryString =  "SELECT * FROM ICD_6_10 WHERE "
			    	      + rev
				      + " AND "
			 	      + " ((SUBSTR(CODE,1," + ssLen + ") = " + "SUBSTR('" + icd + "',1," + ssLen + ")" + ") "
				      + " OR "
				      + " (GROUPCODE = " + "SUBSTR('" + icd + "',1," + ssLen + ")" + " "
				      + " AND "
				      + " CODE = '-')) "
				      + " ORDER BY REVISION, GROUPCODE, CODE, DESC";
		}
		else {
			queryString = "SELECT * FROM ICD_6_10 WHERE FALSE ORDER BY REVISION, GROUPCODE, CODE, DESC LIMIT 20";
		}

		//System.out.println(queryString);

		try {
			setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			ArrayList<DTO> al = query(queryString);
			setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			displayResults(al);
			setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		} catch	(Exception e) {
			e.printStackTrace();    // query failed
		}
        }//GEN-LAST:event_jButton1ActionPerformed

        private void icdCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_icdCodeFocusGained
                icdCode.setText(null);
		descriptionText.setText("Text to search for.");
        }//GEN-LAST:event_icdCodeFocusGained

        private void icdCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_icdCodeKeyReleased
		String icd = icdCode.getText();
	
		if (icd.length() == 0) {
			return;
		}
		
		if (Character.isAlphabetic(icd.charAt(0))) {
			if (icd.length() > 4) {
				icdCode.setText(icd.substring(0,4));
			}
		}
		else {
			if (icd.length() > 3) {
				icdCode.setText(icd.substring(0,3).toUpperCase());
			}
		}
        }//GEN-LAST:event_icdCodeKeyReleased

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		Help help = new Help("help_icd.txt", this);
		help.setVisible(true);
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		String queryString = null;
		String searchText;
		boolean wildcard;
		
		searchText = descriptionText.getText().toUpperCase();
		if (searchText.contains("*")) {
			wildcard = true;
		}
		else {
			wildcard = false;
		}
                System.out.println(">> " + searchText);
                searchText = searchText.replaceAll("(?i)\\*", ".*");
                System.out.println(">> " + searchText);

		if (searchText.length() == 0) {
			try {
				displayResults(null);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}
		
		queryString = "SELECT * FROM ICD_6_10 WHERE Desc = '" + searchText + "'";
		
		
		String regex;
		if (wildcard) {
			regex = "'" + searchText + "'";
		}
		else {
			regex =   "'.* " + searchText + " .*"
				+ "|^"   + searchText + "$"
				+ "|^"   + searchText + " .*"
				+ "|.* " + searchText + "$'";
		}
		
		if (selectedRevision != 0) {
			queryString =  "SELECT * FROM ICD_6_10 WHERE "
				      +" Revision = " 
				      + selectedRevision
				      + " AND "
//				      + " UCASE(DESC) LIKE '% " + searchText + " %'"
				      + " REGEXP_MATCHES(UCASE(DESC), " + regex + ")"
				      + " ORDER BY REVISION, GROUPCODE, CODE, DESC";
		}
		else {
			queryString =   "SELECT * FROM ICD_6_10 WHERE " 
//				      + " UCASE(DESC) LIKE '% " + searchText + " %'"
				      + " REGEXP_MATCHES(UCASE(DESC), " + regex + ")"
				      + " ORDER BY REVISION, GROUPCODE, CODE, DESC";
		}
				
		System.out.println(queryString);
		
		ArrayList<DTO> al = null;
		try {
			al = query(queryString);
		} catch	(Exception e) {
			e.printStackTrace();    // query failed
                        displayResults(null);
                        return;
		}

		StringBuilder whereClause = new StringBuilder();
		boolean first = true;
		for (DTO dto : al) {
			if (!first) {
				whereClause.append(" OR ");
			}
			first = false;
			whereClause.append(" (REVISION = "
				           + dto.getRevision()
				           + " AND "
				           + "GROUPCODE = "
				           + "'" + dto.getGroupCode() + "')");
		}
			
		if (whereClause.length() == 0) {
			whereClause.append("FALSE");
		}
		queryString = "SELECT * FROM ICD_6_10 WHERE " + whereClause;

		//System.out.println(queryString);
		
		try {
			setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			al = query(queryString);
			setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			displayResults(al);
			setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		} catch	(Exception e) {
			e.printStackTrace();    // query failed
                        displayResults(null);
                        return;
		}
        }//GEN-LAST:event_jButton3ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
		Help help = new Help("help_desc.txt", this);
		help.setVisible(true);
        }//GEN-LAST:event_jButton4ActionPerformed

        private void descriptionTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descriptionTextFocusGained
                descriptionText.setText(null);
		icdCode.setText("ICD Code");
        }//GEN-LAST:event_descriptionTextFocusGained

        private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
                this.setVisible(false);
		this.dispose();
        }//GEN-LAST:event_jMenuItem1ActionPerformed

	public synchronized ArrayList<DTO> query(String expression) throws SQLException {

		ArrayList<DTO> returnSet = new ArrayList<>();
		
		Statement st = null;
		ResultSet rs = null;

		st = conn.createStatement();         // statement objects can be reused with

		// repeated calls to execute but we
		// choose to make a new one each time
		rs = st.executeQuery(expression);    // run the query
		
		// the order of the rows in a cursor
		// are implementation dependent unless you use the SQL ORDER statement
		ResultSetMetaData meta = rs.getMetaData();
		int colmax = meta.getColumnCount();
		int i;
		Object o = null;
		
		// the result set is a cursor into the data.  You can only
		// point to one row at a time
		// assume we are pointing to BEFORE the first row
		// rs.next() points to next row and returns true
		// or false if there is no next row, which breaks the loop
		for (; rs.next();) {
			returnSet.add(new DTO(Integer.parseInt(rs.getObject(1).toString()),
				              rs.getString(2),
				              rs.getString(3),
				              rs.getString(4),
				              rs.getString(5)));
		}

		// do something with the result set.
		st.close();    // NOTE!! if you close a statement the associated ResultSet is

		// closed too
		// so you should copy the contents to some other object.
		// the result set is invalidated also  if you recycle an Statement
		// and try to execute some other query before the result set has been
		// completely examined.
		
		return returnSet;
	}

	//use for SQL commands CREATE, DROP, INSERT and UPDATE
	public synchronized void update(String expression) throws SQLException {

		Statement st = null;

		st = conn.createStatement();    // statements

		int i = st.executeUpdate(expression);    // run the query

		if (i == -1) {
			System.out.println("db error : " + expression);
		}

		st.close();
	}    // void update()

	public void displayResults(ArrayList<DTO> results) {
		
		jTextPane1.setText("");
		
		//System.out.println(results.isEmpty() + " " + results.size());
		
		String stylesheet =  "<STYLE>"
		                     + readCSSFile("css/ICD_Finder.css")
		                     + "</STYLE>";

		StringBuilder sb = new StringBuilder();

				
		if(results == null || results.isEmpty()) {
			sb.append("<HTML><HEAD>" + stylesheet + "</HEAD><BODY><H1>No Results</H1></BODY></HTML>");
			jTextPane1.setText(sb.toString());
			return;
		}
		else {
			sb.append("<HTML><HEAD>" + stylesheet + "</HEAD><BODY><TABLE BORDER=1>");
		}

		int oldRevision = -999;
		
		sb.append("<TR CLASS=\"header\"><TH>Rev</TH><TH CLASS=\"nowrap\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ICD&nbsp;Code&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH><TH>Description</TH></TR>");
		
		for (DTO dto : results) {
			if (dto.getRevision() != oldRevision) {
				oldRevision = dto.getRevision();
			}
		
			//System.out.println("'" + dto.getCode() + "'");
			if (dto.getCode().charAt(0) == '-') {
				//System.out.println("Dash");
				sb.append("<TR CLASS=\"revheader\">");
				sb.append("<TD CLASS=\"center\">");
				sb.append(Integer.toString(dto.getRevision()) + " ");
				sb.append("</TD>");
				sb.append("<TD CLASS=\"nowrap\">");
				sb.append(dto.getGroupCode());
				sb.append("</TD>");
				sb.append("<TD CLASS=\"nowrap\">");
				sb.append(dto.getGroupDesc().replaceAll("(?i)"+descriptionText.getText().replaceAll("\\*", ""), "<FONT STYLE='background-color:yellow;'>" + descriptionText.getText().replaceAll("\\*", "") + "</FONT>"));
				sb.append("</TD>");
				sb.append("</TR>");
			}
			else {
				sb.append("<TR>");
				sb.append("<TD CLASS=\"center\">");
				sb.append(Integer.toString(dto.getRevision()) + " ");
				sb.append("</TD>");
				sb.append("<TD CLASS=\"nowrap\">");
				//System.out.println(dto.getCode() + " " + dto.getCode().replace(".","").length());
				sb.append(spaces.substring(0,24*(dto.getCode().replace(".","").length()-3)));
				sb.append(dto.getCode());
				sb.append("</TD>");
				sb.append("<TD CLASS=\"nowrap\">");
				sb.append(spaces.substring(0,24*(dto.getCode().replace(".","").length()-3)));
				sb.append(dto.getDesc().replaceAll("(?i)"+descriptionText.getText().replaceAll("\\*", ""), "<FONT STYLE='background-color:yellow;'>" + descriptionText.getText().replaceAll("\\*", "") + "</FONT>"));
				sb.append("</TD>");
				sb.append("</TR>");
			}
		}
		
		sb.append("</TABLE></BODY></HTML>");
		
		jTextPane1.setText(sb.toString());
	}
	
	private String readCSSFile(String cssFile) {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(cssFile));
		BufferedReader br     = new BufferedReader(isr);
		
		StringBuilder stylesheet = new StringBuilder();
		//stylesheet.append("<STYLE>");
		try {
			String line;
			while ((line = br.readLine()) != null) {
				stylesheet.append(line);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//stylesheet.append("</STYLE>");
		
		return stylesheet.toString();
}	
	
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
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ICD_Finder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ICD_Finder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ICD_Finder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ICD_Finder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ICD_Finder().setVisible(true);
			}
		});
	}
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField descriptionText;
        private javax.swing.JTextField icdCode;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JMenuItem jMenuItem1;
        private javax.swing.JRadioButton jRadioButton06;
        private javax.swing.JRadioButton jRadioButton07;
        private javax.swing.JRadioButton jRadioButton08;
        private javax.swing.JRadioButton jRadioButton09;
        private javax.swing.JRadioButton jRadioButton10;
        private javax.swing.JRadioButton jRadioButtonAny;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextPane jTextPane1;
        private javax.swing.ButtonGroup revisionButtons;
        // End of variables declaration//GEN-END:variables
}