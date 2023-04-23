package projectStudentManage;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListDataEvent;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

import projectStudentManage.Students;
//import projectStudentManage.StudentsModify;
import projectStudentManage.Students;

import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class projectsFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableStudents;

	
	// New
	private JTextField txtMaMonHoc;
	private JTextField txtSoTinChi;
	private JTextField txtDiem;
	private JTextField txtSoSvDangHoc;
	private JTextField txtNgayMo;
	private JTextField txtNgayKetThuc;
	private JTextField txtNhapMaMonHoc;
	
	DefaultTableModel tableModel;
	
	List<Students> studentList = new ArrayList<>();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					projectsFrame frame = new projectsFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public projectsFrame() {
		initComponents();
		
		tableModel = (DefaultTableModel) tableStudents.getModel();
        
        showStudents();
	}
	
	private void showStudents() {		
		tableModel.setRowCount(0);
		
		studentList.forEach((student) -> {
            tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, 
            		student.getMamonhoc(), 
            		student.getSotinchi(), 
            		student.getDiem(),
            		student.getSosvdanghoc(), 
            		student.getNgaymo(), 
            		student.getNgayketthuc()});
        });
	}

	/**
	 * Create the frame.
	 */
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {
		setBackground(new Color(255, 255, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 768);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelBy = new JLabel("Nhóm 8");
		labelBy.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		labelBy.setBounds(1092, 65, 62, 23);
		contentPane.add(labelBy);
		
		JLabel labelLogin = new JLabel("QUẢN LÝ SINH VIÊN");
		labelLogin.setBackground(new Color(0, 255, 0));
		labelLogin.setVerifyInputWhenFocusTarget(false);
		labelLogin.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelLogin.setBounds(10, 11, 1164, 88);
		labelLogin.setHorizontalAlignment(SwingConstants.CENTER); // set text alignment to center
		labelLogin.setFont(new Font("Arial", Font.BOLD, 50)); // set a new font with larger size
		labelLogin.setForeground(new Color(0, 0, 0)); // set text color to blue
		contentPane.add(labelLogin);
		
		JPanel panelPriView = new JPanel();
		panelPriView.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelPriView.setBounds(10, 128, 1164, 590);
		contentPane.add(panelPriView);
		panelPriView.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1164, 579);
		panelPriView.add(tabbedPane);
		tabbedPane.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JPanel panelStudents = new JPanel();
		panelStudents.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		panelStudents.setBorder(new EmptyBorder(0, 0, 0, 0));
		tabbedPane.addTab("Sinh viên", null, panelStudents, null);
		panelStudents.setLayout(null);
		
		JPanel panelStudentsInfor = new JPanel();
		panelStudentsInfor.setBackground(new Color(0, 255, 0));
		panelStudentsInfor.setBounds(0, 0, 339, 545);
		panelStudentsInfor.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelStudents.add(panelStudentsInfor);
		panelStudentsInfor.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ma mon hoc");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 21, 100, 26);
		panelStudentsInfor.add(lblNewLabel);
		
		JLabel lblNewLabe2 = new JLabel("So tin chi");
		lblNewLabe2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabe2.setBounds(10, 71, 100, 26);
		panelStudentsInfor.add(lblNewLabe2);
		
		
		JLabel lblNewLabe3 = new JLabel("Diem");
		lblNewLabe3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabe3.setBounds(10, 121, 40, 26);
		panelStudentsInfor.add(lblNewLabe3);
		
		JLabel lblNewLabe4 = new JLabel("So sv dang hoc");
		lblNewLabe4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabe4.setBounds(10, 171, 120, 26);
		panelStudentsInfor.add(lblNewLabe4);
		
		JLabel lblNewLabe5 = new JLabel("Ngay mo");
		lblNewLabe5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabe5.setBounds(10, 221, 80, 26);
		panelStudentsInfor.add(lblNewLabe5);
		
		JLabel lblNewLabe6 = new JLabel("Ngay ket thuc");
		lblNewLabe6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabe6.setBounds(10, 271, 100, 26);
		panelStudentsInfor.add(lblNewLabe6);
		
		
		txtMaMonHoc = new JTextField();
		txtMaMonHoc.setColumns(10);
		txtMaMonHoc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMaMonHoc.setBounds(120, 21, 200, 26);
		panelStudentsInfor.add(txtMaMonHoc);

		txtSoTinChi = new JTextField();
		txtSoTinChi.setColumns(10);
		txtSoTinChi.setBounds(120, 71, 200, 26);
		panelStudentsInfor.add(txtSoTinChi);

		txtDiem = new JTextField();
		txtDiem.setColumns(10);
		txtDiem.setBounds(120, 121, 200, 26);
		panelStudentsInfor.add(txtDiem);

		
		txtSoSvDangHoc = new JTextField();
		txtSoSvDangHoc.setColumns(10);
		txtSoSvDangHoc.setBounds(120, 171, 200, 26);
		panelStudentsInfor.add(txtSoSvDangHoc);

		txtNgayMo = new JTextField();
		txtNgayMo.setColumns(10);
		txtNgayMo.setBounds(120, 221, 200, 26);
		panelStudentsInfor.add(txtNgayMo);

		txtNgayKetThuc = new JTextField();
		txtNgayKetThuc.setColumns(10);
		txtNgayKetThuc.setBounds(120, 271, 200, 26);
		panelStudentsInfor.add(txtNgayKetThuc);


		
		
		JScrollPane scrollPaneStudents = new JScrollPane();
		scrollPaneStudents.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPaneStudents.setBounds(349, 38, 810, 507);
		panelStudents.add(scrollPaneStudents);
		
		tableStudents = new JTable();
		tableStudents.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT","Ma mon hoc", "So tin chi", "Diem", "So sv dang hoc", "Ngay mo" , "Ngay ket thuc"
			}
		));
		tableStudents.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		scrollPaneStudents.setViewportView(tableStudents);
		
		JButton btnThemStudents = new JButton("Thêm");
		btnThemStudents.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnThemStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mamonhoc = txtMaMonHoc.getText();
				double diem = Double.parseDouble(txtDiem.getText());
				long sotinchi = Long.parseLong(txtSoTinChi.getText());
				long sosvdanghoc = Long.parseLong(txtSoSvDangHoc.getText());
				String ngaymo = txtNgayMo.getText();
				String ngayketthuc = txtNgayKetThuc.getText();
				
				
				if(diem < 0 || diem > 10) {
					JOptionPane.showMessageDialog(panelPriView,"Nhập điểm hệ số 10 !");
		        	return;
				}

				Students std = new Students(mamonhoc, sotinchi, sosvdanghoc, diem, ngaymo, ngayketthuc);
				studentList.add(std);

				showStudents();
			}
		});
		btnThemStudents.setBounds(10, 499, 89, 35);
		panelStudentsInfor.add(btnThemStudents);
		JButton btnCpNhpStudents = new JButton("Cập nhập");
		btnCpNhpStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = tableStudents.getSelectedRow();
				if(selectedIndex >= 0 && selectedIndex < studentList.size()) {
					//
				}else {
					JOptionPane.showMessageDialog(panelPriView,"Chon hang ban muon cap nhat");
					return;
				}
				
				
				String mamonhoc = txtMaMonHoc.getText();
				double diem = Double.parseDouble(txtDiem.getText());
				long sotinchi = Long.parseLong(txtSoTinChi.getText());
				long sosvdanghoc = Long.parseLong(txtSoSvDangHoc.getText());
				String ngaymo = txtNgayMo.getText();
				String ngayketthuc = txtNgayKetThuc.getText();
				
				
				if(diem < 0 || diem > 10) {
					JOptionPane.showMessageDialog(panelPriView,"Nhập điểm hệ số 10 !");
		        	return;
				}

				Students std = new Students(mamonhoc, sotinchi, sosvdanghoc, diem, ngaymo, ngayketthuc);
				studentList.set(selectedIndex, std);
				
				showStudents();
				
			}
		});
		btnCpNhpStudents.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnCpNhpStudents.setBounds(115, 499, 108, 35);
		panelStudentsInfor.add(btnCpNhpStudents);
		
		JButton btnXoaStudents = new JButton("Xóa");
		btnXoaStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int selectedIndex = tableStudents.getSelectedRow();
		        if(selectedIndex >= 0) {
		            
		        	int option = JOptionPane.showConfirmDialog(panelPriView, "Bạn có muốn xóa không?");
		        	
		            System.out.println("option : " + option  +" " + selectedIndex);
		            
		            // Delete
		            if(option == 0) {
		            	studentList.remove(selectedIndex);
		                showStudents();
		            }
		        }
			}
		});
		btnXoaStudents.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnXoaStudents.setBounds(240, 499, 89, 35);
		panelStudentsInfor.add(btnXoaStudents);
		
		

		JLabel lblNhapMaMonHoc = new JLabel("Nhap ma mon hoc");
		lblNhapMaMonHoc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhapMaMonHoc.setBounds(495,5,121,26);
		panelStudents.add(lblNhapMaMonHoc);
		

		txtNhapMaMonHoc = new JTextField();
		txtNhapMaMonHoc.setColumns(10);
		txtNhapMaMonHoc.setToolTipText("Nhap ma mon hoc de tim kiem");
		txtNhapMaMonHoc.setBounds(625, 5 , 256, 26);
		panelStudents.add(txtNhapMaMonHoc);
	
		
		
		JButton btnFindStudents = new JButton("Tìm");
		btnFindStudents.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnFindStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				String searchMamonhoc = txtNhapMaMonHoc.getText();
//				
//				long index = studentList.size();
//			
//				
//				for (int i = 0; i < studentList.size(); i++) {
//				    if (studentList.get(i).getMamonhoc().equals(searchMamonhoc)) {
//				       index = i;
//				       break;
//				    }
//				}
//
//					
//				if(index == studentList.size()) {
//					showStudents();
//					return;
//				}
//
//				
//				tableModel.setRowCount(0);
//				
//				studentList.forEach((student) -> {
//		            tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, 
//		            		student.getMamonhoc(), 
//		            		student.getSotinchi(), 
//		            		student.getDiem(),
//		            		student.getSosvdanghoc(), 
//		            		student.getNgaymo(), 
//		            		student.getNgayketthuc()});
//		        });
			}
		});
		btnFindStudents.setBounds(901, 5, 99, 27);
		panelStudents.add(btnFindStudents);
		
		
	}
	
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
