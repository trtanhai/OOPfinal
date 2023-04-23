package projectStudentManage;

public class Students {
	String mamonhoc;
	long sotinchi;
	long sosvdanghoc;
	double diem;
	String ngaymo;
	String ngayketthuc;
	
	public Students(String mamonhoc,long sotinchi,long sosvdanghoc,double diem,String ngaymo,String ngayketthuc) {
		this.mamonhoc = mamonhoc;
		this.sotinchi = sotinchi;
		this.sosvdanghoc = sosvdanghoc;
		this.diem = diem;
		this.ngaymo = ngaymo;
		this.ngayketthuc = ngayketthuc;
	}
	
	public void setMamonhoc(String mamonhoc) {
	    this.mamonhoc = mamonhoc;
	}

	public void setSotinchi(long sotinchi) {
	    this.sotinchi = sotinchi;
	}

	public void setSosvdanghoc(long sosvdanghoc) {
	    this.sosvdanghoc = sosvdanghoc;
	}

	public void setDiem(double diem) {
	    this.diem = diem;
	}

	public void setNgaymo(String ngaymo) {
	    this.ngaymo = ngaymo;
	}

	public void setNgayketthuc(String ngayketthuc) {
	    this.ngayketthuc = ngayketthuc;
	}

	public String getMamonhoc() {
	    return mamonhoc;
	}

	public long getSotinchi() {
	    return sotinchi;
	}

	public long getSosvdanghoc() {
	    return sosvdanghoc;
	}

	public double getDiem() {
	    return diem;
	}

	public String getNgaymo() {
	    return ngaymo;
	}

	public String getNgayketthuc() {
	    return ngayketthuc;
	}

	
}